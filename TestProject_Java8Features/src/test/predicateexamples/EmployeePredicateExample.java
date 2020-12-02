package test.predicateexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeePredicateExample {
	public static void main(String[] args) {

		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1291, "John"));
		e.add(new Employee(1091, "Misha"));
		e.add(new Employee(1187, "Mira"));
		e.add(new Employee(1243, "Carl"));
		e.add(new Employee(1323, "Steffy"));

		System.out.println(e);

		Predicate<Integer> p = i -> i > 1200;

		for (Employee employee : e) {
			if (p.test(employee.empNo)) {
				System.out.println(employee.toString());
			}
		}

	}

}

class Employee {
	int empNo;
	String empName;

	Employee(int empNo, String empName) {
		this.empNo = empNo;
		this.empName = empName;
	}

	public String toString() {
		return empNo + "-" + empName;
	}
}
