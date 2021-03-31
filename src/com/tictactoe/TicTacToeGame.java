package com.tictactoe;
import java.util.*;
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
		System.out.println("Enter the position in between 1 to 9 ");
	
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		//Using switch 
		switch(n) {
		case 1:
			board [0][0]='X';
			break;
		case 2:
			board [0][2]='X';
			break;
		case 3:
			board [0][4]='X';
			break;
		case 4:
			board [2][0]='X';
			break;
		case 5:
			board [2][2]='X';
			break;
		case 6:
			board [2][4]='X';
			break;
		case 7:
			board [4][0]='X';
			break;
		case 8:
			board [4][2]='X';
			break;
		case 9:
			board [4][4]='X';
			break;
		}
		//catch character in for loop
		for (int i = 0; i < board.length; i++) {
			System.out.println(board[i]);
		}
	}
	
	public static void main(String[] args) {
		showBoard();
		
	}

}