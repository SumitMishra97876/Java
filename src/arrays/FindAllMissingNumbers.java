package arrays;

public class FindAllMissingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int arr[]= {1,2,3,6,8,11,19,20};
       int n=arr.length;
       printMissingElements(arr,n);
	}
	
	static void printMissingElements(int arr[],
            int N)
{

// Initialize an array with zero
// of size equals to the maximum
// element in the array
int[] b = new int[arr[N - 1] + 1];

// Make b[i]=1 if i is present
// in the array
for(int i = 0; i < N; i++)
{

// If the element is present
// make b[arr[i]]=1
b[arr[i]] = 1;
}

// Print the indices where b[i]=0
for(int i = arr[0]; i <= arr[N - 1]; i++)
{
if (b[i] == 0)
{
System.out.print(i + " ");
}
}
}


}
