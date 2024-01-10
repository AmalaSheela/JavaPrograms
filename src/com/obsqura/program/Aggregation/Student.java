package com.obsqura.program.Aggregation;

public class Student {
	String studentname;
	int rollnumber;
	Address stu;

	public Student(String studentname, int rollnumber, Address stu) {
		super();
		this.studentname = studentname;
		this.rollnumber = rollnumber;
		this.stu = stu;
	}

	void display()
	{
		System.out.println(stu.city + ","+ stu.pincode+"");
		System.out.println(studentname +","+rollnumber+"");
	}
	
	public static void main(String args[])
	{
		Address a1=new Address("Kochi",68879);
		Student s1=new Student("Annie",5,a1);
		s1.display();	
		
	}

}
