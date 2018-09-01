package cn.net.realloyal.core.util;

import java.math.BigDecimal;
import java.util.Map;

public class MapUtil {

	/**
	 * 从Map中获取数据，能自动取得Object数组中第一项
	 * 
	 * @param map
	 *            原始Map
	 * @param key
	 *            要获取数据的Key
	 * @return 取得的对象或对象数组中的第一项
	 */
	public static Object getObjectFromMap(Map map, String key) {
		Object value = map.get(key);
		if (value != null && (value instanceof Object[])) {
			Object[] array = (Object[]) value;
			if (array != null && array.length > 0) {
				value = array[0];
			}
		}
		return value;
	}

	/* 获取字符串 */
	public static String getStringFromMap(Map map, String key) {
		Object value = getObjectFromMap(map, key);
		if (value==null) return null;
		if (value instanceof String) {
			return (String) value;
		}
		return value.toString();
	}

	/* 获取基本对象 */

	public static int getIntFromMap(Map map, String key) {
		Object value = getObjectFromMap(map, key);
		if (value instanceof String) {
			return Integer.parseInt((String) value);
		}
		return ((BigDecimal) value).intValue();
	}

	public static Integer getIntegerObjectFromMap(Map map, String key) {
		return new Integer(getIntFromMap(map, key));
	}

	public static long getLongFromMap(Map map, String key) {
		Object value = getObjectFromMap(map, key);
		if (value instanceof String) {
			return Integer.parseInt((String) value);
		}
		return ((BigDecimal) value).longValue();
	}

	public static Long getLongObjectFromMap(Map map, String key) {
		return new Long(getLongFromMap(map, key));
	}

	/* 获取对象数组 */

	public static Object[] getObjectArrayFromMap(Map map, String key) {
		String[] keys = key.split(",");
		Object[] tmp = new Object[keys.length];
		for (int i = 0; i < keys.length; i++) {
			tmp[i] = getObjectFromMap(map, keys[i].trim());
		}
		return tmp;
	}
}
