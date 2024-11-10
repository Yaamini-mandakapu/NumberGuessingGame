package com.NumberGuessingGame;

import java.util.Scanner;
import java.util.Random;

public class Main {
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String play = "yes";
		//while loop to determine if we are going to play the game again
		while(play.equals("yes")) {
			Random random =new Random();
			int randomNumber = 100;
			int guess = -1;
			int tries = 0;
			//while loop to check if the game is over
			while(guess != randomNumber) {
				System.out.println("Guess a number between 1 and 100: ");
				guess = scanner.nextInt();
				tries++;
				if(guess == randomNumber) {
					System.out.println("Awesome! you guessed the number!");
					System.out.println("It only took you " +tries+ "guesssess!");
					System.out.println("Would you like to paly again? Yes or No: ");
				}else if(guess < randomNumber){
					System.out.println("Your guess is too low, try again.");
				}else {
					System.out.println("Your guess is too high, try again.");
				}
				
			}
		}
		scanner.close();
	}
	
	
}
