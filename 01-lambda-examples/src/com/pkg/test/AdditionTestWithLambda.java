package com.pkg.test;

import com.pkg.interf.Addition;

public class AdditionTestWithLambda {

	public static void main(String[] args) {

		Addition add = (a,b) -> a+b;
		
		System.out.println("Addition of 5 and 5 : "+add.add(5, 5));
		
	}

}
