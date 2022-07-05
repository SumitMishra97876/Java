package string_manipulations;

public class Swapping_Corner_words_Reversing_Mid {
	public static void main(final String[] args) {
        final String str = "Keep up the good work";
        swpapReverse(str);
    }
    
    public static void swpapReverse(final String str) {
        final String[] str2 = str.split(" ");
        final String temp = str2[0];
        str2[0] = str2[str2.length - 1];
        str2[str2.length - 1] = temp;
        String mid = " ";
        for (int i = str2.length - 2; i >= 1; --i) {
            final String mid2 = str2[i];
            for (int j = mid2.length() - 1; j >= 0; --j) {
                mid = String.valueOf(mid) + mid2.charAt(j);
            }
            mid = String.valueOf(mid) + " ";
        }
        System.out.println(String.valueOf(str2[0]) + " " + mid + " " + str2[str2.length - 1]);
    }

}
