package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;

final class CMSSI10 extends FontInfo {

	CMSSI10(final String ttfPath) {
		super(0, ttfPath, 444, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\241', 541, 694, 0, 133);

		setMetrics('\242', 833, 694);

		setMetrics('\243', 777, 694, 0, 75);

		setMetrics('\244', 611, 694);

		setMetrics('\245', 666, 694, 0, 128);

		setMetrics('\246', 708, 694, 0, 80);

		setMetrics('\247', 722, 694, 0, 119);

		setMetrics('\250', 777, 694, 0, 90);

		setMetrics('\251', 722, 694, 0, 46);

		setMetrics('\252', 777, 694, 0, 90);

		setMetrics('\253', 722, 694, 0, 82);

		setMetrics('\256', 583, 694, 0, 217);
		setLigatures('\151', '\261', '\154', '\262');
		setKern(new char[] {'\047', '\077', '\041', '\051', '\135'}, new int[] {69, 69, 69, 69, 69});

		setMetrics('\257', 536, 694, 0, 97);

		setMetrics('\260', 536, 694, 0, 94);

		setMetrics('\261', 813, 694, 0, 97);

		setMetrics('\262', 813, 694, 0, 94);

		setMetrics('\263', 238, 444, 0, 41);

		setMetrics('\264', 266, 444, 194, 41);

		setMetrics('\265', 500, 694);

		setMetrics('\266', 500, 694, 0, 92);

		setMetrics('\267', 500, 631, 0, 84);

		setMetrics('\270', 500, 694, 0, 94);

		setMetrics('\271', 500, 608, 0, 87);

		setMetrics('\272', 737, 694);

		setMetrics('\273', 444, 0, 170);

		setMetrics('\274', 480, 694, 0, 92);

		setMetrics('\275', 722, 444, 0, 67);

		setMetrics('\276', 777, 444, 0, 67);

		setMetrics('\277', 500, 541, 97, 48);

		setMetrics('\300', 861, 694, 0, 119);

		setMetrics('\301', 972, 694, 0, 119);

		setMetrics('\302', 777, 743, 48, 75);

		setMetrics('\303', 238, 444);
		setKern(new char[] {'\154', '\114'}, new int[] {-238, -258});

		setMetrics('\041', 319, 694, 0, 57);
		setLigatures('\140', '\074');

		setMetrics('\042', 500, 694, 0, 3);

		setMetrics('\043', 833, 694, 194, 50);

		setMetrics('\044', 500, 750, 55, 111);

		setMetrics('\045', 833, 750, 55, 31);

		setMetrics('\046', 758, 694, 0, 30);

		setMetrics('\047', 277, 694, 0, 78);
		setLigatures('\047', '\042');
		setKern(new char[] {'\077', '\041'}, new int[] {111, 111});

		setMetrics('\050', 388, 750, 250, 131);
		setNextLarger(Configuration.getFonts().cmex10, '\241');

		setMetrics('\051', 388, 750, 250, 25);
		setNextLarger(Configuration.getFonts().cmex10, '\242');

		setMetrics('\052', 500, 750, 0, 117);

		setMetrics('\053', 777, 583, 83, 25);

		setMetrics('\054', 277, 83, 125);

		setMetrics('\055', 333, 444, 0, 19);
		setLigatures('\055', '\173');

		setMetrics('\056', 277, 83);

		setMetrics('\057', 500, 750, 250, 131);
		setNextLarger(Configuration.getFonts().cmex10, '\261');

		setMetrics('\060', 500, 655, 0, 111);

		setMetrics('\061', 500, 655, 0, 111);

		setMetrics('\062', 500, 655, 0, 111);

		setMetrics('\063', 500, 655, 0, 111);

		setMetrics('\064', 500, 655, 0, 111);

		setMetrics('\065', 500, 655, 0, 111);

		setMetrics('\066', 500, 655, 0, 111);

		setMetrics('\067', 500, 655, 0, 111);

		setMetrics('\070', 500, 655, 0, 111);

		setMetrics('\071', 500, 655, 0, 111);

		setMetrics('\072', 277, 444, 0, 25);

		setMetrics('\073', 277, 444, 125, 25);

		setMetrics('\074', 319, 500, 194, 15);

		setMetrics('\075', 777, 370, -130, 50);

		setMetrics('\076', 472, 500, 194);

		setMetrics('\077', 472, 694, 0, 118);
		setLigatures('\140', '\076');

		setMetrics('\100', 666, 694, 0, 75);

		setMetrics('\101', 666, 694);
		setKern(new char[] {'\164', '\103', '\117', '\107', '\125', '\121', '\124', '\131', '\126', '\127'}, new int[] {-27, -27, -27, -27, -27, -27, -83, -83, -111, -111});

		setMetrics('\102', 666, 694, 0, 82);

		setMetrics('\103', 638, 694, 0, 119);

		setMetrics('\104', 722, 694, 0, 75);
		setKern(new char[] {'\130', '\127', '\101', '\126', '\131'}, new int[] {-27, -27, -27, -27, -27});

		setMetrics('\105', 597, 694, 0, 119);

		setMetrics('\106', 569, 694, 0, 133);
		setKern(new char[] {'\157', '\145', '\165', '\162', '\141', '\101', '\117', '\103', '\107', '\121'}, new int[] {-27, -27, -27, -27, -27, -83, -27, -27, -27, -27});

		setMetrics('\107', 666, 694, 0, 119);

		setMetrics('\110', 708, 694, 0, 80);

		setMetrics('\111', 277, 694, 0, 133);
		setKern(new char[] {'\111'}, new int[] {27});

		setMetrics('\112', 472, 694, 0, 80);

		setMetrics('\113', 694, 694, 0, 119);
		setKern(new char[] {'\117', '\103', '\107', '\121'}, new int[] {-27, -27, -27, -27});

		setMetrics('\114', 541, 694);
		setKern(new char[] {'\124', '\131', '\126', '\127'}, new int[] {-83, -83, -111, -111});

		setMetrics('\115', 875, 694, 0, 80);

		setMetrics('\116', 708, 694, 0, 80);

		setMetrics('\117', 736, 694, 0, 75);
		setKern(new char[] {'\130', '\127', '\101', '\126', '\131'}, new int[] {-27, -27, -27, -27, -27});

		setMetrics('\120', 638, 694, 0, 82);
		setKern(new char[] {'\101', '\157', '\145', '\141', '\056', '\054'}, new int[] {-83, -27, -27, -27, -83, -83});

		setMetrics('\121', 736, 694, 125, 75);

		setMetrics('\122', 645, 694, 0, 82);

		setMetrics('\123', 555, 694, 0, 92);

		setMetrics('\124', 680, 694, 0, 133);
		setKern(new char[] {'\171', '\145', '\157', '\162', '\141', '\101', '\165'}, new int[] {-83, -83, -83, -83, -83, -83, -83});

		setMetrics('\125', 687, 694, 0, 80);

		setMetrics('\126', 666, 694, 0, 161);
		setKern(new char[] {'\157', '\145', '\165', '\162', '\141', '\101', '\117', '\103', '\107', '\121'}, new int[] {-27, -27, -27, -27, -27, -83, -27, -27, -27, -27});

		setMetrics('\127', 944, 694, 0, 161);
		setKern(new char[] {'\157', '\145', '\165', '\162', '\141', '\101', '\117', '\103', '\107', '\121'}, new int[] {-27, -27, -27, -27, -27, -83, -27, -27, -27, -27});

		setMetrics('\130', 666, 694, 0, 133);
		setKern(new char[] {'\117', '\103', '\107', '\121'}, new int[] {-27, -27, -27, -27});

		setMetrics('\131', 666, 694, 0, 172);
		setKern(new char[] {'\145', '\157', '\162', '\141', '\101', '\165'}, new int[] {-83, -83, -83, -83, -83, -83});

		setMetrics('\132', 611, 694, 0, 119);

		setMetrics('\133', 288, 750, 250, 159);
		setNextLarger(Configuration.getFonts().cmex10, '\243');

		setMetrics('\134', 500, 694, 0, 142);

		setMetrics('\135', 288, 750, 250, 87);
		setNextLarger(Configuration.getFonts().cmex10, '\244');

		setMetrics('\136', 500, 694, 0, 79);

		setMetrics('\137', 277, 679, 0, 77);

		setMetrics('\140', 277, 694, 0, 78);
		setLigatures('\140', '\134');

		setMetrics('\141', 480, 444, 0, 9);
		setKern(new char[] {'\162', '\171', '\167'}, new int[] {-27, -27, -27});

		setMetrics('\142', 516, 694, 0, 30);
		setKern(new char[] {'\145', '\157', '\170', '\144', '\143', '\161', '\162', '\171', '\167'}, new int[] {27, 27, -27, 27, 27, 27, -27, -27, -27});

		setMetrics('\143', 444, 444, 0, 83);

		setMetrics('\144', 516, 694, 0, 94);

		setMetrics('\145', 444, 444, 0, 67);

		setMetrics('\146', 305, 694, 0, 217);
		setLigatures('\151', '\257', '\146', '\256', '\154', '\260');
		setKern(new char[] {'\047', '\077', '\041', '\051', '\135'}, new int[] {69, 69, 69, 69, 69});

		setMetrics('\147', 500, 444, 194, 108);
		setKern(new char[] {'\152'}, new int[] {27});

		setMetrics('\150', 516, 694, 0, 17);

		setMetrics('\151', 238, 679, 0, 97);

		setMetrics('\152', 266, 679, 194, 91);

		setMetrics('\153', 488, 694, 0, 83);
		setKern(new char[] {'\145', '\141', '\157', '\143'}, new int[] {-27, -27, -27, -27});

		setMetrics('\154', 238, 694, 0, 94);

		setMetrics('\155', 794, 444, 0, 17);

		setMetrics('\156', 516, 444, 0, 17);

		setMetrics('\157', 500, 444, 0, 66);
		setKern(new char[] {'\145', '\157', '\170', '\144', '\143', '\161', '\162', '\171', '\167'}, new int[] {27, 27, -27, 27, 27, 27, -27, -27, -27});

		setMetrics('\160', 516, 444, 194, 38);
		setKern(new char[] {'\145', '\157', '\170', '\144', '\143', '\161', '\162', '\171', '\167'}, new int[] {27, 27, -27, 27, 27, 27, -27, -27, -27});

		setMetrics('\161', 516, 444, 194, 41);

		setMetrics('\162', 341, 444, 0, 108);

		setMetrics('\163', 383, 444, 0, 77);

		setMetrics('\164', 361, 571, 0, 72);
		setKern(new char[] {'\171', '\167'}, new int[] {-27, -27});

		setMetrics('\165', 516, 444, 0, 41);
		setKern(new char[] {'\167'}, new int[] {-27});

		setMetrics('\166', 461, 444, 0, 108);

		setMetrics('\167', 683, 444, 0, 108);
		setKern(new char[] {'\145', '\141', '\157', '\143'}, new int[] {-27, -27, -27, -27});

		setMetrics('\170', 461, 444, 0, 91);

		setMetrics('\171', 461, 444, 194, 108);
		setKern(new char[] {'\157', '\145', '\141', '\056', '\054'}, new int[] {-27, -27, -27, -83, -83});

		setMetrics('\172', 434, 444, 0, 87);

		setMetrics('\173', 500, 444, 0, 86);
		setLigatures('\055', '\174');

		setMetrics('\174', 1000, 444, 0, 86);

		setMetrics('\175', 500, 694, 0, 92);

		setMetrics('\176', 500, 676, 0, 88);

		setMetrics('\304', 500, 679, 0, 63);

		setMetrics('\305', 277, 48, 212);

	}
}
