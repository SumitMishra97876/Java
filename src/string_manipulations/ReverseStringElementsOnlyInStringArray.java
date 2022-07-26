package string_manipulations;

public class ReverseStringElementsOnlyInStringArray {

	public static void main(String[] args) {

     String[] arr= {"Hello","Excitement","1234","Pyhthon","987"};
     
     
     disp(arr);
     

	}
	
	public static void disp(String[] arr)
	{
		
		for(int i=0;i<arr.length;i++)
		{
			if(!Character.isDigit(arr[i].charAt(0)))
			{
				arr[i]=reverse(arr[i]);
			}
		}
		for(String s:arr)
		{
			System.out.print(s+" ");
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
