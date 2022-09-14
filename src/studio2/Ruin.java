package studio2;

import java.util.Scanner;
public class Ruin {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter the amount of money you are starting with");
		double startAmount = in.nextDouble();
		double originalAmount = startAmount;
		System.out.println("What amount of money would you like to stop playing with?");
		double winLimit = in.nextDouble();
		double winChance = 0.5;
		System.out.println("How many days would you like to go to the casino?");
		int daysAtCasino = in.nextInt();

		for (int i= daysAtCasino; i > 0; i--) {
			startAmount = originalAmount;
			System.out.println("Day number " + i);



			int NumberOfPlays = 0; 
			while (startAmount > 0 && startAmount < winLimit)
			{
				NumberOfPlays = NumberOfPlays + 1; 
				if (Math.random() > winChance) {
					startAmount = startAmount + 1;
					// System.out.println("You have won! Your new balance is " + startAmount );

				}
				else {
					startAmount = startAmount - 1;
					// System.out.println("You have lost! Your new balance is " + startAmount );
				}
			}

			if (startAmount == 0) {
				System.out.println("Your day is over!!");
			}

			else {
				System.out.println("Your day was successful!!");
			}
			System.out.println("You Played " + NumberOfPlays + " times before you ended this day");
			// TODO Auto-generated method stub

		}

	}
}
