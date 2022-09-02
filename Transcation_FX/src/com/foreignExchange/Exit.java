package com.foreignExchange;

import java.util.Scanner;

public class Exit {
static void exit() {
	System.out.println("Do you really want to exit (y/n)");
	Scanner input = new Scanner(System.in);
	String conformation = input.next();
	if(conformation.equalsIgnoreCase("y")){
	System.out.println("Bye - have a good day!");
	System.out.println("**********************");
	//ForeignExchange.SelectOption(); // (if it is necessary to return to options, then uncomment it)
	}
	else if(conformation.equalsIgnoreCase("n")){
	System.out.println("**********************");
	//ForeignExchange.SelectOption();  // (if it is necessary to return to options, then uncomment it)
	}
	else {
		System.out.println("Please enter valid input!");
		exit();
		System.out.println("**********************");
	}
	
}
}
