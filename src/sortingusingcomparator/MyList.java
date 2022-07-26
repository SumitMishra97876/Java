package sortingusingcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MyList {

	public static void main(String[] args) {


		
		ArrayList<Integer> alist=new ArrayList<Integer>();
		
		alist.add(1);
		alist.add(9);
		alist.add(5);
		alist.add(2);
		alist.add(10);

		
		Collections.sort(alist, new MyComparator());
		//Collections.sort(alist,Comparator.reverseOrder());
		System.out.println(alist);
	}

}
