package com.obsqura.program.Inheritance;

public class cTotalSalary extends bHraPf
{
	double t;
//cal
	public void Total()
	{
	   t=super.basicpay-super.deduction+super.bonus-pf()+hra();
	System.out.println("Total salary is " + t);
	}
//salaryslip	
	public void SalarySlip()
	{
	System.out.println("Basicpay is " + basicpay);
	System.out.println("deduction amount is " + deduction);
	System.out.println("Bonus amount is " + bonus);
	System.out.println("pf is " + pf());
	System.out.println("hra is " + hra());
	}
//main method	
	public static void main (String args[])
	{
		cTotalSalary ts = new cTotalSalary();
		ts.Total();
		ts.SalarySlip();
		
	}

}
