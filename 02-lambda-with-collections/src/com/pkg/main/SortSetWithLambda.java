package com.pkg.main;

import java.util.TreeSet;

public class SortSetWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TreeSet<Integer> rollNoSet = new TreeSet<Integer>((I1,I2) -> (I1>I2)?-1:(I1<I2)?1:0);
		
		rollNoSet.add(5);
		rollNoSet.add(45);
		rollNoSet.add(15);
		rollNoSet.add(25);
		rollNoSet.add(15);
		rollNoSet.add(35);
		
		System.out.println("Sorted Set: "+rollNoSet);

	}

}
