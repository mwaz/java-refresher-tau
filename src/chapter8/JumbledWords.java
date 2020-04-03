package chapter8;

public class JumbledWords {
	public static void main(String[] args){
		addSpaces("HeyThereIAmUsingIdea");
	}

	/**
	 * Adds spaces to Uppercase Characters
	 * @param text jumbled text
	 */
	public static void addSpaces(String text){
		var modifiedText = new StringBuilder(text);
		int wordLength = modifiedText.length();


		for (int i=0; i<=wordLength; i++){
			if(i!=0 && Character.isUpperCase(modifiedText.charAt(i))){
			modifiedText.insert(i, " ");
			i++;
			};

			}
		System.out.println(modifiedText);

	}



}
