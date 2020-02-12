package chapter4;

import java.util.Random;

public class DieGame {
	public static void main(String args []){
		int maxRolls = 20;
		int dieCount = 0;
		Random random = new Random();

		for (int i=0; i<5; i++){
			int die = random.nextInt(6) + 1;

			dieCount = dieCount + die;


			if(dieCount == maxRolls){
				System.out.println("Roll "+ (i+1) + " You've rolled a " + die + "." + " You are on space " + maxRolls + " Congratulations you have won!");
			}
			else if (dieCount < 20 && i==4) {
				System.out.println("Roll "+ (i+1)  + " You are on space " + dieCount + " Unfortunately you did not make it to all the  " + maxRolls + " spaces you lose!" );

			}
			else if(dieCount < 20){
				System.out.println("Roll "+ (i+1)  + " You've rolled a " + die + "." + "You are now on space " + dieCount + " and have " + (maxRolls - dieCount) +  " more to go.");
			}
			else  {
				System.out.println("Roll "+ (i+1)  + " You have exceeded the die count, please try again You are now on space " + dieCount + "" );
				break;
			}

		}

	}

}
