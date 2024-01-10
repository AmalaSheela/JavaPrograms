package com.obsqura.program.Aggregation;

public class Employee {
	String empname;
	int empid;
	Car emply;
	

	public Employee(String empname, int empid, Car emply) {
		super();
		this.empname = empname;
		this.empid = empid;
		this.emply = emply;
	}

void display()
{
	System.out.println(emply.color + "," + emply.carname + "," + emply.regno);
	System.out.println(empname + "," + empid + "");
}

	public static void main(String[] args) {
		Car c1 = new Car("Black","Polo",993324);
		Employee e1 = new Employee("Manu",23411,c1);
		e1.display();
		

	}

}
