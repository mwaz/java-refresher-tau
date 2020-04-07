package chapter8;

import java.util.regex.Pattern;

public class PasswordValidator {

	private static String username = "dummyUser";

	public static void main (String args []){
		checkPassword("SomePassworddummyUse#");

	}

	public static void checkPassword(String password){
		checkLength(password);
		checkUppercase(password);
		checkSpecialCharacter(password);
		checkUsernameInPassword(password);
//		checkOldPassword(password);

	}

	public static String checkLength(String password){
		if(password.length() >= 8 ){
			 System.out.println("Matches Required Password Length");
			 return password;
		}
		else System.out.println("Invalid Password Length");
		return  password;
	}

	public static String checkUppercase(String password){
		for(int i=0; i<password.length(); i++){
			if(!Character.isUpperCase(password.charAt(i))){
				System.out.println("Does not match Required Uppercase parameters");
			}
			else System.out.println("Matches Required Uppercase parameters");
			return  password;
		}
		return  password;
	}

	public static String checkSpecialCharacter(String password){
		for(int i=0; i<password.length(); i++){
			if(!Pattern.matches("[a-zA-Z0-9 ]*", password)){
				System.out.println("Matches Special character Requirement");
			}
			else System.out.println("Missing Special Character");
			return  password;
		}
		return  password;
	}

	public static String checkUsernameInPassword(String password){
		for(int i=0; i<password.length(); i++){
			if(!password.contains(username)){
				System.out.println("Matches No Username In Password Requirement");
			}
			else System.out.println("Password should not contain username");
			return  password;
		}
		return  password;

	}
}
