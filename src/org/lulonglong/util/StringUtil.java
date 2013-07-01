package org.lulonglong.util;


/**
 * Descriptions
 * 
 * @version 2013-6-20
 * @author lulonglong
 * @since JDK1.6
 * 
 */
public class StringUtil {

	public static final String Empty = "";

	public static boolean isNotNull(String str) {

		boolean result = false;
		if (str != null && str.trim().length() > 0) {
			result = true;
		}

		return result;
	}
	
	/**
	 * �Ƿ�Ϊ�б��ַ���
	 * 
	 * @param str
	 * @param split
	 * @return
	 */
	public static boolean isListString(String str, String split) {

		if (isNullOrWhiteSpace(str) || str.endsWith(split)
				|| str.startsWith(split))
			return false;

		for (String item : str.split(split)) {
			if (isNullOrWhiteSpace(item))
				return false;
		}

		return true;
	}


	/**
	 * �Ƿ�Ϊ��
	 * 
	 * @param str
	 * @return
	 */
	public static boolean isNullOrWhiteSpace(String str) {
		return !isNotNull(str);
	}


	public static String getSetMethodString(String methodName) {
		if (isNullOrWhiteSpace(methodName))
			return null;
		return "set"+methodName.substring(0, 1).toUpperCase()
				+ methodName.substring(1);
	}
}
