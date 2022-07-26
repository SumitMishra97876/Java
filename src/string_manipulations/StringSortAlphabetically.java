package string_manipulations;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class StringSortAlphabetically {

	public static void main(String[] args) {


		String str="My Name is Sumit Mishra";
		
		disp(str);

	}
	
	public static void disp(String str)
	{
		
		String sarr[]=str.split(" ");
		
		ArrayList<String> alist=new ArrayList<String>(Arrays.asList(sarr));
		String[] newArr=alist.stream().sorted((i1,i2)->i1.compareToIgnoreCase(i2)).toArray(String[]::new);  //sorting in natural order i.e ascending/aphabetical order
		System.out.println(String.join(" ", newArr));
		
		
		String[] newArr1=alist.stream().sorted((i1,i2)->-i1.compareToIgnoreCase(i2)).toArray(String[]::new); // sorting in customized order i.e descending order 
		System.out.println(String.join(" ", newArr1));
		
		
		
		
		
	}

}
