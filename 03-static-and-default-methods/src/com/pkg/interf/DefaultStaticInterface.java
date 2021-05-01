package com.pkg.interf;

public interface DefaultStaticInterface {
	
	default void m1(){
		System.out.println("Default Method m1 from DefaultStaticInterface");
	}
	
	default void m2(){
		System.out.println("Default Method m2 from DefaultStaticInterface");
	}
	
	public static void sum(int a, int b){
		System.out.println("Sum : "+a+b);
	}

}
