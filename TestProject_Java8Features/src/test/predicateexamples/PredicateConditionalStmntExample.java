package test.predicateexamples;

import java.util.function.Predicate;

public class PredicateConditionalStmntExample {

	public static void main(String[] args) {
		int num[] = { 12, 43, 23, 54, 76, 65, 23, 76, 54 };

		Predicate<Integer> p1 = i -> i % 2 == 0;
		Predicate<Integer> p2 = i -> i > 30;
		System.out.println("Numbers which are even and greater than 30");
		for (int n : num) {
			if (p1.and(p2).test(n))
				System.out.println(n);
		}

		System.out.println("Numbers which are even or greater than 30");
		for (int n : num) {
			if (p1.or(p2).test(n))
				System.out.println(n);
		}

		System.out.println("Numbers which not even");
		for (int n : num) {
			if (p1.negate().test(n))
				System.out.println(n);
		}
	}

}
