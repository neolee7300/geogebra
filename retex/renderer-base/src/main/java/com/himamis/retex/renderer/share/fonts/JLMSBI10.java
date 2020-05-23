package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class JLMSBI10 extends FontInfo {

	JLMSBI10(final String ttfPath) {
		super(0, ttfPath, 0, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 734, 454, 0, 46);

		setMetrics('\044', 734, 454, 0, 4);

		setMetrics('\042', 489, 454, 0, 34);

		setMetrics('\043', 489, 454, 0, -12);

		setMetrics('\045', 1330, 751, 0, 46);

		setMetrics('\046', 1826, 751, 0, 46);

	}
}
