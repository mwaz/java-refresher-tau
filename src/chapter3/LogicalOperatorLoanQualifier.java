package chapter3;
import  java.util.Scanner;

public class LogicalOperatorLoanQualifier {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int salary = 30000;
		int workingExperience = 2;

		System.out.println("Please enter your current salary");
		double salaryExpectation = scanner.nextDouble();
		System.out.println("Please enter your work experience in years");
		double experience = scanner.nextDouble();
		scanner.close();

		if(salaryExpectation >= salary && experience >= workingExperience ) {

			System.out.println("Congratulations!, You qualify for a loan");
		}
		else System.out.println("Oops Sorry!,Your salary needs to be above " + salaryExpectation + " and working experience greater than " + workingExperience);

	}

}

