package collection;

import java.util.ArrayList;

public class ListDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> a = new ArrayList<>();

		a.add("sunil-56-88-23");
		a.add("bindul-88-70-10");
		a.add("john-70-49-65");
		//System.out.println(test(a));
		test(a);

	}

	public static void test(ArrayList<String> a) {
		int len = a.size();
		int res = 0, max = 0;

		String name = "";

		for (int i = 0; i < len; i++) {
			String s[] = a.get(i).split("-");
			String firstname = s[0];
			int s1 = Integer.parseInt(s[1]);
			int s2 = Integer.parseInt(s[2]);
			int s3 = Integer.parseInt(s[3]);

			res = s1 + s2 + s3;

			if (res > max)

			{

				max = res;

				name = firstname;

			}
			

		}
		//return name;
		System.out.println("Highest marks scored by : " +name + " is " +res);

	}

}
