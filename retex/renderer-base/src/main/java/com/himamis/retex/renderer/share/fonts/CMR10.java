package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;

final class CMR10 extends FontInfo {

	CMR10(final String ttfPath) {
		super(0, ttfPath, 430, 333, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\241', 625, 683);

		setMetrics('\242', 833, 683);

		setMetrics('\243', 777, 683);

		setMetrics('\244', 694, 683);

		setMetrics('\245', 666, 683);

		setMetrics('\246', 750, 683);

		setMetrics('\247', 722, 683);

		setMetrics('\250', 777, 683);

		setMetrics('\251', 722, 683);

		setMetrics('\252', 777, 683);

		setMetrics('\253', 722, 683);

		setMetrics('\256', 583, 694, 0, 77);
		setLigatures('\151', '\261', '\154', '\262');
		setKern(new char[] {'\047', '\077', '\041', '\051', '\135'}, new int[] {77, 77, 77, 77, 77});

		setMetrics('\257', 555, 694);

		setMetrics('\260', 555, 694);

		setMetrics('\261', 833, 694);

		setMetrics('\262', 833, 694);

		setMetrics('\263', 277, 430);

		setMetrics('\264', 305, 430, 194);

		setMetrics('\265', 500, 694);

		setMetrics('\266', 500, 694);

		setMetrics('\267', 500, 628);

		setMetrics('\270', 500, 694);

		setMetrics('\271', 500, 567);

		setMetrics('\272', 750, 694);

		setMetrics('\273', 444, 0, 170);

		setMetrics('\274', 500, 694);

		setMetrics('\275', 722, 430);

		setMetrics('\276', 777, 430);

		setMetrics('\277', 500, 527, 97);

		setMetrics('\300', 902, 683);

		setMetrics('\301', 1013, 683);

		setMetrics('\302', 777, 731, 48);

		setMetrics('\303', 277, 430);
		setKern(new char[] {'\154', '\114'}, new int[] {-277, -319});

		setMetrics('\041', 277, 694);
		setLigatures('\140', '\074');

		setMetrics('\042', 500, 694);

		setMetrics('\043', 833, 694, 194);

		setMetrics('\044', 500, 750, 55);

		setMetrics('\045', 833, 750, 55);

		setMetrics('\046', 777, 694);

		setMetrics('\047', 277, 694);
		setLigatures('\047', '\042');
		setKern(new char[] {'\077', '\041'}, new int[] {111, 111});

		setMetrics('\050', 388, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\241');

		setMetrics('\051', 388, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\242');

		setMetrics('\052', 500, 750);

		setMetrics('\053', 777, 583, 83);

		setMetrics('\054', 277, 105, 194);

		setMetrics('\055', 333, 430);
		setLigatures('\055', '\173');

		setMetrics('\056', 277, 105);

		setMetrics('\057', 500, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\261');

		setMetrics('\060', 500, 644);

		setMetrics('\061', 500, 644);

		setMetrics('\062', 500, 644);

		setMetrics('\063', 500, 644);

		setMetrics('\064', 500, 644);

		setMetrics('\065', 500, 644);

		setMetrics('\066', 500, 644);

		setMetrics('\067', 500, 644);

		setMetrics('\070', 500, 644);

		setMetrics('\071', 500, 644);

		setMetrics('\072', 277, 430);

		setMetrics('\073', 277, 430, 194);

		setMetrics('\074', 277, 500, 194);

		setMetrics('\075', 777, 366, -133);

		setMetrics('\076', 472, 500, 194);

		setMetrics('\077', 472, 694);
		setLigatures('\140', '\076');

		setMetrics('\100', 777, 694);

		setMetrics('\101', 750, 683);
		setKern(new char[] {'\164', '\103', '\117', '\107', '\125', '\121', '\124', '\131', '\126', '\127'}, new int[] {-27, -27, -27, -27, -27, -27, -83, -83, -111, -111});

		setMetrics('\102', 708, 683);

		setMetrics('\103', 722, 683);

		setMetrics('\104', 763, 683);
		setKern(new char[] {'\130', '\127', '\101', '\126', '\131'}, new int[] {-27, -27, -27, -27, -27});

		setMetrics('\105', 680, 683);

		setMetrics('\106', 652, 683);
		setKern(new char[] {'\157', '\145', '\165', '\162', '\141', '\101', '\117', '\103', '\107', '\121'}, new int[] {-83, -83, -83, -83, -83, -111, -27, -27, -27, -27});

		setMetrics('\107', 784, 683);

		setMetrics('\110', 750, 683);

		setMetrics('\111', 361, 683);
		setKern(new char[] {'\111'}, new int[] {27});

		setMetrics('\112', 513, 683);

		setMetrics('\113', 777, 683);
		setKern(new char[] {'\117', '\103', '\107', '\121'}, new int[] {-27, -27, -27, -27});

		setMetrics('\114', 625, 683);
		setKern(new char[] {'\124', '\131', '\126', '\127'}, new int[] {-83, -83, -111, -111});

		setMetrics('\115', 916, 683);

		setMetrics('\116', 750, 683);

		setMetrics('\117', 777, 683);
		setKern(new char[] {'\130', '\127', '\101', '\126', '\131'}, new int[] {-27, -27, -27, -27, -27});

		setMetrics('\120', 680, 683);
		setKern(new char[] {'\101', '\157', '\145', '\141', '\056', '\054'}, new int[] {-83, -27, -27, -27, -83, -83});

		setMetrics('\121', 777, 683, 194);

		setMetrics('\122', 736, 683);
		setKern(new char[] {'\164', '\103', '\117', '\107', '\125', '\121', '\124', '\131', '\126', '\127'}, new int[] {-27, -27, -27, -27, -27, -27, -83, -83, -111, -111});

		setMetrics('\123', 555, 683);

		setMetrics('\124', 722, 683);
		setKern(new char[] {'\171', '\145', '\157', '\162', '\141', '\101', '\165'}, new int[] {-27, -83, -83, -83, -83, -83, -83});

		setMetrics('\125', 750, 683);

		setMetrics('\126', 750, 683, 0, 13);
		setKern(new char[] {'\157', '\145', '\165', '\162', '\141', '\101', '\117', '\103', '\107', '\121'}, new int[] {-83, -83, -83, -83, -83, -111, -27, -27, -27, -27});

		setMetrics('\127', 1027, 683, 0, 13);
		setKern(new char[] {'\157', '\145', '\165', '\162', '\141', '\101', '\117', '\103', '\107', '\121'}, new int[] {-83, -83, -83, -83, -83, -111, -27, -27, -27, -27});

		setMetrics('\130', 750, 683);
		setKern(new char[] {'\117', '\103', '\107', '\121'}, new int[] {-27, -27, -27, -27});

		setMetrics('\131', 750, 683, 0, 25);
		setKern(new char[] {'\145', '\157', '\162', '\141', '\101', '\165'}, new int[] {-83, -83, -83, -83, -83, -83});

		setMetrics('\132', 611, 683);

		setMetrics('\133', 277, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\243');

		setMetrics('\134', 500, 694);

		setMetrics('\135', 277, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, '\244');

		setMetrics('\136', 500, 694);

		setMetrics('\137', 277, 667);

		setMetrics('\140', 277, 694);
		setLigatures('\140', '\134');

		setMetrics('\141', 500, 430);
		setKern(new char[] {'\166', '\152', '\171', '\167'}, new int[] {-27, 55, -27, -27});

		setMetrics('\142', 555, 694);
		setKern(new char[] {'\145', '\157', '\170', '\144', '\143', '\161', '\166', '\152', '\171', '\167'}, new int[] {27, 27, -27, 27, 27, 27, -27, 55, -27, -27});

		setMetrics('\143', 444, 430);
		setKern(new char[] {'\150', '\153'}, new int[] {-27, -27});

		setMetrics('\144', 555, 694);

		setMetrics('\145', 444, 430);

		setMetrics('\146', 305, 694, 0, 77);
		setLigatures('\151', '\257', '\146', '\256', '\154', '\260');
		setKern(new char[] {'\047', '\077', '\041', '\051', '\135'}, new int[] {77, 77, 77, 77, 77});

		setMetrics('\147', 500, 430, 194, 13);
		setKern(new char[] {'\152'}, new int[] {27});

		setMetrics('\150', 555, 694);
		setKern(new char[] {'\164', '\165', '\142', '\171', '\166', '\167'}, new int[] {-27, -27, -27, -27, -27, -27});

		setMetrics('\151', 277, 667);

		setMetrics('\152', 305, 667, 194);

		setMetrics('\153', 527, 694);
		setKern(new char[] {'\141', '\145', '\141', '\157', '\143'}, new int[] {-55, -27, -27, -27, -27});

		setMetrics('\154', 277, 694);

		setMetrics('\155', 833, 430);
		setKern(new char[] {'\164', '\165', '\142', '\171', '\166', '\167'}, new int[] {-27, -27, -27, -27, -27, -27});

		setMetrics('\156', 555, 430);
		setKern(new char[] {'\164', '\165', '\142', '\171', '\166', '\167'}, new int[] {-27, -27, -27, -27, -27, -27});

		setMetrics('\157', 500, 430);
		setKern(new char[] {'\145', '\157', '\170', '\144', '\143', '\161', '\166', '\152', '\171', '\167'}, new int[] {27, 27, -27, 27, 27, 27, -27, 55, -27, -27});

		setMetrics('\160', 555, 430, 194);
		setKern(new char[] {'\145', '\157', '\170', '\144', '\143', '\161', '\166', '\152', '\171', '\167'}, new int[] {27, 27, -27, 27, 27, 27, -27, 55, -27, -27});

		setMetrics('\161', 527, 430, 194);

		setMetrics('\162', 391, 430);

		setMetrics('\163', 394, 430);

		setMetrics('\164', 388, 615);
		setKern(new char[] {'\171', '\167'}, new int[] {-27, -27});

		setMetrics('\165', 555, 430);
		setKern(new char[] {'\167'}, new int[] {-27});

		setMetrics('\166', 527, 430, 0, 13);
		setKern(new char[] {'\141', '\145', '\141', '\157', '\143'}, new int[] {-55, -27, -27, -27, -27});

		setMetrics('\167', 722, 430, 0, 13);
		setKern(new char[] {'\145', '\141', '\157', '\143'}, new int[] {-27, -27, -27, -27});

		setMetrics('\170', 527, 430);

		setMetrics('\171', 527, 430, 194, 13);
		setKern(new char[] {'\157', '\145', '\141', '\056', '\054'}, new int[] {-27, -27, -27, -83, -83});

		setMetrics('\172', 444, 430);

		setMetrics('\173', 500, 430, 0, 27);
		setLigatures('\055', '\174');

		setMetrics('\174', 1000, 430, 0, 27);

		setMetrics('\175', 500, 694);

		setMetrics('\176', 500, 667);

		setMetrics('\304', 500, 667);

		setMetrics('\305', 277, 18, 197);

	}
}
