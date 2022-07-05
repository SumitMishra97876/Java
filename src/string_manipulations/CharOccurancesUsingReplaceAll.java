package string_manipulations;

public class CharOccurancesUsingReplaceAll {

	public static void main(String[] args) {
		
		
		String str="mdbndjhskjdjdskhjdh";
		duplicate(str);

	}
	
	
	public static void duplicate(String str)
	{
		
		for (int i=0;i<str.length();i++) 
		{
			String chars=String.valueOf(str.charAt(i));
			int count=str.length()-str.replaceAll(chars, "").length();
			
			System.out.println("count of each Char " + str.charAt(i) +" is " +count);
			
		}
		
		
		
		
	}

}
