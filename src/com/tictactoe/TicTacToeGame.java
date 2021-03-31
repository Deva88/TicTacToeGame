package com.tictactoe;

/*@Description- simulator for TicTacToe Game show Board*/

public class TicTacToeGame {
	// create one method showBoard()
	public static void showBoard() {
		//taken 9 column
		char[][] board = { { ' ', '|', ' ', '|', ' ' }, //row
						   { '-', '+', '-', '+', '-' }, 
						   { ' ', '|', ' ', '|', ' ' },//row
						   { '-', '+', '-', '+', '-' }, 
						   { ' ', '|', ' ', '|', ' ' }, //row 
						   };
		//catch character in for loop
		for (int i = 0; i < board.length; i++) {
			System.out.println(board[i]);
		}
	}
	
	public static void main(String[] args) {
		showBoard();
	}

}