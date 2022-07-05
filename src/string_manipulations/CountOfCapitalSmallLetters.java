package string_manipulations;

public class CountOfCapitalSmallLetters {

	public static void main(String[] args) {
		
		countOfCapitalSmallLetters("SumitMishra");
	}
	
	public static void countOfCapitalSmallLetters(String str)
	{
		int capitalCount=0;
		int smallCount=0;
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isLowerCase(str.charAt(i)))
			{
				smallCount++;
			}
			else
			{
				capitalCount++;
			}
		}
		
		System.out.println("Capital  letter count : " +capitalCount);
		System.out.println("Small letter count : " +smallCount);
	}

}
