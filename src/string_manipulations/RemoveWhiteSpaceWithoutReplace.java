package string_manipulations;

public class RemoveWhiteSpaceWithoutReplace {

	public static void main(String[] args) {
		
		test("Saket Saurav        is an Autom ation Engi ne      er");
	}
   public static void test(String str)
   {
	   StringBuffer s=new StringBuffer();
	   char[] arr=str.toCharArray();
	   
	   for(int i=0;i<arr.length;i++)
	   {
		   if((arr[i]!= ' ') && (arr[i]!= '\t'))
        {
          s.append(arr[i]);
        }
	   }
	   
	   System.out.println(s);
   }
}
