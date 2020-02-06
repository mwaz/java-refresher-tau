package chapter3;

import java.util.Scanner;

public class ChangeForADollarGame {
	public  static void main(String [] args){
		// 100 pennies equal to a dollar
		// 20 nickels make a dollar
		// 10 dimes make a dollar
		// 4 quarters make a dollar

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the pennies");
		int pennnies = scanner.nextInt();
		System.out.println("Enter the nickels");
		int nickels = scanner.nextInt();
		System.out.println("Enter the dimes");
		int dimes = scanner.nextInt();
		System.out.println("Enter the quarters");
		int quarters = scanner.nextInt();

		scanner.close();

		double penniesToDollar = pennnies/100;
		double nickelsToDollar = nickels/20;
		double dimesToDollar = dimes/10;
		double quartersToDollar = quarters/4;
		int dollar = 1;

		double monetarySum = penniesToDollar + nickelsToDollar + dimesToDollar + quartersToDollar;

		if(monetarySum == dollar){
			System.out.println("Congratulations you win");
		}
		else if(monetarySum != dollar && monetarySum < dollar){
			double monetaryDifference = dollar - monetarySum;
			System.out.println("You change is less than one dollar, you require $" + String.format("%.2f", monetaryDifference) + " to cover the difference" );
		}
		else if(monetarySum != dollar && monetarySum > dollar){
			double monetaryDifference = monetarySum - dollar;
			System.out.println("You change is excessive you went $" + String.format("%.2f", monetaryDifference) + " over the required amount" );

		}
		else System.out.println("Invalid input");
	}

}
