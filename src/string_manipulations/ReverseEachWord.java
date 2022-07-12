package string_manipulations;

public class ReverseEachWord {

	public static void main(String[] args) {
     String str="how are you";
     
     reverseEach(str);


	}
	
	public static void reverseEach(String str)
	{
		String[] sarr=str.split(" ");
		
		
		for(int i=0;i<sarr.length;i++ )
		{
			System.out.print(reverse(sarr[i])+ " ");
		}
		
	}
	
	public static String reverse(String str)
	{
		String rev="";
		
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		
		return rev;
	}

}
