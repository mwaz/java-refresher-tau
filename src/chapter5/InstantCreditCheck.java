package chapter5;

import java.util.Scanner;

public class InstantCreditCheck {
	static double requiredSalary = 25000;
	static double requiredCreditSCore = 700;
	static Scanner scanner = new Scanner(System.in);


	public static void main(String args[]){
		double salary = getSalary();
		double creditScore = getCreditScore();
		scanner.close();
		boolean qualified = isUserQualified(salary, creditScore);

		notifyUser(qualified);


	}
	public static double getSalary() {
		System.out.println("Kindly enter your salary");
		double salary = scanner.nextDouble();
		return salary;
	}

	public static double getCreditScore() {

	System.out.println("Kindly enter your credit Score");
		double creditScore = scanner.nextDouble();
		return creditScore;
	}


	public static boolean isUserQualified(double salary, double creditScore){
		if(creditScore >= requiredCreditSCore && salary >= requiredSalary){
			return true;
		}
		else return  false;
	}

	public static void notifyUser(boolean qualifiedMessage){
		if(qualifiedMessage){
			System.out.println("Congratulations! You qualify for credit");
		}
		else {
			System.out.println("You do not qualify for credit you require a salry of " + requiredSalary + " and a credit score of " + requiredCreditSCore + " ");
		}


	}

}
