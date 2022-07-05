package string_manipulations;

import java.util.Arrays;

public class TestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="MyNameIsSumit";
		String[] strArr=str.split("(?=\\p{Upper})");
		
		System.out.println(Arrays.toString(strArr));

	}

}
