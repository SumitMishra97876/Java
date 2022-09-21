package string_manipulations;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ReverseStringUsingStreams {

	public static void main(String[] args) {


		
		String str="Sabretooth";
		
		rev(str);
		

	}
	
	public static void rev(String str)
	{
		
	String rev=	Arrays.asList(str.split(" ")).stream().map(m -> new 
			StringBuilder(m).reverse().toString()).collect(Collectors.joining(" "));
		System.out.println(rev);
       
		
		
	}

}
