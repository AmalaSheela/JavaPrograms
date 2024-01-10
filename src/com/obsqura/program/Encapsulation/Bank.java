package com.obsqura.program.Encapsulation;

import java.util.Scanner;

public class Bank {

	public boolean isvalidatePin(int pin) {
		if ((pin == 1001) || (pin == 1234) || (pin == 1212)) {
			return true;
		} else {
			return false;
		}
	}
	
	private void withdraw() {
			System.out.println("Enter amount to withdraw");
	
		}

	public static void main(String args[]) {

		System.out.println("Enter pin: ");

		Scanner scan = new Scanner(System.in);
		int pin = scan.nextInt();
		User ur = new User();
		ur.setPin(pin);
		Bank b = new Bank();

		boolean isvalidatePin = b.isvalidatePin(pin);

		System.out.println(isvalidatePin);

		if (isvalidatePin == true) {
			b.withdraw();
		} else {
			System.out.println("Invalid pin");
		}

	}

	

}
