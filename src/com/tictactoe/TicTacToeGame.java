package com.tictactoe;

/*@Description- simulator for TicTacToe Game*/
public class TicTacToeGame {
	
	/* UC1 -- Creating a Board */
	public static void board() {
		char[] board = new char[10];
		for (int pos = 1; pos < board.length; pos++) {
			board[pos] = ' ';
		}
	}
	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		board();
	}

}