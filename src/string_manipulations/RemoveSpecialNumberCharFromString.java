package string_manipulations;

public class RemoveSpecialNumberCharFromString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		remove("Sumit123@67*");
	}
	
	public static void remove(String str)
	{
		String numbers="";
		String specialChars="";
		String alphabets="";
		
		for(int i=0;i<str.length();i++)
		{
			if(Character.isAlphabetic(str.charAt(i)))
			{
				alphabets=alphabets+str.charAt(i);
			}
			else if(Character.isDigit(str.charAt(i)))
			{
				numbers=numbers+str.charAt(i);
			}
			else
			{
				specialChars=specialChars+str.charAt(i);
			}
		}
		
		System.out.println(numbers);
		System.out.println(specialChars);
		System.out.println(alphabets);
		
	}

}
