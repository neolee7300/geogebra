package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.FontInfo;

final class JLMR10_UNCHANGED extends FontInfo {

	JLMR10_UNCHANGED(final String ttfPath) {
		super(0, ttfPath, 430, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\176', 1389, 1900);

		setMetrics('\177', 1389, 800);

	}
}
