package string_manipulations;

public class EliminateFirstAndLastStringFromArray {

	public static void main(String[] args) {
		String[] arr= {"abc","cdf","huy","bhnj","jsjj","njhddh","hhdhgd","hdhdgdg","kdjdjdh","bcvcfd","poiiuy"};
		print(arr);
	}
	
	public static void print(String[] str)
	{
		System.out.println(str.length-2);
		String[] arr1=new String[str.length-2];
		for(int i=0;i<str.length-2;i++)
		{
			arr1[i]=str[i+1];
		}
		
		for(int i=0;i<arr1.length;i++)
		{
			System.out.print(arr1[i] + " ");
		}
	}

}
