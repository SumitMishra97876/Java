package string_manipulations;

public class Test8 {

	public static void main(String[] args) {
		
		
		String str="xxyyyzzzxpp";
		
		test(str);
		
	}
	
	public static void test(String str)
	{
		int length=str.length();
		
		
		
		for(int i=0;i<length;i++)
			
		{
			int count=1;
			while(i<length-1 && str.charAt(i)==str.charAt(i+1))
			{
				count++;
				i++;
			}
			if(count==1)
			{
				System.out.print(str.charAt(i));
				System.out.print(count);
				
			}
			else
			{
				System.out.print(str.charAt(i));
				System.out.print(count);
			}
		}
	}

}
