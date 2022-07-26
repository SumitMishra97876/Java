package string_manipulations;

public class LengthOfStrinhWithoutUsingLength {

	public static void main(String[] args) {


		String str="mbsjgdjgdjgdjGJKGKJG";

		
		len(str);
	}
	
	
	public static void len(String str)
	{
	 
		int count=0;
		int i=0;
		try
		{
//		for(int i=0;i<100000000;i++)
//		{
//			char c=str.charAt(i);
//			count++;
//		}
			while(true)
			{
				char c=str.charAt(i);
				i++;
				count++;
			}
		
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("Length of String is :" +count);
		}
    

	}

}
