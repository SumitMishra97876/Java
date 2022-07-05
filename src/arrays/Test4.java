package arrays;

public class Test4 {

	public static void main(String[] args) {
		
		int arr[]= {3,8,7,5,0};
		int item=3;
		
		test(arr,item);
		

	}
	
	public static void test(int arr[],int item)
	{
	     int len=arr.length;
	     boolean flag=false;
	     
	     for(int i=0;i<len;i++)
	     {
	    	 if(arr[i]==item)
	    	 {
	    		 System.out.println("item found at index " + i);
	    		 flag=true;
	    		 break;
	    	 }
	    	 
	     }
	     if(flag==false)
	     {
	    	 System.out.println("item doesnt exist");
	     }
	    
		
		
	}

}
