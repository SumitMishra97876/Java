package arrays;

public class ArraysDescendSort {

	public static void main(String[] args) {
		
		
		int arr[]= {3,8,9,8,0,15,89};
		disp(arr);
	}
	
	
	public static void disp(int arr[])
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {   
            System.out.print(arr[i] + " ");  
        }  
	}

}
