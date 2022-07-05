package numbers;

public class Swap2NumsWithoutTempVar {

	public static void main(String[] args) {
		
		swap(19,7);
	}
	
	public static void swap(int a,int b)
	{
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("Swapped value of a:" +a);
		 System.out.println("Swapped value of b:" +b);
		 
		
	}

}
