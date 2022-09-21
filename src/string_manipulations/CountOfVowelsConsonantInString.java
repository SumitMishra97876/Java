package string_manipulations;

import java.util.Arrays;
import java.util.HashMap;

public class CountOfVowelsConsonantInString {

	public static void main(String[] args) {


		
		String str="Jackson";
		disp(str);
		
		HashMap<String,Integer>hm=new HashMap<String,Integer>();
		hm.put("a", 10);
		hm.put("a", 20);
		
		System.out.println(hm.size());
		double pickle=2;
	
		int jar=(int) pickle;
		

	}
	
	public static void disp(String str)
	{
		
       long vowelCount= str.chars().filter(c->c=='a'|| c=='e' || c=='i' || c=='o' || c=='u' || c=='A' || c=='E' || c=='I' || c=='O' || c=='U').count();
       System.out.println(vowelCount);
       
       
       long total= str.chars().count();
       System.out.println("consonantCount :" +(total-vowelCount));
		
		
		
		
	}

}
