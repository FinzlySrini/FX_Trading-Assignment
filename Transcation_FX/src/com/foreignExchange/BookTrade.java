package com.foreignExchange;
import java.util.Scanner;


public class BookTrade {
	static int count =0; 
public static void bookTrade() {
	 final double inr=66.00;
    String name = null;
	String CurrencyPair = null;
	double amount =0;
    String rate = null;
    double convertedValue = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Enter your name");
	 name =input.nextLine().trim();
	System.out.println("Enter Currency Pair");
	 CurrencyPair =input.nextLine();
	 if(CurrencyPair.equalsIgnoreCase("USDINR")) {
		 System.out.println("Enter the amount");
		 amount =input.nextDouble();
		System.out.println("Do you want to get Rate(yes/no)");
		 rate = input.next();		
			convertedValue = amount * inr;
			if (rate.equalsIgnoreCase("yes")) {
				System.out.println("You are transferring INR is " + convertedValue + " " + name);
			} else if (rate.equalsIgnoreCase("no")) {
				System.out.println("Thanks for your responding");
			} else {
				System.out.println("Invalid Dat (or) something went wrong!");
				bookTrade();
			}
			System.out.println("Book/Cancel this trade?");
			String decision = input.next();
			if (decision.equalsIgnoreCase("Book")) {
				count++;
				System.out.println("Trade for" + " " + CurrencyPair.toUpperCase() + " " + "has been booked with rate"+ inr + "," + "The amount of Rs" + convertedValue + " "+ "will  be transferred in 2 working days to" + " " + name + "...");
				TradeListsAdder.tradeList(count, name, CurrencyPair, convertedValue, inr);
			
				System.out.println("**********************");
				ForeignExchange.SelectOption();
			} else if (decision.equalsIgnoreCase("cancel")) {
				System.out.println("Trade is Cancelled!");
				System.out.println("**********************");
				ForeignExchange.SelectOption();
			} else {
				System.out.println("Invalid Data (or) something went wrong!");
				bookTrade();
			}
		} else {
			System.out.println("Invalid Data (or) something went wrong!");
			bookTrade();
		}

	}
}

