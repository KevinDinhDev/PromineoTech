package com.promineotech;

import java.util.Scanner;

public class week02boolean {

	public static void main(String[] args) {
		boolean loggedIn = false;
		Scanner sc= new Scanner(System.in);   
		
		while (!loggedIn) {
			System.out.print("Enter username: ");   
			String username = sc.nextLine();   
			System.out.print("Enter password: ");  
			String password = sc.nextLine();   
			if (username.equals("samy123") && password.equals("12345")) {
			System.out.println("Welcome back " + username);
		loggedIn = true;
		    } else { 
		System.out.println("Inaccurate credentials!"); 
		} // end of else 
		} // end of while
	}

}
