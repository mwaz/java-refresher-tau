package chapter3;

import java.util.Scanner;

public class QuotaCalculator {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter the number of sales made");

		int quota = 10;
		int sales = scanner.nextInt();
		scanner.close();

		if(sales >= quota){
			System.out.println("Congratulations!, Quota met");
		}
		else {
			System.out.println("Sorry!, You require " + (quota - sales) + " more sales to meet your quota");
		}

	}

}
