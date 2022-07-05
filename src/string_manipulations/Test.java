package string_manipulations;

public class Test {
	public static void main(final String[] args) {
        final String s = "AB2C99423A";
        final char[] ch = s.toCharArray();
        final char[] res = new char[ch.length + 2];
        int even = 0;
        int odd = 1;
        for (int i = 0; i < s.length(); ++i) {
            if (Character.isAlphabetic(ch[i])) {
                res[even] = ch[i];
                even += 2;
            }
            else if (!Character.isAlphabetic(ch[i])) {
                res[odd] = ch[i];
                odd += 2;
            }
        }
        for (int i = 0; i < res.length; ++i) {
            System.out.print(res[i]);
        }
    }

}
