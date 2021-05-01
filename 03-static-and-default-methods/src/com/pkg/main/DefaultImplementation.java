package com.pkg.main;

import com.pkg.interf.DefaultInterface;
import com.pkg.interf.StaticInterface;

public class DefaultImplementation implements DefaultInterface, StaticInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DefaultImplementation d = new DefaultImplementation();
		d.m1();
		d.m2();
		StaticInterface.sum(5, 10);
		
		//Static methods are not available to implementation classes. We need to call static methods
		//using Interface name
		//d.sum(5,10)		Not allowed. Still we can have method with same Signature

	}

}
