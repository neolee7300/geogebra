package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class CMSY10 extends FontInfo {

	CMSY10(final String ttfPath) {
		super(0, ttfPath, 430, 0, 1000, '\060');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\241', 777, 583, 83);

		setMetrics('\242', 277, 444, -55);

		setMetrics('\243', 777, 583, 83);

		setMetrics('\244', 500, 465, -34);

		setMetrics('\245', 777, 583, 83);

		setMetrics('\246', 500, 444, -55);

		setMetrics('\247', 777, 583, 83);

		setMetrics('\250', 777, 583, 83);

		setMetrics('\251', 777, 583, 83);

		setMetrics('\252', 777, 583, 83);

		setMetrics('\253', 777, 583, 83);

		setMetrics('\256', 777, 583, 83);

		setMetrics('\257', 777, 583, 83);

		setMetrics('\260', 1000, 694, 194);

		setMetrics('\261', 500, 444, -55);

		setMetrics('\262', 500, 444, -55);

		setMetrics('\263', 777, 463, -36);

		setMetrics('\264', 777, 463, -36);

		setMetrics('\265', 777, 635, 135);

		setMetrics('\266', 777, 635, 135);

		setMetrics('\267', 777, 635, 135);

		setMetrics('\270', 777, 635, 135);

		setMetrics('\271', 777, 635, 135);

		setMetrics('\272', 777, 635, 135);

		setMetrics('\273', 777, 366, -133);

		setMetrics('\274', 777, 483, -16);

		setMetrics('\275', 777, 539, 39);

		setMetrics('\276', 777, 539, 39);

		setMetrics('\277', 1000, 539, 39);

		setMetrics('\300', 1000, 539, 39);

		setMetrics('\301', 777, 539, 39);

		setMetrics('\302', 777, 539, 39);

		setMetrics('\303', 1000, 366, -133);

		setMetrics('\041', 1000, 366, -133);

		setMetrics('\042', 500, 694, 194);
		setNextLarger(Configuration.getFonts().cmex10, '\170');

		setMetrics('\043', 500, 694, 194);
		setNextLarger(Configuration.getFonts().cmex10, '\171');

		setMetrics('\044', 1000, 366, -133);

		setMetrics('\045', 1000, 694, 194);

		setMetrics('\046', 1000, 694, 194);

		setMetrics('\047', 777, 463, -36);

		setMetrics('\050', 1000, 366, -133);

		setMetrics('\051', 1000, 366, -133);

		setMetrics('\052', 611, 694, 194);
		setNextLarger(Configuration.getFonts().cmex10, '\176');

		setMetrics('\053', 611, 694, 194);
		setNextLarger(Configuration.getFonts().cmex10, '\304');

		setMetrics('\054', 1000, 366, -133);

		setMetrics('\055', 1000, 694, 194);

		setMetrics('\056', 1000, 694, 194);

		setMetrics('\057', 777, 430);

		setMetrics('\060', 275, 555);

		setMetrics('\061', 1000, 430);

		setMetrics('\062', 666, 539, 39);

		setMetrics('\063', 666, 539, 39);

		setMetrics('\064', 888, 694, 194);
		setNextLarger(Configuration.getFonts().stmary10, '\201');

		setMetrics('\065', 888, 694, 194);
		setNextLarger(Configuration.getFonts().stmary10, '\200');

		setMetrics('\066', 0, 694, 194);

		setMetrics('\067', 0, 366, -133);

		setMetrics('\070', 555, 694);

		setMetrics('\071', 555, 694);

		setMetrics('\072', 666, 430);

		setMetrics('\073', 500, 750, 55);

		setMetrics('\074', 722, 694);

		setMetrics('\075', 722, 694);

		setMetrics('\076', 777, 694);

		setMetrics('\077', 777, 694);

		setMetrics('\100', 611, 694);

		setMetrics('\101', 798, 683);
		setKern(new char[] {'\060'}, new int[] {194});

		setMetrics('\102', 656, 683, 0, 30);
		setKern(new char[] {'\060'}, new int[] {138});

		setMetrics('\103', 526, 683, 0, 58);
		setKern(new char[] {'\060'}, new int[] {138});

		setMetrics('\104', 771, 683, 0, 27);
		setKern(new char[] {'\060'}, new int[] {83});

		setMetrics('\105', 527, 683, 0, 89);
		setKern(new char[] {'\060'}, new int[] {111});

		setMetrics('\106', 718, 683, 0, 99);
		setKern(new char[] {'\060'}, new int[] {111});

		setMetrics('\107', 594, 683, 97, 59);
		setKern(new char[] {'\060'}, new int[] {111});

		setMetrics('\110', 844, 683, 0, 9);
		setKern(new char[] {'\060'}, new int[] {111});

		setMetrics('\111', 544, 683, 0, 73);
		setKern(new char[] {'\060'}, new int[] {27});

		setMetrics('\112', 677, 683, 97, 184);
		setKern(new char[] {'\060'}, new int[] {166});

		setMetrics('\113', 761, 683, 0, 14);
		setKern(new char[] {'\060'}, new int[] {55});

		setMetrics('\114', 689, 683);
		setKern(new char[] {'\060'}, new int[] {138});

		setMetrics('\115', 1200, 683);
		setKern(new char[] {'\060'}, new int[] {138});

		setMetrics('\116', 820, 683, 0, 147);
		setKern(new char[] {'\060'}, new int[] {83});

		setMetrics('\117', 796, 683, 0, 27);
		setKern(new char[] {'\060'}, new int[] {111});

		setMetrics('\120', 695, 683, 0, 82);
		setKern(new char[] {'\060'}, new int[] {83});

		setMetrics('\121', 816, 683, 97);
		setKern(new char[] {'\060'}, new int[] {111});

		setMetrics('\122', 847, 683);
		setKern(new char[] {'\060'}, new int[] {83});

		setMetrics('\123', 605, 683, 0, 74);
		setKern(new char[] {'\060'}, new int[] {138});

		setMetrics('\124', 544, 683, 0, 254);
		setKern(new char[] {'\060'}, new int[] {27});

		setMetrics('\125', 625, 683, 0, 99);
		setKern(new char[] {'\060'}, new int[] {83});

		setMetrics('\126', 612, 683, 0, 82);
		setKern(new char[] {'\060'}, new int[] {27});

		setMetrics('\127', 987, 683, 0, 82);
		setKern(new char[] {'\060'}, new int[] {83});

		setMetrics('\130', 713, 683, 0, 146);
		setKern(new char[] {'\060'}, new int[] {138});

		setMetrics('\131', 668, 683, 97, 82);
		setKern(new char[] {'\060'}, new int[] {83});

		setMetrics('\132', 724, 683, 0, 79);
		setKern(new char[] {'\060'}, new int[] {138});

		setMetrics('\133', 666, 555);

		setMetrics('\134', 666, 555);

		setMetrics('\135', 666, 555);

		setMetrics('\136', 666, 555);

		setMetrics('\137', 666, 555);

		setMetrics('\140', 611, 694);

		setMetrics('\141', 611, 694);

		setMetrics('\142', 444, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\245');

		setMetrics('\143', 444, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\246');

		setMetrics('\144', 444, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\247');

		setMetrics('\145', 444, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\250');

		setMetrics('\146', 500, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\251');

		setMetrics('\147', 500, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\252');

		setMetrics('\150', 388, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\253');

		setMetrics('\151', 388, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\256');

		setMetrics('\152', 277, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\257');

		setMetrics('\153', 500, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\260');

		setMetrics('\154', 500, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\077');

		setMetrics('\155', 611, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\167');

		setMetrics('\156', 500, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\262');

		setMetrics('\157', 277, 694, 194);

		setMetrics('\160', 833, 39, 960);
		setNextLarger(Configuration.getFonts().cmex10, '\160');

		setMetrics('\161', 750, 683);

		setMetrics('\162', 833, 683);

		setMetrics('\163', 416, 694, 194, 111);

		setMetrics('\164', 666, 555);

		setMetrics('\165', 666, 555);

		setMetrics('\166', 777, 635, 135);

		setMetrics('\167', 777, 635, 135);

		setMetrics('\170', 444, 694, 194);

		setMetrics('\171', 444, 694, 194);

		setMetrics('\172', 444, 694, 194);

		setMetrics('\173', 611, 694, 194);

		setMetrics('\174', 777, 694, 129);

		setMetrics('\175', 777, 694, 129);

		setMetrics('\176', 777, 694, 129);

		setMetrics('\304', 777, 694, 129);

	}
}
