/* FontInfo.java
 * =========================================================================
 * This file is originally part of the JMathTeX Library - http://jmathtex.sourceforge.net
 *
 * Copyright (C) 2004-2007 Universiteit Gent
 * Copyright (C) 2009-2018 DENIZET Calixte
 *
 * This program is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation; either version 2 of the License, or (at
 * your option) any later version.
 *
 * This program is distributed in the hope that it will be useful, but
 * WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * General Public License for more details.
 *
 * A copy of the GNU General Public License can be found in the file
 * LICENSE.txt provided with the source distribution of this program (see
 * the META-INF directory in the source jar). This license can also be
 * found on the GNU website at http://www.gnu.org/licenses/gpl.html.
 *
 * If you did not receive a copy of the GNU General Public License along
 * with this program, contact the lead developer, or write to the Free
 * Software Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA
 * 02110-1301, USA.
 *
 * Linking this library statically or dynamically with other modules
 * is making a combined work based on this library. Thus, the terms
 * and conditions of the GNU General Public License cover the whole
 * combination.
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce
 * an executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under terms
 * of your choice, provided that you also meet, for each linked independent
 * module, the terms and conditions of the license of that module.
 * An independent module is a module which is not derived from or based
 * on this library. If you modify this library, you may extend this exception
 * to your version of the library, but you are not obliged to do so.
 * If you do not wish to do so, delete this exception statement from your
 * version.
 *
 */

package com.himamis.retex.renderer.share;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

import com.himamis.retex.renderer.share.platform.FontAdapter;
import com.himamis.retex.renderer.share.platform.font.Font;

/**
 * Contains all the font information for 1 font.
 */
public class FontInfo {

	/**
	 * Maximum number of character codes in a TeX font.
	 */
	private static final int NUMBER_OF_CHAR_CODES = 256;

	// font
	protected Font font;
	protected final int size;
	protected final String path;
	protected boolean loaded = false;

	protected final double[][] metrics;

	// skew character of the font (used for positioning accents)
	protected final char skewChar;

	// general parameters for this font
	protected final double xHeight;
	protected final double space;
	protected final double quad;

	protected FontInfo bold;
	protected FontInfo roman;
	protected FontInfo ss;
	protected FontInfo tt;
	protected FontInfo it;

	protected CharFont[][] lig;
	protected double[][] kern;
	protected CharFont[] nextLarger;
	protected char[][] extensions;

	public static ArrayList<FontInfo> fonts = new ArrayList<>();

	public String c(char ch) {
		if (ch == '\0') {
			return "0";
		}

		if (ch < 511) {
			return "'\\" + String.format("%03o", (int) ch) + "'";
		}

		return "'\\u" + String.format("%04x", (int) ch) + "'";
	}

	public String i(double d) {
		return Integer.toString((int) (d * 1000));
	}

	String name = getClass().getName().substring(getClass().getName().lastIndexOf('.') + 1);
	FileWriter myWriter;

	public FontInfo(int size, String path, double xHeight, double space,
			double quad, char skewChar) {
		this.path = path;
		this.xHeight = xHeight;
		this.space = space;
		this.quad = quad;
		this.skewChar = skewChar;
		this.size = size == 0 ? NUMBER_OF_CHAR_CODES : size;
		this.metrics = new double[this.size][];

		try {
			myWriter = new FileWriter(name + ".java");
			myWriter.write("package com.himamis.retex.renderer.share.fonts;\n\n");
			myWriter.write("import com.himamis.retex.renderer.share.Configuration;\n");
			myWriter.write("import com.himamis.retex.renderer.share.FontInfo;\n");
			myWriter.write("import com.himamis.retex.renderer.share.UniFontInfo;\n\n");

			if (this instanceof UniFontInfo) {
				myWriter.write("final class " + name + " extends UniFontInfo {\n\n");
			} else {
				myWriter.write("final class " + name + " extends FontInfo {\n\n");
			}

			myWriter.write("\t" + name + "(final String ttfPath) {\n");
			myWriter.write("\t\tsuper(" + size + ", ttfPath, " + i(xHeight) + ", " + i(space) + ", " + i(quad) + ", " + c(skewChar) + ");\n");
			myWriter.write("\t}\n\n");

			myWriter.write("\t@Overrride\n");
			myWriter.write("\tprotected final void initMetrics() {\n");

			fonts.add(this);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void close() {
		try {
			myWriter.write("\t}\n");
			myWriter.write("}\n");
			myWriter.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public void setDependencies(FontInfo bold, FontInfo roman, FontInfo ss,
			FontInfo tt, FontInfo it) {
		this.bold = bold == null ? this : bold;
		this.roman = roman == null ? this : roman;
		this.ss = ss == null ? this : ss;
		this.tt = tt == null ? this : tt;
		this.it = it == null ? this : it;
	}

	/**
	 *
	 * @param left
	 *            left character
	 * @param right
	 *            right character
	 * @param k
	 *            kern value
	 */
	public void addKern(final char left, final char right, final double k) {
		if (kern == null) {
			kern = new double[size][];
		}
		if (kern[left] == null) {
			kern[left] = new double[size];
		}
		kern[left][right] = k;
	}

	/**
	 * @param left
	 *            left character
	 * @param right
	 *            right character
	 * @param ligChar
	 *            ligature to replace left and right character
	 */
	public void addLigature(final char left, final char right,
			final char ligChar) {
		if (lig == null) {
			lig = new CharFont[size][];
		}
		if (lig[left] == null) {
			lig[left] = new CharFont[size];
		}
		lig[left][right] = new CharFont(ligChar, this);
	}

	public char[] getExtension(final char c) {
		init();
		if (extensions == null) {
			return null;
		}
		return extensions[c];
	}

	public double getKern(final char left, final char right,
			final double factor) {
		init();
		if (kern == null || kern[left] == null) {
			return 0.;
		}

		return kern[left][right] * factor;
	}

	public CharFont getLigature(final char left, final char right) {
		init();
		if (lig == null || lig[left] == null) {
			return null;
		}
		return lig[left][right];
	}

	public double[] getMetrics(final char c) {
		init();
		return metrics[c];
	}

	public double getWidth(final char c) {
		init();
		return metrics[c][0];
	}

	public double getHeight(final char c) {
		init();
		return metrics[c][1];
	}

	public double getDepth(final char c) {
		init();
		return metrics[c][2];
	}

	public double getItalic(final char c) {
		init();
		return metrics[c][3];
	}

	public CharFont getNextLarger(final char c) {
		init();
		if (nextLarger == null) {
			return null;
		}
		return nextLarger[c];
	}

	/**
	 * @return the skew character of the font (for the correct positioning of
	 *         accents)
	 */
	public double getSkew(final char c, final double factor) {
		init();
		if (skewChar != '\0') {
			return getKern(c, skewChar, factor);
		}
		return 0.;
	}

	public void setExtension(final char c, final char[] ext) {
		if (extensions == null) {
			extensions = new char[size][];
		}
		extensions[c] = ext;
	}

	public void setMetrics(char c, double[] arr) {
		metrics[c] = arr;
	}

	public void setNextLarger(final char c, final char larger,
			final FontInfo fontLarger) {
		if (nextLarger == null) {
			nextLarger = new CharFont[size];
		}
		nextLarger[c] = new CharFont(larger, fontLarger);
	}

	public void setInfo(char c, double[] metrics, char[] ligatures,
			char[] kernCode, double[] kernValue, FontInfo nextLarger,
			char nextLargerChar, char[] extension) {
		try {
			if (metrics[2] == 0 && metrics[3] == 0) {
				myWriter.write("\t\tsetMetrics(" + c(c) + ", " + i(metrics[0]) + ", " + i(metrics[1]) + ");\n");
			} else if (metrics[3] == 0) {
				myWriter.write("\t\tsetMetrics(" + c(c) + ", " + i(metrics[0]) + ", " + i(metrics[1]) + ", " + i(metrics[2]) + ");\n");
			} else {
				myWriter.write("\t\tsetMetrics(" + c(c) + ", " + i(metrics[0]) + ", " + i(metrics[1]) + ", " + i(metrics[2]) + ", " + i(metrics[3]) + ");\n");
			}

			if (ligatures != null) {
				myWriter.write("\t\tsetLigatures(");
				for (int i = 0; i < ligatures.length; i += 1) {
					if (i != 0) {
						myWriter.write(", ");
					}
					myWriter.write(c(ligatures[i]));
				}
				myWriter.write(");\n");
			}

			if (kernCode != null) {
				myWriter.write("\t\tsetKern(new char[] {");
				for (int i = 0; i < kernCode.length; i += 1) {
					if (i != 0) {
						myWriter.write(", ");
					}
					myWriter.write(c(kernCode[i]));
				}
				myWriter.write("}, new int[] {");
				for (int i = 0; i < kernValue.length; i += 1) {
					if (i != 0) {
						myWriter.write(", ");
					}
					myWriter.write(i(kernValue[i]));
				}
				myWriter.write("});\n");
			}

			if (nextLarger != null) {
				String cname = nextLarger.getClass().getName();
				cname = cname.substring(cname.lastIndexOf('.') + 1);
				cname = cname.toLowerCase();
				myWriter.write("\t\tsetNextLarger(Configuration.getFonts()." + cname + ", " + c(nextLargerChar) + ");\n");
			}

			if (extension != null) {
				myWriter.write("\t\tsetExtension(" + c(extension[0]) + ", " + c(extension[1]) + ", " + c(extension[2]) + ", " + c(extension[3]) + ");\n");
			}

			myWriter.write("\n");
		} catch (IOException e) {
			e.printStackTrace();
		}

		setMetrics(c, metrics);
		if (ligatures != null) {
			for (int i = 0; i < ligatures.length; i += 2) {
				addLigature(c, ligatures[i], ligatures[i + 1]);
			}
		}
		if (kernCode != null) {
			for (int i = 0; i < kernCode.length; ++i) {
				addKern(c, kernCode[i], kernValue[i]);
			}
		}
		if (nextLarger != null) {
			setNextLarger(c, nextLargerChar, nextLarger);
		}
		if (extension != null) {
			setExtension(c, extension);
		}
	}

	protected final void init() {
		if (!loaded) {
			initMetrics();
			loaded = true;
		}
	}

	protected void initMetrics() {
	}

	public double getQuad(final double factor) {
		return quad * factor;
	}

	public final double getSpace(final double factor) {
		return space * factor;
	}

	public final double getXHeight(final double factor) {
		return xHeight * factor;
	}

	public final boolean hasSpace() {
		return space > TeXFormula.PREC;
	}

	public final char getSkewChar() {
		return skewChar;
	}

	public final FontInfo getBold() {
		return bold;
	}

	public final FontInfo getRoman() {
		return roman;
	}

	public final FontInfo getTt() {
		return tt;
	}

	public final FontInfo getIt() {
		return it;
	}

	public final FontInfo getSs() {
		return ss;
	}

	public final Font getFont() {
		if (font == null) {
			font = new FontAdapter().loadFont(path + ".ttf");
		}
		return font;
	}

	@Override
	public String toString() {
		return "FontInfo: " + path;
	}
}
