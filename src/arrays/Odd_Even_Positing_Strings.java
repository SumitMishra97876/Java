package arrays;

public class Odd_Even_Positing_Strings {

	public static void main(String[] args) {
		
		String[] arr= {"looking","you","handsome","are","so"};
		
		test(arr);
		

	}
     public static void test(String[] arr)
     {
    	 int len=arr.length;
    	 
    	 String oddString="";
    	 String evenString="";
    	 
    	 for(int i=0;i<len;i++)
    	 {
    		 if(i%2==0)
    		 {
    			 oddString=oddString+" "+arr[i];
    		 }
    		 else if(i%2!=0)
    		 {
    			 evenString=evenString+" "+arr[i];
    		 }
    	 }
    	 System.out.println(evenString +""+ " " + oddString+"");
     }
}
