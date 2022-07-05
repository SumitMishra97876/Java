package string_manipulations;

public class WordsCountString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="This Is Camel Case Letter";
		System.out.println(wordCount(str));

	}
	public static int wordCount(String str)
	{
		int count=0;
		
		for(int i=0;i<str.length();i++)
		{
			if((str.charAt(i)>=65 && str.charAt(i)<=90) && (str.charAt(i+1)>=97 && str.charAt(i+1)<=122))
			{
				count=count+1;
			}
			
		}
		return count;
	

	}
}

