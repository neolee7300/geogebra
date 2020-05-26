package com.himamis.retex.renderer.share.fonts;

import com.himamis.retex.renderer.share.Configuration;
import com.himamis.retex.renderer.share.FontInfo;

final class CMMI10_UNCHANGED extends FontInfo {

	CMMI10_UNCHANGED(final String ttfPath) {
		super(0, ttfPath, 430, 0, 1000, 196);
	}

	@Override
	protected final void initMetrics() {
		setMetrics(33, 622, 430, 0, 35);

		setMetrics(34, 466, 430);
		setKern(196, 83);

		setMetrics(35, 591, 694);
		setKern(196, 83);

		setMetrics(36, 828, 430, 0, 27);

		setMetrics(37, 517, 430, 194);
		setKern(196, 83);

		setMetrics(38, 362, 430, 97, 79);
		setKern(196, 83);

		setMetrics(39, 654, 430, 194);
		setKern(196, 83);

		setMetrics(40, 1000, 366, -133);

		setMetrics(41, 1000, 366, -133);

		setMetrics(42, 1000, 366, -133);

		setMetrics(43, 1000, 366, -133);

		setMetrics(44, 277, 463, -36);

		setMetrics(45, 277, 463, -36);

		setMetrics(46, 500, 465, -34);

		setMetrics(47, 500, 465, -34);

		setMetrics(58, 277, 105);

		setMetrics(59, 277, 105, 194);

		setMetrics(60, 777, 539, 39);
		setNextLarger(Configuration.getFonts().cmex10, 171);

		setMetrics(61, 500, 750, 250);
		setNextLarger(Configuration.getFonts().cmex10, 177);

		setMetrics(62, 777, 539, 39);
		setNextLarger(Configuration.getFonts().cmex10, 174);

		setMetrics(63, 500, 465, -34);

		setMetrics(64, 530, 694, 0, 55);
		setKern(196, 83);

		setMetrics(91, 388, 750);

		setMetrics(92, 388, 694, 194);

		setMetrics(93, 388, 694, 194);

		setMetrics(94, 1000, 357, -142);

		setMetrics(95, 1000, 357, -142);

		setMetrics(96, 416, 694);
		setKern(196, 111);

		setMetrics(101, 465, 430);
		setKern(196, 55);

		setMetrics(111, 484, 430);
		setKern(196, 55);

		setMetrics(174, 639, 430, 0, 3);
		setKern(196, 27);

		setMetrics(175, 565, 694, 194, 52);
		setKern(196, 83);

		setMetrics(176, 517, 430, 194, 55);

		setMetrics(177, 444, 694, 0, 37);
		setKern(59, -55, 58, -55, 196, 55);

		setMetrics(178, 405, 430);
		setKern(196, 55);

		setMetrics(179, 437, 694, 194, 73);
		setKern(196, 83);

		setMetrics(180, 496, 430, 194, 35);
		setKern(196, 55);

		setMetrics(181, 469, 694, 0, 27);
		setKern(196, 83);

		setMetrics(182, 353, 430);
		setKern(196, 55);

		setMetrics(183, 576, 430);

		setMetrics(184, 583, 694);

		setMetrics(185, 602, 430, 194);
		setKern(196, 27);

		setMetrics(186, 493, 430, 0, 63);
		setKern(59, -55, 58, -55, 196, 27);

		setMetrics(187, 437, 694, 194, 46);
		setKern(196, 111);

		setMetrics(188, 570, 430, 0, 35);

		setMetrics(189, 517, 430, 194);
		setKern(196, 83);

		setMetrics(190, 571, 430, 0, 35);
		setKern(59, -55, 58, -55);

		setMetrics(191, 437, 430, 0, 113);
		setKern(59, -55, 58, -55, 196, 27);

		setMetrics(192, 540, 430, 0, 35);
		setKern(196, 27);

		setMetrics(193, 595, 694, 194);
		setKern(196, 83);

		setMetrics(194, 625, 430, 194);
		setKern(196, 55);

		setMetrics(195, 651, 694, 194, 35);
		setKern(196, 111);

		setMetrics(123, 322, 430);
		setKern(196, 27);

		setMetrics(124, 384, 430, 194);
		setKern(196, 83);

		setMetrics(125, 636, 430, 194);
		setKern(196, 111);

		setMetrics(126, 500, 714, 0, 153);

		setMetrics(196, 277, 694, 0, 399);

	}
}
