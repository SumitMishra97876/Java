package string_manipulations;

public class Test2 {
	
	public static void main(final String[] args) {
        final String str = "01230";
        System.out.println(test(str));
    }
    
    public static String test(final String str) {
        final int length = str.length();
        String rev = "";
        for (int i = length - 1; i >= 0; --i) {
            rev = String.valueOf(rev) + str.charAt(i);
        }
        return rev;
    }

}
