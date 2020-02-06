package chapter3;

import java.util.Scanner;

public class SalaryCalculator {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int salary = 1000;
		int bonus = 250;
		int quota = 10;

		System.out.println("Enter the number of sales made");
		int sales = scanner.nextInt();
		scanner.close();

		// calculate bonus payments
		if (sales > quota){
			System.out.println("Salary is " + (salary + bonus));
		}
		else {
			System.out.println("Salary is " + salary);
		}




	}

}
