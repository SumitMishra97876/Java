package string_manipulations;

public class RemoveWhiteSpacesfromStringWithoutUsingInbuiltFunctions {

	public static void main(String[] args) {


		String str="I am Sumit Mishra";
		disp(str);

	}
	
	public static void disp(String str)
	{
		
		String str1="";
		//str1=str.replaceAll(" ", "");
		
		for(int i=0;i<str.length();i++)
		{
			if(!(str.charAt(i)==' '))
			{
				str1=str1+str.charAt(i);
			}
			
		}
		System.out.println(str1);
		
		
	}

}
