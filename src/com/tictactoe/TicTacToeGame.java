package com.tictactoe;

import java.util.*;
/*@Description- simulator for TicTacToe Game*/

public class TicTacToeGame {

	static Scanner sc = new Scanner(System.in);
	static char playerLetter, computerLetter;

	// Taking Input
	public static char takeInput() {
		System.out.println("Enter the letter you wish to take: ('X' / 'O'): ");
		char input = Character.toUpperCase(sc.next().charAt(0));
		if (input == 'X' || input == 'O') {
			setLetter(input);
			return input;
		} else {
			System.out.println("Invalid Character. Try Again.");
			return takeInput();
		}
	}

	// Determine letter for player and computer
	public static void setLetter(char playerLetter) {
		computerLetter = (playerLetter == 'X') ? 'O' : 'X';
		System.out.println("Player Letter: " + playerLetter + "\nComputer Letter : " + computerLetter);
	}

	public static void main(String args[]) {
		System.out.println("Welcome to the TIC_TAC_TOE game");
		// userInput();
		takeInput();
	}
}