package com.practice.java8;

public class CheckEven {

	interface Checker {
		boolean check(int num);
	}

	public static void main(String[] args) {
		Checker isEven = (number) -> number % 2 == 0;
		
		System.out.println("is 5 is even : "+isEven.check(5));
		System.out.println("is 10 is even : "+isEven.check(10));
		System.out.println("is 12 is even : "+isEven.check(12));
		System.out.println("is 19 is even : "+isEven.check(19));

	}
	

}
