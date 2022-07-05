package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,Float> hs=new HashMap<>();
		
		hs.put(1, 2.3f);
		hs.put(2, 4.1f);
		hs.put(6, 6.2f);
		//hs.put(8, 6.2f);
		
		System.out.println(test(hs));
		

	}
	
	public static float test(Map<Integer, Float> hs)
	{
		
		int count=0;
		float avg=0.0f;
		
		float sum=0.0f;
		Set<Map.Entry<Integer, Float>>s=hs.entrySet();
		
		for(Map.Entry<Integer, Float> s1:s)
		{
			if(s1.getKey()%2==0)
			{
				count++;
				float t=s1.getValue();
				sum=sum+t;
			}
			
		}
		avg=sum/count;
       return Math.round(avg*100.0f)/100.0f;
}
}
