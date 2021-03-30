package com.tictactoe;

/*@Description- simulator for TicTacToe Game*/
public class TicTacToeGame {

	/* UC1 -- Creating a Board */
	public static char[] createBoard() {
		char[] board = new char[10];
		/* initialize board with empty space */
		for (int pos = 1; pos < board.length; pos++) {
			board[pos] = ' ';
		}
		return board;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		createBoard();
	}

}