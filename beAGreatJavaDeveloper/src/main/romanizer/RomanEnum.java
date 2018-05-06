package main.romanizer;

import java.util.HashMap;
import java.util.Map;

/**
 * 数字とローマ数字を取り扱うENUM
 */
public enum RomanEnum {

	M(1000, "M")
	, CD(900, "CD")
	, D(500, "D")
	, C(100, "C")
	, XC(90, "XC")
	, L(50, "L")
	, XL(40, "XL")
	, X(10, "X")
	, IX(9, "IX")
	, VIII(8, "VIII")
	, VII(7, "VII")
	, VI(6, "VI")
	, V(5, "V")
	, IV(4, "IV")
	, III(3, "III")
	, II(2, "II")
	, I(1, "I");

	private int num;
	private String roman;
	private static Map<Integer, String> mapValue = new HashMap();

	// 除数
	private final static String DIVISOR = "divisor";
	// 余り
	private final static String REMAINDER = "remainder";

	private RomanEnum(int num, String roman) {
		this.num = num;
		this.roman = roman;
	}

	public int getNum() {
		return num;
	}

	// フィールドの値をMap型で全て取得
	public static Map<Integer, String> getMapValue() {
		for (RomanEnum compareObj: values()) {
			mapValue.put(compareObj.num, compareObj.roman);
		}
		return mapValue;
	}

	// ローマ数字を取得
	public static String getRoman(int i) {
		return getMapValue().get(i);
	}

	// フィールドに値が存在する
	public static boolean isInRomanEnum(int i) {
		for (RomanEnum compareObj: values()) {
			if (compareObj.getNum() == i) {
				return true;
			}
		}
		return false;
	}

	// 商が1以上になる時の除数と余りを返す
	public static Map<String, Integer> getQuotAndRem(int i) {
		Map<String, Integer> map = new HashMap<String, Integer>();
		for (RomanEnum compareObj: values()) {
			if (i / compareObj.getNum() >= 1) {
				map.put(DIVISOR, compareObj.getNum());
				map.put(REMAINDER, i - compareObj.getNum());
				break;
			}
		}
		return map;
	}
}