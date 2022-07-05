package arrays;

import java.util.HashSet;

public class SumOf3NumsEqualToANumInArray {

	public static void main(String[] args) {

		int arr[] = { 2, 3, 5, 4, 1 };

		int number = 12;
     	boolean flag=false;
//
//		for (int i = 0; i < arr.length - 2; i++) {
//			for (int j = i + 1; j < arr.length - 1; j++) {
//
//				for (int k = j + 1; k < arr.length; k++) {
//
//					if (arr[i] + arr[j] + arr[k] == number) {
//						flag=true;
//						break;
//
//						
//						
//
//					}
//					
//
//				}
//				
//			}
//			
//		}
//		if(flag==true)
//		{
//		System.out.println("true");
//		}
//		else
//		{
//			System.out.println("false");
//		}
//		
		
//		static boolean find3Numbers(int A[],
//                int arr_size, int sum)
//{
// Fix the first element as A[i]
for (int i = 0; i < arr.length-2; i++) {

// Find pair in subarray A[i+1..n-1]
// with sum equal to sum - A[i]
HashSet<Integer> s = new HashSet<Integer>();
int curr_sum = number - arr[i];
for (int j = i + 1; j < arr.length; j++) 
{
if (s.contains(curr_sum - arr[j])) 
{
    System.out.printf("Triplet is %d, %d, %d" ,arr[i],arr[j],curr_sum - arr[j]);
    flag=true;
    
}
s.add(arr[j]);
}
}
if(flag==false)
{
	System.out.println("Triplets not found");
}

// If we reach here, then no triplet was found

}

	}
	


