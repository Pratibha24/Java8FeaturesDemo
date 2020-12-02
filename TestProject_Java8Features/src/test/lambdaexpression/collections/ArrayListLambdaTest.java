package test.lambdaexpression.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ArrayListLambdaTest {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<Integer>();
		l.add(40);
		l.add(50);
		l.add(4);
		l.add(90);
		l.add(30);

		// Print List
		System.out.println(l);

		/*
		 * old way Collections.sort(l, new MyComparator());
		 */

		// Using lambda expression
		Comparator<Integer> c = (i1, i2) -> (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
		Collections.sort(l, c);

		// Print sorted list
		System.out.println(l);

		l.stream().forEach(System.out::println);

	}
}

class MyComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer i1, Integer i2) {
		return (i1 > i2) ? -1 : (i1 < i2) ? 1 : 0;
		/*
		 * if (i1 > i2) return -1; else if (i1 < i2) return 1; else return 0;
		 */
	}
}
