package string_manipulations;

public class Likes_Dislike_Hackerearth {
	
	 public static void main(String[] args) {
	        final String str1 = "0010010101";
	        final String str2 = "1001010111";
	        final int matches = like_dislike(str1, str2);
	        System.out.println(matches);
	    }
	    
	    public static int like_dislike(final String str1, final String str2) {
	        final int len1 = str1.length();
	        int count = 0;
	        for (int i = 0; i < len1; ++i) {
	            if (str1.charAt(i) == str2.charAt(i)) {
	                ++count;
	            }
	        }
	        return count;
	    }

}
