package string;

import java.util.LinkedHashSet;
import java.util.Set;

public class Rem_Dup_String {

	public static void main(String[] args) {
		String str = "hi this is sample test";
		test(str);

	}

	public static void test(String str) {
		char ch[] = str.toCharArray();

		int chlen = ch.length;

		Set<Character> s = new LinkedHashSet<>();

		for (char c : ch) {

			s.add(c);
		}

		for (char c : s) {
			System.out.print(c);
		}

	}

}
