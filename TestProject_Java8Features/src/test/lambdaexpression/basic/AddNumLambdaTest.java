package test.lambdaexpression.basic;

import test.lambdaexpression.functionalInterace.Interface2;

public class AddNumLambdaTest {

	public static void main(String[] args) {
		Interface2 i = (a, b) -> System.out.println("Sum is : " + (a + b));
		i.add(40, 50);
		i.add(1000, 3000);
	}

}
