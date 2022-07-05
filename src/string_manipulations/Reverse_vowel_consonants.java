package string_manipulations;

public class Reverse_vowel_consonants {

	public static void main(String[] args) {
		
		String str="this is sumit";
		
		test(str);

	}

	public static void test(String str) {
		String[] arr = str.split(" ");
		String strr="";

		int len = arr.length;

		for (int i = 0; i < len; i++) {
			for (int j = 0; j < arr[i].length(); j++) {
				if ((arr[i].charAt(j) == 'a' || arr[i].charAt(j) == 'e' || arr[i].charAt(j) == 'i'
						|| arr[i].charAt(j) == 'o' || arr[i].charAt(j) == 'u')
						&& (arr[i].charAt(j + 1) != 'a' || arr[i].charAt(j + 1) != 'e' || arr[i].charAt(j + 1) != 'i'
								|| arr[i].charAt(j + 1) != 'o' || arr[i].charAt(j + 1) != 'u')) {
					
					String str1=arr[i];
					
					arr[i]=rev(str1);

				}

			}
			
			for(int k=0;k<len;k++)
			{
				strr=strr+arr[k] + " ";
			}
			
			System.out.println(strr);

		}
		

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
