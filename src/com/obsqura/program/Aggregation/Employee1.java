package com.obsqura.program.Aggregation;

public class Employee1 {
	String empName;
	int empId;
	Car1 carr;
	Bike1 bikee;
	
	
	public Employee1(String empName, int empId, Car1 carr, Bike1 bikee) {
		super();
		this.empName = empName;
		this.empId = empId;
		this.carr = carr;
		this.bikee = bikee;
	}


	void display()
	{
		System.out.println(carr.color + ","+ carr.carName + ","+carr.regNo + "");
		System.out.println(bikee.bikeName+","+bikee.regNo + "");
		System.out.println(empName +"," + empId + "");
	}
	

	public static void main(String[] args) {
		Car1 c1 = new Car1("Black","polo",435345);
		
		Bike1 b1 = new Bike1("pulser",545654);
		Employee1 e1 = new Employee1("Manu",8333,c1,b1);
		e1.display();
	}

}
