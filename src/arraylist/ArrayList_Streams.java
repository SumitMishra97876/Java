package arraylist;

import java.util.ArrayList;
import java.util.stream.Collectors;

public class ArrayList_Streams {

	public static void main(String[] args) {
		
		
		
		ArrayList<String> l1=new ArrayList<String>();
		
		ArrayList<String> l2=new ArrayList<String>();
		
		
		ArrayList<String> l3=new ArrayList<String>();
		
		l3.add("abcd");
		l3.add("efgh");
		l3.add("hijk");
		
		System.out.println(l3);
		
		l1=(ArrayList<String>) l3.stream().map(x->x.substring(0,2)).collect(Collectors.toList());
		System.out.println(l1);
		
		l2=(ArrayList<String>) l3.stream().map(x->x.substring(2)).collect(Collectors.toList());
		
		System.out.println(l2);
		
	}

}
