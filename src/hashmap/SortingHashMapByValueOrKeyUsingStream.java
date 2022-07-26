package hashmap;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class SortingHashMapByValueOrKeyUsingStream {

	public static void main(String[] args) {

		HashMap<String, Integer> hm = new HashMap<String, Integer>();
		hm.put("Math", 98);
		hm.put("Data Structure", 85);
		hm.put("Database", 91);
		hm.put("Java", 95);
		hm.put("Operating System", 79);
		hm.put("Networking", 80);
		disp(hm);
	}

	public static void disp(HashMap<String, Integer> hmap) {
//		
		// By Values
		// sorting HashMap by Values in Ascending order
		LinkedHashMap<String, Integer> lmapAscending = hmap.entrySet().stream().sorted(Map.Entry.comparingByValue())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));
		System.out.println(lmapAscending);

		LinkedHashMap<String, Integer> lmapDescending = hmap.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e2, LinkedHashMap::new));

		System.out.println(lmapDescending);

		System.out.println(
				"---------------------------------------------------------------------------------------------------------------");

		// By Keys

		LinkedHashMap<String, Integer> lmapKeysAscending = hmap.entrySet().stream().sorted(Map.Entry.comparingByKey())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));
		System.out.println(lmapKeysAscending);

		LinkedHashMap<String, Integer> lmapKeysDescending = hmap.entrySet().stream()
				.sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

		System.out.println(lmapKeysDescending);

	}

}
