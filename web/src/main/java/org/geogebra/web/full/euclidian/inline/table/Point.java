package org.geogebra.web.full.euclidian.inline.table;

import jsinterop.annotations.JsType;

@JsType
class Point {

	public int x;
	public int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
}