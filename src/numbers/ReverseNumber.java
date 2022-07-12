package numbers;

public class ReverseNumber {

	public static void main(String[] args) {
		int x=2147483647;
		System.out.println(reverse(x));

	}
	
	public static int reverse(int x) {
        int Max=Integer.MAX_VALUE; // storing the max val
        int Min=Integer.MIN_VALUE; // storing the min val
        System.out.println("Max Value:"+Max+"Min val:"+Min);
      String val1=String.valueOf(x); // converting int to string
// Using regex to check if number is negative
      if(!val1.contains("-")) {
        StringBuilder br = new StringBuilder(val1);
        StringBuilder br2 = br.reverse();
        long number=Long.parseLong(br2.toString());
        if(number<=Max && number>=Min){return (int) number;}
        else return 0;

      }else {
        String sec=val1.replaceAll("-","");
        StringBuilder br = new StringBuilder(sec);
        StringBuilder br2 = br.reverse();
        long number=-Long.parseLong(br2.toString());
        if(number<=Max && number>=Min){return (int) number;}
        else return 0;

      }
     
  }

}
