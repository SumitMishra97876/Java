package string_manipulations;

public class Remove_Digits_String {

	public static void main(String[] args) {
		
		
		String str = "Test1234Test9876UIPath jack1234";
		
		 System.out.println(removeDigits(str));

		

	}
	
	public static String removeDigits(String str)
	{
		int len = str.length();

		char[] ch = str.toCharArray();

		String res = "";

		for (int i = 0; i < ch.length; i++) {
			if (!Character.isDigit(ch[i])) {
				res = res + ch[i];
			}
		}
		return res;
	}

	}


