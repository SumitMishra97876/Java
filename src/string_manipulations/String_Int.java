package string_manipulations;

public class String_Int {

	public static void main(String[] args) {

		String str = "Ind12ia45";

		System.out.println(test(str));

	}

	public static String test(String str) {
		int len = str.length();

		String chars = "";
		String digs = "";

		for (int i = 0; i < len; i++) {
			if (Character.isLetter(str.charAt(i))) {
				chars = chars + str.charAt(i);
			}

		if (Character.isDigit(str.charAt(i))) {
//			else
//			{
				digs = digs + str.charAt(i);
			}
		}

		return new String(chars + digs);
	}

}
