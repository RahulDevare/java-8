package com.pkg.main;

import java.util.ArrayList;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

import com.pkg.entity.Student;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> studentList = new ArrayList<Student>();
		populate(studentList);
		
		Predicate<Student> marksGreaterThanSixty = s -> s.getMarks()>60;
		
		Function<Student,String> printClass = s -> {
			
			int marks = s.getMarks();
			
			if(marks >= 80){
				return "A[Distinction]";
			}else if(marks >= 60){
				return "B[First Class]";
			}else if(marks >= 50){
				return "C[Second Class]";
			}else if(marks >= 35){
				return "D[Third Class]";
			}else{
				return "E[Failed]";
			}
		};
		
		Consumer<Student> printStudent = s -> {
			System.out.println("Student Name: "+s.getName());
			System.out.println("Student Marks: "+s.getMarks());
			System.out.println("Student Grade: "+printClass.apply(s));
			System.out.println();
		};
		
		for(Student s: studentList){
			printStudent.accept(s);
		}

	}
	
	public static void populate(ArrayList<Student> l){
		
		l.add(new Student("Rahul",80));
		l.add(new Student("Vijay",50));
		l.add(new Student("Harsh",98));
		l.add(new Student("Vikas",75));
		l.add(new Student("Tushar",85));
		
	}

}
