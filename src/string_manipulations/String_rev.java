package string_manipulations;

public class String_rev {
	
	public static void main(final String[] args) {
        final String str = "Sabretooth";
        System.out.println(rev(str));
    }
    
    public static String rev(final String str) {
        if (str == null) {
            System.out.println("Enter a non null string");
        }
        else if (str.equals("")) {
            System.out.println("Enter a non blank string");
        }
        final int length = str.length();
        if (length == 1) {
            return str;
        }
        String rev = "";
        for (int i = length - 1; i >= 0; --i) {
            rev = String.valueOf(rev) + str.charAt(i);
        }
        return rev;
    }

}
