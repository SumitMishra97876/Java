package sortingusingcomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortingUsingLambdaExpression {

	public static void main(String[] args) {


		
ArrayList<String> alist=new ArrayList<String>();
		
//		alist.add(1);
//		alist.add(9);
//		alist.add(5);
//		alist.add(2);
//		alist.add(10);
//		alist.add(12);
		
		
		alist.add("Sumit");
		alist.add("Tinku");
		alist.add("Rahul");
		alist.add("Natua");
		alist.add("Murg");
		alist.add("Sardarwa");
		
		//Collections.sort(alist,(i1,i2)->(i1>i2)?-1:(i1>i2)?1:0);
		Collections.sort(alist/*,Comparator.reverseOrder()*/);
		
		System.out.println(alist);

	}

}
