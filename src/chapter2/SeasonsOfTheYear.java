package chapter2;

import java.util.Scanner;

public class SeasonsOfTheYear {

	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		// Get the season
		System.out.println("Enter the season of the year");
		String season = scanner.next();

		// Get the whole number
		System.out.println("Enter a whole number");
		int wholeNumber = scanner.nextInt();

		// Get an adjective
		System.out.println("Enter the adjective");
		String adjective = scanner.next();

		scanner.close();

		// Display Output

		System.out.println("On a " + adjective +  " " + season + " day, I drink a minimum of " + wholeNumber + " cups of coffee");




	}


}
