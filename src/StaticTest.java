
public class StaticTest {
	
	int c=0;
	static int d=2;
	
	public  void disp()
	{
		this.c=100;
		this.d=100;
		System.out.println(d);
	}
	
	public static void main(String[] args)
	{
		new StaticTest().disp();
		
	}

}
