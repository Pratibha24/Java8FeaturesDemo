package test.lambdaexpression.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class EmployeeSortingLambdaTest {

	public static void main(String[] args) {

		List<Employee> e = new ArrayList<Employee>();
		e.add(new Employee(1291, "John"));
		e.add(new Employee(1091, "Misha"));
		e.add(new Employee(1187, "Mira"));
		e.add(new Employee(1243, "Carl"));
		e.add(new Employee(1323, "Steffy"));

		System.out.println(e);

		Collections.sort(e, (e1, e2) -> (e1.empNo > e2.empNo) ? 1 : (e1.empNo < e2.empNo) ? -1 : 0);

		System.out.println(e);
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
