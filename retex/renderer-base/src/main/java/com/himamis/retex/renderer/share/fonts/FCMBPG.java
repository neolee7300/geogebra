package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;
import com.himamis.retex.renderer.share.UniFontInfo;

final class FCMBPG extends UniFontInfo {

	FCMBPG(final String ttfPath) {
		super(205, ttfPath, 451, 319, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\040', 319, 0);

		setMetrics('\250', 255, 645, 0, 61);

		setMetrics('\u0374', 224, 712);

		setMetrics('\u0375', 224, 7, 216);

		setMetrics('\u037a', 128, -53, 241);

		setMetrics('\u0384', 192, 712);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-128, -64, -32, -128, -32});

		setMetrics('\u0385', 319, 711, 0, 31);

		setMetrics('\u0387', 319, 445);

		setMetrics('\u0390', 287, 711, 7, 28);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u0391', 869, 700);
		setKern(new char[] {'\u0398', '\u039f', '\u03a4', '\u03a5', '\u03a6', '\u03a8', '\u03ab'}, new int[] {-96, -96, -96, -160, -96, -141, -160});

		setMetrics('\u0392', 818, 688);

		setMetrics('\u0393', 691, 681);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-153, -128, -141, -153});

		setMetrics('\u0394', 958, 699);
		setKern(new char[] {'\u039f', '\u03a5', '\u03ab'}, new int[] {-38, -160, -160});

		setMetrics('\u0395', 755, 681);

		setMetrics('\u0396', 703, 687);

		setMetrics('\u0397', 900, 687);

		setMetrics('\u0398', 894, 699, 11);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-96, -96});

		setMetrics('\u0399', 436, 687);

		setMetrics('\u039a', 901, 687);
		setKern(new char[] {'\u039f'}, new int[] {-96});

		setMetrics('\u039b', 805, 700);
		setKern(new char[] {'\u039f', '\u03a5', '\u03ab'}, new int[] {-38, -115, -115});

		setMetrics('\u039c', 1091, 688);

		setMetrics('\u039d', 900, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-96, -96});

		setMetrics('\u039e', 766, 676);

		setMetrics('\u039f', 864, 699, 11);
		setKern(new char[] {'\u0391', '\u03a3', '\u1fbc'}, new int[] {-96, -64, -96});

		setMetrics('\u03a0', 900, 681);

		setMetrics('\u03a1', 786, 688);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-192, -192});

		setMetrics('\u03a3', 830, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-32, -32});

		setMetrics('\u03a4', 800, 676);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-96, -96});

		setMetrics('\u03a5', 894, 699);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-160, -160, -160, -160});

		setMetrics('\u03a6', 830, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-96, -96});

		setMetrics('\u03a7', 869, 687);

		setMetrics('\u03a8', 894, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-141, -141});

		setMetrics('\u03a9', 830, 698);

		setMetrics('\u03aa', 436, 893);

		setMetrics('\u03ab', 894, 892);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-160, -160, -160, -160});

		setMetrics('\u03ac', 575, 711, 6, 29);

		setMetrics('\u03ad', 495, 711, 10);

		setMetrics('\u03ae', 575, 712, 260);

		setMetrics('\u03af', 287, 711, 7);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -31, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u03b0', 575, 712, 6);

		setMetrics('\u03b1', 575, 452, 6, 29);

		setMetrics('\u03b2', 575, 701, 269);

		setMetrics('\u03b3', 639, 452, 200);

		setMetrics('\u03b4', 543, 704, 6);

		setMetrics('\u03b5', 495, 456, 10);

		setMetrics('\u03b6', 543, 707, 207);

		setMetrics('\u03b7', 575, 456, 260);

		setMetrics('\u03b8', 519, 706, 12);

		setMetrics('\u03b9', 287, 452, 7);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -31, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u03ba', 607, 457, 11);

		setMetrics('\u03bb', 575, 698, 5);

		setMetrics('\u03bc', 622, 457, 257);

		setMetrics('\u03bd', 543, 452, 5);

		setMetrics('\u03be', 543, 707, 206);

		setMetrics('\u03bf', 607, 452, 6);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-32, -32, -26, -26, -32});

		setMetrics('\u03c0', 591, 446, 21);

		setMetrics('\u03c1', 543, 452, 256);

		setMetrics('\u03c2', 511, 451, 125);

		setMetrics('\u03c3', 655, 446, 6);

		setMetrics('\u03c4', 527, 446, 6);
		setKern(new char[] {'\u03ac', '\u03b1', '\u03bf', '\u03c9', '\u03cc', '\u03ce', '\u1f00', '\u1f01', '\u1f04', '\u1f05', '\u1f06', '\u1f07', '\u1f40', '\u1f41', '\u1f44', '\u1f45', '\u1f60', '\u1f61', '\u1f64', '\u1f65', '\u1f66', '\u1f67', '\u1f70', '\u1f78', '\u1f7c', '\u1f80', '\u1f81', '\u1f84', '\u1f85', '\u1f86', '\u1f87', '\u1fa0', '\u1fa1', '\u1fa4', '\u1fa5', '\u1fa6', '\u1fa7', '\u1fb2', '\u1fb4', '\u1fb6', '\u1fb7', '\u1ff2', '\u1ff4', '\u1ff6', '\u1ff7'}, new int[] {-32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32, -32});

		setMetrics('\u03c5', 575, 468, 6);

		setMetrics('\u03c6', 671, 462, 268);

		setMetrics('\u03c7', 639, 452, 256);

		setMetrics('\u03c8', 671, 711, 268);

		setMetrics('\u03c9', 766, 457, 6);

		setMetrics('\u03ca', 287, 641, 7, 54);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u03cb', 575, 641, 6);

		setMetrics('\u03cc', 607, 711, 6);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-32, -32, -26, -26, -32});

		setMetrics('\u03cd', 575, 712, 6);

		setMetrics('\u03ce', 766, 712, 6);

		setMetrics('\u03d1', 655, 701, 6);

		setMetrics('\u03d8', 575, 693, 3);

		setMetrics('\u03d9', 575, 640, 94);

		setMetrics('\u03da', 894, 677);

		setMetrics('\u03db', 575, 457, 24);

		setMetrics('\u03dc', 723, 681);

		setMetrics('\u03dd', 575, 446, 265);

		setMetrics('\u03df', 447, 618, 144);

		setMetrics('\u03e0', 881, 706);

		setMetrics('\u03e1', 830, 696, 10);

		setMetrics('\u1f00', 575, 696, 6, 29);

		setMetrics('\u1f01', 575, 696, 6, 29);

		setMetrics('\u1f02', 575, 711, 6, 29);

		setMetrics('\u1f03', 575, 711, 6, 29);

		setMetrics('\u1f04', 575, 711, 6, 29);

		setMetrics('\u1f05', 575, 711, 6, 29);

		setMetrics('\u1f06', 575, 696, 6, 29);

		setMetrics('\u1f07', 575, 696, 6, 29);

		setMetrics('\u1f10', 495, 696, 10);

		setMetrics('\u1f11', 495, 696, 10);

		setMetrics('\u1f12', 495, 711, 10);

		setMetrics('\u1f13', 495, 711, 10);

		setMetrics('\u1f14', 495, 711, 10);

		setMetrics('\u1f15', 495, 711, 10);

		setMetrics('\u1f20', 575, 696, 260);

		setMetrics('\u1f21', 575, 696, 260);

		setMetrics('\u1f22', 575, 712, 260);

		setMetrics('\u1f23', 575, 712, 260);

		setMetrics('\u1f24', 575, 712, 260);

		setMetrics('\u1f25', 575, 712, 260);

		setMetrics('\u1f26', 575, 696, 260);

		setMetrics('\u1f27', 575, 696, 260);

		setMetrics('\u1f30', 287, 696, 7);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -31, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1f31', 287, 696, 7);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -31, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1f32', 287, 711, 7);

		setMetrics('\u1f33', 287, 711, 7);

		setMetrics('\u1f34', 287, 711, 7, 1);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1f35', 287, 711, 7, 1);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1f36', 287, 696, 7, 29);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1f37', 287, 696, 7, 29);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1f40', 607, 696, 6);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-32, -32, -26, -26, -32});

		setMetrics('\u1f41', 607, 696, 6);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-32, -32, -26, -26, -32});

		setMetrics('\u1f42', 607, 711, 6);

		setMetrics('\u1f43', 607, 711, 6);

		setMetrics('\u1f44', 607, 711, 6);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-32, -32, -26, -26, -32});

		setMetrics('\u1f45', 607, 711, 6);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-32, -32, -26, -26, -32});

		setMetrics('\u1f50', 575, 696, 6);

		setMetrics('\u1f51', 575, 696, 6);

		setMetrics('\u1f52', 575, 712, 6);

		setMetrics('\u1f53', 575, 712, 6);

		setMetrics('\u1f54', 575, 712, 6);

		setMetrics('\u1f55', 575, 712, 6);

		setMetrics('\u1f56', 575, 696, 6);

		setMetrics('\u1f57', 575, 696, 6);

		setMetrics('\u1f60', 766, 696, 6);

		setMetrics('\u1f61', 766, 696, 6);

		setMetrics('\u1f62', 766, 712, 6);

		setMetrics('\u1f63', 766, 712, 6);

		setMetrics('\u1f64', 766, 712, 6);

		setMetrics('\u1f65', 766, 712, 6);

		setMetrics('\u1f66', 766, 696, 6);

		setMetrics('\u1f67', 766, 696, 6);

		setMetrics('\u1f70', 575, 711, 6, 29);

		setMetrics('\u1f72', 495, 711, 10);

		setMetrics('\u1f74', 575, 712, 260);

		setMetrics('\u1f76', 287, 711, 7);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1f78', 607, 711, 6);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-32, -32, -26, -26, -32});

		setMetrics('\u1f7a', 575, 712, 6);

		setMetrics('\u1f7c', 766, 712, 6);

		setMetrics('\u1f80', 575, 696, 241, 29);

		setMetrics('\u1f81', 575, 696, 241, 29);

		setMetrics('\u1f82', 575, 711, 241, 29);

		setMetrics('\u1f83', 575, 711, 241, 29);

		setMetrics('\u1f84', 575, 711, 241, 29);

		setMetrics('\u1f85', 575, 711, 241, 29);

		setMetrics('\u1f86', 575, 696, 241, 29);

		setMetrics('\u1f87', 575, 696, 241, 29);

		setMetrics('\u1f90', 575, 696, 260);

		setMetrics('\u1f91', 575, 696, 260);

		setMetrics('\u1f92', 575, 712, 260);

		setMetrics('\u1f93', 575, 712, 260);

		setMetrics('\u1f94', 575, 712, 260);

		setMetrics('\u1f95', 575, 712, 260);

		setMetrics('\u1f96', 575, 696, 260);

		setMetrics('\u1f97', 575, 696, 260);

		setMetrics('\u1fa0', 766, 696, 241);

		setMetrics('\u1fa1', 766, 696, 241);

		setMetrics('\u1fa2', 766, 712, 241);

		setMetrics('\u1fa3', 766, 712, 241);

		setMetrics('\u1fa4', 766, 712, 241);

		setMetrics('\u1fa5', 766, 712, 241);

		setMetrics('\u1fa6', 766, 696, 241);

		setMetrics('\u1fa7', 766, 696, 241);

		setMetrics('\u1fb2', 575, 711, 241, 29);

		setMetrics('\u1fb3', 575, 452, 241, 29);

		setMetrics('\u1fb4', 575, 711, 241, 29);

		setMetrics('\u1fb6', 575, 641, 6, 29);

		setMetrics('\u1fb7', 575, 641, 241, 29);

		setMetrics('\u1fbc', 869, 700, 241);
		setKern(new char[] {'\u0398', '\u039f', '\u03a4', '\u03a5', '\u03a6', '\u03a8', '\u03ab'}, new int[] {-96, -96, -96, -160, -96, -141, -160});

		setMetrics('\u1fbe', 255, 157, 155);

		setMetrics('\u1fbf', 255, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-160, -64, -32, -160, -32});

		setMetrics('\u1fc0', 383, 641);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-128, -128});

		setMetrics('\u1fc1', 511, 696);

		setMetrics('\u1fc2', 575, 712, 260);

		setMetrics('\u1fc3', 575, 456, 260);

		setMetrics('\u1fc4', 575, 712, 260);

		setMetrics('\u1fc6', 575, 641, 260);

		setMetrics('\u1fc7', 575, 641, 260);

		setMetrics('\u1fcc', 900, 687, 241);

		setMetrics('\u1fcd', 319, 711);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-96, -32, -96});

		setMetrics('\u1fce', 319, 711, 0, 4);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-96, -32, -96});

		setMetrics('\u1fcf', 383, 696);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-128, -128});

		setMetrics('\u1fd2', 287, 711, 7, 28);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -31, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1fd6', 287, 641, 7, 29);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1fd7', 287, 696, 7, 29);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7', '\u03d1'}, new int[] {-32, -19, -19, -64, -32, -32, -32, -32, -32, -19});

		setMetrics('\u1fdd', 319, 711);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-96, -32, -96});

		setMetrics('\u1fde', 319, 711, 0, 4);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-96, -32, -96});

		setMetrics('\u1fdf', 383, 696);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-128, -128});

		setMetrics('\u1fe2', 575, 712, 6);

		setMetrics('\u1fe4', 543, 696, 256);

		setMetrics('\u1fe5', 543, 696, 256);

		setMetrics('\u1fe6', 575, 641, 6);

		setMetrics('\u1fe7', 575, 696, 6);

		setMetrics('\u1fed', 319, 711, 0, 31);

		setMetrics('\u1fef', 192, 712);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-128, -64, -32, -128, -32});

		setMetrics('\u1ff2', 766, 712, 241);

		setMetrics('\u1ff3', 766, 457, 241);

		setMetrics('\u1ff4', 766, 712, 241);

		setMetrics('\u1ff6', 766, 641, 6);

		setMetrics('\u1ff7', 766, 641, 241);

		setMetrics('\u1ffc', 830, 698, 241);

		setMetrics('\u1ffe', 255, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-192, -64, -32, -192, -32});

		setMetrics('\u2019', 319, 696);

		setMetrics('\u2329', 447, 751, 251);

		setMetrics('\u232a', 447, 751, 251);

	}
}
