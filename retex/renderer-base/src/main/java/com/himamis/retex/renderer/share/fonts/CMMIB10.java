package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;

final class CMMIB10 extends FontInfo {

	CMMIB10(final String ttfPath) {
		super(0, ttfPath, 444, 0, 1149, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\241', 656, 686, 0, 159);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -127, -127, 95});

		setMetrics('\242', 958, 686);
		setKern(new char[] {'\304'}, new int[] {191});

		setMetrics('\243', 867, 686, 0, 31);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\244', 805, 686);
		setKern(new char[] {'\304'}, new int[] {191});

		setMetrics('\245', 841, 686, 0, 74);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\246', 982, 686, 0, 82);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -63, -63, 63});

		setMetrics('\247', 885, 686, 0, 54);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\250', 670, 686, 0, 159);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -127, -127, 63});

		setMetrics('\251', 766, 686);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\252', 714, 686, 0, 116);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -63, -63, 63});

		setMetrics('\253', 878, 686, 0, 48);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\256', 760, 444);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\257', 659, 694, 194, 34);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\260', 590, 444, 194, 63);

		setMetrics('\261', 522, 694, 0, 38);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-63, -63, 63});

		setMetrics('\262', 483, 444);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\263', 508, 694, 194, 62);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\264', 599, 444, 194, 37);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\265', 561, 694, 0, 31);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\266', 412, 444);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\267', 667, 444);

		setMetrics('\270', 670, 694);

		setMetrics('\271', 707, 444, 194);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\272', 576, 444, 0, 68);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-63, -63, 31});

		setMetrics('\273', 508, 694, 194, 30);
		setKern(new char[] {'\304'}, new int[] {127});

		setMetrics('\274', 682, 444, 0, 37);

		setMetrics('\275', 611, 444, 194);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\276', 685, 444, 0, 37);
		setKern(new char[] {'\073', '\072'}, new int[] {-63, -63});

		setMetrics('\277', 520, 444, 0, 134);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-63, -63, 31});

		setMetrics('\300', 630, 444, 0, 37);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\301', 712, 694, 194);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\302', 718, 444, 194);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\303', 758, 694, 194, 37);
		setKern(new char[] {'\304'}, new int[] {127});

		setMetrics('\041', 717, 444, 0, 37);

		setMetrics('\042', 528, 444);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\043', 691, 694);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\044', 974, 444, 0, 31);

		setMetrics('\045', 611, 444, 194);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\046', 423, 444, 97, 79);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\047', 747, 444, 194);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\050', 1149, 391, -108);

		setMetrics('\051', 1149, 391, -108);

		setMetrics('\052', 1149, 391, -108);

		setMetrics('\053', 1149, 391, -108);

		setMetrics('\054', 319, 502, 2);

		setMetrics('\055', 319, 502, 2);

		setMetrics('\056', 574, 472, -27);

		setMetrics('\057', 574, 472, -27);

		setMetrics('\060', 574, 444);

		setMetrics('\061', 574, 444);

		setMetrics('\062', 574, 444);

		setMetrics('\063', 574, 444, 194);

		setMetrics('\064', 574, 444, 194);

		setMetrics('\065', 574, 444, 194);

		setMetrics('\066', 574, 644);

		setMetrics('\067', 574, 444, 194);

		setMetrics('\070', 574, 644);

		setMetrics('\071', 574, 444, 194);

		setMetrics('\072', 319, 155);

		setMetrics('\073', 319, 155, 194);

		setMetrics('\074', 894, 585, 85);
		setNextLarger(Configuration.getFonts().cmex10, '\253');

		setMetrics('\075', 574, 750, 250);
		setKern(new char[] {'\242', '\101', '\115', '\116', '\131', '\132'}, new int[] {-63, -63, -63, -63, 63, -63});
		setNextLarger(Configuration.getFonts().cmex10, '\261');

		setMetrics('\076', 894, 585, 85);
		setNextLarger(Configuration.getFonts().cmex10, '\256');

		setMetrics('\077', 574, 472, -27);

		setMetrics('\100', 628, 694, 0, 63);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\101', 869, 686);
		setKern(new char[] {'\304'}, new int[] {159});

		setMetrics('\102', 866, 686, 0, 48);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\103', 816, 686, 0, 69);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-31, -63, -63, 95});

		setMetrics('\104', 938, 686, 0, 31);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\105', 810, 686, 0, 54);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\106', 688, 686, 0, 159);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -127, -127, 95});

		setMetrics('\107', 886, 686);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\110', 982, 686, 0, 82);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -63, -63, 63});

		setMetrics('\111', 511, 686, 0, 77);
		setKern(new char[] {'\304'}, new int[] {127});

		setMetrics('\112', 631, 686, 0, 100);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -127, -127, 191});

		setMetrics('\113', 971, 686, 0, 69);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -63, -63, 63});

		setMetrics('\114', 755, 686);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\115', 1142, 686, 0, 114);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -63, -63, 95});

		setMetrics('\116', 950, 686, 0, 114);
		setKern(new char[] {'\075', '\075', '\073', '\072', '\304'}, new int[] {-95, -31, -63, -63, 95});

		setMetrics('\117', 836, 686, 0, 31);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\120', 723, 686, 0, 159);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -127, -127, 95});

		setMetrics('\121', 868, 686, 194);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\122', 872, 686, 0, 4);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\123', 692, 686, 0, 53);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -63, -63, 95});

		setMetrics('\124', 636, 686, 0, 159);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-31, -63, -63, 95});

		setMetrics('\125', 800, 686, 0, 114);
		setKern(new char[] {'\073', '\072', '\075', '\304'}, new int[] {-127, -127, -63, 31});

		setMetrics('\126', 677, 686, 0, 255);
		setKern(new char[] {'\073', '\072', '\075'}, new int[] {-191, -191, -127});

		setMetrics('\127', 1093, 686, 0, 159);
		setKern(new char[] {'\073', '\072', '\075'}, new int[] {-191, -191, -127});

		setMetrics('\130', 947, 686, 0, 77);
		setKern(new char[] {'\075', '\075', '\073', '\072', '\304'}, new int[] {-95, -31, -63, -63, 95});

		setMetrics('\131', 674, 686, 0, 255);
		setKern(new char[] {'\073', '\072', '\075'}, new int[] {-191, -191, -127});

		setMetrics('\132', 772, 686, 0, 69);
		setKern(new char[] {'\075', '\073', '\072', '\304'}, new int[] {-63, -63, -63, 95});

		setMetrics('\133', 447, 750);

		setMetrics('\134', 447, 694, 194);

		setMetrics('\135', 447, 694, 194);

		setMetrics('\136', 1149, 361, -138);

		setMetrics('\137', 1149, 361, -138);

		setMetrics('\140', 473, 694);
		setKern(new char[] {'\304'}, new int[] {127});

		setMetrics('\141', 632, 444);

		setMetrics('\142', 520, 694);

		setMetrics('\143', 513, 444);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\144', 609, 694);
		setKern(new char[] {'\131', '\132', '\152', '\146', '\304'}, new int[] {63, -63, -127, -191, 191});

		setMetrics('\145', 553, 444);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\146', 568, 694, 194, 110);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-63, -63, 191});

		setMetrics('\147', 544, 444, 194, 37);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\150', 667, 694);
		setKern(new char[] {'\304'}, new int[] {-31});

		setMetrics('\151', 404, 693);

		setMetrics('\152', 470, 693, 194, 62);
		setKern(new char[] {'\073', '\072'}, new int[] {-63, -63});

		setMetrics('\153', 603, 694, 0, 18);

		setMetrics('\154', 348, 694, 0, 8);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\155', 1032, 444);

		setMetrics('\156', 712, 444);

		setMetrics('\157', 584, 444);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\160', 600, 444, 194);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\161', 542, 444, 194, 37);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\162', 528, 444, 0, 31);
		setKern(new char[] {'\073', '\072', '\304'}, new int[] {-63, -63, 63});

		setMetrics('\163', 531, 444);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\164', 415, 634);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\165', 681, 444);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\166', 566, 444, 0, 37);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\167', 831, 444, 0, 27);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\170', 659, 444);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\171', 590, 444, 194, 37);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\172', 555, 444, 0, 42);
		setKern(new char[] {'\304'}, new int[] {63});

		setMetrics('\173', 393, 444);
		setKern(new char[] {'\304'}, new int[] {31});

		setMetrics('\174', 438, 444, 194);
		setKern(new char[] {'\304'}, new int[] {95});

		setMetrics('\175', 740, 444, 194);
		setKern(new char[] {'\304'}, new int[] {127});

		setMetrics('\176', 574, 724, 0, 154);

		setMetrics('\304', 319, 694, 0, 449);

	}
}
