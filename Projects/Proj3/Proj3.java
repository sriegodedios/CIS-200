/**
* Game: Connect 4
*
*/


import java.util.*;
public class Proj3 {
	public static void main(String[] Arg){
		Scanner s = new Scanner(System.in);
		
		
		System.out.println("user1 = O, user 2 = X");
		//Print initial Board
		char[][] board = new char[6][7]; 
		initializeGame(board);
	
	char turn = 0;
	for (int count = 0; count < 42; count++) {
		turn++;
		if(turn % 2 == 0){
			turn = 'X';
		}else{
			turn = 'O';
		}
			System.out.print("\n" + turn + ", Enter a col (0-6): "); 
			int col = Integer.parseInt(s.nextLine());
			//checks to see if row is blocked
			int rowCount = 5;
			
			//do{
				for(rowCount = 5; rowCount > 0; rowCount--){
					if ( col < 0 || col > 7) { 
						
						System.out.println("Invalid move.");
						rowCount++;
						break;
					}else{
						if(board[rowCount][col] != '_' ){
							continue;
					
						}else{
							board[rowCount][col] = turn;
							break;
						}
					}
					

				//}while()
			}
			for (int i = 0; i < board.length; i++) {
				for (int j = 0; j < board[0].length; j++) { 
					System.out.print(board[i][j] + " "); 
				} 
				System.out.println();
			}
			
	}	
	
		
		
		
		
		
		
		
		
		
		
	}
	
	public static void initializeGame(char[][] board){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = '_'; 
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}

}
