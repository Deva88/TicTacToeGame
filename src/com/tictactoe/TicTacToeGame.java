package com.tictactoe;

/*@Description- simulator for TicTacToe Game*/
public class TicTacToeGame {

	/* UC1 -- Creating a Board */
	public static char[] createBoard() {
		char[] board = new char[10];
		/* initialize board with empty space */
		for (int pos = 1; pos < board.length; pos++) {
			System.out.print("board values are " + board[pos] + " ");
			if (pos % 3 == 0)
				System.out.println("\n");
			
		}
		return board;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to the TicTacToe Game");
		createBoard();
	}

}