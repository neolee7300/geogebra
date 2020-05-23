package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class JLMBI10 extends FontInfo {

	JLMBI10(final String ttfPath) {
		super(0, ttfPath, 0, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 634, 472, 0, 90);

		setMetrics('\044', 634, 472, 0, -26);

		setMetrics('\042', 507, 472, 0, 30);

		setMetrics('\043', 507, 472, 0, -26);

		setMetrics('\045', 1284, 752, 0, 22);

		setMetrics('\046', 1704, 752, 0, 22);

	}
}
