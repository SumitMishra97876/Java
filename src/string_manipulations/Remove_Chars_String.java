package string_manipulations;

public class Remove_Chars_String {

	public static void main(String[] args) {
		String str = "Test1234Test9876UIPath jack1234";

		int len = str.length();

		char[] ch = str.toCharArray();

		String res = "";

		for (int i = 0; i < ch.length; i++) {
			if (Character.isDigit(ch[i])) {
				res = res + ch[i];
			}
		}
		System.out.println(res);

	}

}
