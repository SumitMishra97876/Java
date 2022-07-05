package string_manipulations;

public class Vowel_Consonants_reverse1 {

	public static void main(String[] args) {
		
		
		String str="this is rohan";
		test(str);
		

}
	
	public static void test(String str)
	{
		int strlen=str.length();
		// thsi si rhoti
		
		
		char[] charr=str.toCharArray();
		
		int len=charr.length;
		
		for(int i=0;i<strlen;i++)
		{
		if((str.charAt(i) == 'a' || str.charAt(i) == 'e' ||  str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
			&& (str.charAt(i+1) != 'a' || str.charAt(i+1) != 'e' || str.charAt(i+1) != 'i' || str.charAt(i+1) != 'o' || str.charAt(i+1) != 'u'))
		{
              char temp=charr[i];
	          charr[i]=charr[i+1];
	          charr[i+1]=temp;
		}
           
           

		}
		
		String str2="";
		
		for(int i=0;i<len;i++)
		{
			str2=str2+charr[i] + "";
		}
		System.out.println(str2);
		
	}
	}
	

