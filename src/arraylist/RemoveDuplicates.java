package arraylist;

import java.util.ArrayList;

public class RemoveDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(5);
		arr.add(6);
		arr.add(1);
		arr.add(3);
		arr.add(5);
		arr.add(7);
		arr.add(6);
		
		removeDuplicates(arr);
	}
	
	public static void removeDuplicates(ArrayList<Integer> arr)
	{
		ArrayList<Integer> arr1=new ArrayList<Integer>();
		
		for(int i=0;i<arr.size();i++)
		{
			if(!arr1.contains(arr.get(i)))
			{
				arr1.add(arr.get(i));
			}
		}
		
//		for(Integer in:arr)
//		{
//			if(!arr1.)
//		}
		System.out.println(arr1);
		
	}

}
