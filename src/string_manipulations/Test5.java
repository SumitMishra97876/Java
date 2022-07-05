package string_manipulations;

public class Test5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Hello";
		String str2="World";
		String str3=str+str2;
		String str5="HelloWorld";
		String str6=str5;
		
		String str4="HelloWorld";
		System.out.println(str3);
		System.out.println(str4);
		System.out.println(str3.equals(str4));
		System.out.println(str5==str4);
		System.out.println(str6==str4);

	}

}
