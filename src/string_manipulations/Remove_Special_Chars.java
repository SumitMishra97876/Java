package string_manipulations;

public class Remove_Special_Chars {
	
	public static void main( String[] args) {
        String str = "@#%$Hello*&%$#@!";
        System.out.println(str);
        str = str.replaceAll("[^a-zA-Z0-9]", "");
        System.out.println(str);
    }

}
