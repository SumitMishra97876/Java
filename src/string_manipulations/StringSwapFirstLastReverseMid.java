package string_manipulations;

public class StringSwapFirstLastReverseMid {

	public static void main(String[] args) {
		String str="keep good work";
		
		disp(str);

	}
	
	public static void disp(String str)
	{
		String[] str1=str.split(" ");
		
		
		String temp=str1[0];
		str1[0]=str1[str1.length-1];
		str1[str1.length-1]=temp;
		
		String mid="";
		
		for(int i=str1.length-2;i>=1;i--)
		{
			String str2=str1[i];
			for(int j=str2.length()-1;j>=0;j--)
			{
			mid=mid+str2.charAt(j);
		}
		
		System.out.println(str1[0]+ "  "+ mid + " " +str1[str1.length-1]);
		
	}

}
}
