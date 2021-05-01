package com.pkg.test;

import com.pkg.interf.NoArgumentInterface;
import com.pkg.interf.OneArgumentSquareInterface;
import com.pkg.interf.OneArgumentWelcomeInterface;

public class ArgumentsTestWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//For No argument interface, we need to provide emply brackets
		NoArgumentInterface greetings = () -> System.out.println("Welcome to world of Lambda Expreassions");
		
		//For one argument interface, brackets are optional, parameter types also optional if compliler is able to
		//guess type through type inference and if method returns value then we don't need to specify return keyword
		OneArgumentSquareInterface square = (int x) -> {return x*x;};   
		OneArgumentSquareInterface square2 = x -> x*x;
		OneArgumentWelcomeInterface sayHello = name -> System.out.println("Hey "+name+"!, Welcome!");
		
		greetings.showMessage();
		System.out.println("Square of 5 : "+square.square(5));
		System.out.println("Square of 9 : "+square2.square(9));
		sayHello.sayHello("Rahul");
		
		
		

	}

}
