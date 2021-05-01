package com.pkg.interf;

@FunctionalInterface
public interface AdditionB extends Addition {
	
	//AdditionB is also functional interface if it has no method signature at all,
	//it will have inherited method of Addition
	//Else we can give same signature as of Addition to keep AdditionB as functional interface
	public int add(int a, int b);
	
	
	//If we add method signature other than method of Addition then compiler will throw error
	//as it will not be functional interface
	//public int sum(int a, int b);    Error-AdditionB is not functional interface
	
	//Still we can have any number of default and static methods
	default int sum(int a, int b){
		return a+b;
	}
	
	static int addition(int a, int b){
		return a+b;
	}

}
