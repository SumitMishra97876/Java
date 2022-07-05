package set;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SortingASet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		Set<Integer> s=new HashSet<Integer>();
		 s.add(2);
		 s.add(9);
		 s.add(13);
		 s.add(8);
		 s.add(15);
		 s.add(12);
		 
		 List<Integer> l=new ArrayList<Integer>(s);
		 
		 Collections.sort(l);
		 
		 s= new HashSet<Integer>(l);
		 
		 System.out.println(s);
		
	}

}
