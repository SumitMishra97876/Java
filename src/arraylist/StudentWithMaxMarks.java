package arraylist;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class StudentWithMaxMarks {

	public static void main(String[] args) {

		ArrayList<String> alist = new ArrayList<>();

		alist.add("Sunil-56-88-23");
		alist.add("Bindul-88-70-10");
		alist.add("John-70-49-65");
		alist.add("Sumit-88-89-95");
		alist.add("Rahul-79-89-97");
		alist.add("Murg-99-76-85");
		alist.add("Sunny-90-89-87");
		

		disp(alist);

	}

	public static void disp(ArrayList<String> alist) {

		HashMap<String, Integer> hmap = new HashMap<>();

		for (int i = 0; i < alist.size(); i++) {
			String[] str = alist.get(i).split("-");

			String name = str[0];
			int marks = Integer.parseInt(str[1]) + Integer.parseInt(str[2]) + Integer.parseInt(str[3]);

			hmap.put(name, marks);

		}

		System.out.println(hmap);
		
		//with Collections and Streams;
		
	int max=hmap.entrySet().stream().map(e->e.getValue()).max(Integer::compare).get();
	int min=hmap.entrySet().stream().map(e->e.getValue()).min(Integer::compare).get();
	
	List<Entry<String, Integer>>maxMarksWithName=hmap.entrySet().stream().filter(e->e.getValue()==max).collect(Collectors.toList());
	System.out.println("Student with Max Marks is : " +maxMarksWithName);
	
	List<Entry<String, Integer>>minMarksWithName=hmap.entrySet().stream().filter(e->e.getValue()==min).collect(Collectors.toList());
	System.out.println("Student with Min Marks is : " +minMarksWithName);
	
	
	//Conventional way...without Streams

//		int maxMarks = Collections.max(hmap.values());
//		int minMarks=Collections.min(hmap.values());
//
//		for (Map.Entry<String, Integer> s : hmap.entrySet()) {
//
//			if (s.getValue() == maxMarks) {
//				System.out.println("Student with Max Marks is : " +s.getKey() + " " + s.getValue());
//			}
//			if (s.getValue() == minMarks) {
//				System.out.println("Student with Min Marks is : " +s.getKey() + " " + s.getValue());
//			}
//		}

	}

}
