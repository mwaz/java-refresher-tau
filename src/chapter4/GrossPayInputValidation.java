package chapter4;

import java.util.Scanner;

public class GrossPayInputValidation {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// get number of hours worked
		// max working hours = 40

		System.out.println("Please enter the hours worked");
		double hoursWorked = scanner.nextDouble();
		int rate = 15;
		int maxHours = 40;

		while (hoursWorked > maxHours || hoursWorked < 1){
			System.out.println("Hours should be less than 40 and more than 1, kindly retry");
			hoursWorked = scanner.nextDouble();
		}
		scanner.close();

		double salary = hoursWorked * rate;
		System.out.println("Worker salary is " + salary);

	}

}
