package chapter3;

import java.util.Scanner;

public class LoanQualifier {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int salaryLimit = 30000;
		int workingExperience = 2;

		System.out.println("Please enter your current salary");
		double salary = scanner.nextDouble();
		System.out.println("Please enter your work experience in years");
		double experience = scanner.nextDouble();
		scanner.close();

		if(salary >= salaryLimit){
			if(experience >= workingExperience){
				System.out.println("Congratulations!, You qualify for a loan");
			}
			else System.out.println("Oops Sorry!, Your years of experience need to be greater than " + workingExperience);
		}
		else System.out.println("Oops Sorry!,Your salary needs to be above " + salaryLimit);




	}

}
