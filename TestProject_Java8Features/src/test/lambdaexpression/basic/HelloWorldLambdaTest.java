package test.lambdaexpression.basic;

import test.lambdaexpression.functionalInterace.*;

public class HelloWorldLambdaTest {
	public static void main(String[] args) {
		Interface1 i = () -> System.out.println("Hello World");
		i.printHelloWorld();
	}

}
