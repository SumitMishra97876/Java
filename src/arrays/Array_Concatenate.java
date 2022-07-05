package arrays;

public class Array_Concatenate {

	public static void main(String[] args) {
	   
		int a1[]= {1,2,3,4};
		
		int b1[]= {5,6,7,8};
		
		int c=a1.length+b1.length;
		
		int c1[]=new int[c];
		
		for(int i=0;i<a1.length;i++)
		{
			c1[i]=a1[i];
			
		}
		for(int i=0;i<b1.length;i++)
		{
			c1[a1.length+i]=b1[i];
		}
		
		for(int i=0;i<c1.length;i++)
		{
			System.out.println(c1[i]);
		}

	}

}
