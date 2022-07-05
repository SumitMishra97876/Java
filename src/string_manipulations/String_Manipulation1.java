package string_manipulations;

import java.util.Arrays;

public class String_Manipulation1 {

	public static void main(String[] args) {

		String str = "I am from India";

		String[] arr = str.split(" ");

		String arr1 = arr[1];

		arr[1] = rev(arr1);

		String str1 = "";

		for (int i = 0; i < arr.length; i++) {
			str1 = str1 + arr[i] + " ";
		}

		System.out.println(str1);

	}

	public static String rev(String str) {
		int len = str.length();

		String revs = "";

		for (int i = len - 1; i >= 0; i--) {
			revs = revs + str.charAt(i);
		}
		return revs;
	}

}
