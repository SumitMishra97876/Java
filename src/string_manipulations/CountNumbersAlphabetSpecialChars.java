package string_manipulations;

public class CountNumbersAlphabetSpecialChars {

	public static void main(String[] args) {
		
		count("Sum!t12@34jhuj&^%");
	}
	
	public static void count(String str)
	{
		int numCount=0;
		int alphaCount=0;
		int specCount=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.codePointAt(i)))
			{
				alphaCount++;
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				numCount++;
			}
			else 
			{
				specCount++;
			}
		}
		System.out.println("Num count " +numCount);
		System.out.println("Alpha count " +alphaCount);
		System.out.println("Spec count " +specCount);
	}

}
