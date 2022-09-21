package string_manipulations;

public class StringSwap {

	public static void main(String[] args) {
      String a="Sumit";
      String b="tinku";
      swap(a,b);


	}
	
	
	public static void swap(String a,String b)
	{
		System.out.println("Before Swapping");
		System.out.println("String a: " +a);
		System.out.println("String b: " +b);
		System.out.println("After Swapping");
		
		a=a+b;
		b=a.substring(0,a.length()-b.length());
		a=a.substring(b.length());
		
		System.out.println("String a: " +a);
		System.out.println("String b: " +b);
		
	}

}
