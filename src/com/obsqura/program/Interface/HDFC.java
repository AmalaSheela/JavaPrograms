package com.obsqura.program.Interface;

public class HDFC implements RBI{

	@Override
	public double recurringDeposit(double amount, int duration ) {
	
		Double tamount = amount*duration*interestRate;
		
	
		return tamount;
	}

}
