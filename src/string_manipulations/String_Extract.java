package string_manipulations;

public class String_Extract {

	public static void main(String[] args) {
		String str="lsdfreth => \\\\asdfghjklm\\qwerty_er_tyu\\cvbn1\\okmnjiuhb\\QW_000_000_VIVEK01##Wsxcder##IJ-0000##cvbnmkd346jdg577##0.qwer";
		String str1="VIVEK01";
		
		//System.out.println(test(str,str1));
		String s="";
		String s1="";
		String s2="";
		
		if(str.contains(str1))
		{
			s=s+str.replaceAll("[^VIVEK01]", "");
			s1=s1+s.replaceAll("1000000", "");
			s2=s2+s1.replaceAll("I00000", "");
			
		}
		System.out.println(s2);
		
		
		

	}
	
	

}

