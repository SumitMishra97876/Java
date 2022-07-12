package string_manipulations;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicateWordsFromString {

	public static void main(String[] args) {
		
    String str="I am Sumit Sumit";
    removeDups(str);
	}
	
	public static void removeDups(String str)
	{
		
		String[] sarr=str.split(" ");
		
		Set<String> set=new LinkedHashSet<String>();
		
		
		for(int i=0;i<sarr.length;i++)
		{
			if(!set.add(sarr[i]))
			{
				//System.out.println("Duplicate String is : " +sarr[i]);
				set.add(sarr[i]);
			}
		}
		
		for(String s:set)
		{
			System.out.print(s +" ");
		}
		
	}

}
