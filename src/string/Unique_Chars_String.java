package string;


import java.util.Set;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;

public class Unique_Chars_String {

	public static void main(String[] args) {
		
		String str="sumit";
		System.out.println(test1(str));
		//test(str);

	}
	
//	public static int test(String str)
//	{
//		
//		char ch[]=str.toCharArray();
//		
//		Set<Character>st1=new HashSet<Character>();
//		Set<Character>st2=new HashSet<Character>();
//		
//		for(int i=0;i<ch.length;i++)
//		{
//			if(st1.contains(ch[i]))
//			{
//				st1.add(ch[i]);
//				st2.remove(ch[i]);
//			}
//			else
//			{
//				st1.add(ch[i]);
//				st2.add(ch[i]);
//				
//			}
//		}
//		if(st2.size()!=0)
//			return st2.size();
//		else
//			return -1;
//        
//        
//        
//    }
	
	public static int test1(String str)
	{
		Set<Character> st1=new LinkedHashSet<Character>();
		Set<Character> st2=new LinkedHashSet<Character>();
		
		
		
		for(int i=0;i<str.length();i++)
		{
			if(!st1.add(str.charAt(i)))
			{
				st2.add(str.charAt(i));
				
			}
			st1.removeAll(st2);
		}
		if(st1.size()>0)
			return st1.size();
		else
			return -1;
	}

		
		
		
		
		
		
		
	}



