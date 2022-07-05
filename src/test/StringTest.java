package test;

public class StringTest {

	public static void main(String[] args) {
		
		
		String str="hello world";
		
		
		String str1="hello world";
		char ch[]= {'a','b'};
		
		StringBuilder str2=new StringBuilder();
		StringBuilder str3=new StringBuilder("Ass");
		
		str2.append("Jack");
		str2.reverse();
		
		System.out.println(str2.compareTo(str3));
		System.out.println(str2);
		System.out.println(str2.getClass().getName());
		
		
//		str=str.concat(str1);
//		
//		System.out.println(str);
//		System.out.println(str);
//		str="jack";
//		System.out.println(str);
		System.out.println(str1.compareTo(str));

	}

}
