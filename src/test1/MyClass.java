package test1;
import test.QaClass;

public class MyClass extends QaClass {

	public static void main(String[] args) {
		
		MyClass class1=new MyClass();
		class1.myClassMethod();
		
	}
	public  void myClassMethod()
	{
		myMethod();
	}

}
