package string_manipulations;

import java.util.ArrayList;

public class ReverseOnlyWordsInStringNotNumbers {

	public static void main(String[] args) {

		String str = "test987Java657python989yummy90$ypop";

		disp(str);

	}

	public static void disp(String str) {

		String[] strArr = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

		for (int i = 0; i < strArr.length; i++) {

			if (!Character.isDigit(strArr[i].charAt(0))) {

				strArr[i] = rev(strArr[i]);

			}

		}

		for (String str1 : strArr) {
			System.out.print(str1);
		}

	}

	public static String rev(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		return rev;
	}

}
