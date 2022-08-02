package test;

public class TEST3 {
	
	public static int i=5;
	public int j=0;
	public static void main(String[] args) {


//		System.out.println(test("four"));
//		System.out.println(test("tee"));
//		System.out.println(test("to"));
//		
//	
//		String x="capgemini";
//		System.out.println(x.lastIndexOf('i', 5));
		
		
		int l=0;
		boolean t=true;
		boolean f=false,b;
		
		b=(t|((l++)==0));
		b=(f|((l+=2)>0));
		
//		System.out.println(l);
		
		TEST3 tt=new TEST3();
		
         tt.checck();
         System.out.println(TEST3.i=9);
         System.out.println(tt.i=10);
         System.out.println(i);
	}
	
	public static String test(String str)
	{
		//i++ ---> gives error as we cnt use non static vr in static method.
		//new TEST3().j++;// will work becuase we are using object to access non static i
		
		//checck();
		int check=4;
		
		if(check==str.length())
		{
			
			return str.charAt(check-=1)+",";
		}
		else
		{
			return str.charAt(0)+",";
		}
	}
    public void checck()
    {
    	++i;
    	System.out.println(i);
    }
}
