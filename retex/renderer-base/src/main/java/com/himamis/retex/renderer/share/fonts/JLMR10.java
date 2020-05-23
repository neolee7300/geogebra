package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.FontInfo;

final class JLMR10 extends FontInfo {

	JLMR10(final String ttfPath) {
		super(0, ttfPath, 430, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 552, 485);

		setMetrics('\044', 552, 485);

		setMetrics('\042', 441, 485);

		setMetrics('\043', 441, 485);

		setMetrics('\045', 1159, 751);

		setMetrics('\046', 1501, 751);

	}
}
