package string_manipulations;

import java.util.Arrays;

public class Test1 {

	public static void main(String[] args) {
		
		String str="My n@me is 12Rahul";
		//char ch[]=str.toCharArray();
	     System.out.println(test(str));
		//test(str);
		
		

	}
	
	public static String test(String str)
	{
		
		
		String rev="";
		int len=str.length();
		
//		int left=0;
//		int right=str.length-1;
//		
//		while(left<right)
//		{
//			if(Character.isDigit(str[left]))
//			{
//				left++;
//				
//			}
//			else if(Character.isDigit(str[right]))
//			{
//				right--;
//			}
//			else
//            {
//                char tmp = str[left];
//                str[left] = str[right];
//                str[right]= tmp;
//                left++;
//                right--;
//            }
			
		
		
		
		
		for(int i=len-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
	}
	System.out.println(rev);
		
		String[] revRev=rev.split(" ");
		String revOrg="";
		 for (int i = revRev.length-1; i >= 0; i--) {  
			 revOrg=revOrg+revRev[i] + " ";  
	 }
		  return revOrg;
			  
		
	}
		
}


