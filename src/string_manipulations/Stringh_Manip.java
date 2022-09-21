package string_manipulations;

public class Stringh_Manip {
	
	public static void main(final String[] args) {
        final String str = "i am on the verge of losing everythingo";
        System.out.println(str.length());
        System.out.println(string(str, 2, 'o'));
    }
    
    public static int string(final String str, final int n, final char ch) {
        int occur = 0;
        if (str == null || str.equals("")) {
            return -1;
        }
        for (int i = 0; i < str.length(); ++i) {
            if (str.charAt(i) == ch) {
                ++occur;
            }
            if (occur == n) {
                return i;
            }
        }
        return -1;
    }

}
