package chapter3;

import java.util.Scanner;

public class TestResults {
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		// get the test score
		// calculate their grade
		System.out.println("Please Enter the Student's score");
		double score = scanner.nextDouble();
		scanner.close();

		char grade;

		if(score < 60){
			grade = 'F';
		}
		else if(score < 70){
			grade = 'D';
		}
		else if(score < 80){
			grade = 'C';
		}
		else if(score < 90){
			grade = 'B';
		}
		else{
			grade = 'A';
		}

		System.out.println("Your grade is " + grade);


	}

}
