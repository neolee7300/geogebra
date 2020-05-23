package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.FontInfo;

final class SPECIAL extends FontInfo {

	SPECIAL(final String ttfPath) {
		super(0, ttfPath, 233, 0, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\105', 705, 700, 15);

		setMetrics('\145', 500, 680, 13);

		setMetrics('\155', 500, 450, 200);

	}
}
