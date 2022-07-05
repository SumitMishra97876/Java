package string_manipulations;

public class Adding_Digits_String {

	public static void main(String[] args) {
		String str="a3b4c6";
		test(str);
		

	}
	
	
	public static void test(String str)
	{
		int nums=Integer.parseInt(str.replaceAll("[^0-9]", ""));
		
		 str=nums + "";
		 int sum=0;
		
		for(int i=0;i<str.length();i++)
		{
			sum=sum+Integer.parseInt(String.valueOf(str.charAt(i)));
		}
		System.out.println(sum);
	}

}
