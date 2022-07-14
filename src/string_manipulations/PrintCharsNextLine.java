package string_manipulations;

public class PrintCharsNextLine {
 
	public static void main(String[] args) {
   String str="Today is good day";
   print(str);
	}
public static void print(String str)
{
	
	System.out.println(str.replaceAll(" ", "\n"));
	 
}
}
