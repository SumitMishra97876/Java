package arrays;

public class Excluding_sum_between_6_And_9 {

	public static void main(String[] args) {
		int[] test= {1,2,2,4,8,8,7,5,4,8,0,8,7,6,3,5,7,9};
		
		
		int sum=0;
		int sum1=0;
		for(int i=0;i<test.length;i++)
		{
			sum=sum+test[i];
		}
		System.out.println(sum);
		
		for(int i=0;i<test.length;i++)
		{
			if(test[i]==6)
			{
				for(int j=i;j<test.length;j++)
				{
					if(test[j]==9)
					{
						i=j;
						break;
					}
				}
			}
			else
			{
				sum1=sum1+test[i];
			}
		}
		System.out.println(sum1);
	}

}
