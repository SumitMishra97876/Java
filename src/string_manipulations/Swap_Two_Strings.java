package string_manipulations;

public class Swap_Two_Strings {
	
	public static void main(final String[] args) {
        String a = "Hello";
        String b = "World";
        System.out.println("Before Swapping :");
        System.out.println("A is:" + a);
        System.out.println("B is:" + b);
        a = String.valueOf(a) + b;
        b = a.substring(0, a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After Swapping :");
        System.out.println("A is:" + a);
        System.out.println("B is:" + b);
    }

}
