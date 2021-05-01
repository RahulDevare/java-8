package com.pkg.main;

import java.util.TreeMap;
import java.util.TreeSet;

public class SortMapWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeMap<Integer,String> rollNoMap = new TreeMap<Integer,String>((I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0);
		
		rollNoMap.put(15,"Rahul");
		rollNoMap.put(25,"Kiran");
		rollNoMap.put(45,"Vaibhav");
		rollNoMap.put(35,"Tushar");
		rollNoMap.put(55,"Suhas");
		rollNoMap.put(5,"Jetha");
		
		System.out.println("Sorted Map: "+rollNoMap);

	}

}
