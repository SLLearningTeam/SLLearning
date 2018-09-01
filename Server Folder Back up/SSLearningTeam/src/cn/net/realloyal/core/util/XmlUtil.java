package cn.net.realloyal.core.util;

public class XmlUtil {
	private static final char[] LT = "&lt;".toCharArray();

	private static final char[] GT = "&gt;".toCharArray();

	private static final char[] AMP = "&amp;".toCharArray();

	private static final char[] QUOT = "&quot;".toCharArray();

	private static final char[] APOS = "&apos;".toCharArray();

	public static String getXmlFromArray(String[] array, String root,
			String node) {
		StringBuffer sb = new StringBuffer();
		sb.append("<" + root + ">");
		for (int i = 0; i < array.length; i++) {
			sb.append("<" + node + ">");
			sb.append(escapeXml(array[i]));
			sb.append("</" + node + ">");
		}
		sb.append("</" + root + ">");
		return sb.toString();
	}

	public static String escapeXml(String text) {
		char[] textChars = text.toCharArray();
		StringBuffer sb = new StringBuffer();
		for (int i = 0; i < textChars.length; i++) {
			char c = textChars[i];
			switch (c) {
			case '<':
				sb.append(LT, 0, 4);
				break;
			case '>':
				sb.append(GT, 0, 4);
				break;
			case '&':
				sb.append(AMP, 0, 5);
				break;
			case '"':
				sb.append(QUOT, 0, 6);
				break;
			case '\'':
				sb.append(APOS, 0, 6);
				break;
			default:
				sb.append(c);
			}
		}
		return sb.toString();
	}
}
