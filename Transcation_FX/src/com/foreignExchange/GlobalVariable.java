package com.foreignExchange;

public class GlobalVariable {
	
private int TradeNo;
private String name;
private String CurrencyPair;
private double amount;
private double rate;
public GlobalVariable(int tradeNo, String name, String currencyPair, double amount, double rate) {
	super();
	TradeNo = tradeNo;
	this.name = name;
	CurrencyPair = currencyPair;
	this.amount = amount;
	this.rate = rate;
}
@Override
public String toString() {
	return   TradeNo +"       " +CurrencyPair.toUpperCase() +"          "+  name +"        "+ "INR"+amount +"    "+ rate ;
}
}
