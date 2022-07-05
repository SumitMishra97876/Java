package string_manipulations;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class CountWordsInAString {

	public static void main(String[] args) {
     String str="I am learning java java java programming";
     
     disp(str);

	}
	
	
	public static void disp(String str)
	{
		
		
		String[] arr=str.split(" ");
		
		HashMap<String,Integer> hs=new HashMap<String,Integer>();
		int counter=0;
		
		for(int i=0;i<arr.length;i++)
		{
			if(hs.containsKey(arr[i]))
			{
				counter=hs.get(arr[i]);
				counter=counter+1;
				hs.put(arr[i], counter);
			}
			else
			{
				hs.put(arr[i], 1);
			}
		}
		
		Set<Map.Entry<String,Integer>>s=hs.entrySet();
		
		
		for(Map.Entry<String, Integer> s1:s)
		{
			System.out.println("Numebr of time : " +s1.getKey() + " is " +s1.getValue());
		}
		
	}

}
