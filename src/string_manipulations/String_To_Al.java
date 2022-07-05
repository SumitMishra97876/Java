package string_manipulations;

import java.util.ArrayList;
import java.util.Arrays;

public class String_To_Al {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="1,2,3";
		
		String[] arr=str.split(",");
		
		ArrayList<String> al=new ArrayList<String>(Arrays.asList(arr));
		
		for(String s:al)
		{
			System.out.print(s);
		}

	}
	
	
}
