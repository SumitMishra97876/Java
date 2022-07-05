package string_manipulations;

public class RemoveFirstAndLastCharacterFromString {

	public static void main(String[] args) {
		print("GeeksForGeeks");
	}
	
	public static void print(String str)
	{
		String str1=str.substring(1, str.length()-1);
		
		System.out.println(str1);
	}

}
