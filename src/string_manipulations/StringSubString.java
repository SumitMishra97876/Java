package string_manipulations;

public class StringSubString {

	public static void main(String[] args) {

     String str="sabretooth";
     printSubString(str);
	}
	
	public static void printSubString(String str)
	{
		int len=str.length();
		String subStr="";
		
		for(int i=0;i<len;i++)
		{
			for(int j=1;j<=len-i;j++)
			{
				subStr=str.substring(i,i+j);
			}
			System.out.println(subStr);
		}
		
		
		
		
	}

}
