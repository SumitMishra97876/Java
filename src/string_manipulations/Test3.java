package string_manipulations;

public class Test3 {

	public static void main(String[] args) {
		
		
		String str1="This is the thread that given";
		String str2="th";
		//reverseString(str1,str2);
		
		reverseString(str1,str2);
		
//		char[] str=str1.toCharArray();
//		
//		
//		for(int i=0;i<str.length;i++)
//		{
//			if((str[i]=='T' || str[i]=='t') && (str[i+1]=='h'))
//			{
//				char temp=str[i];
//				str[i]=str[i+1];
//				str[i+1]=temp;
//			}
//		}
//		
//		String s=String.valueOf(str);
//		
//		System.out.println(s);
		
		

	}
	public static void reverseString(String str1,String str2)
	{
		int len=str1.length();
		String str2rev="";
		String regEx="([Tt][Hh])";
		
		if(str1.contains(str2))
		{
			 str2rev= str2rev+rev(str2);
		}
		
		String newStr=str1.replaceAll(regEx, str2rev);
		System.out.println(newStr);
		
		
	}
	
	public static String rev(String str)
	{
        String reverse="";
		
		int n=str.length();
		for(int i=n-1;i>=0;i--)
		{
			 reverse=reverse + str.charAt(i);
		}
		return reverse;
	}

}
