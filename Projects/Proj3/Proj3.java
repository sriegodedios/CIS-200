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
		if(turn=='X'||turn=='O'){
			System.out.println("Spot 1: "+board[5][0]);
			System.out.println("Spot 2: "+board[4][1]);
			System.out.println("Spot 3: "+board[3][2]);
			System.out.println("Spot 4: "+board[2][3]);
		
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
				
					
				
				}
				for (int i = 0; i < board.length; i++) {
					for (int j = 0; j < board[0].length; j++) { 
						System.out.print(board[i][j] + " "); 
						
					} 
					System.out.println();
				}
				/*for (int x = 0; x < 4; x++){
					for(int y = 5 ; y > 2; y--){
						System.out.println(board[y][x]+":Place 1");
						System.out.println(board[y-1][x+1]+":Place 2");
						System.out.println(board[y-2][x+2]+":Place 3");
					    System.out.println(board[y-3][x+3]+":Place 4");
						
						if (board[y][x] == 'X' && board[y - 1][x + 1] == 'X' && board[y -  2][x + 2] == 'X' && board[y - 3][x + 3] == 'X'){
							System.out.println("Player X Wins diagonally");
							break;
						}
						if (board[y][x] == 'O' && board[y - 1][x + 1] == 'O' && board[y - 2][x + 2] == 'O' && board[y - 3][x + 3] == 'O'){
							System.out.println("Player O Wins diagonally");
							break;
						}
					}
					
				}*/
				//diagonally left
				for(int y = 5; y > 2;y--){
					for(int x = 6; x > 3; x--){
						System.out.println(board[y][x]+":Place 1");
						System.out.println(board[y-1][x-1]+":Place 2");
						System.out.println(board[y-2][x-2]+":Place 3");
					    System.out.println(board[y-3][x-3]+":Place 4");
						
					}
					
					
				}
				
				
					
					
			}
			
	
	}	
	
		
	/*for(int y = 0; y < 4; y++){
		//checks the row diagonally to left
		for(int dl = 5; dl > 2 ; dl--){
			char dlnum1 = board[dl][y];
			char dlnum2 = board[dl-1][y+1];
			char dlnum3 = board[dl-2][y+2];
			char dlnum4 = board[dl-3][y+3];
			System.out.println("Main: "+dlnum1);
			
			
			if(dlnum1==dlnum2&&dlnum1==dlnum3&&dlnum1==dlnum4){
				//System.out.println(dlnum1+" Wins!");
				//break;
			}
			
		}
		
		
		
		
		
	}*/	
		
		
		
		
		
		
		
		
	
	
	public static void initializeGame(char[][] board){
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[0].length; j++) {
				board[i][j] = '_'; 
				System.out.print(board[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void checkDiagLeft(char[][] board){
		for (int x = 5; x >2; x--){
			for(int y = 6; y > 3; y--){
				if (board[x][y] == 'X' && board[x - 1][y - 1] == 'X' && board[x - 2][y - 2] == 'X' && board[x - 3][y - 3] == 'X'){
					System.out.println("Player X Wins diagonally");
				}
				if (board[x][y] == 'O' && board[x - 1][y - 1] == 'O' && board[x - 2][y - 2] == 'O' && board[x - 3][y - 3] == 'O'){
					System.out.println("Player O Wins diagonally");
				}
			}
		}
	}

}
