package string_manipulations;

public class Printing_Start_After_Each_Letter {
	
	 public static void main(final String[] args) {
	        final String name = "Sumit";
	        System.out.println(printStar(name));
	    }
	    
	    public static String printStar(final String name) {
	        final int len = name.length();
	        String name2 = "";
	        for (int i = 0; i < len; ++i) {
	            name2 = name2 + name.charAt(i) + "*";
	        }
	        return name2;
	    }

}
