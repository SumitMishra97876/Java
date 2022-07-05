package test;

import java.util.HashSet;
import java.util.Set;

public class Enum_In_Switch {
	
	
	
	
	
	enum myOpts{
		first,second,third,fourth;
	}

	public static void main(String[] args) {
		
		
		myOpts opts=myOpts.second;
		
		switch(opts)
		{
		case first:
			System.out.println("First");
			break;
		case second:
			System.out.println("Second");
			break;
		case third:
			System.out.println("Third");
			break;
		case fourth:
			System.out.println("Fourth");
			
	
			
		}

	}

}
