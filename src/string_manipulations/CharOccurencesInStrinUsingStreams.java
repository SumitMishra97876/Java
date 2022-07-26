package string_manipulations;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class CharOccurencesInStrinUsingStreams {

	public static void main(String[] args) {

     String str="Appartment";
     
     disp(str);

	}
	
	public static void disp(String str)
	{
		
		 
		Map<Object, Long> result=Arrays.stream(str.split("")).map(String::toLowerCase)
				.collect(Collectors.groupingBy(s->s,LinkedHashMap::new,
				 Collectors.counting()));
		System.out.println(result);
	}
	
	

}
