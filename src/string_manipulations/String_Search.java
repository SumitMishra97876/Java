package string_manipulations;

public class String_Search {
	
	 public static void main(final String[] args) {
	        final String[] names = { "Sumit", "Amit", "Lalit", "Saswat" };
	        final String search_name = "Saswat";
	        int count = 0;
	        for (int i = 0; i < names.length; ++i) {
	            if (names[i].equals(search_name)) {
	                System.out.println("Name FOund and is: " + names[i]);
	                count = 1;
	                break;
	            }
	        }
	        if (count == 0) {
	            System.out.println("Name not found");
	        }
	    }

}
