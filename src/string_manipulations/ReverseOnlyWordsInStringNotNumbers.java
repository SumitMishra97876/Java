package string_manipulations;

import java.util.Arrays;

public class ReverseOnlyWordsInStringNotNumbers {

	public static void main(String[] args) {

		String str = "test986java657hello98po";

		disp(str);

	}

	public static void disp(String str) {

		String[] strArr = str.split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");

		for (int i = 0; i < strArr.length; i++) {

			if (!Character.isDigit(strArr[i].charAt(0))) {

				strArr[i] = rev(strArr[i]);

			}

		}

		String s2 = String.join("", strArr);

		System.out.print(s2);

	}

	public static String rev(String str) {

		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		return rev;
	}

}
