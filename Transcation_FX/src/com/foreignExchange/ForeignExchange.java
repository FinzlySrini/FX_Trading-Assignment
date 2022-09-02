package com.foreignExchange;

import java.util.Scanner;

public class ForeignExchange {
	public static void main(String[] args) {
		ForeignExchange.SelectOption();
	}

	public static void SelectOption() {
	System.out.println("Please select the below options!");
	System.out.println("to Book Trade enter 1\nto Print Trades enter 2\nto Exit enter 3");
	Scanner input = new Scanner(System.in);
	int option = input.nextInt();
	 input.nextLine();
switch(option) {
case (1):
BookTrade.bookTrade();	
break;
case(2):
	TradeListsAdder.TradeList();
break;
case(3):
	Exit.exit();
break;
default:
	System.out.println("Something went wrong (or) Entered data is invalid!");
	SelectOption();
    }
 }
}
