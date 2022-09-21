package lambda_expressions;

public class ThreadTest implements Runnable {

	@Override
	public void run() {

                 for(int i=0;i<10;i++)
                 {
                	 System.out.println("In Child");
                 }
		
	}
	
	public static void main(String[] args)
	{
		Runnable r=new ThreadTest();
		Thread t=new Thread(r);
		
		t.start();
		
		for(int i=0;i<10;i++)
		{
			System.out.println("In Main");
		}
	}

	

	}


