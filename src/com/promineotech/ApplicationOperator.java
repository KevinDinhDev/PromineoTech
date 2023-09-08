package com.promineotech;

public class ApplicationOperator {

	public static void main(String[] args) {
		//operator performs actions on operands
		// + - * /
		int age = 34 * 2;
		System.out.println(age);
		boolean isAge30 = age == 30;
		System.out.println(isAge30);
		System.out.println(age == 68);
		
		age = age + 1;
		System.out.println(age);
	
	
		String firstName = "Tommy";
		String lastName = "Smith";
		String fullName = firstName + " " + lastName; //concatenation
		System.out.println(fullName);
		
		
	}

}
