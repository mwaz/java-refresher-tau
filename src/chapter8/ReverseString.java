package chapter8;

public class ReverseString {
	public static void main(String args[]){
		reverse("Hey There");

	}

	/**
	 * Prints the string in reverse order
	 * @param text String to reverse
	 */
	public static void reverse(String text){

		int wordsCount = text.length();


		for (int i=wordsCount-1; i>=0; i--){
			System.out.print(text.charAt(i));


		}


	}

}
