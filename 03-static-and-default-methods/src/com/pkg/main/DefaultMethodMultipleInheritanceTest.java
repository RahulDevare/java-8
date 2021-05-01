package com.pkg.main;

import com.pkg.interf.LeftInterface;
import com.pkg.interf.RightInterface;

public class DefaultMethodMultipleInheritanceTest implements LeftInterface, RightInterface {
//Compile time error that duplicate default methods, need to implement
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultMethodMultipleInheritanceTest test = new DefaultMethodMultipleInheritanceTest();
		
		test.m1();

	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		// Call method from LeftInterface
		LeftInterface.super.m1();
		
		//OR
		
		// Call method from RightInterface
		RightInterface.super.m1();
		
		//OR
		
		//Implement own m1
		System.out.println("Default Method m1 Overrrided");
		
	}

}
