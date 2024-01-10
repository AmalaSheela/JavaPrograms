package com.obsqura.program.Encapsulation;

public class Contractor extends Employee {
	
private int paymentperhour;
private	int workinghours;

	
	public int getPaymentperhour() {
	return paymentperhour;
}


public void setPaymentperhour(int paymentperhour) {
	this.paymentperhour = paymentperhour;
}


public int getWorkinghours() {
	return workinghours;
}


public void setWorkinghours(int workinghours) {
	this.workinghours = workinghours;
}


	public void calculateSalary() {

		double totalSalary=paymentperhour*workinghours;
		System.out.println("Salary for Contractor is : " + totalSalary);
	}
}