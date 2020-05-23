package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;

final class CMMI10_UNCHANGED extends FontInfo {

	CMMI10_UNCHANGED(final String ttfPath) {
		super(0, ttfPath, 430, 0, 1000, '\304');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\041', 622, 430, 0, 35);

		setMetrics('\042', 466, 430);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\043', 591, 694);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\044', 828, 430, 0, 27);

		setMetrics('\045', 517, 430, 194);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\046', 362, 430, 97, 79);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\047', 654, 430, 194);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\050', 1000, 366, -133);

		setMetrics('\051', 1000, 366, -133);

		setMetrics('\052', 1000, 366, -133);

		setMetrics('\053', 1000, 366, -133);

		setMetrics('\054', 277, 463, -36);

		setMetrics('\055', 277, 463, -36);

		setMetrics('\056', 500, 465, -34);

		setMetrics('\057', 500, 465, -34);

		setMetrics('\072', 277, 105);

		setMetrics('\073', 277, 105, 194);

		setMetrics('\074', 777, 539, 39);
		setNextLarger(Configuration.getFonts().cmex10, '\253');

		setMetrics('\075', 500, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\261');

		setMetrics('\076', 777, 539, 39);
		setNextLarger(Configuration.getFonts().cmex10, '\256');

		setMetrics('\077', 500, 465, -34);

		setMetrics('\100', 530, 694, 0, 55);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\133', 388, 750);

		setMetrics('\134', 388, 694, 194);

		setMetrics('\135', 388, 694, 194);

		setMetrics('\136', 1000, 357, -142);

		setMetrics('\137', 1000, 357, -142);

		setMetrics('\140', 416, 694);
		setKern(new char[] {'\304'}, new int[] {111});

		setMetrics('\145', 465, 430);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\157', 484, 430);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\256', 639, 430, 0, 3);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\257', 565, 694, 194, 52);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\260', 517, 430, 194, 55);

		setMetrics('\261', 444, 694, 0, 37);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-55, -55, 55});

		setMetrics('\262', 405, 430);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\263', 437, 694, 194, 73);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\264', 496, 430, 194, 35);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\265', 469, 694, 0, 27);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\266', 353, 430);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\267', 576, 430);

		setMetrics('\270', 583, 694);

		setMetrics('\271', 602, 430, 194);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\272', 493, 430, 0, 63);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-55, -55, 27});

		setMetrics('\273', 437, 694, 194, 46);
		setKern(new char[] {'\304'}, new int[] {111});

		setMetrics('\274', 570, 430, 0, 35);

		setMetrics('\275', 517, 430, 194);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\276', 571, 430, 0, 35);
		setKern(new char[] {'\073', '\072'}, new int[] {-55, -55});

		setMetrics('\277', 437, 430, 0, 113);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-55, -55, 27});

		setMetrics('\300', 540, 430, 0, 35);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\301', 595, 694, 194);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\302', 625, 430, 194);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\303', 651, 694, 194, 35);
		setKern(new char[] {'\304'}, new int[] {111});

		setMetrics('\173', 322, 430);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\174', 384, 430, 194);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\175', 636, 430, 194);
		setKern(new char[] {'\304'}, new int[] {111});

		setMetrics('\176', 500, 714, 0, 153);

		setMetrics('\304', 277, 694, 0, 399);

	}
}
