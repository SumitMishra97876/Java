package arraylist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Collectors;

public class Main1 {

	public static void main(String[] args) {

		String[] testStrings = { "Bernard", "Charlie", "Angie", "Andy", "Bertha", "Annie", "Carl", "Dennis", "Caroline",
				"Bob", "Betty", "Bart", "Albert", "Connie" };

		System.out.println("Lets Begin");

		
		

		test(testStrings);

	}

	public static void test(String[] str) {
		ArrayList<String> str1 = new ArrayList<String>(Arrays.asList(str));
		System.out.print("Original Collection :");
		
		System.out.println(str1);

		

		ArrayList<String> ar1 = (ArrayList<String>) str1.stream().filter(e -> e.startsWith("A") && e.length() > 4)
				.collect(Collectors.toList());

		System.out.println("Sorted and filtered names with A larger than 4 characters");

		System.out.println(ar1);

		ArrayList<String> ar2 = (ArrayList<String>) str1.stream().filter(e -> e.startsWith("B") && e.length() >= 3)
				.collect(Collectors.toList());

		System.out.println("Sorted and filtered names with B equal or  larger than 3 characters");

		System.out.println(ar2);

		ArrayList<String> ar3 = (ArrayList<String>) str1.stream().filter(e -> e.startsWith("C") && e.length() >= 5)
				.collect(Collectors.toList());

		System.out.println("Sorted and filtered names with C equal or  larger than 5 characters");

		System.out.println(ar3);
	}

}
