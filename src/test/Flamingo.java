package test;

public class Flamingo {
	
	public Flamingo(String s)
	{
		name=s;
	}

	public static void main(String[] args) {
		
		Flamingo one=new Flamingo("f1");
		Flamingo two=new Flamingo("f2");
		
		one=two;
		two=null;
		
		System.out.println(two.name);
		
		
		
	}
	private String name;
	

}
