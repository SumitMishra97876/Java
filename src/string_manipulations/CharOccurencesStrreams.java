package string_manipulations;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class CharOccurencesStrreams {

	public static void main(String[] args) {


		
		String str="territory";
		
		
		String[] sarr=str.split("");
		
		
		Map<Object,Long> map=Arrays.stream(sarr).collect(Collectors.groupingBy(s->s,LinkedHashMap::new,Collectors.counting()));
		
		System.out.println(map);
		
		
		List<Entry<Object, Long>> lis=map.entrySet().stream().filter(e->e.getValue()>1).collect(Collectors.toList());
		System.out.println(lis);

}
}
