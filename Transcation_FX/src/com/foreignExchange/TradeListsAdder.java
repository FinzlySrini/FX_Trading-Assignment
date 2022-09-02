package com.foreignExchange;
import java.util.ArrayList;

public class TradeListsAdder {
	static ArrayList<GlobalVariable> arrayList = new ArrayList<>();
public  static void tradeList(int TradeNo,String name, String CurrencyPair, double  convertedValue, double rate) {
	arrayList.add(new GlobalVariable(TradeNo, name, CurrencyPair,  convertedValue, rate));
}
public static void TradeList() {
	
	if(arrayList.isEmpty()) {
		System.out.println("No Trades started yet!");
		ForeignExchange.SelectOption();
	}
	else {
		System.out.println("TradeNo\t" + "CurrencyName\t"+"CustomerName\t"+"Amount\t"+"Rate");
	for(GlobalVariable gv :arrayList) {
		System.out.println(gv);
	}
	ForeignExchange.SelectOption();
	}
}
}
