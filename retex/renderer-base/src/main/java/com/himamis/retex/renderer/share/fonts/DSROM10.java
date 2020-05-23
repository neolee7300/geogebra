package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class DSROM10 extends FontInfo {

	DSROM10(final String ttfPath) {
		super(0, ttfPath, 462, 300, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\061', 611, 644);

		setMetrics('\101', 833, 683);

		setMetrics('\102', 763, 683);

		setMetrics('\103', 722, 683);

		setMetrics('\104', 791, 683);

		setMetrics('\105', 736, 683);

		setMetrics('\106', 708, 683);

		setMetrics('\107', 784, 683);

		setMetrics('\110', 833, 683);

		setMetrics('\111', 444, 683);

		setMetrics('\112', 597, 683);

		setMetrics('\113', 833, 683);

		setMetrics('\114', 680, 683);

		setMetrics('\115', 1000, 683);

		setMetrics('\116', 833, 683);

		setMetrics('\117', 777, 683);

		setMetrics('\120', 736, 683);

		setMetrics('\121', 777, 683, 194);

		setMetrics('\122', 791, 683);

		setMetrics('\123', 555, 683);

		setMetrics('\124', 750, 683);

		setMetrics('\125', 805, 683);

		setMetrics('\126', 805, 683, 0, 13);

		setMetrics('\127', 1083, 683, 0, 13);

		setMetrics('\130', 861, 683);

		setMetrics('\131', 805, 683, 0, 25);

		setMetrics('\132', 750, 683);

		setMetrics('\141', 833, 683);

		setMetrics('\150', 655, 694);

		setMetrics('\153', 627, 694);

	}
}
