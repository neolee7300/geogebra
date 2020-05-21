package org.geogebra.arbase;

import org.geogebra.common.geogebra3D.euclidian3D.EuclidianView3D;
import org.geogebra.common.util.DoubleUtil;

import static org.geogebra.common.geogebra3D.euclidian3D.ar.ARManagerInterface.MAX_FACTOR_TO_EMPHASIZE;

class ARRatio {
    private double arRatioAtStart;
    private float ratioChange = 1;     // change of ratio when ratio is set from menu
    private String arRatioText = "1";  // current ratio used for Ratio snack bar and ratio settings

    static double getFittingScreenRatio(double fittingScreenScale, double ggbToRw) {
        double ratio;

        ratio = fittingScreenScale / ggbToRw; // fittingScreenScale = ggbToRw * ratio
        double pot = DoubleUtil.getPowerOfTen(ratio);
        ratio = ratio / pot;
        if (ratio < 2f / MAX_FACTOR_TO_EMPHASIZE) {
            ratio = 1f;
        } else if (ratio < 5f / MAX_FACTOR_TO_EMPHASIZE) {
            ratio = 2f;
        } else if (ratio < 10f / MAX_FACTOR_TO_EMPHASIZE) {
            ratio = 5f;
        } else {
            ratio = 10f;
        }
        ratio = ratio * pot;
        return ratio;
    }

    void setArRatioAtStart(double arRatioAtStart) {
        this.arRatioAtStart = arRatioAtStart;
    }

    void calculateAndShowRatio(EuclidianView3D view3D, ARGestureManager arGestureManager,
                                      ARSnackBarManagerInterface arSnackBarManagerInterface) {
        double ratio;
        if (arGestureManager != null) {
            ratio = arRatioAtStart * arGestureManager.getScaleFactor() * ratioChange
                    * getUnitConversion(view3D);
        } else {
            ratio = arRatioAtStart;
        }
        String text;
        if (view3D.getARRatioMetricSystem() == EuclidianView3D.RATIO_UNIT_INCHES) {
            ratio = (double) Math.round(ratio * 100d) / 100d;
            view3D.setARRatioUnit("inch");
        } else {
            if (ratio >= 100) {
                // round double for precision 3 in m
                ratio = (double) Math.round(ratio) / 100d;
                view3D.setARRatioUnit("m");
            } else if (ratio < 0.5 ) {
                // round double for precision 3 in mm
                ratio = (double) Math.round(ratio * 1000d) / 100d;
                view3D.setARRatioUnit("mm");
            } else {
                // round double for precision 3 in cm
                ratio = (double) Math.round(ratio * 100d) / 100d;
                view3D.setARRatioUnit("cm");
            }
        }
        text = getRatioMessage(ratio, view3D);
        arSnackBarManagerInterface.showRatio(text);
    }

    private static float getUnitConversion(EuclidianView3D view3D) {
        if (view3D.getARRatioMetricSystem() == EuclidianView3D.RATIO_UNIT_INCHES) {
            return EuclidianView3D.FROM_CM_TO_INCH;
        } else {
            return 1;
        }
    }

    private String getRatioMessage(double ratio, EuclidianView3D view3D) {
        if(DoubleUtil.isInteger(ratio)) {
            arRatioText = String.format("%d", (long) ratio);
        } else {
            arRatioText = String.format("%.4s", ratio);
        }
        return String.format("1 : %s %s", arRatioText, view3D.getARRatioUnit());
    }

    float getRatioChange() {
        return ratioChange;
    }

    String getArRatioText() {
        return arRatioText;
    }

    void setARRatio(EuclidianView3D view3D, double ratio) {
        if (view3D.getARRatioMetricSystem() == EuclidianView3D.RATIO_UNIT_INCHES) {
            ratioChange = (float) ((ratio * EuclidianView3D.FROM_INCH_TO_CM) / arRatioAtStart);
        } else {
            ratioChange = (float) ((ratio) / arRatioAtStart);
        }
    }
}