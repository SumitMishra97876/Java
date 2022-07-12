package string_manipulations;

public class CountDuplicateCharacterFromStringWithoutUsingLoop {

	public static void main(String[] args) {

      String str="appartment";
      duplicate(str);
//      int countA=str.length()-str.replaceAll("a", "").length();
//		int countP=str.length()-str.replaceAll("p", "").length();
//		int countR=str.length()-str.replaceAll("r", "").length();
//		
//		int countT=str.length()-str.replaceAll("t", "").length();
//		int countM=str.length()-str.replaceAll("m", "").length();
//		int countE=str.length()-str.replaceAll("e", "").length();
//		int countN=str.length()-str.replaceAll("n", "").length();
//		
//		
//		System.out.print(" a" +countA);
//		System.out.print(" p" +countP);
//		System.out.print(" r" +countR);
//		System.out.print(" t" +countT);
//		System.out.print(" m" +countM);
//		System.out.print(" e" +countE);
//		System.out.print(" n" +countN);

	}
	
	
	
	
	
	
	public static void duplicate(String str)
	{
		
		for (int i=0;i<str.length();i++) 
		{
			String chars=String.valueOf(str.charAt(i));
			int count=str.length()-str.replaceAll(chars, "").length();
			
			System.out.print( str.charAt(i)+""+count);
			
		}
	
	
	
		
		
		
		
	}
}


