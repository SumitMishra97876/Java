package string_manipulations;

public class Total_Digits_In_A_String {
	public static void main(final String[] args) {
        final String str = "GeeksforGeeks password is :5675674 ";
        int digits = 0;
        for (int i = 0; i < str.length(); ++i) {
			/* if (str.charAt(i) >= '0' && str.charAt(i) <= '9') */ if(Character.isDigit(str.charAt(i))){
                digits++;
            }
        }
        System.out.println("Total number of Digits = " + digits);
    }

}
