import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       
		int i=0;
		int count=0;
		
		for( i=0;i<=10;i++)
		{
			++count;
			
		}
		System.out.println(count);
		System.out.println(i);
		
		List<String> alist=new ArrayList<String>();
		alist.add("dhuhdhd");
		alist.add("hddgd");
		
		//String[] ar=(String[]) alist.toArray();
		String[] ar=alist.toArray(new String[0]);
		System.out.println(Arrays.toString(ar));
	}

}
