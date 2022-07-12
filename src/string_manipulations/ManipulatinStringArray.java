package string_manipulations;

import java.util.ArrayList;

public class ManipulatinStringArray {

	public static void main(String[] args) {

    
		
		String[] days= {"Sunday","Monday","Tuesday","Wednesday","Thurdsay","Friday","Saturday"};
		//printing the array first
		for(String d:days)
		{
			System.out.print(d +" ");
		}
		System.out.println();
		
		manipulate(days);
	}
	
	
	public static void manipulate(String[] inputArr)
	{
		
		ArrayList<String> alist=new ArrayList<String>();
		
		String[] outputArr=new String[inputArr.length];
		
		for(int i=0;i<inputArr.length;i++)
		{
			String day=inputArr[i].substring(0, 3);
			//alist.add(day);
//			for(int j=0;j<outputArr.length;j++)
			outputArr[i]=day;
			
		}
		
		for(String day:outputArr)
		{
			System.out.print(day +" ");
		}
		
		
	}

}
