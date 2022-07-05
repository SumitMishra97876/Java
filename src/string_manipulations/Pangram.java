package string_manipulations;

public class Pangram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		isPangram("abcdefghijklmnopqrstuvwxyz");
	}
	
	public static void isPangram(String str)
	{
		str=str.toLowerCase();
		
		boolean flag=true;
		
		for(char c='a';c<='z';c++)
		{
			if(!str.contains(String.valueOf(c)))
			{
				flag=false;
				break;
			}
		}
		
		if(flag)
		{
			System.out.println("String is Pangram");
		}
		else
		{
			System.out.println("String is not Pangram");
		}
	}

}
