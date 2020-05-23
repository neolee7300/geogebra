package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class CMTI10_UNCHANGED extends FontInfo {

	CMTI10_UNCHANGED(final String ttfPath) {
		super(0, ttfPath, 430, 357, 1022, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\044', 769, 694);

	}
}
