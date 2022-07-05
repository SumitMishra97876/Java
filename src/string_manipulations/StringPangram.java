package string_manipulations;

public class StringPangram {

	public static void main(String[] args) {
		
		String str="The quick brown fox jumps over the lazy dog";
		
		pangram(str);
	}
	
	public static void pangram(String str)
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
			System.out.println("String is pangram");
		}
		else
		{
			System.out.println("String not pangram");
		}
	}

}
