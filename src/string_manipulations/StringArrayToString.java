package string_manipulations;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StringArrayToString {

	public static void main(String[] args) {

        String[] str= {"lets","try"};
		
		System.out.println(strinUsingJoin(str,","));
		System.out.println(stringUsingStreams(str,":"));
		
		System.out.println(stringUsingStringBuilder(str,"||"));

	}
	
	public static String strinUsingJoin(String[] str,String delimeter)
	{
		
		return String.join(delimeter, str);
		
	}
	
	public static String stringUsingStreams(String[] str,String delimeter)
	{
		String string=Arrays.asList(str).stream().collect(Collectors.joining(delimeter));
		return string;
	}
	public static String stringUsingStringBuilder(String[] str,String delimeter)
	{
		StringBuilder sb=new StringBuilder();
		
		int end=0;
		
		for(String s:str)
		{
			if(s!=null)
			{
		       sb.append(s);
		       end=sb.length();
		       sb.append(delimeter);
		
		}
	}
		return sb.substring(0, end);

}
}
