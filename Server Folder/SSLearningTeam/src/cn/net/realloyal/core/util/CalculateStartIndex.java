package cn.net.realloyal.core.util;

public class CalculateStartIndex {
	//用于计算指定页面开始的下标
	public static int getStartIndex(int startIndex,int numInAPage) {
		return (startIndex-1)*numInAPage;
	}
}
