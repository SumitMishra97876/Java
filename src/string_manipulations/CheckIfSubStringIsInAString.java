package string_manipulations;

import java.text.DateFormat;
import java.util.Date;

public class CheckIfSubStringIsInAString {

	public static void main(String[] args) {

		String str = "Sabretooth1 Is Back";
		int i=1;
		i=++i;
		System.out.println(i);
		
		
		

		boolean res = disp(str, "1");

		System.out.println(res);
	}

	public static boolean disp(String str, String subString) {

//		if(str.contains(subString))
//		{
//			return true;
//		}
//		return false;
		//str.matches("(.*)" +subString + "(.*)"))

		if (str.matches("(.*)" + subString + "(.*)")) {
              return true;
		}
		return false;

	}

}
