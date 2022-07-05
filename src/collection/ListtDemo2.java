package collection;

import java.util.ArrayList;
import java.util.Collections;

public class ListtDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ArrayList<Integer>a=new ArrayList<>(5);
		ArrayList<Integer>b=new ArrayList<>(5);
		
		a.add(3);
		a.add(1);
		a.add(11);
		a.add(19);
		a.add(17);
		
		
		b.add(5);
		b.add(2);
		b.add(6);
		b.add(7);
		b.add(20);
		
		System.out.println(test(a,b));

	}
	
	public static ArrayList<Integer> test(ArrayList<Integer> a,ArrayList<Integer> b)
	{
		
		
		a.addAll(b);
		
		Collections.sort(a);
		
		ArrayList<Integer>c=new ArrayList<>();
		
		c.add(a.get(2));
		c.add(a.get(6));
		c.add(a.get(8));
		
		return c;
		
		
	}

}
