package string_manipulations;

import java.util.Arrays;

public class String_Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringAnagram("Mother In Law","Hitler Woman");
	}
	
	public static void StringAnagram(String str1,String str2)
	{
	    String s1=str1.replaceAll("\\s", "");
	    String s2=str2.replaceAll("\\s", "");
	    
	    
	    if(s1.length()!=s2.length())
	    {
	    	System.out.println("Strings are not anagram");
	    }
	    
	    else
	    {
	    char[]ar1=	s1.toUpperCase().toCharArray();
	    char ar2[]=s2.toUpperCase().toCharArray();
	    
	    Arrays.sort(ar1);
	    Arrays.sort(ar2);
	    
	   boolean res= Arrays.equals(ar1, ar2);
	   
	   if(res==true)
	   {
		   System.out.println("Strings are anagram");
	   }
	   else
	   {
		   System.out.println("Strings are not anagram");
	   }
	    }
	    
	}

}
