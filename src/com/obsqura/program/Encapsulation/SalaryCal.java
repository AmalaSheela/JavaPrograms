package com.obsqura.program.Encapsulation;

public class SalaryCal {
	
//main
	public static void main(String[] args) {
		//contractor
		Contractor c= new Contractor();
		c.setPaymentperhour(1000);
		c.setWorkinghours(9);
		c.calculateSalary();
		
		//FullTimeemployee
		
		FullTimeEmployee fe=new FullTimeEmployee();
		fe.setPaymentperhour(1500);
		fe.calculateSalary();
	}

}
