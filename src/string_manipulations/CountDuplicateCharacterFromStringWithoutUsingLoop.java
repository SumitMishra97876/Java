package string_manipulations;

public class CountDuplicateCharacterFromStringWithoutUsingLoop {

	public static void main(String[] args) {

      String str="apartment";
      int countA=str.length()-str.replaceAll("a", "").length();
		int countP=str.length()-str.replaceAll("p", "").length();
		int countR=str.length()-str.replaceAll("r", "").length();
		
		int countT=str.length()-str.replaceAll("t", "").length();
		int countM=str.length()-str.replaceAll("m", "").length();
		int countE=str.length()-str.replaceAll("e", "").length();
		int countN=str.length()-str.replaceAll("n", "").length();
		
		
		System.out.println(" count of a: " +countA);
		System.out.println(" count of p: " +countP);
		System.out.println(" count of r: " +countR);
		System.out.println(" count of t: " +countT);
		System.out.println(" count of m: " +countM);
		System.out.println(" count of e: " +countE);
		System.out.println(" count of n: " +countN);

	}
	
	
	public static void duplicate(String str)
	{
		
		
		
		
		
	}

}
