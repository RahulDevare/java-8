package com.pkg.test;

public class ThreadWithLambdaExpression {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread t = new Thread(()->{
			 	for(int i=0; i<20; i++){
					System.out.println("Child Thread "+i);
				}
			});
		
		t.start();
		for(int i=0; i<20; i++){
			System.out.println("Main Thread "+i);
		}
		

	}

}
