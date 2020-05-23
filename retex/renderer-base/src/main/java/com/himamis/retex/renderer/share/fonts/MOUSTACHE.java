package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.FontInfo;

final class MOUSTACHE extends FontInfo {

	MOUSTACHE(final String ttfPath) {
		super(0, ttfPath, 430, 0, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\070', 888, 0, 900);

		setMetrics('\071', 888, 0, 900);

		setMetrics('\072', 888, 0, 900);

		setMetrics('\073', 888, 0, 900);

		setMetrics('\076', 888, 0, 300);
		setExtension('\0', '\0', '\076', '\0');

		setMetrics('\100', 458, 0);
		setExtension('\070', '\0', '\076', '\073');

		setMetrics('\101', 875, 0);
		setExtension('\071', '\0', '\076', '\072');

	}
}
