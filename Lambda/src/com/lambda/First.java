package com.lambda;

public class First {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FullLambda old  = new Second();
		FullLambda myt = () -> System.out.println("hello"); 
		myt.test();
		old.test();
	}

}

interface mytest{
	void test();
}
