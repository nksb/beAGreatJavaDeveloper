package main.romanizer;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {

		int arg = Integer.parseInt(args[0]);
		int roman[] = new int[arg];
		for (int i = 1; i < args.length; i++) {
			roman[i - 1] = Integer.parseInt(args[i]);
		}
		String returnRoman[] = new String[Integer.parseInt(args[0])];
		returnRoman = romanizer(roman);
		for (String show : returnRoman) {
			System.out.println(show);
		}
	}

	/**
	 * 数字をローマ数字へ変換する
	 * @param ローマ数字へ変換する値
	 * @return ローマ数字に変換された値
	 */
	static String[] romanizer(int[] numbers) {

		String[] romReturn = new String[numbers.length];
		StringBuffer str;
		// 除数(divisor)
		int div = 0;
		// 余り(remainder)
		int rem = 0;
		int i = 0;
		Map<String, Integer> map = new HashMap<String, Integer>();

		// ローマ数字へ変換する値を一つずつ変換していく
		for (int arabic : numbers) {
			// 定数として宣言されている値はそのままローマ数字に変換する
			if (RomanEnum.isInRomanEnum(arabic)) {
				romReturn[i] = RomanEnum.getRoman(arabic);

			} else {
				// 定数に宣言されていない値は定数を使いながらローマ数字へ変換していく
				str = new StringBuffer();
				rem = arabic;
				while (rem != 0) {
					// 値を割って除数と余りを算出
					map = RomanEnum.getQuotAndRem(rem);
					// 余りを取得
					rem = map.get("remainder");
					// 編集用の値に除数を格納
					str.append(RomanEnum.getMapValue().get(map.get("divisor")));
				}
				romReturn[i] = str.toString();
			}
			i++;
		}
		return romReturn;
	}
}
