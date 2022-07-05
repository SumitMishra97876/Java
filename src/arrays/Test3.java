package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;

public class Test3 {

	public static void main(String[] args) {
		
		
		int a[]= {4,5,7,4,2,3,4,5,5,5};
		
		
		Map<Integer,Integer>hs=new HashMap<Integer,Integer>();
		
		for(int i=0;i<a.length;i++)
		{
			hs.put(a[i], hs.getOrDefault(a[i], 0) + 1);
		}
//		int count=0;
//		
//		
//		for(int i=0;i<a.length;i++)
//		{
//			if(hs.containsKey(a[i]))
//			{
//				count=hs.get(a[i]);
//				count++;
//				hs.put(a[i], count);
//			}
//			else
//			{
//				hs.put(a[i], 1);
//			}
//		}
		ArrayList<Integer> b = new ArrayList<>();
//	    hs.entrySet().stream()
//	    .sorted((k1, k2) -> -k1.getValue().compareTo(k2.getValue())).forEach(e -> {
//	    for(int i=0;i<e.getValue();i++)
//	    b.add(e.getKey());
//	    });
		
		hs.entrySet().stream()
		.sorted(Map.Entry.<Integer,Integer> comparingByValue().reversed())
		.forEach(record -> {
			int key=record.getKey();
			int value=record.getValue();
			
			for(int i=0;i<value;i++)
			{
				b.add(key);
			}
		});
		
		for(Integer b1:b)
		{
			System.out.print(b1);
		}

	}

}
