package test;

public class Constructor_Test {
	
	 int i;
	
	public Constructor_Test()
	{
		
	}
	

	public static void main(String[] args) {
		
		Constructor_Test t=new Constructor_Test();
		
		System.out.println(t.init().i);
		
		//Constructor_Test t1=new Constructor_Test(10);
		//t.init();
		//System.out.println(t.i);
		
		//Constructor_Test t1=new Constructor_Test();
		//t1.init();
		//System.out.println(t1.i);
		//System.out.println(t1.i);
		//t.init();

	}
	
	public  Constructor_Test init()
	{
		i=234;
		return this;
		
	}

}
