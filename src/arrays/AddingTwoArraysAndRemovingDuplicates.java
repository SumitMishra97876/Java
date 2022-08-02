package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class AddingTwoArraysAndRemovingDuplicates {

	public static void main(String[] args) {

		String[] name1 = { "Ava", "Emma", "Olivia" ,"jack","Shane"};

		String[] name2 = { "Olivia", "Sophia", "Emma","Shane" };
		
		
		disp(name1,name2);

	}
	
	
	public static void disp(String[] name1,String[] name2)
	{
		
		List<String> names1=Arrays.stream(name1)
		.collect(Collectors.toList());
		
		List<String> names2=Arrays.stream(name2)
				.collect(Collectors.toList());
		
		names1.addAll(names2);
		
		Set<String> namesSet=new LinkedHashSet<String>(names1);
		
		ArrayList<String> a=new ArrayList<String>(namesSet);
		String[] distincNames=new String[a.size()];
		
		for(int i=0;i<namesSet.size();i++)
		{
			distincNames[i]=a.get(i);  
		}
		
		System.out.println(Arrays.toString(distincNames));
		
		
		
		
		
		
		
	}
}
