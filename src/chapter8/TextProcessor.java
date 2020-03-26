package chapter8;


public class TextProcessor {


	public static void main(String args[]){
		countWords("Hey here are some words");

	}

	/**
	 * Counts the words in a sentence
	 * and returns the number
	 * @param text
	 */
	public static void countWords(String text) {
		String[] numbers = text.split(" ");

		int numberCount = numbers.length;

		System.out.println("The number count of words is " + numberCount);

		for(int i=0; i<numberCount; i++ ){
			System.out.println(numbers[i]);
		}

	}

}
