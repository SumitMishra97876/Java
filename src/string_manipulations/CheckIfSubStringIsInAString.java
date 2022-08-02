package string_manipulations;

public class CheckIfSubStringIsInAString {

	public static void main(String[] args) {

		String str = "Sabretooth1 Is Back";

		boolean res = disp(str, "1");

		System.out.println(res);
	}

	public static boolean disp(String str, String subString) {

//		if(str.contains(subString))
//		{
//			return true;
//		}
//		return false;

		if (str.matches("(.*)" + subString + "(.*)")) {
              return true;
		}
		return false;

	}

}
