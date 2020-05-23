package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.UniFontInfo;

final class FCSBPG extends UniFontInfo {

	FCSBPG(final String ttfPath) {
		super(204, ttfPath, 472, 255, 1000, '\0');
	}

	@Override
	protected final void initMetrics() {
		setMetrics('\040', 255, 0);

		setMetrics('\250', 244, 630, 0, 56);

		setMetrics('\u0374', 214, 695);

		setMetrics('\u0375', 214, 1, 188);

		setMetrics('\u037a', 122, -67, 247);

		setMetrics('\u0384', 183, 695);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-122, -61, -31, -122, -31});

		setMetrics('\u0385', 305, 695);

		setMetrics('\u0387', 305, 459);

		setMetrics('\u0390', 275, 695, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u0391', 733, 687);
		setKern(new char[] {'\u0398', '\u039f', '\u03a4', '\u03a5', '\u03a6', '\u03a8', '\u03ab'}, new int[] {-92, -92, -92, -153, -92, -134, -153});

		setMetrics('\u0392', 733, 687);

		setMetrics('\u0393', 580, 684);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-147, -122, -134, -147});

		setMetrics('\u0394', 916, 687);
		setKern(new char[] {'\u039f', '\u03a5', '\u03ab'}, new int[] {-37, -153, -153});

		setMetrics('\u0395', 642, 684);

		setMetrics('\u0396', 672, 687);

		setMetrics('\u0397', 794, 687);

		setMetrics('\u0398', 855, 709, 22);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-92, -92});

		setMetrics('\u0399', 308, 687);

		setMetrics('\u039a', 764, 687);
		setKern(new char[] {'\u039f'}, new int[] {-92});

		setMetrics('\u039b', 672, 687);
		setKern(new char[] {'\u039f', '\u03a5', '\u03ab'}, new int[] {-37, -110, -110});

		setMetrics('\u039c', 978, 687);

		setMetrics('\u039d', 794, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-92, -92});

		setMetrics('\u039e', 733, 681);

		setMetrics('\u039f', 794, 710, 22);
		setKern(new char[] {'\u0391', '\u03a3', '\u1fbc'}, new int[] {-92, -61, -92});

		setMetrics('\u03a0', 794, 684);

		setMetrics('\u03a1', 703, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-183, -183});

		setMetrics('\u03a3', 794, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-31, -31});

		setMetrics('\u03a4', 733, 681);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-92, -92});

		setMetrics('\u03a5', 855, 709);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-153, -153, -153, -153});

		setMetrics('\u03a6', 794, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-92, -92});

		setMetrics('\u03a7', 733, 687);

		setMetrics('\u03a8', 855, 687);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-134, -134});

		setMetrics('\u03a9', 794, 709);

		setMetrics('\u03aa', 308, 847, 0, 10);

		setMetrics('\u03ab', 855, 847);
		setKern(new char[] {'\u0391', '\u0394', '\u039b', '\u1fbc'}, new int[] {-153, -153, -153, -153});

		setMetrics('\u03ac', 550, 695, 11, 61);

		setMetrics('\u03ad', 473, 695, 22);

		setMetrics('\u03ae', 550, 695, 272);

		setMetrics('\u03af', 275, 695, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u03b0', 550, 695, 11);

		setMetrics('\u03b1', 550, 471, 11, 61);

		setMetrics('\u03b2', 550, 706, 271);

		setMetrics('\u03b3', 611, 471, 228);

		setMetrics('\u03b4', 519, 707, 11);

		setMetrics('\u03b5', 473, 482, 22);

		setMetrics('\u03b6', 519, 718, 186);

		setMetrics('\u03b7', 550, 482, 272);

		setMetrics('\u03b8', 626, 706, 11);

		setMetrics('\u03b9', 275, 470, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u03ba', 580, 487, 27);

		setMetrics('\u03bb', 550, 697, 10);

		setMetrics('\u03bc', 586, 482, 266, 1);

		setMetrics('\u03bd', 519, 472, 10);

		setMetrics('\u03be', 519, 718, 186);

		setMetrics('\u03bf', 580, 471, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-31, -31, -24, -24, -31});

		setMetrics('\u03c0', 565, 459, 11, 27);

		setMetrics('\u03c1', 519, 471, 266);

		setMetrics('\u03c2', 489, 471, 125);

		setMetrics('\u03c3', 626, 459, 12);

		setMetrics('\u03c4', 504, 460, 11);
		setKern(new char[] {'\u03ac', '\u03b1', '\u03bf', '\u03c9', '\u03cc', '\u03ce', '\u1f00', '\u1f01', '\u1f04', '\u1f05', '\u1f06', '\u1f07', '\u1f40', '\u1f41', '\u1f44', '\u1f45', '\u1f60', '\u1f61', '\u1f64', '\u1f65', '\u1f66', '\u1f67', '\u1f70', '\u1f78', '\u1f7c', '\u1f80', '\u1f81', '\u1f84', '\u1f85', '\u1f86', '\u1f87', '\u1fa0', '\u1fa1', '\u1fa4', '\u1fa5', '\u1fa6', '\u1fa7', '\u1fb2', '\u1fb4', '\u1fb6', '\u1fb7', '\u1ff2', '\u1ff4', '\u1ff6', '\u1ff7'}, new int[] {-31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31, -31});

		setMetrics('\u03c5', 550, 492, 10);

		setMetrics('\u03c6', 642, 486, 272);

		setMetrics('\u03c7', 611, 473, 263);

		setMetrics('\u03c8', 642, 718, 272);

		setMetrics('\u03c9', 733, 481, 11);

		setMetrics('\u03ca', 275, 641, 10, 1);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u03cb', 550, 640, 10);

		setMetrics('\u03cc', 580, 695, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-31, -31, -24, -24, -31});

		setMetrics('\u03cd', 550, 695, 10);

		setMetrics('\u03ce', 733, 695, 11);

		setMetrics('\u03d8', 550, 698);

		setMetrics('\u03d9', 550, 646, 77);

		setMetrics('\u03da', 855, 682, 1);

		setMetrics('\u03db', 550, 481);

		setMetrics('\u03dc', 611, 684);

		setMetrics('\u03dd', 550, 461, 249);

		setMetrics('\u03df', 428, 577, 75);

		setMetrics('\u03e0', 703, 686);

		setMetrics('\u03e1', 794, 695);

		setMetrics('\u1f00', 550, 696, 11, 61);

		setMetrics('\u1f01', 550, 696, 11, 61);

		setMetrics('\u1f02', 550, 696, 11, 61);

		setMetrics('\u1f03', 550, 696, 11, 61);

		setMetrics('\u1f04', 550, 696, 11, 61);

		setMetrics('\u1f05', 550, 696, 11, 61);

		setMetrics('\u1f06', 550, 695, 11, 61);

		setMetrics('\u1f07', 550, 695, 11, 61);

		setMetrics('\u1f10', 473, 696, 22);

		setMetrics('\u1f11', 473, 696, 22);

		setMetrics('\u1f12', 473, 696, 22);

		setMetrics('\u1f13', 473, 696, 22);

		setMetrics('\u1f14', 473, 696, 22);

		setMetrics('\u1f15', 473, 696, 22);

		setMetrics('\u1f20', 550, 696, 272);

		setMetrics('\u1f21', 550, 696, 272);

		setMetrics('\u1f22', 550, 696, 272);

		setMetrics('\u1f23', 550, 696, 272);

		setMetrics('\u1f24', 550, 696, 272);

		setMetrics('\u1f25', 550, 696, 272);

		setMetrics('\u1f26', 550, 695, 272);

		setMetrics('\u1f27', 550, 695, 272);

		setMetrics('\u1f30', 275, 696, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1f31', 275, 696, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1f32', 275, 696, 10);

		setMetrics('\u1f33', 275, 696, 10);

		setMetrics('\u1f34', 275, 696, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1f35', 275, 696, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1f36', 275, 696, 10, 16);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1f37', 275, 696, 10, 16);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1f40', 580, 696, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-31, -31, -24, -24, -31});

		setMetrics('\u1f41', 580, 696, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-31, -31, -24, -24, -31});

		setMetrics('\u1f42', 580, 696, 11);

		setMetrics('\u1f43', 580, 696, 11);

		setMetrics('\u1f44', 580, 696, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-31, -31, -24, -24, -31});

		setMetrics('\u1f45', 580, 696, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-31, -31, -24, -24, -31});

		setMetrics('\u1f50', 550, 696, 10);

		setMetrics('\u1f51', 550, 696, 10);

		setMetrics('\u1f52', 550, 696, 10);

		setMetrics('\u1f53', 550, 696, 10);

		setMetrics('\u1f54', 550, 696, 10);

		setMetrics('\u1f55', 550, 696, 10);

		setMetrics('\u1f56', 550, 695, 10);

		setMetrics('\u1f57', 550, 695, 10);

		setMetrics('\u1f60', 733, 696, 11);

		setMetrics('\u1f61', 733, 696, 11);

		setMetrics('\u1f62', 733, 696, 11);

		setMetrics('\u1f63', 733, 696, 11);

		setMetrics('\u1f64', 733, 696, 11);

		setMetrics('\u1f65', 733, 696, 11);

		setMetrics('\u1f66', 733, 695, 11);

		setMetrics('\u1f67', 733, 695, 11);

		setMetrics('\u1f70', 550, 695, 11, 61);

		setMetrics('\u1f72', 473, 695, 22);

		setMetrics('\u1f74', 550, 695, 272);

		setMetrics('\u1f76', 275, 695, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1f78', 580, 695, 11);
		setKern(new char[] {'\u03b3', '\u03bb', '\u03bd', '\u03c4', '\u03c7'}, new int[] {-31, -31, -24, -24, -31});

		setMetrics('\u1f7a', 550, 695, 10);

		setMetrics('\u1f7c', 733, 695, 11);

		setMetrics('\u1f80', 550, 696, 247, 61);

		setMetrics('\u1f81', 550, 696, 247, 61);

		setMetrics('\u1f82', 550, 696, 247, 61);

		setMetrics('\u1f83', 550, 696, 247, 61);

		setMetrics('\u1f84', 550, 696, 247, 61);

		setMetrics('\u1f85', 550, 696, 247, 61);

		setMetrics('\u1f86', 550, 695, 247, 61);

		setMetrics('\u1f87', 550, 695, 247, 61);

		setMetrics('\u1f90', 550, 696, 272);

		setMetrics('\u1f91', 550, 696, 272);

		setMetrics('\u1f92', 550, 696, 272);

		setMetrics('\u1f93', 550, 696, 272);

		setMetrics('\u1f94', 550, 696, 272);

		setMetrics('\u1f95', 550, 696, 272);

		setMetrics('\u1f96', 550, 695, 272);

		setMetrics('\u1f97', 550, 695, 272);

		setMetrics('\u1fa0', 733, 696, 247);

		setMetrics('\u1fa1', 733, 696, 247);

		setMetrics('\u1fa2', 733, 696, 247);

		setMetrics('\u1fa3', 733, 696, 247);

		setMetrics('\u1fa4', 733, 696, 247);

		setMetrics('\u1fa5', 733, 696, 247);

		setMetrics('\u1fa6', 733, 695, 247);

		setMetrics('\u1fa7', 733, 695, 247);

		setMetrics('\u1fb2', 550, 695, 247, 61);

		setMetrics('\u1fb3', 550, 471, 247, 61);

		setMetrics('\u1fb4', 550, 695, 247, 61);

		setMetrics('\u1fb6', 550, 640, 11, 61);

		setMetrics('\u1fb7', 550, 640, 247, 61);

		setMetrics('\u1fbc', 733, 687, 247);
		setKern(new char[] {'\u0398', '\u039f', '\u03a4', '\u03a5', '\u03a6', '\u03a8', '\u03ab'}, new int[] {-92, -92, -92, -153, -92, -134, -153});

		setMetrics('\u1fbe', 244, 155, 153);

		setMetrics('\u1fbf', 244, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-153, -61, -31, -153, -31});

		setMetrics('\u1fc0', 367, 640);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-122, -122});

		setMetrics('\u1fc1', 489, 696);

		setMetrics('\u1fc2', 550, 695, 272);

		setMetrics('\u1fc3', 550, 482, 272);

		setMetrics('\u1fc4', 550, 695, 272);

		setMetrics('\u1fc6', 550, 640, 272);

		setMetrics('\u1fc7', 550, 640, 272);

		setMetrics('\u1fcc', 794, 687, 247);

		setMetrics('\u1fcd', 305, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-92, -31, -92});

		setMetrics('\u1fce', 305, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-92, -31, -92});

		setMetrics('\u1fcf', 367, 696);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-122, -122});

		setMetrics('\u1fd2', 275, 695, 10);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1fd6', 275, 640, 10, 16);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1fd7', 275, 696, 10, 16);
		setKern(new char[] {'\u03b3', '\u03b7', '\u03b8', '\u03bd', '\u03bf', '\u03c2', '\u03c3', '\u03c4', '\u03c7'}, new int[] {-31, -18, -18, -61, -31, -31, -31, -31, -31});

		setMetrics('\u1fdd', 305, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-92, -31, -92});

		setMetrics('\u1fde', 305, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u1fbc'}, new int[] {-92, -31, -92});

		setMetrics('\u1fdf', 367, 696);
		setKern(new char[] {'\u0391', '\u1fbc'}, new int[] {-122, -122});

		setMetrics('\u1fe2', 550, 695, 10);

		setMetrics('\u1fe4', 519, 696, 266);

		setMetrics('\u1fe5', 519, 696, 266);

		setMetrics('\u1fe6', 550, 640, 10);

		setMetrics('\u1fe7', 550, 695, 10);

		setMetrics('\u1fed', 305, 695);

		setMetrics('\u1fef', 183, 695);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-122, -61, -31, -122, -31});

		setMetrics('\u1ff2', 733, 695, 247);

		setMetrics('\u1ff3', 733, 481, 247);

		setMetrics('\u1ff4', 733, 695, 247);

		setMetrics('\u1ff6', 733, 641, 11);

		setMetrics('\u1ff7', 733, 641, 247);

		setMetrics('\u1ffc', 794, 709, 247);

		setMetrics('\u1ffe', 244, 696);
		setKern(new char[] {'\u0391', '\u039f', '\u03a9', '\u1fbc', '\u1ffc'}, new int[] {-183, -61, -31, -183, -31});

		setMetrics('\u2019', 305, 696);

		setMetrics('\u2329', 428, 751, 250);

		setMetrics('\u232a', 428, 751, 250);

	}
}
