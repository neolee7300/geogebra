package org.geogebra.arbase;


import java.util.HashMap;
import java.util.Map;

import org.geogebra.common.geogebra3D.euclidian3D.EuclidianController3D;
import org.geogebra.common.geogebra3D.euclidian3D.EuclidianView3D;
import org.geogebra.common.geogebra3D.euclidian3D.ar.ARManagerInterface;
import org.geogebra.common.geogebra3D.euclidian3D.draw.DrawClippingCube3D;
import org.geogebra.common.geogebra3D.euclidian3D.openGL.Renderer;
import org.geogebra.common.kernel.matrix.CoordMatrix;
import org.geogebra.common.kernel.matrix.CoordMatrix4x4;
import org.geogebra.common.kernel.matrix.Coords;
import org.geogebra.common.main.settings.EuclidianSettings3D;
import org.geogebra.common.util.DoubleUtil;

abstract public class ARManager<TouchEventType> implements ARManagerInterface<TouchEventType> {

    protected CoordMatrix4x4 viewMatrix = new CoordMatrix4x4();
    protected CoordMatrix4x4 projectMatrix = new CoordMatrix4x4();
    protected CoordMatrix4x4 modelMatrix = new CoordMatrix4x4();
    protected CoordMatrix4x4 anchorMatrix = new CoordMatrix4x4();
    private CoordMatrix4x4 undoRotationMatrix = new CoordMatrix4x4();
    private CoordMatrix4x4 viewModelMatrix = new CoordMatrix4x4();
    private CoordMatrix4x4 tmpMatrix1 = new CoordMatrix4x4();
    private CoordMatrix4x4 tmpMatrix2 = new CoordMatrix4x4();
    private CoordMatrix4x4 tmpMatrix3 = new CoordMatrix4x4();
    private float arScaleAtStart;
    private float arScale = 1;

    protected float rotateAngel = 0;
    protected Coords hittingFloor = Coords.createInhomCoorsInD3();
    protected boolean hittingFloorOk;
    private Map<Object, Double> trackablesZ;
    protected Object hittingTrackable;
    protected double hittingDistance;
    private float arScaleFactor = 1;

    private Coords tmpCoords1 = new Coords(4);
    private Coords tmpCoords2 = new Coords(4);
    private Coords tmpCoords3 = new Coords(4);

    private Coords lastHitOrigin = new Coords(3);
    protected Coords rayEndOrigin = new Coords(3);
    private Coords translationOffset = new Coords(3);
    private Coords previousTranslationOffset = new Coords(3);
    private Coords positionXY = new Coords(2);

    protected boolean objectIsPlaced = false;
    protected boolean drawing = false;
    protected boolean arIsRendering = false;

    protected CoordMatrix4x4 cHitMatrix = new CoordMatrix4x4();
    private Coords rayOrigin = new Coords(4);
    private Coords rayDirection = new Coords(4);
    private Coords projection = Coords.createInhomCoorsInD3();

    protected ARGestureManager arGestureManager;

    protected EuclidianView3D view3D;

    private ARMotionEvent lastARMotionEvent;

    protected ARSnackBarManagerInterface arSnackBarManagerInterface;

    private ARRatio arRatio = new ARRatio();

    abstract public void onSurfaceCreated();

    abstract public void onSurfaceChanged(int width, int height);

    abstract public void onResume();

    abstract public void onPause();

    abstract public void proceedARLogic();

    abstract public void arButtonClicked() throws ARException;

    abstract public void setSession() throws ARException;

    protected void addGestureRecognizers(){
        arGestureManager.addGestureRecognizers();
    }

    public boolean getARIsRendering(){
        return false;
    }

    public boolean hasSessionStarted(){
        return false;
    }

    abstract public void setBackgroundColor();

    abstract public void setBackgroundStyle(Renderer.BackgroundStyle backgroundStyle);

    public  Renderer.BackgroundStyle getBackgroundStyle() {
        return null;
    }

    public Coords getHittingDirection() {
        return rayDirection;
    }

    public Coords getHittingOrigin() {
        return rayOrigin;
    }

    public Coords getHittingFloor() {
        return hittingFloorOk ? hittingFloor : null;
    }

    public double checkHittingFloorZ(double z) {
        createTrackableListIfNeeded();
        Double v = trackablesZ.get(hittingTrackable);
        if (v == null) {
            trackablesZ.put(hittingTrackable, z);
            return z;
        }
        return v;
    }

    private void createTrackableListIfNeeded() {
        if (trackablesZ == null) {
            trackablesZ = new HashMap<>();
        }
    }

    public double getHittingDistance() {
        return hittingDistance / arScale;
    }

    abstract public void setHittingOriginAndDirection(float x, float y);

    abstract public void setHittingOriginAndDirectionFromScreenCenter();

    private void wrapMouseMoved(int x, int y) {
        view3D.getEuclidianController().wrapMouseMoved(view3D.getEuclidianController()
                .createTouchEvent(x,y));
    }

    protected MouseTouchGestureQueueHelper mouseTouchGestureQueueHelper;

    protected void setMouseTouchGestureController() {

    }

    public void onDrawFrame() {
        Renderer renderer = view3D.getRenderer();
        renderer.getRendererImpl().glViewPort();
        proceedARLogic(); // Feature.G3D_AR_REGULAR_TOOLS: pass the touch event
        viewModelMatrix.setMul(viewMatrix, modelMatrix);
        ARMotionEvent arMotionEvent = mouseTouchGestureQueueHelper.poll(); // can be null
        // to update hitting o&d
        if (drawing) {
            renderer.getView().setARDrawing(true);
            renderer.setView();
            if (((EuclidianController3D) renderer.getView().getEuclidianController())
                    .isCurrentModeForCreatingPoint()) {
                if (arMotionEvent == null) {
                    if (mouseTouchGestureQueueHelper.isCurrentlyUp()) {
                        // create a "mouse move" event
                        setHittingOriginAndDirectionFromScreenCenter();
                        wrapMouseMoved(renderer.getWidth() / 2, renderer.getHeight() / 2);
                    } else {
                        // force a drag (device may have moved)
                        arMotionEvent = getARMotionEventMove((float) view3D.getWidth() / 2,
                                (float) view3D.getHeight() / 2);
                        setHittingOriginAndDirectionFromScreenCenter();
                    }
                } else {
                    // force event to be screen-centered
                    arMotionEvent.setLocation(renderer.getWidthInPixels() / 2,
                            renderer.getHeightInPixels() / 2);
                    setHittingOriginAndDirectionFromScreenCenter();
                }
            } else {
                // process motionEvent at touch location (if exists)
                if (arMotionEvent != null) {
                    setHittingOriginAndDirection(arMotionEvent);
                    lastARMotionEvent = arMotionEvent;
                } else {
                    if (mouseTouchGestureQueueHelper.isCurrentlyUp()) {
                        lastARMotionEvent = null;
                    } else {
                        // create a new motionEvent
                        if (lastARMotionEvent != null) {
                            if (lastARMotionEvent.getAction() ==
                                    ARMotionEvent.FIRST_FINGER_DOWN) {
                                arMotionEvent = getARMotionEventMove(lastARMotionEvent.getX(),
                                        lastARMotionEvent.getY());
                                setHittingOriginAndDirection(arMotionEvent);
                            } else if (lastARMotionEvent.getAction() ==
                                    ARMotionEvent.ON_MOVE) {
                                arMotionEvent = lastARMotionEvent;
                                setHittingOriginAndDirection(arMotionEvent);
                            }
                        }
                    }
                }
            }
            renderer.getView().setEuclidianPanelOnTouchListener();
            setMouseTouchGestureController();
            proceedARMotionEvent(arMotionEvent);
            renderer.drawScene();
        } else {
            renderer.getView().setARDrawing(false);
            renderer.endOfDrawScene();
        }
    }

    public MouseTouchGestureQueueHelper getMouseTouchGestureQueueHelper() {
        return mouseTouchGestureQueueHelper;
    }

    protected void proceedARMotionEvent(ARMotionEvent arMotionEvent) {

    }

    protected void updateModelMatrixFields() {
        /* translating */
        translationOffset.setSub3(rayEndOrigin, lastHitOrigin);

        /* update ratio */
        calculateAndShowRatio();
    }

    protected void clearAnchors() {
        if (trackablesZ != null) {
            trackablesZ.clear();
        }
        hittingTrackable = null;
    }

    protected void updateModelMatrix() {
        modelMatrix.set(anchorMatrix);
        /* translating */
        Coords modelOrigin = modelMatrix.getOrigin();
        Coords anchorOrigin = anchorMatrix.getOrigin();
        modelOrigin.setX(anchorOrigin.getX() + translationOffset.getX() +
                previousTranslationOffset.getX());
        modelOrigin.setY(anchorOrigin.getY());
        modelOrigin.setZ(anchorOrigin.getZ() + translationOffset.getZ() +
                previousTranslationOffset.getZ());
    }

    protected Coords setRay() {
        viewMatrix.solve(Coords.O, rayOrigin);
        rayDirection.setSub3(cHitMatrix.getOrigin(), rayOrigin);
        rayOrigin.projectPlane(modelMatrix.getVx(), modelMatrix.getVz(), rayDirection,
                modelMatrix.getOrigin(), projection);
        return projection;
    }

    protected void updateTranslationIfNeeded() {
        if (arGestureManager != null && arGestureManager.getUpdateOriginIsWanted()) {
            arGestureManager.setUpdateOriginIsWanted(false);
            Coords modelOrigin = modelMatrix.getOrigin();
            Coords anchorOrigin = anchorMatrix.getOrigin();
            previousTranslationOffset.setSub3(modelOrigin, anchorOrigin);

            lastHitOrigin.set3(rayEndOrigin);
        }
    }

    protected void setClipCenterAndComputeRayDirection() {
        // set clip center to projection matrix near plane location
        tmpCoords2.setX(0);
        tmpCoords2.setY(0);
        tmpCoords2.setZ(projectMatrix.getOrigin().getZ()/(1-projectMatrix.getVz().getZ()));
        tmpCoords2.setW(1);
        viewMatrix.solve(tmpCoords2, rayOrigin);
        // compute ray direction (which is z- in camera coord sys)
        viewMatrix.solve(Coords.VZm, rayDirection);
        rayDirection.normalize();
    }

    protected void countHittingOriginAndDirection() {
        // "ground" hitting point
        tmpCoords1.setMul(viewMatrix, cHitMatrix.getOrigin());
        tmpCoords1.setW(0);
        tmpCoords1.normalize();
        // set clip center to projection matrix near plane location
        tmpCoords2.setX(0);
        tmpCoords2.setY(0);
        tmpCoords2.setZ(projectMatrix.getOrigin().getZ()/(1-projectMatrix.getVz().getZ()));
        tmpCoords2.setW(1);
        // get clip hitting point
        Coords.O.projectPlane(Coords.VX, Coords.VY, tmpCoords1, tmpCoords2, tmpCoords3);
        // projection may not be possible
        if (tmpCoords3.isDefined()) {
            viewMatrix.solve(tmpCoords3, rayOrigin);
            rayDirection.setSub3(cHitMatrix.getOrigin(), rayOrigin);
            rayDirection.normalize();
        }
    }

    protected void copyPosFromGestureManager() {
        if (arGestureManager != null) {
            arGestureManager.copyXYPosition(positionXY);
        }
    }

    protected float getPosX() {
        return (float) positionXY.getX();
    }

    protected float getPosY() {
        return (float) positionXY.getY();
    }

    protected void resetTranslationOffsetAndScaleMatrix() {
        // used in iOS
        translationOffset.set(0,0,0);
        previousTranslationOffset.set(0,0,0);
        arScaleFactor = 1;
    }

    /**
     * set first hit floor z value
     * @param z altitude
     */
    public void setFirstFloor(double z) {
        if (hittingTrackable != null) {
            createTrackableListIfNeeded();
            trackablesZ.put(hittingTrackable, z);
        }
    }

    protected ARMotionEvent getARMotionEventMove(float x, float y){
        return null;
    }

    private void setHittingOriginAndDirection(ARMotionEvent arMotionEvent) {
            setHittingOriginAndDirection(arMotionEvent.getX(), arMotionEvent.getY());
    }

    private double getThicknessMin(double distance) {
        return view3D.dipToPx(THICKNESS_MIN_FACTOR) * distance / projectMatrix.get(1 ,1);
    }

    public void setARScaleAtStart() {
        float mDistance = (float) viewModelMatrix.getOrigin().calcNorm3();
        double thicknessMin = getThicknessMin(mDistance);
        // don't expect distance less than desk distance at start
        if (mDistance < DESK_DISTANCE_MAX) {
            mDistance = (float) DESK_DISTANCE_AVERAGE;
        }
        // 1 ggb unit ==  1 meter
        double ggbToRw = 1.0 / view3D.getXscale();
        // ratio
        double projectFactor = projectMatrix.get(1, 1);
        double precisionPoT = DoubleUtil.getPowerOfTen(projectFactor);
        double precision = Math.round(projectFactor / precisionPoT) * precisionPoT
                * PROJECT_FACTOR_RELATIVE_PRECISION;
        projectFactor = Math.round(projectFactor / precision) * precision;
        float fittingScreenScale = (float) (DrawClippingCube3D.REDUCTION_ENLARGE
                * (mDistance / projectFactor)
                / view3D.getRenderer().getWidth());
        double fittingScreenRatio = ARRatio.getFittingScreenRatio(fittingScreenScale, ggbToRw);

        int mToCm = 100;
        arRatio.setArRatioAtStart(fittingScreenRatio * mToCm);

        arScaleAtStart = (float) (ggbToRw * fittingScreenRatio); // arScaleAtStart ~= thicknessMin
        arScale = (float) thicknessMin;
        arScaleFactor = arScaleAtStart / arScale;
        updateSettingsScale(arScaleFactor);

        calculateAndShowRatio();
    }

    private float getARScaleParameter() {
        return arGestureManager == null ? arScale :
                arScale * arGestureManager.getScaleFactor() * arRatio.getRatioChange();
    }

    public void fromARCoordsToGGBCoords(Coords coords, Coords ret) {
        // undo model matrix
        modelMatrix.solve(coords, ret);
        // undo scale matrix
        CoordMatrix4x4.setZero(tmpMatrix2);
        CoordMatrix4x4.setDilate(tmpMatrix2, getARScaleParameter());
        tmpMatrix2.solve(ret, tmpCoords1);
        // undo screen coordinates
        ret.setMul(view3D.getToSceneMatrix(), tmpCoords1);
    }

    public void setProjectionMatrixViewForAR(CoordMatrix4x4 projectionMatrix) {
        // scaleMatrix
        CoordMatrix4x4.setZero(tmpMatrix1);
        CoordMatrix4x4.setDilate(tmpMatrix1, getARScaleParameter());

        // invert cameraView * modelMatrix to keep labels towards to screen
        // calculate angle to keep labels upward
        tmpMatrix2.set(viewModelMatrix);
        tmpMatrix2.setOrigin(Coords.O);
        tmpMatrix3.set(tmpMatrix2.inverse());
        Coords vy = tmpMatrix3.getVy();
        Coords vz = tmpMatrix3.getVz();
        tmpCoords1.setSub3(Coords.VY,
                tmpCoords1.setMul3(vz, Coords.VY.dotproduct(vz)));
        tmpCoords1.setW(0);
        tmpCoords1.normalize();
        double c = tmpCoords1.dotproduct(vy);
        double s = vz.dotCrossProduct(tmpCoords1, vy);
        double rot = Math.atan2(s, c);
        CoordMatrix.setRotation3DMatrix(CoordMatrix.Z_AXIS, -rot, tmpMatrix2);
        undoRotationMatrix.setMul(tmpMatrix3, tmpMatrix2);

        // (cameraView * modelMatrix) * scaleMatrix
        tmpMatrix2.setMul(viewModelMatrix, tmpMatrix1);

        // cameraPerspective * (cameraView * (modelMatrix * scaleMatrix))
        projectionMatrix.setMul(projectMatrix, tmpMatrix2);
    }

    public CoordMatrix4x4 getUndoRotationMatrix() {
        return undoRotationMatrix;
    }

    public CoordMatrix4x4 getViewModelMatrix() {
        return viewModelMatrix;
    }

    public void calculateAndShowRatio() {
        if (!view3D.isARRatioShown() || !objectIsPlaced) {
            return;
        }
        arRatio.calculateAndShowRatio(view3D, arGestureManager, arSnackBarManagerInterface);
    }

    public void fitThickness() {
        if (drawing) {
            float previousARScale = arScale;
            float mDistance = (float) viewModelMatrix.getOrigin().calcNorm3();
            // 1 pixel thickness in ggb == 0.25 mm (for distance smaller than DESK_DISTANCE_MAX)
            double thicknessMin = getThicknessMin(mDistance);
            arScale = (float) (thicknessMin / (arGestureManager.getScaleFactor()
                    * arRatio.getRatioChange()));
            arScaleFactor = arScaleAtStart / arScale;
            updateSettingsScale(previousARScale / arScale);
        }
    }

    private void updateSettingsScale(float factor) {
        EuclidianSettings3D settings = view3D.getSettings();
        settings.setXYZscale(settings.getXscale() * factor,
                settings.getYscale() * factor,
                settings.getZscale() * factor);
    }

    public float getArScaleFactor() {
        return arScaleFactor;
    }

    public void resetScaleFromAR() {
        EuclidianSettings3D s = view3D.getSettings();
        s.setXYZscaleValues(s.getXscale() / arScaleFactor,
                s.getYscale() / arScaleFactor,
                s.getZscale() / arScaleFactor);
        arScaleFactor = 1f;
    }

    public String getARRatioInString() {
        return arRatio.getArRatioText();
    }

    public void setARRatio(double ratio) {
        arRatio.setARRatio(view3D, ratio);
        arGestureManager.resetScaleFactor();
        fitThickness();
        calculateAndShowRatio();
    }

    public void setRatioIsShown(boolean ratioIsShown) {
        if (ratioIsShown) {
            calculateAndShowRatio();
        } else {
            arSnackBarManagerInterface.hideRatio();
        }
    }
}
