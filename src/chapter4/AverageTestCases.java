package chapter4;

import java.util.Scanner;

public class AverageTestCases {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int numberOfStudents = 24;
		int numberOfTests = 4;
		double average;


		for(int i=0; i<numberOfStudents; i++){
			double total = 0;
			for(int j=0; j<numberOfTests; j++){
				System.out.println("Enter the score for Test #" + (j + 1) );
				double score = scanner.nextDouble();
				total = total + score;
			}
			average = total/numberOfTests;
			System.out.println("Teest average of student #" + (i + 1) + " is " + average );


		}
	}

}
