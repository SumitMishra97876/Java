package string_manipulations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

public class WordOccurancesInStringArray {

	public static void main(String[] args) {


		
		String[] str= {"Jack","Java","Python","Jack","java","Python"};

		disp(str);
	}
	
	public static void disp(String[] str)
	{
		
		
		Map<Object, Long> hm = Arrays.stream(str)
				.collect(Collectors.groupingBy(s -> s, LinkedHashMap::new ,Collectors.counting()));	
		
		System.out.println(hm);
		System.out.println();
		
		
		List<Entry<Object, Long>> nm=hm.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());
		System.out.println("Duplicate words along with count are : " +nm);
		
//		Set<Map.Entry<Object,Long>>s=hm.entrySet();
//		
//		for(Map.Entry<Object, Long> s1:s)
//		{
//			if(s1.getValue()>1)
//			{
//				System.out.println("Duplicates are " +s1.getKey());
//			}
//		}
	}

}
