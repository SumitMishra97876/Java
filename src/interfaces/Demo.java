package interfaces;

public interface Demo {
	
	 public void greet();
	 
	 public void show();
	 
	public default void test()
	 {
		 System.out.println("Test From Demo Interface");
	 }
	 
	public static void print()
	 {
		 System.out.println("Printing from Demo Interface");
	 }
	
	

}
