package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;

final class CMMI10 extends FontInfo {

	CMMI10(final String ttfPath) {
		super(0, ttfPath, 430, 0, 1000, '\304');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\241', 615, 683, 0, 138);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -111, -111, 83});

		setMetrics('\242', 833, 683);
		setKern(new char[] {'\304'}, new int[] {166});

		setMetrics('\243', 762, 683, 0, 27);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\244', 694, 683);
		setKern(new char[] {'\304'}, new int[] {166});

		setMetrics('\245', 742, 683, 0, 75);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\246', 831, 683, 0, 81);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -55, -55, 55});

		setMetrics('\247', 779, 683, 0, 57);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\250', 583, 683, 0, 138);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -111, -111, 55});

		setMetrics('\251', 666, 683);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\252', 612, 683, 0, 110);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -55, -55, 55});

		setMetrics('\253', 772, 683, 0, 50);
		setKern(new char[] {'\304'}, new int[] {83});

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

		setMetrics('\060', 500, 430);

		setMetrics('\061', 500, 430);

		setMetrics('\062', 500, 430);

		setMetrics('\063', 500, 430, 194);

		setMetrics('\064', 500, 430, 194);

		setMetrics('\065', 500, 430, 194);

		setMetrics('\066', 500, 644);

		setMetrics('\067', 500, 430, 194);

		setMetrics('\070', 500, 644);

		setMetrics('\071', 500, 430, 194);

		setMetrics('\072', 277, 105);

		setMetrics('\073', 277, 105, 194);

		setMetrics('\074', 777, 539, 39);
		setNextLarger(Configuration.getFonts().cmex10, '\253');

		setMetrics('\075', 500, 750, 250);
		setKern(new char[] {'\242', '\101', '\115', '\116', '\131', '\132'}, new int[] {-55, -55, -55, -55, 55, -55});
		setNextLarger(Configuration.getFonts().cmex10, '\261');

		setMetrics('\076', 777, 539, 39);
		setNextLarger(Configuration.getFonts().cmex10, '\256');

		setMetrics('\077', 500, 465, -34);

		setMetrics('\100', 530, 694, 0, 55);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\101', 750, 683);
		setKern(new char[] {'\304'}, new int[] {138});

		setMetrics('\102', 758, 683, 0, 50);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\103', 714, 683, 0, 71);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-27, -55, -55, 83});

		setMetrics('\104', 827, 683, 0, 27);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\105', 738, 683, 0, 57);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\106', 643, 683, 0, 138);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -111, -111, 83});

		setMetrics('\107', 786, 683);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\110', 831, 683, 0, 81);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -55, -55, 55});

		setMetrics('\111', 439, 683, 0, 78);
		setKern(new char[] {'\304'}, new int[] {111});

		setMetrics('\112', 554, 683, 0, 96);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -111, -111, 166});

		setMetrics('\113', 849, 683, 0, 71);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -55, -55, 55});

		setMetrics('\114', 680, 683);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\115', 970, 683, 0, 109);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -55, -55, 83});

		setMetrics('\116', 803, 683, 0, 109);
		setKern(new char[] {'\075', '\075', '\073', '\072', '\304'}, new int[] {-83, -27, -55, -55, 83});

		setMetrics('\117', 762, 683, 0, 27);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\120', 642, 683, 0, 138);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -111, -111, 83});

		setMetrics('\121', 790, 683, 194);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\122', 759, 683, 0, 7);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\123', 613, 683, 0, 57);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -55, -55, 83});

		setMetrics('\124', 584, 683, 0, 138);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-27, -55, -55, 83});

		setMetrics('\125', 682, 683, 0, 109);
		setKern(new char[] {'\073', '\072', '\075', '\304'}, new int[] {-111, -111, -55, 27});

		setMetrics('\126', 583, 683, 0, 222);
		setKern(new char[] {'\073', '\072', '\075'}, new int[] {-166, -166, -111});

		setMetrics('\127', 944, 683, 0, 138);
		setKern(new char[] {'\073', '\072', '\075'}, new int[] {-166, -166, -111});

		setMetrics('\130', 828, 683, 0, 78);
		setKern(new char[] {'\075', '\075', '\073', '\072', '\304'}, new int[] {-83, -27, -55, -55, 83});

		setMetrics('\131', 580, 683, 0, 222);
		setKern(new char[] {'\073', '\072', '\075'}, new int[] {-166, -166, -111});

		setMetrics('\132', 682, 683, 0, 71);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-55, -55, -55, 83});

		setMetrics('\133', 388, 750);

		setMetrics('\134', 388, 694, 194);

		setMetrics('\135', 388, 694, 194);

		setMetrics('\136', 1000, 357, -142);

		setMetrics('\137', 1000, 357, -142);

		setMetrics('\140', 416, 694);
		setKern(new char[] {'\304'}, new int[] {111});

		setMetrics('\141', 528, 430);

		setMetrics('\142', 429, 694);

		setMetrics('\143', 432, 430);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\144', 520, 694);
		setKern(new char[] {'\131', '\132', '\152', '\146', '\304'}, new int[] {55, -55, -111, -166, 166});

		setMetrics('\145', 465, 430);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\146', 489, 694, 194, 107);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-55, -55, 166});

		setMetrics('\147', 476, 430, 194, 35);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\150', 576, 694);
		setKern(new char[] {'\304'}, new int[] {-27});

		setMetrics('\151', 344, 659);

		setMetrics('\152', 411, 659, 194, 57);
		setKern(new char[] {'\073', '\072'}, new int[] {-55, -55});

		setMetrics('\153', 520, 694, 0, 31);

		setMetrics('\154', 298, 694, 0, 19);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\155', 878, 430);

		setMetrics('\156', 600, 430);

		setMetrics('\157', 484, 430);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\160', 503, 430, 194);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\161', 446, 430, 194, 35);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\162', 451, 430, 0, 27);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-55, -55, 55});

		setMetrics('\163', 468, 430);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\164', 361, 615);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\165', 572, 430);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\166', 484, 430, 0, 35);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\167', 715, 430, 0, 26);
		setKern(new char[] {'\304'}, new int[] {83});

		setMetrics('\170', 571, 430);
		setKern(new char[] {'\304'}, new int[] {27});

		setMetrics('\171', 490, 430, 194, 35);
		setKern(new char[] {'\304'}, new int[] {55});

		setMetrics('\172', 465, 430, 0, 43);
		setKern(new char[] {'\304'}, new int[] {55});

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
