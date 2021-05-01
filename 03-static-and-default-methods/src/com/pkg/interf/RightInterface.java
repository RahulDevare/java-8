package com.pkg.interf;

public interface RightInterface {
	
	default void m1(){
		System.out.println("m1() RightInterface");
	}

}
