package arraylist;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		String[] testStrings = { "Bernard", "Charlie", "Angie", "Andy", "Bertha", "Annie", "Carl", "Dennis", "Caroline",
				"Bob", "Betty", "Bart", "Albert","Connie"};
		
		System.out.println("Lets Begin");
		
		System.out.println("Original Collection :" );
		
		for(int i=0;i<testStrings.length;i++)
		{
			System.out.print(testStrings[i] + " ");
		}
		
		test(testStrings);

	}
	
	
	public static void test(String[] str)
	{
		ArrayList<String> ar1=new ArrayList<String>();
		ArrayList<String> ar2=new ArrayList<String>();
		ArrayList<String> ar3=new ArrayList<String>();
		
		
		int len=str.length;
		
		for(int i=0;i<len;i++)
		{
			if(str[i].startsWith("A") && str[i].length()>4)
			{
				ar1.add(str[i]);
			}
			if(str[i].startsWith("B") && str[i].length()>=3)
			{
				ar2.add(str[i]);
			}
			if(str[i].startsWith("C") && str[i].length()>=5)
			{
				ar3.add(str[i]);
			}
		}
		
		System.out.println("Sorted and filtered names with A larger than 4 characters");
		
		System.out.println(ar1);
		
          System.out.println("Sorted and filtered names with B equal or  larger than 3 characters");
		
		System.out.println(ar2);
		
        System.out.println("Sorted and filtered names with C equal or  larger than 5 characters");
		
		System.out.println(ar3);
		
		
		
		
	}

}
