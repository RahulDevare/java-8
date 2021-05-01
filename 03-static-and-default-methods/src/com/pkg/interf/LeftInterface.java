package com.pkg.interf;

public interface LeftInterface {
	
	default void m1(){
		System.out.println("m1() LeftInterface");
	}

}
