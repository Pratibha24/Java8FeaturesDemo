package test.predicateexamples;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class ConsumerExample {

	public static void main(String[] args) {
		
		//Functions takes an input to perform some operation and then returns the result
		Function<Student, String> f = (s) -> {
			if (s.marks > 60)
				return "A";
			else if (s.marks > 50)
				return "B";
			else if (s.marks > 40)
				return "C";
			else
				return "Fail";
		};
		
		// Predicate is used for conditional checks and returns boolean
		Predicate<Integer> p = (i) -> i > 60;
		
		// Consumer takes an input and does not return anything
		Consumer<Student> c = (s1) -> {
			System.out.println("Student name : " + s1.name);
			System.out.println("Student makrs : " + s1.marks);
			System.out.println("Student grade : " + f.apply(s1) + "\n");
		};

		Student[] st = { new Student("Steffy", 78), new Student("George", 44), new Student("Rohan", 32),
				new Student("Maria", 54), new Student("Peter", 87) };
		
		for (Student student : st) {
			
			if(p.test(student.marks))
			c.accept(student);
		}
	}

}

class Student {
	String name;
	int marks;

	Student(String name, int marks) {
		this.name = name;
		this.marks = marks;
	}

	public String toString() {
		return name + " scored " + marks;
	}
}
