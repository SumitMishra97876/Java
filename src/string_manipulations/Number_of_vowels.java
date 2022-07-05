package string_manipulations;

public class Number_of_vowels {
	
	public static void main(final String[] args) {
        final String s = "My life is fucked up badly";
        countVowels(s);
    }
    
    public static void countVowels(final String str) {
        final int n = str.length();
        int count = 0;
        for (int i = 0; i < n; ++i) {
            if (str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') {
                ++count;
            }
        }
        System.out.println("number of vowels " + count);
    }

}
