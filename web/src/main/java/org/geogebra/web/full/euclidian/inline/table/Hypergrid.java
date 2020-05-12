package org.geogebra.web.full.euclidian.inline.table;

import jsinterop.annotations.JsOverlay;
import jsinterop.annotations.JsPackage;
import jsinterop.annotations.JsProperty;
import jsinterop.annotations.JsType;

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
public class Hypergrid {

	@JsOverlay
	public final void editAt(int x, int y) {
		GridCell gridCell = getGridCellFromMousePoint(new Point(x, y));
		editAt(gridCell.cellEvent);
	}

	private native void editAt(CellEvent e);

	private native GridCell getGridCellFromMousePoint(Point p);
}

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
class GridCell {

	@JsProperty
	public CellEvent cellEvent;
}

@JsType(isNative = true, namespace = JsPackage.GLOBAL)
class CellEvent {

}

@JsType
class Point {

	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}