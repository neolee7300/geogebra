package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.UniFontInfo;

final class FCMRPG extends UniFontInfo {

	FCMRPG(final String ttfPath) {
		super(205, ttfPath, 443, 278, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\040', 278, 0);

		setMetrics('\250', 222, 603, 0, 41);

		setMetrics('\u0374', 194, 701);

		setMetrics('\u0375', 194, 3, 217);

		setMetrics('\u037a', 111, -63, 228);

		setMetrics('\u0384', 167, 701);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-111, -56, -28, -111, -28});

		setMetrics('\u0385', 278, 701);

		setMetrics('\u0387', 278, 431);

		setMetrics('\u0390', 250, 701, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u0391', 750, 717);
		setKern(new char[] {'\u0398', '\u039f', '\u03a4', '\u03a5', '\u03a6', '\u03a8', '\u03ab'}, new int[] {-83, -83, -83, -139, -83, -122, -139});

		setMetrics('\u0392', 708, 685);

		setMetrics('\u0393', 625, 681);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-133, -111, -122, -133});

		setMetrics('\u0394', 833, 718);
		setKern(new char[] {'\u039f', '\u03a5', '\u03ab'}, new int[] {-33, -139, -139});

		setMetrics('\u0395', 680, 681);

		setMetrics('\u0396', 611, 685);

		setMetrics('\u0397', 750, 684);

		setMetrics('\u0398', 778, 706, 21);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-83, -83});

		setMetrics('\u0399', 361, 684);

		setMetrics('\u039a', 778, 684);
		setKern(new char[] {'\u039f'}, new int[] {-83});

		setMetrics('\u039b', 694, 718);
		setKern(new char[] {'\u039f', '\u03a5', '\u03ab'}, new int[] {-33, -100, -100});

		setMetrics('\u039c', 916, 684);

		setMetrics('\u039d', 750, 684);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-83, -83});

		setMetrics('\u039e', 667, 678);

		setMetrics('\u039f', 778, 706, 21);
		setKern(new char[] {'\u0391', '\u03a3', '\u1fbc'}, new int[] {-83, -56, -83});

		setMetrics('\u03a0', 750, 681);

		setMetrics('\u03a1', 680, 685);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-167, -167});

		setMetrics('\u03a3', 722, 684);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-28, -28});

		setMetrics('\u03a4', 722, 678);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-83, -83});

		setMetrics('\u03a5', 778, 707);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-139, -139, -139, -139});

		setMetrics('\u03a6', 722, 684);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-83, -83});

		setMetrics('\u03a7', 750, 684);

		setMetrics('\u03a8', 778, 684);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-122, -122});

		setMetrics('\u03a9', 722, 706);

		setMetrics('\u03aa', 361, 833);

		setMetrics('\u03ab', 778, 833);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-139, -139, -139, -139});

		setMetrics('\u03ac', 500, 702, 11, 1);

		setMetrics('\u03ad', 430, 701, 21);

		setMetrics('\u03ae', 500, 701, 271);

		setMetrics('\u03af', 250, 701, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -28, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u03b0', 500, 702, 10);

		setMetrics('\u03b1', 500, 443, 11, 1);

		setMetrics('\u03b2', 500, 706, 276);

		setMetrics('\u03b3', 555, 442, 200);

		setMetrics('\u03b4', 472, 700, 10);

		setMetrics('\u03b5', 430, 454, 21);

		setMetrics('\u03b6', 472, 718, 139);

		setMetrics('\u03b7', 500, 454, 271);

		setMetrics('\u03b8', 472, 717, 22);

		setMetrics('\u03b9', 250, 443, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -28, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u03ba', 528, 454, 22);

		setMetrics('\u03bb', 500, 697, 10);

		setMetrics('\u03bc', 519, 453, 260);

		setMetrics('\u03bd', 472, 443, 10);

		setMetrics('\u03be', 472, 717, 139);

		setMetrics('\u03bf', 528, 443, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-28, -28, -22, -22, -28});

		setMetrics('\u03c0', 514, 432, 18);

		setMetrics('\u03c1', 472, 442, 261);

		setMetrics('\u03c2', 444, 443, 125);

		setMetrics('\u03c3', 569, 432, 10);

		setMetrics('\u03c4', 458, 432, 10);
		setKern(new char[] {'\u03ac', '\u03b1', '\u03bf', '\u03c9', '\u03cc', '\u03ce', '\u1f00', '\u1f01', '\u1f04', '\u1f05', '\u1f06', '\u1f07', '\u1f40', '\u1f41', '\u1f44', '\u1f45', '\u1f60', '\u1f61', '\u1f64', '\u1f65', '\u1f66', '\u1f67', '\u1f70', '\u1f78', '\u1f7c', '\u1f80', '\u1f81', '\u1f84', '\u1f85', '\u1f86', '\u1f87', '\u1fa0', '\u1fa1', '\u1fa4', '\u1fa5', '\u1fa6', '\u1fa7', '\u1fb2', '\u1fb4', '\u1fb6', '\u1fb7', '\u1ff2', '\u1ff4', '\u1ff6', '\u1ff7'}, new int[] {-28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28, -28});

		setMetrics('\u03c5', 500, 457, 10);

		setMetrics('\u03c6', 583, 455, 275);

		setMetrics('\u03c7', 555, 444, 262);

		setMetrics('\u03c8', 583, 720, 276);

		setMetrics('\u03c9', 667, 453, 11);

		setMetrics('\u03ca', 250, 626, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u03cb', 500, 626, 10);

		setMetrics('\u03cc', 528, 701, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-28, -28, -22, -22, -28});

		setMetrics('\u03cd', 500, 702, 10);

		setMetrics('\u03ce', 667, 701, 11);

		setMetrics('\u03d1', 569, 707, 11);

		setMetrics('\u03d8', 500, 695, 1);

		setMetrics('\u03d9', 500, 599, 63);

		setMetrics('\u03da', 778, 679);

		setMetrics('\u03db', 500, 454, 27);

		setMetrics('\u03dc', 653, 681);

		setMetrics('\u03dd', 500, 432, 257);

		setMetrics('\u03df', 389, 595, 138);

		setMetrics('\u03e0', 766, 695);

		setMetrics('\u03e1', 722, 696, 22);

		setMetrics('\u1f00', 500, 696, 11, 1);

		setMetrics('\u1f01', 500, 696, 11, 1);

		setMetrics('\u1f02', 500, 702, 11, 1);

		setMetrics('\u1f03', 500, 702, 11, 1);

		setMetrics('\u1f04', 500, 701, 11, 1);

		setMetrics('\u1f05', 500, 701, 11, 1);

		setMetrics('\u1f06', 500, 696, 11, 1);

		setMetrics('\u1f07', 500, 696, 11, 1);

		setMetrics('\u1f10', 430, 696, 21);

		setMetrics('\u1f11', 430, 696, 21);

		setMetrics('\u1f12', 430, 701, 21);

		setMetrics('\u1f13', 430, 701, 21);

		setMetrics('\u1f14', 430, 701, 21);

		setMetrics('\u1f15', 430, 701, 21);

		setMetrics('\u1f20', 500, 696, 271);

		setMetrics('\u1f21', 500, 696, 271);

		setMetrics('\u1f22', 500, 701, 271);

		setMetrics('\u1f23', 500, 701, 271);

		setMetrics('\u1f24', 500, 701, 271);

		setMetrics('\u1f25', 500, 701, 271);

		setMetrics('\u1f26', 500, 696, 271);

		setMetrics('\u1f27', 500, 696, 271);

		setMetrics('\u1f30', 250, 696, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -28, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1f31', 250, 696, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -28, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1f32', 250, 701, 12);

		setMetrics('\u1f33', 250, 701, 12);

		setMetrics('\u1f34', 250, 701, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1f35', 250, 701, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1f36', 250, 696, 12, 8);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1f37', 250, 696, 12, 8);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1f40', 528, 696, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-28, -28, -22, -22, -28});

		setMetrics('\u1f41', 528, 696, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-28, -28, -22, -22, -28});

		setMetrics('\u1f42', 528, 701, 11);

		setMetrics('\u1f43', 528, 701, 11);

		setMetrics('\u1f44', 528, 701, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-28, -28, -22, -22, -28});

		setMetrics('\u1f45', 528, 701, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-28, -28, -22, -22, -28});

		setMetrics('\u1f50', 500, 696, 10);

		setMetrics('\u1f51', 500, 696, 10);

		setMetrics('\u1f52', 500, 701, 10);

		setMetrics('\u1f53', 500, 701, 10);

		setMetrics('\u1f54', 500, 701, 10);

		setMetrics('\u1f55', 500, 701, 10);

		setMetrics('\u1f56', 500, 696, 10);

		setMetrics('\u1f57', 500, 696, 10);

		setMetrics('\u1f60', 667, 696, 11);

		setMetrics('\u1f61', 667, 696, 11);

		setMetrics('\u1f62', 667, 702, 11);

		setMetrics('\u1f63', 667, 702, 11);

		setMetrics('\u1f64', 667, 701, 11);

		setMetrics('\u1f65', 667, 701, 11);

		setMetrics('\u1f66', 667, 696, 11);

		setMetrics('\u1f67', 667, 696, 11);

		setMetrics('\u1f70', 500, 701, 11, 1);

		setMetrics('\u1f72', 430, 701, 21);

		setMetrics('\u1f74', 500, 701, 271);

		setMetrics('\u1f76', 250, 701, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1f78', 528, 701, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-28, -28, -22, -22, -28});

		setMetrics('\u1f7a', 500, 701, 10);

		setMetrics('\u1f7c', 667, 701, 11);

		setMetrics('\u1f80', 500, 696, 228, 1);

		setMetrics('\u1f81', 500, 696, 228, 1);

		setMetrics('\u1f82', 500, 702, 228, 1);

		setMetrics('\u1f83', 500, 702, 228, 1);

		setMetrics('\u1f84', 500, 701, 228, 1);

		setMetrics('\u1f85', 500, 701, 228, 1);

		setMetrics('\u1f86', 500, 696, 228, 1);

		setMetrics('\u1f87', 500, 696, 228, 1);

		setMetrics('\u1f90', 500, 696, 271);

		setMetrics('\u1f91', 500, 696, 271);

		setMetrics('\u1f92', 500, 701, 271);

		setMetrics('\u1f93', 500, 701, 271);

		setMetrics('\u1f94', 500, 701, 271);

		setMetrics('\u1f95', 500, 701, 271);

		setMetrics('\u1f96', 500, 696, 271);

		setMetrics('\u1f97', 500, 696, 271);

		setMetrics('\u1fa0', 667, 696, 228);

		setMetrics('\u1fa1', 667, 696, 228);

		setMetrics('\u1fa2', 667, 702, 228);

		setMetrics('\u1fa3', 667, 702, 228);

		setMetrics('\u1fa4', 667, 701, 228);

		setMetrics('\u1fa5', 667, 701, 228);

		setMetrics('\u1fa6', 667, 696, 228);

		setMetrics('\u1fa7', 667, 696, 228);

		setMetrics('\u1fb2', 500, 701, 228, 1);

		setMetrics('\u1fb3', 500, 443, 228, 1);

		setMetrics('\u1fb4', 500, 702, 228, 1);

		setMetrics('\u1fb6', 500, 627, 11, 1);

		setMetrics('\u1fb7', 500, 627, 228, 1);

		setMetrics('\u1fbc', 750, 717, 228);
		setKern(new char[] {'\u0398', '\u039f', '\u03a4', '\u03a5', '\u03a6', '\u03a8', '\u03ab'}, new int[] {-83, -83, -83, -139, -83, -122, -139});

		setMetrics('\u1fbe', 222, 158, 156);

		setMetrics('\u1fbf', 222, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-139, -56, -28, -139, -28});

		setMetrics('\u1fc0', 333, 627);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-111, -111});

		setMetrics('\u1fc1', 444, 696);

		setMetrics('\u1fc2', 500, 701, 271);

		setMetrics('\u1fc3', 500, 454, 271);

		setMetrics('\u1fc4', 500, 701, 271);

		setMetrics('\u1fc6', 500, 627, 271);

		setMetrics('\u1fc7', 500, 627, 271);

		setMetrics('\u1fcc', 750, 684, 228);

		setMetrics('\u1fcd', 278, 701, 0, 16);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-83, -28, -83});

		setMetrics('\u1fce', 278, 701, 0, 12);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-83, -28, -83});

		setMetrics('\u1fcf', 333, 696);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-111, -111});

		setMetrics('\u1fd2', 250, 701, 12);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -28, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1fd6', 250, 627, 12, 8);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1fd7', 250, 696, 12, 8);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-28, -17, -17, -56, -28, -28, -28, -28, -28, -17});

		setMetrics('\u1fdd', 278, 701, 0, 16);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-83, -28, -83});

		setMetrics('\u1fde', 278, 701, 0, 12);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-83, -28, -83});

		setMetrics('\u1fdf', 333, 696);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-111, -111});

		setMetrics('\u1fe2', 500, 701, 10);

		setMetrics('\u1fe4', 472, 696, 261);

		setMetrics('\u1fe5', 472, 696, 261);

		setMetrics('\u1fe6', 500, 627, 10);

		setMetrics('\u1fe7', 500, 696, 10);

		setMetrics('\u1fed', 278, 701);

		setMetrics('\u1fef', 167, 701);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-111, -56, -28, -111, -28});

		setMetrics('\u1ff2', 667, 701, 228);

		setMetrics('\u1ff3', 667, 453, 228);

		setMetrics('\u1ff4', 667, 701, 228);

		setMetrics('\u1ff6', 667, 628, 11);

		setMetrics('\u1ff7', 667, 628, 228);

		setMetrics('\u1ffc', 722, 706, 228);

		setMetrics('\u1ffe', 222, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-167, -56, -28, -167, -28});

		setMetrics('\u2019', 278, 695);

		setMetrics('\u2329', 389, 751, 249);

		setMetrics('\u232a', 389, 751, 250);

	}
}
