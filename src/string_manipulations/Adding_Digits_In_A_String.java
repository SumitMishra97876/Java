package string_manipulations;

public class Adding_Digits_In_A_String {

	public static void main(String[] args) {
		String str = "a3b4c6";
		test(str);

	}

	public static void test(String str) {
		int len = str.length();
		int sum = 0;
		
		for (int i = 0; i < len; i++) {
			if (Character.isDigit(str.charAt(i))) {
				//sum = sum + Character.getNumericValue(str.charAt(i));
				sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}

		System.out.println("sum is : " + sum);
	}

}
