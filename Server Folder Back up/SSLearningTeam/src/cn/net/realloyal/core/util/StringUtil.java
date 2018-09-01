package cn.net.realloyal.core.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtil {
	public static String[] clearEmptyLine(String[] array) {
		List list = new ArrayList();
		for (int i = 0; i < array.length; i++) {
			String trimStr = array[i].trim();
			if (trimStr.length() > 0) {
				list.add(trimStr);
			}
		}
		String[] result = new String[list.size()];
		for (int i = 0; i < list.size(); i++) {
			result[i] = (String) list.get(i);
		}
		return result;
	}

	/**
	 * 清理行尾的换行符
	 * 
	 * @param array
	 * @return
	 */
	public static void clearLastNewLineMark(String[] array) {
		for (int i = 0; i < array.length; i++) {
			String srcStr = array[i];
			if (srcStr.endsWith("\r\n")) {
				array[i] = srcStr.substring(0, srcStr.length() - 2);
			}
		}
	}

}
