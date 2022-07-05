package string_manipulations;

import java.util.Arrays;

public class Reverse_String_With_Special_Chars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "To$day is Wed#nesday";

		int dollarindex = str.indexOf("$");

		System.out.println(dollarindex);
		int hashindex = str.indexOf("#");
		System.out.println(hashindex);
		
		String newArr=str.replaceAll("[^A-Z a-z]", "");

		String[] arr = newArr.split(" ");

	     System.out.println(Arrays.toString(arr));

		int len = arr.length;

		for (int i = arr.length / 2; i >= 0; i--) {

			String temp = arr[i];

			arr[i] = arr[len - i - 1];
			arr[len - i - 1] = temp;

		}
		 System.out.println(Arrays.toString(arr));
		String srr = "";

		for (int i = 0; i < arr.length; i++) {
			srr = srr + arr[i] + " ";
		}
		 System.out.println(srr);

////		String newArr = "";
////
////		newArr = newArr + srr.replaceAll("[^A-Z a-z]", "");
//
//		// System.out.println(newArr);
//
		String modArr ="";
				

		for (int i = 0; i <srr.length(); i++) {
			

			if (i == dollarindex) 
			{
				modArr = modArr + "$";
			}
			if (i ==hashindex-1)
			{
				modArr = modArr +"#";
			}
			modArr = modArr + srr.charAt(i);


		}
		System.out.println(modArr);
		
		System.out.println(modArr.indexOf("#"));

	}

}

