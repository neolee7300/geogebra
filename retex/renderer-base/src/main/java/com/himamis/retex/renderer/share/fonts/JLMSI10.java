package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class JLMSI10 extends FontInfo {

	JLMSI10(final String ttfPath) {
		super(0, ttfPath, 0, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 662, 448, 0, 58);

		setMetrics('\044', 662, 448);

		setMetrics('\042', 441, 448, 0, 48);

		setMetrics('\043', 441, 448, 0, -2);

		setMetrics('\045', 1159, 751, 0, 50);

		setMetrics('\046', 1533, 751, 0, 50);

	}
}
