package test;

public class Test2 {

	public static void main(String[] args) {
		
		int[] ints= {1,2,3,8,9,0,7,7,6,5,90,110,87,76,55,87,76,56,000,87,34,11,22,45,65};
		
		System.out.println(exists(ints,987));

	}
	
	static boolean exists(int[] ints,int k)
	{
		boolean flag=false;
		
		for(int i=0;i<ints.length;i++)
		{
			if(ints[i]==k)
			{
				flag=true;
				return flag;
			}
		}
		if(flag==false)
			
		
		return flag;
		return flag;
	}

}
