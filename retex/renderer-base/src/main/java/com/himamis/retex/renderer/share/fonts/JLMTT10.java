package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class JLMTT10 extends FontInfo {

	JLMTT10(final String ttfPath) {
		super(0, ttfPath, 0, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 516, 441);

		setMetrics('\044', 516, 441);

		setMetrics('\042', 516, 441);

		setMetrics('\043', 516, 441);

		setMetrics('\045', 516, 695);

		setMetrics('\046', 516, 695);

	}
}
