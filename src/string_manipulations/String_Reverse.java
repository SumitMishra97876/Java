package string_manipulations;

public class String_Reverse {
	
	 public static void main(final String[] args) {
	        System.out.println(stringRev("Sumit"));
	    }
	    
	    public static String stringRev(final String str) {
	        if (str == null) {
	            return "You passed a null string...Please pass a proper String";
	        }
	        final int length = str.length();
	        if (length == 1) {
	            return str;
	        }
	        if (str.equals("")) {
	            return "please pass proper string";
	        }
	        String rev = "";
	        for (int i = length - 1; i >= 0; --i) {
	            rev = rev + str.charAt(i);
	        }
	        return rev;
	    }

}
