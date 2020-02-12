package chapter5;

import java.util.Scanner;

public class PhoneBillCalculator {

	static Scanner scanner = new Scanner(System.in);

	public static void main(String args[]){
		double overageMinutes = getOverageMinutes();
		double planFee = getPlanFee();
		scanner.close();
		double overage = calculateOverage(overageMinutes);
		double tax = calculateTax(planFee, overage);

		getTotal(overage, overageMinutes, planFee, tax);

	}

	public static double getPlanFee(){
		System.out.println("Enter the plan fee");
		double planFee = scanner.nextDouble();
		return  planFee;

	}

	public static double getOverageMinutes(){
		System.out.println("Enter the overage minutes");
		double overageMinutes = scanner.nextDouble();
		return  overageMinutes;
	}

	public static double calculateOverage(double overageMinutes){
		double overageCost = (0.25 * overageMinutes);
		return  overageCost;
	}

	public static double calculateTax(double feePlan, double overage){
		double subTotal = feePlan + overage;
		double tax = 0.15 * subTotal;
		return  tax;
	}

	public static void getTotal(double overage, double overageMinutes, double planFee, double tax){
		double total = overage + tax + planFee;

		System.out.println("Phone Bill Statement");
		System.out.println("Plan: " + planFee);
		System.out.println("Overage: " + overageMinutes);
		System.out.println("Tax: " + tax);
		System.out.println("Total: " + total);

	}




}
