package com.yinlipuhui.heng;


public class Num2Rmb {
	private static String[] hanArr = { "零", "壹", "贰", "叁", "肆", "伍", "陆", "柒", "Ⅷ", "Ⅸ" };
	private static String[] unitArr = { "十", "百", "千", "万", "亿"};

	public static String[] divide(double num) {
		long zheng = (long) num;
		long xiao = Math.round((num - zheng) * 100);
		return new String[] { String.valueOf(zheng), String.valueOf(xiao)};
	}

	public static String toHanziStr(double num) {
		String result = "";
		String[] num_div = divide(num);
		String zheng = num_div[0];
		int zhengLen = zheng.length();
		for (int i = 0; i < zhengLen; i++) {
			int n = zheng.charAt(i) - 48;
			if (i != zhengLen-1 && n != 0) {
				result +=  hanArr[n] + unitArr[zhengLen -2 - i];
			}else {
				result += hanArr[n];
			}
		}
		return result;
	}
}
