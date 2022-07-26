package hashmap;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo1 implements Runnable {

	
	static ConcurrentHashMap<String,Integer> hmap=new  ConcurrentHashMap<String,Integer>();
	
	public void run() {

      try
      {
    	 // Thread.sleep(100);
    	  hmap.put("Sumit", 97876);
    	  
      }
      catch(Exception e)
      {
    	  e.printStackTrace();
      }

	}

	public static void main(String[] args) throws InterruptedException {
		
	
		hmap.put("Rahul", 4567);
		hmap.put("Rahul1", 4568);
		hmap.put("Maitiya", 4569);
		hmap.put("Murg", 45690);
		
		Runnable demo=new HashMapDemo1();
		Thread t=new Thread(demo);
		t.start();
		
//		for(Map.Entry<String, Integer>s:hmap.entrySet())
//		{
//			System.out.println(s.getKey()+" " +s.getValue());
//		}
//		  
		for(Object o:hmap.entrySet())
		{
			
			System.out.println(o);
			//Thread.sleep(1000);
		}
		
		
		
	}
	
	

//    static ConcurrentHashMap<Integer,String> l=new ConcurrentHashMap<Integer,String>();
//  
//    public void run()
//    {
//          
//      
//        try
//        {
//            Thread.sleep(1000);
//            // Child thread trying to add
//            // new element in the object
//            l.put(103,"D");
//        }
//        catch(InterruptedException e)
//        {
//            System.out.println("Child Thread going to add element");
//        }
//    }
//  
//    public static void main(String[] args) throws InterruptedException
//    {
//        l.put(100,"A");
//        l.put(101,"B");
//        l.put(102,"C");
//        
//        Runnable r=new HashMapDemo1();
//
//         Thread t=new Thread(r);
//         t.start();
//        
//          
//        for (Object o : l.entrySet()) 
//        {
//           // Object s=o;
//            System.out.println(o);
//            Thread.sleep(1000);
//        }
//        System.out.println(l);
//    }
}

