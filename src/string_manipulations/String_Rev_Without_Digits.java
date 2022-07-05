package string_manipulations;

import java.util.Arrays;

public class String_Rev_Without_Digits {

	public static void main(String[] args) {
		
      String str="My name is 12Rahul";
      
      
      String[] arr=str.split(" ");
      
      String rev="";
      
      for(String st : arr)
      {
    	  for(int i=st.length()-1;i>=0;i--)
    	  {
    		//  if(st.charAt(i).matches("[^a-z]"))
    		  {
    			  rev=rev+st.charAt(i);
    		  }
    		  
    	  }
    	  
    	  
      }
      System.out.println(rev);
      
     
      
      
      
	}
	
	

}

