package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class CMTI10 extends FontInfo {

	CMTI10(final String ttfPath) {
		super(0, ttfPath, 430, 357, 1022, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\241', 627, 683, 0, 133);

		setMetrics('\242', 817, 683);

		setMetrics('\243', 766, 683, 0, 94);

		setMetrics('\244', 692, 683);

		setMetrics('\245', 664, 683, 0, 152);

		setMetrics('\246', 743, 683, 0, 163);

		setMetrics('\247', 715, 683, 0, 120);

		setMetrics('\250', 766, 683, 0, 111);

		setMetrics('\251', 715, 683, 0, 59);

		setMetrics('\252', 766, 683, 0, 111);

		setMetrics('\253', 715, 683, 0, 102);

		setMetrics('\256', 613, 694, 194, 211);
		setLigatures('\151', '\261', '\154', '\262');
		setKern(new char[] {'\047', '\077', '\041', '\051', '\135'}, new int[] {104, 104, 104, 104, 104});

		setMetrics('\257', 562, 694, 194, 103);

		setMetrics('\260', 587, 694, 194, 103);

		setMetrics('\261', 881, 694, 194, 103);

		setMetrics('\262', 894, 694, 194, 103);

		setMetrics('\263', 306, 430, 0, 76);

		setMetrics('\264', 332, 430, 194, 37);

		setMetrics('\265', 511, 694);

		setMetrics('\266', 511, 694, 0, 96);

		setMetrics('\267', 511, 628, 0, 82);

		setMetrics('\270', 511, 694, 0, 108);

		setMetrics('\271', 511, 561, 0, 103);

		setMetrics('\272', 831, 694);

		setMetrics('\273', 459, 0, 170);

		setMetrics('\274', 536, 694, 194, 105);

		setMetrics('\275', 715, 430, 0, 75);

		setMetrics('\276', 715, 430, 0, 75);

		setMetrics('\277', 511, 527, 97, 91);

		setMetrics('\300', 882, 683, 0, 120);

		setMetrics('\301', 984, 683, 0, 120);

		setMetrics('\302', 766, 731, 48, 94);

		setMetrics('\303', 255, 430);
		setKern(new char[] {'\154', '\114'}, new int[] {-255, -320});

		setMetrics('\041', 306, 694, 0, 124);
		setLigatures('\140', '\074');

		setMetrics('\042', 514, 694, 0, 69);

		setMetrics('\043', 817, 694, 194, 66);

		setMetrics('\044', 769, 694);

		setMetrics('\045', 817, 750, 55, 136);

		setMetrics('\046', 766, 694, 0, 96);

		setMetrics('\047', 306, 694, 0, 124);
		setLigatures('\047', '\042');
		setKern(new char[] {'\077', '\041'}, new int[] {102, 102});

		setMetrics('\050', 408, 750, 250, 161);
		setNextLarger(Configuration.getFonts().cmex10, '\241');

		setMetrics('\051', 408, 750, 250, 36);
		setNextLarger(Configuration.getFonts().cmex10, '\242');

		setMetrics('\052', 511, 750, 0, 149);

		setMetrics('\053', 766, 561, 56, 36);

		setMetrics('\054', 306, 105, 194);

		setMetrics('\055', 357, 430, 0, 28);
		setLigatures('\055', '\173');

		setMetrics('\056', 306, 105);

		setMetrics('\057', 511, 750, 250, 161);
		setNextLarger(Configuration.getFonts().cmex10, '\261');

		setMetrics('\060', 511, 644, 0, 135);

		setMetrics('\061', 511, 644, 0, 135);

		setMetrics('\062', 511, 644, 0, 135);

		setMetrics('\063', 511, 644, 0, 135);

		setMetrics('\064', 511, 644, 194, 135);

		setMetrics('\065', 511, 644, 0, 135);

		setMetrics('\066', 511, 644, 0, 135);

		setMetrics('\067', 511, 644, 194, 135);

		setMetrics('\070', 511, 644, 0, 135);

		setMetrics('\071', 511, 644, 0, 135);

		setMetrics('\072', 306, 430, 0, 58);

		setMetrics('\073', 306, 430, 194, 58);

		setMetrics('\074', 306, 500, 194, 75);

		setMetrics('\075', 766, 366, -133, 66);

		setMetrics('\076', 511, 500, 194);

		setMetrics('\077', 511, 694, 0, 122);
		setLigatures('\140', '\076');

		setMetrics('\100', 766, 694, 0, 95);

		setMetrics('\101', 743, 683);
		setKern(new char[] {'\156', '\154', '\162', '\165', '\155', '\164', '\151', '\103', '\117', '\107', '\150', '\142', '\125', '\153', '\166', '\167', '\121', '\124', '\131', '\126', '\127', '\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -76, -76, -102, -102, -51, -51, -51, -51, -51, -51, -51});

		setMetrics('\102', 703, 683, 0, 102);

		setMetrics('\103', 715, 683, 0, 145);

		setMetrics('\104', 754, 683, 0, 94);
		setKern(new char[] {'\130', '\127', '\101', '\126', '\131'}, new int[] {-25, -25, -25, -25, -25});

		setMetrics('\105', 678, 683, 0, 120);

		setMetrics('\106', 652, 683, 0, 133);
		setKern(new char[] {'\157', '\145', '\165', '\162', '\141', '\101', '\117', '\103', '\107', '\121'}, new int[] {-76, -76, -76, -76, -76, -102, -25, -25, -25, -25});

		setMetrics('\107', 773, 683, 0, 87);

		setMetrics('\110', 743, 683, 0, 163);

		setMetrics('\111', 385, 683, 0, 158);

		setMetrics('\112', 524, 683, 0, 140);

		setMetrics('\113', 768, 683, 0, 145);
		setKern(new char[] {'\117', '\103', '\107', '\121'}, new int[] {-25, -25, -25, -25});

		setMetrics('\114', 627, 683);
		setKern(new char[] {'\124', '\131', '\126', '\127', '\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-76, -76, -102, -102, -51, -51, -51, -51, -51, -51, -51});

		setMetrics('\115', 896, 683, 0, 163);

		setMetrics('\116', 743, 683, 0, 163);

		setMetrics('\117', 766, 683, 0, 94);
		setKern(new char[] {'\130', '\127', '\101', '\126', '\131'}, new int[] {-25, -25, -25, -25, -25});

		setMetrics('\120', 678, 683, 0, 102);
		setKern(new char[] {'\101'}, new int[] {-76});

		setMetrics('\121', 766, 683, 194, 94);

		setMetrics('\122', 729, 683, 0, 38);
		setKern(new char[] {'\156', '\154', '\162', '\165', '\155', '\164', '\151', '\103', '\117', '\107', '\150', '\142', '\125', '\153', '\166', '\167', '\121', '\124', '\131', '\126', '\127', '\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -25, -76, -76, -102, -102, -51, -51, -51, -51, -51, -51, -51});

		setMetrics('\123', 562, 683, 0, 119);

		setMetrics('\124', 715, 683, 0, 133);
		setKern(new char[] {'\171', '\145', '\157', '\162', '\141', '\165', '\101'}, new int[] {-76, -76, -76, -76, -76, -76, -76});

		setMetrics('\125', 743, 683, 0, 163);

		setMetrics('\126', 743, 683, 0, 183);
		setKern(new char[] {'\157', '\145', '\165', '\162', '\141', '\101', '\117', '\103', '\107', '\121'}, new int[] {-76, -76, -76, -76, -76, -102, -25, -25, -25, -25});

		setMetrics('\127', 998, 683, 0, 183);
		setKern(new char[] {'\101'}, new int[] {-76});

		setMetrics('\130', 743, 683, 0, 158);
		setKern(new char[] {'\117', '\103', '\107', '\121'}, new int[] {-25, -25, -25, -25});

		setMetrics('\131', 743, 683, 0, 193);
		setKern(new char[] {'\145', '\157', '\162', '\141', '\165', '\101'}, new int[] {-76, -76, -76, -76, -76, -76});

		setMetrics('\132', 613, 683, 0, 145);

		setMetrics('\133', 306, 750, 250, 187);
		setNextLarger(Configuration.getFonts().cmex10, '\243');

		setMetrics('\134', 514, 694, 0, 168);

		setMetrics('\135', 306, 750, 250, 105);
		setNextLarger(Configuration.getFonts().cmex10, '\244');

		setMetrics('\136', 511, 694, 0, 66);

		setMetrics('\137', 306, 667, 0, 117);

		setMetrics('\140', 306, 694, 0, 124);
		setLigatures('\140', '\134');

		setMetrics('\141', 511, 430, 0, 76);

		setMetrics('\142', 459, 694, 0, 63);
		setKern(new char[] {'\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-51, -51, -51, -51, -51, -51, -51});

		setMetrics('\143', 459, 430, 0, 56);
		setKern(new char[] {'\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-51, -51, -51, -51, -51, -51, -51});

		setMetrics('\144', 511, 694, 0, 103);
		setKern(new char[] {'\154'}, new int[] {51});

		setMetrics('\145', 459, 430, 0, 75);
		setKern(new char[] {'\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-51, -51, -51, -51, -51, -51, -51});

		setMetrics('\146', 306, 694, 194, 211);
		setLigatures('\151', '\257', '\146', '\256', '\154', '\260');
		setKern(new char[] {'\047', '\077', '\041', '\051', '\135'}, new int[] {104, 104, 104, 104, 104});

		setMetrics('\147', 459, 430, 194, 88);

		setMetrics('\150', 511, 694, 0, 76);

		setMetrics('\151', 306, 655, 0, 101);

		setMetrics('\152', 306, 655, 194, 144);

		setMetrics('\153', 459, 694, 0, 107);

		setMetrics('\154', 255, 694, 0, 103);
		setKern(new char[] {'\154'}, new int[] {51});

		setMetrics('\155', 817, 430, 0, 76);

		setMetrics('\156', 562, 430, 0, 76);
		setKern(new char[] {'\047'}, new int[] {-102});

		setMetrics('\157', 511, 430, 0, 63);
		setKern(new char[] {'\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-51, -51, -51, -51, -51, -51, -51});

		setMetrics('\160', 511, 430, 194, 63);
		setKern(new char[] {'\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-51, -51, -51, -51, -51, -51, -51});

		setMetrics('\161', 459, 430, 194, 88);

		setMetrics('\162', 421, 430, 0, 107);
		setKern(new char[] {'\145', '\141', '\157', '\144', '\143', '\147', '\161'}, new int[] {-51, -51, -51, -51, -51, -51, -51});

		setMetrics('\163', 408, 430, 0, 82);

		setMetrics('\164', 332, 615, 0, 94);

		setMetrics('\165', 536, 430, 0, 76);

		setMetrics('\166', 459, 430, 0, 107);

		setMetrics('\167', 664, 430, 0, 107);
		setKern(new char[] {'\154'}, new int[] {51});

		setMetrics('\170', 463, 430, 0, 120);

		setMetrics('\171', 485, 430, 194, 88);

		setMetrics('\172', 408, 430, 0, 122);

		setMetrics('\173', 511, 430, 0, 92);
		setLigatures('\055', '\174');

		setMetrics('\174', 1022, 430, 0, 92);

		setMetrics('\175', 511, 694, 0, 122);

		setMetrics('\176', 511, 667, 0, 115);

		setMetrics('\304', 511, 667, 0, 104);

		setMetrics('\305', 306, 22, 178, 178);

	}
}
