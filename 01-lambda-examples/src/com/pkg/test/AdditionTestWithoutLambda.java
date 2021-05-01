package com.pkg.test;

import com.pkg.implementation.AdditionImpl;
import com.pkg.interf.Addition;

public class AdditionTestWithoutLambda {

	public static void main(String[] args) {

		Addition add = new AdditionImpl();
		
		System.out.println("Addition of 5 and 5 : "+add.add(5, 5));
	}

}
