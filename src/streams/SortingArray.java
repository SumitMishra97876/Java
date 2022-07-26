package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SortingArray {

	public static void main(String[] args) {


		
		 Integer[] arr= {23,98,76,54};
		 
		 disp(arr);
		

	}
	
	public static void disp(Integer[] arr)
	{
		ArrayList<Integer> alist=new ArrayList<Integer>(Arrays.asList(arr));

         // List<Integer>list=alist.stream().sorted((i1,i2)->i1<i2?1:i1>i2?-1:0).collect(Collectors.toList());
          List<Integer>list=alist.stream().sorted((i1,i2)->-i1.compareTo(i2)).collect(Collectors.toList());// -i1 will result in descending order
		
          System.out.println(list);
	}

}
