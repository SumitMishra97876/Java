package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.stream.Collectors;

public class ReverseNumbersInArray {

	public static void main(String[] args) {
 
		
		Integer[] arr= {123,456,87,45,68,23,48,245};
        disp(arr);
        String str="sumit";
        
       // rev(str);
	}
	
	public static void disp(Integer[] arr)
	{
		
		ArrayList<Integer> alist=new ArrayList<Integer>(Arrays.asList(arr));
		
		       alist.stream().filter(s->s%2==0).sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
		
		
	}
	
	public static String rev(String str)
	{
		
		String rev = "";

		for (int i = str.length() - 1; i >= 0; i--) {

			rev = rev + str.charAt(i);
		}
		return rev;
	}

}
