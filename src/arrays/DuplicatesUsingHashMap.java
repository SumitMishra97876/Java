package arrays;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicatesUsingHashMap {

	public static void main(String[] args) {

     int[] arr= {1,2,3,5,2};
     dupHashMap(arr);
	}
	
	public static void dupHashMap(int[] arr)
	{
		HashMap<Integer,Integer> hs=new HashMap<Integer,Integer>();
		boolean flag=false;
		int counter=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(hs.containsKey(arr[i]))
			{
				counter=hs.get(arr[i]);
				counter=counter+1;
				hs.put(arr[i], counter);
			} else {
				hs.put(arr[i], 1);
			}
		}
		
		Set<Map.Entry<Integer,Integer>>s=hs.entrySet();
		
		for(Map.Entry<Integer, Integer>s1:s)
		{
			if(s1.getValue()>1)
			{
				flag=true;
				System.out.println("Duplicate elements are : " +s1.getKey());
			}
		}
		
		if(flag==false)
		{
			System.out.println("Duplicates are not there");
		}
	}

}
