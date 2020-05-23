package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.FontInfo;

final class JLMSB10 extends FontInfo {

	JLMSB10(final String ttfPath) {
		super(0, ttfPath, 0, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 734, 455);

		setMetrics('\044', 734, 455);

		setMetrics('\042', 489, 455);

		setMetrics('\043', 489, 455);

		setMetrics('\045', 1330, 752);

		setMetrics('\046', 1826, 752);

	}
}
