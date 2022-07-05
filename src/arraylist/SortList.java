package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ArrayList<String> ls=new ArrayList<String>();
      ls.add("Sumit");
	 ls.add("Rahul");
	ls.add("Aman");
	ls.add("Amit");
      
	
	sort(ls);
	}
    
	
	
	public static void sort(ArrayList<String> alist)
	{
//		alist.add("Sumit");
//		alist.add("Rahul");
//		alist.add("Aman");
//		alist.add("Amit");
		
		
		Collections.sort(alist);
		
		for(String s:alist)
		{
			System.out.println(s);
		}
	}
}
