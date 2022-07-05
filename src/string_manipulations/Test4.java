package string_manipulations;

public class Test4 {

	public static void main(String[] args) {
		String str = "I Love India";

		int len = str.length();

		String rev = "";
		for (int i = len - 1; i >= 0; i--)

		{
			rev = rev + str.charAt(i);

		}
		
		char c = rev.charAt(0);
		char d = rev.charAt(rev.length() - 1);
		String e = String.valueOf(d).trim();

		String s = "";

		for (int i = 1; i < rev.length() - 2; i++) {
			s = s + rev.charAt(i);
		}

		String res = c + " " + s + e;

		System.out.println(res);
	}

}
