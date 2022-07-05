package numbers;

public class Prime_Nums_In_Range {

	public static void main(String[] args) {
		
		
		int n=100;
		int nums=0;
		String pnums="";
		
		for(int i=0;i<=n;i++)
		{
			int counter=0;
			
			for(nums=i;nums>=1;nums--)
			{
				if(i%nums==0)
				{
					counter=counter+1;
				}
			}
			if(counter==2)
			{
				pnums=pnums+i+" ";
			}
		}
		
         System.out.println(pnums);
	}

}
