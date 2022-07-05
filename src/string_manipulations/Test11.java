package string_manipulations;

public class Test11 {

	public static void main(String[] args) {
		
		
		String str="This is Apple";
		test(str);

	}
	
	
	public static void test(String str)
	{
		String[] arr=str.split(" ");
		
		String rev="";
		
		for(String a:arr)
		{
			StringBuilder sb=new StringBuilder(a);
			sb.reverse();
		     rev=rev+sb.toString()+" ";
		}
		System.out.println(rev);
	}

}
