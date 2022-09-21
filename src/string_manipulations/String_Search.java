package string_manipulations;

public class String_Search {
	
	 public static void main(final String[] args) {
	        final String[] names = { "Sumit", "Amit", "Lalit", "Saswat" };
	        final String search_name = "Amit";
	        boolean flag=false;
	        for (int i = 0; i < names.length; ++i) {
	            if (names[i].equals(search_name)) {
	                System.out.println("Name FOund and is at index : " +i);
	               flag=true;
	                break;
	            }
	        }
	        if (flag == false) {
	            System.out.println("Name not found");
	        }
	    }

}
