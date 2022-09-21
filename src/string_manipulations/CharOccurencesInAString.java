package string_manipulations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CharOccurencesInAString {

	public static void main(String[] args) {


		String str="appartmentss";
         disp(str);
	}
	
	public static void disp(String str)
	{
		
		Map<Object, Long> mp=Arrays.stream(str.split("")).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(mp);
		
		
		List<Entry<Object, Long>>charList=mp.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());
		System.out.println(charList);
	}

}
