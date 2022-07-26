package arraylist;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayListSortedOrNot {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<String>();
		alist.add("Is");
		alist.add("My");
		alist.add("Name");

		alist.add("Sumit");
		alist.add("Tinku");

		System.out.println(isSorted(alist));

	}

	public static boolean isSorted(ArrayList<String> alist) {

		boolean isSorted = true;

		int size = alist.size();

		for (int i = 0; i < size - 1; i++) {

			if (alist.get(i).compareTo(alist.get(i + 1)) > 0) {
				isSorted = false;
				break;
			}
		}
		return isSorted;

	}

}
