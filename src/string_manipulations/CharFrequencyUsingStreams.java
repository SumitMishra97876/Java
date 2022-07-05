package string_manipulations;

import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CharFrequencyUsingStreams {

	public static void main(String[] args) {
		
		
		String string = "aasjjikkk";

//		Map<Character, Long> characterFrequency = string.chars()  // creates an IntStream
//		    .mapToObj(c -> (char) c) // converts the IntStream to Stream<Character>
//		    .collect(Collectors.groupingBy(c -> c, Collectors.counting()));
		
		
		Map<Character, Integer> frequency = 
				string.chars()
	               .mapToObj(c -> (char)c)
	               .collect(Collectors.toMap(Function.identity(), c -> 1, Math::addExact));
         
		
		Set<Map.Entry<Character,Integer>> hs=frequency.entrySet();
		
		for(Map.Entry<Character, Integer> h:hs)
		{
			System.out.println(h.getKey()+ "-" + h.getValue());
		}
	}

}

