package com.tictactoe;

/*@Description- simulator for TicTacToe Game*/

public class TicTacToeGame {

	// create one method board()
	public static void board() {
		// create the board of size 10
		char[] board = new char[10];
		// initialize board with empty space and ignore 0th index
		for (int pos = 1; pos < board.length; pos++) {
			board[pos] = ' ';
		}
	}

	public static void main(String[] args) {
		// call method
		board();
	}

}