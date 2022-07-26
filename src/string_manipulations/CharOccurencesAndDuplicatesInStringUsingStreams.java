package string_manipulations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CharOccurencesAndDuplicatesInStringUsingStreams {

	public static void main(String[] args) {
		
     String str="appartment";
     
     disp(str);
	}
	
	public static void disp(String str)
	{
		
		String[] arr=str.split("");
		
		
		Map<Object,Long> hm=Arrays.stream(arr).collect(Collectors.groupingBy(s->s,LinkedHashMap:: new,Collectors.counting()));
		
	
		
		//System.out.println(hm);
		
		              
		     List<Entry<Object, Long>> nm= hm.entrySet()
		           .stream().filter(e->e.getValue()>1).collect(Collectors.toList());
		
		     
		     System.out.println(nm);
		
//		for(Map.Entry<Object, Long>s:hm.entrySet())
//		{
//			if(s.getValue()>1)
//			{
//				System.out.println("Duplicates chars are " +s.getKey());
//			}
//		}
		
		
	}
	
	

}
