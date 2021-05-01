package com.pkg.interf;

public interface DefaultInterface {
	
	default void m1(){
		System.out.println("Default Method m1 from DefaultInterface");
	}
	
	default void m2(){
		System.out.println("Default Method m2 from DefaultInterface");
	}

}
