package string_manipulations;

public class ReverseStringOrder {

	public static void main(String[] args) {
		reverseOrder("This is Sumit");

	}
	
	public static void reverseOrder(String str)
	{
		String[] s=str.split(" ");
		StringBuilder sb=new StringBuilder();
		
		for(int i=s.length-1;i>=0;i--)
		{
			sb.append(s[i]).append(" ");
		}
		
		System.out.println(sb);
	}

}
