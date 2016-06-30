/**
 *
 * DESCRIPTION: This java program simulates a connect 4 game using arrays. 
 * Each player takes turns inserting a marker, for of the same marker, that player of that 
 * marker wins.
 * 
 * 
 * @author Shane Riegodedios
 * @version Project 3
 */

 

import java.util.*;

public class Proj3 {
	public static char[][] board;
	public static Scanner s = new Scanner(System.in);
	public static void main(String[] Arg){
		
		//Print initial Board
		board = new char[6][7]; 
		initializeGame(board);
	
		int turnNumber = 0;
		char turn;
		for (int count = 0; count < 42; count++) {
			turnNumber++;
		
			turn = playerTurn(turnNumber);
			int user = 0;
			if(turn == 'X'){
				user = 2;
			}else{
				user = 1;
			}
		int col = inputMove(turn, user);
			
			
				//Simulates the gravity aspect of the following markers in the game
				for(int rowCount = 5; rowCount > -1; rowCount--){
					
						if(board[rowCount][col] != '_' ){
							continue;
						}else{
							board[rowCount][col] = turn;
							break;
						}
				}
				//checks if there is a winner
				if(checkForWinner()==true){
					System.out.println("\nCurrent Board (user1 = O, user2 = X)");
					printBoard();

					System.out.println("\nUser "+user+" wins "+"("+turn+")");
					
					break;
				}
				//checks if the board is full
				if(boardFull()==true){
					System.out.println("The board is full, it's a draw!)");
					break;
				}
			}
	}	
	
	public static int inputMove(char turn, int user){
		/**
		 * Processes the input of the user(s)
		 * 
		 * turn is the value of the turn (e.g. O or X)  
		 * user is which user it is (e.g. user1 or user2)
		 * 
		 * Returns the variable col, which is used to search the columns of the array
		 */
		boolean validMove;
		int col = -1;
			do{
				
				System.out.print("User "+user+"("+ turn + "), Enter a col (0-6): ");
				String input = s.nextLine();
				//if someone presses 'enter' without inputting anything
				if(input.isEmpty()){
					input = "s";
					//the empty input is replaced by a random character in this case a 's'
				}
					char valueInput = input.charAt(0);
					validMove = checkMove(valueInput);
					System.out.println(" ");
				if(validMove == true){
					col = Integer.parseInt(input);
				}
			}while(validMove != true|| col==-1 );
			return col;
	}
		
	public static boolean checkMove(char input){
		/**
		 * Checks if the user input is valid
		 * 
		 * input passes in the value for the input
		 * 
		 * Returns a true or false if the input is valid
		 */
		try{
			
		   int number = Character.getNumericValue(input);
		   if(number > 6 || number <= -1){
			   System.out.println("Invalid column number"); 
			   return false;
		   }else{
			   if(board[0][number] != '_'){
				   System.out.println("Colmunm is full!!");
				   return false;
			   }else{
				   return true;
			   }
		   }

		}catch (NumberFormatException ex) {
			System.out.println("Invalid Input must be integer!!");
			return false;
		}
			
	}
	
	public static boolean checkForWinner(){
		/**
		 * Checks if there is four in a row: diagonally, horizontal, or vertical
		 * 
		 * If there is a winner, returns a true, if there is no winner, returns false
		 */
		for (int x = 0; x < 4; x++){
			 //Diagonally left
				for(int y = 5 ; y > 2; y--){
					
					
					if (board[y][x] == 'X' && board[y - 1][x + 1] == 'X' && board[y -  2][x + 2] == 'X' && board[y - 3][x + 3] == 'X'){
	
						return true;
						
					}
					if (board[y][x] == 'O' && board[y - 1][x + 1] == 'O' && board[y - 2][x + 2] == 'O' && board[y - 3][x + 3] == 'O'){
						
						return true;
					}
				}
				
			}
		for(int y = 5; y > 2;y--){
			// diagonally right
			for(int x = 6; x > 3; x--){
				
			    
			    if (board[y][x] == 'X' && board[y - 1][x - 1] == 'X' && board[y -  2][x - 2] == 'X' && board[y - 3][x - 3] == 'X'){
					
					return true;
				}
				if (board[y][x] == 'O' && board[y - 1][x - 1] == 'O' && board[y - 2][x - 2] == 'O' && board[y - 3][x - 3] == 'O'){
					
					return true;
				}
				
			}
		}	
		for(int z = 5; z > 1 ;z--){
			//Checks across
			for(int x = 6; x > 2; x--){
				
			    
			    if (board[z][x] == 'X' && board[z][x - 1] == 'X' && board[z][x - 2] == 'X' && board[z][x - 3] == 'X'){
				
					return true;
				}
				if (board[z][x] == 'O' && board[z][x - 1] == 'O' && board[z][x - 2] == 'O' && board[z][x - 3] == 'O'){
					
					return true;
				}
				
			}
		}
		for (int a = 0; a < 6; a++){
			//Checks vertically
			for(int y = 5 ; y > 2; y--){
				
				
				if (board[y][a] == 'X' && board[y - 1][a] == 'X' && board[y -  2][a] == 'X' && board[y - 3][a] == 'X'){
					
					return true;
				}
				if (board[y][a] == 'O' && board[y - 1][a] == 'O' && board[y - 2][a] == 'O' && board[y - 3][a] == 'O'){
					
					return true;
				}
			}
			
		}
		return false;
	}
	
	public static char playerTurn(int turnNumber){
		System.out.println("Current Board (user1 = O, user2 = X)");
		printBoard();
		char turn;
		if(turnNumber % 2 == 0){
			return turn = 'X';
	
		}else{
			return turn = 'O';
		}
		
		
	}
	
		

	public static boolean boardFull(){
		/**
		 *Checks is the board is full
		 *
		 * Returns a boolean true or false, true if full, false if there are still spaces
		 */
		int count = 0;
		for(int i=0; i < board.length; i++){
			if(board[0][i]!='_'){
				count++;
			}	
		}
		if(count == 7){
			System.out.println("Board Full!");
			return true;
		}
		
		
		//loop through and returns if board is full if not returns true
		return false;
	}
		
	public static void printBoard(){
		/**
		 *Prints out board
		 *
		 * Doesn't return anything but it prints out the board
		 */
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) { 
				System.out.print(board[i][j] + " "); 
				
			} 
			System.out.println();
		}
		System.out.println(" ");
	}
		
		
	
	
	public static void initializeGame(char[][] board){
		/**
		 * Initializes the game, sets  each index of the board array to _
		 *
		 * Doesn't return anything, only sets up the board
		 */
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = '_'; 
				
			}
			
		}
	}
}

 /*************************************************************************
 * PROPERTY OF SHANE RIEGODEDIOS
 * Use for educational purposes, DO NOT COPY
 * __________________
 * 
 *  [2016] Shane Riegodedios, Matt Hixon, Lane Evans 
 *  All Rights Reserved.
 * 
 * NOTICE:  All information contained herein is, and remains
 * the property of its people: Shane Riegodedios, 
 * Matt Hixon, and Lane Evans. The intellectual and technical concepts contained
 * herein are proprietary to the Computer Information Sciences at K-State, 
 * College of Engineering, Kansas State University, its original owners,
 * and its suppliers and may be covered by U.S. and Foreign Patents,
 * patents in process, and are protected by trade secret or copyright law.
 * Dissemination of this information or reproduction of this material
 * is strictly forbidden unless prior written permission is obtained. 
 * If this source code is found in any other program that is not owned by the people or affiliates mention 
 * above than it is direct violation of the Kansas State Honor Code as plagirism and instuctors must 
 * take disiplinary action. For more details about the honor code, it can be found here with this 
 * link: https://www.k-state.edu/honor/
 ******************************************************************************/