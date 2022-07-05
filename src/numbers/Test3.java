package numbers;

public class Test3 {

	public static void main(String[] args) {
		
		int num=457286;
		countAtOddEven(num);
		
	}
	
	public static void countAtOddEven(int num)
	{
		String str=String.valueOf(num);
		
		int len=str.length();
		String even="";
		String odd="";
		
		for(int i=0;i<len;i++)
		{
			if(i%2==0)
			{
				odd=odd+str.charAt(i);
				
			}
			else if(i%2!=0)
			{
				even=even+str.charAt(i);
				
			}
		}
		
		System.out.println("Numbers at even position :" +even);
		System.out.println("Numbers at odd position :" +odd);
		
		
		
	}

}
