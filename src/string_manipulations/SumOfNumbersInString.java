package string_manipulations;

public class SumOfNumbersInString {

	public static void main(String[] args) {


		
		String str="java8987Programming987ndmnd98";
		disp(str);
	}
	
	public static void disp(String str)
	{
		
	   int sum=0;
	   
	   for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				//sum = sum + Character.getNumericValue(str.charAt(i));
				sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));
			}
		}
	   System.out.println(sum);
	}

}
