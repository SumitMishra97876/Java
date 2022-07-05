package string_manipulations;

public class Removing_Particular_word_from_String {
	public static void main(String[] args) {
        final String str = "I am Unfortunate guy";
        System.out.println(replaceWord(str, "Unfortunate"));
    }
    
    public static String replaceWord(final String str, final String word) {
        final String[] str2 = str.split(" ");
        String temp = "";
        for (int i = 0; i < str2.length; ++i) {
            if (!str2[i].equals(word)) {
                temp = temp + str2[i] + " ";
            }
        }
        return temp;
    }

}
