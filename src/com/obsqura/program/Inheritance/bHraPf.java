package com.obsqura.program.Inheritance;

public class bHraPf extends aBasicPay
{
	int hra;
	int pf;
//hra
	public double hra()
	{
		hra=super.basicpay*50/100;
		return hra;
		}
//pf
	public double pf()
	{
		pf=super.basicpay*20/100;
		return pf;
	}
//main method
	public static void main(String[] args) {
		
		bHraPf hr=new bHraPf();
		hr.hra();
		hr.pf();

	}

}
