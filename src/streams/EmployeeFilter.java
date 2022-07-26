package streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class EmployeeFilter {

	public static void main(String[] args) {

		Employee e1 = new Employee("Sumit", "Varanasi", "cricket", 10000, 100, 101, true);
		Employee e2 = new Employee("Rahul", "Aurangabad", "Daru", 20000, 102, 100, true);
		Employee e3 = new Employee("Sunny", "Durgapur", "criket", 3000, 101, 102, false);
		Employee e4 = new Employee("Sunil", "Durgapur", "Study", 56000, 103, 100, true);
		Employee e5 = new Employee("Saswata", "Durgapur", "Daru", 9000, 104, 101, false);
		Employee e6 = new Employee("jack", "Durgapur", "Daru", 7000, 105, 102, true);
		Employee e7 = new Employee("Drew", "London", "Daru", 80000, 106, 103, false);

		ArrayList<Employee> alist = new ArrayList<Employee>();

		alist.add(e1);
		alist.add(e2);
		alist.add(e3);
		alist.add(e4);
		alist.add(e5);
		alist.add(e6);
		alist.add(e7);
		Map<String, List<Employee>> newList = alist.stream().collect(Collectors.groupingBy(Employee::getCity));

		System.out.println(newList);

		Map<String, List<Employee>> mlist = alist.stream().collect(Collectors.groupingBy(Employee::getHobby));
		System.out.println(mlist);

		Map<Integer, List<Employee>> clist = alist.stream().collect(Collectors.groupingBy(Employee::getSalary));
		System.out.println(clist);

		// print employee names whose salary greater than 10000
		alist.stream().filter(e -> e.getSalary() > 10000)
				.forEach(e -> System.out.println(e.getName() + " " + e.getSalary()));

		int max = alist.stream().map(s -> s.getSalary()).max(Integer::compare).get();

		alist.stream().filter(s -> s.getSalary() == max).forEach(s -> System.out.println(s));

		int min = alist.stream().map(e -> e.getSalary()).min(Integer::compare).get();

		alist.stream().filter(e -> e.getSalary() == min).forEach(e -> System.out.println(e));

		Map<Integer, List<Employee>> cc = alist.stream().collect(Collectors.groupingBy(Employee::getDeptid));
		System.out.println(cc);

		Map<Integer, Long> dd = alist.stream()
				.collect(Collectors.groupingBy(Employee::getDeptid, Collectors.counting()));
		System.out.println(dd);

		Map<String, Long> ee = alist.stream().collect(Collectors.groupingBy(Employee::getHobby, Collectors.counting()));
		System.out.println(ee);

		List<Employee> ff = alist.stream().filter(e -> e.isStatus() == true).collect(Collectors.toList());

		System.out.println(ff);

		long trueStat = alist.stream().filter(e -> e.isStatus() == true).count();

		long falseStat = alist.stream().filter(e -> e.isStatus() == false).count();

		System.out.println("Total employee with true status " + trueStat);
		System.out.println("Total employee with false status " + falseStat);

		Map<Integer, Optional<Employee>> gg = alist.stream().collect(Collectors.groupingBy(Employee::getDeptid,
				Collectors.reducing(BinaryOperator.maxBy(Comparator.comparing(Employee::getSalary)))));

		System.out.println(gg);
		
		List<Employee> hh=alist.stream().filter(e->e.getSalary()>2000 && e.getSalary()<10000).collect(Collectors.toList());
		System.out.println(hh);
	}

}
