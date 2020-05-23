package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class JLMSS10 extends FontInfo {

	JLMSS10(final String ttfPath) {
		super(0, ttfPath, 0, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 662, 448);

		setMetrics('\044', 662, 448);

		setMetrics('\042', 441, 448);

		setMetrics('\043', 441, 448);

		setMetrics('\045', 1159, 752);

		setMetrics('\046', 1533, 752);

	}
}
