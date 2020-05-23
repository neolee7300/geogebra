package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class JLMI10 extends FontInfo {

	JLMI10(final String ttfPath) {
		super(0, ttfPath, 0, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 557, 485, 0, 140);

		setMetrics('\044', 557, 485, 0, -4);

		setMetrics('\042', 456, 485, 0, 52);

		setMetrics('\043', 456, 485, 0, -6);

		setMetrics('\045', 1115, 751, 0, 32);

		setMetrics('\046', 1432, 751, 0, 32);

	}
}
