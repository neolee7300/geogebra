package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class JLMBX10 extends FontInfo {

	JLMBX10(final String ttfPath) {
		super(0, ttfPath, 0, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 643, 474);

		setMetrics('\044', 643, 474);

		setMetrics('\042', 507, 474);

		setMetrics('\043', 507, 474);

		setMetrics('\045', 1332, 751);

		setMetrics('\046', 1786, 751);

	}
}
