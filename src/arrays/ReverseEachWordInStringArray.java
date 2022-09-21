package arrays;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ReverseEachWordInStringArray {

	public static void main(String[] args) {
     
        String[] strArr= {"abc","def","ghi","pot"};
        
        revEachWord(strArr);
		
	}
	
	
	public static void  revEachWord(String[] strArr)
	{
	List<String>list=	Arrays.stream(strArr).collect(Collectors.toList())
		.stream().map(ReverseEachWordInStringArray::rev).collect(Collectors.toList());
		
		
	
	System.out.println(list);
		
	}
	
	
     
	
	public static String rev(String str)
	{
		
		StringBuilder sb=new StringBuilder(str);
		String revString= sb.reverse()+"";
		return revString;
		
		
	}
}
