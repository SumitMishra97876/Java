package string_manipulations;

public class Vowel_Count {
	
	public static void main(final String[] args) {
        final String str = "Umbrella";
        System.out.println(vowelCount(str));
    }
    
    public static int vowelCount(final String str) {
        final int len = str.length();
        int vowCount = 0;
        for (int i = 0; i < len; ++i) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'A' || str.charAt(i) == 'e' || str.charAt(i) == 'E' || str.charAt(i) == 'i' || str.charAt(i) == 'I' || str.charAt(i) == 'o' || str.charAt(i) == 'O' || str.charAt(i) == 'u' || str.charAt(i) == 'U') {
                ++vowCount;
            }
        }
        return vowCount;
    }

}
