package test.lambdaexpression.basic;

import test.lambdaexpression.functionalInterace.Interface3;

public class SquareLambdaTest3 {

	public static void main(String[] args) {

		Interface3 i = n -> n * n;
		System.out.println(i.squareNum(40));
		System.out.println(i.squareNum(25));
	}

}
