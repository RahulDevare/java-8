package com.pkg.main;

import java.util.ArrayList;
import java.util.Collections;

import com.pkg.entity.Employee;

public class SortEmployeeListWithLambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Employee> l= new ArrayList<Employee>();
		l.add(new Employee(100,"Katrina"));
		l.add(new Employee(600,"Kareena"));
		l.add(new Employee(200,"Deepika"));
		l.add(new Employee(400,"Sunny"));
		l.add(new Employee(500,"Alia"));
		l.add(new Employee(300,"Mallika"));
		
		System.out.println("Before Sorting:");
		System.out.println(l);
		Collections.sort(l,(e1,e2)->(e1.getEno()<e2.getEno())?-1:(e1.getEno()>e2.getEno())?1:0);
		System.out.println("After Sorting:");
		System.out.println(l);

	}

}
