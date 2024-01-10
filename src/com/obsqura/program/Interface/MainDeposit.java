package com.obsqura.program.Interface;

public class MainDeposit {

	public static void main(String[] args) {
   HDFC h1=new HDFC();
   Double amount1  =   h1.recurringDeposit(2000, 5);
   
   //amount1 store the value from prev class
   
   System.out.println("The Recurring  amount is " + amount1);

	}

}
