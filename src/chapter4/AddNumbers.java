package chapter4;

import java.util.Scanner;

public class AddNumbers {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		boolean repeat;

		do {
			System.out.println("Enter your first number");
			double firstNumber = scanner.nextDouble();
			System.out.println("Enter your other number");
			double secondNumber = scanner.nextDouble();
			double sum = firstNumber + secondNumber;
			System.out.println("Your sum is " + sum);

			System.out.println("Would you want to compute again? True or False");
			repeat = scanner.nextBoolean();

		} while (repeat);
		scanner.close();
	}

}
