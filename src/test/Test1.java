package test;

public class Test1 {
	
	
	int id;
	String name;
	
	public Test1()
	{
//		this.id=9;
//		this.name="Sumit";
		
	}
	
	public static void test1() throws Exception 
	{
		
		int a=9;
		int b=0;
		int res=a/b;
		System.out.println(res);
		test1(b);
		
		
		
	}
	
	public static void  test1(int c)
	{
		
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Test1 t=new Test1();
       
       System.out.println(t.id);
       System.out.println(t.name);
       try {
		test1();
	} catch (Exception e) {
		System.out.println("Arithmetic Exception");
	}
       System.out.println("mbmbmbbmbm");
	}
}
