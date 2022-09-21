package anonymous;

public class TestRunner {

	public static void main(String[] args) {


		IPrintable ob=new IPrintable()
		{

			@Override
			public void print() {
				System.out.println("Printing from Anonymous Inner Class");
			}
			
		};
		
		ob.print();
		
	}

}
