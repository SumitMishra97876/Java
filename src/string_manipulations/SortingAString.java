package string_manipulations;

public class SortingAString {

	public static void main(String[] args) {


		
		String str="Mishra";
		disp(str);

	}
	public static void disp(String str)
	{
		
		
		str=str.toLowerCase();
		char[] chArr=str.toCharArray();
		
		for(int i=0;i<chArr.length;i++)
		{
			
			
			for(int j=i+1;j<chArr.length;j++)  
			
			if(chArr[i]>chArr[j])    // for sorting descending   make <
			{
				char temp=chArr[i];
				chArr[i]=chArr[j];
				chArr[j]=temp;
			}
		}
		
		for(char c:chArr)
		{
			System.out.print(c);
		}
		
		
	}

}
