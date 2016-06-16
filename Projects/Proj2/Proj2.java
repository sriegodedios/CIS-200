/**
 * CIS 200 Project 2
 *
 * Description: This java program is a game of pig in which the player plays against the computer.  
 * 				Each player rolls dice three times. Each number they role (2-6) is counted towards their turn score. After three rolls their turn score is added to the total score.
 *				If they ever role a 1, their turn ends and the total points they get for that turn is 0. The first one with a core of 20 or higher wins! 
 *
 * Note: Alot of this program runs alot of loop statements
 *
 * Requirements: You must include a description of your strategy for the computer, and why you believe it is effective. 
 *				 In addition to the comment block at the top of the file, you should include comments within each file that describe what your code does. 
 *				 You don't have to comment every line, but you should include enough description that is easy for an outside reader to tell what you are doing.
 *
 *
 *
 *
 * @author Shane Riegodedios
 * @version v1.0
 */



import java.util.*;
import java.text.*;






public class Proj2 {
	public static void main(String[] arg) throws InterruptedException{
		boolean noPlay=false; //This sets initial setting of exiting the game to false
		Scanner s = new Scanner(System.in);
		int playerWins = 0; //Sets total number of player wins
		int computerWins = 0; // Sets total number of computer wins
		
		while(noPlay==false){ 
			
			int playerScore; //intializes the player total score
			int computerScore; // initializes the computer total score
			computerScore = playerScore = 0; //sets both computer and player score to 0
			int turn;//intialize turn count, this is used for determeaning who's turn it is
			turn = 1; //sets the turn to 1
			do{
					System.out.println("Current score: You have "+playerScore+", Computer has "+computerScore+".");
				if(turn % 2 == 0){ //this moderator checks to see if the turn number is even or odd
					
					
					//Even: Computer turn
					computerScore += computerTurn(); //calls the computerTurn method and adds the value it returns to total computer score 
			
				}else{
					//Odd: Player turn;
				 	playerScore += playerTurn(); //calls the playerTurn method and adds the value it returns to total player score 
				}
				turn++; //adds 1 to the turn
			
			}while((playerScore<=20)&&(computerScore<=20)); //checks if total player or computer score is greater than 20 if
			//Won't leave the loop until either score is greater than or equal to 20
		
			//If your here, that means either score is greater or equal to 20 and it exits the while loop
		
			if(playerScore>=20){ //Checks ti see if player score is greater than or equal to 20
				System.out.println("You won with the score of: "+playerScore+"!"); //Prints you won statement
				playerWins += 1; //Adds 1 to the total number of player wins 
				
			}else{ //if the if statement of the player score is false, obviously it's the computer who won
				System.out.println("The computer won with the score of: "+computerScore+" Sorry you lost..."); //prints the computer won
				computerWins += 1; //Adds 1 to the total number of player wins 
			}
			
			boolean exitOption = false;//sets the exit question false to default or no
			System.out.println("Total player wins: "+playerWins+"."); // prints out the total wins of the player
			System.out.println("Total computer wins: "+computerWins+".");//prints out the total wins of the computer
			//prints out the scores
			while(exitOption == false){ //loop that checks if y or n is typed in
				System.out.print("Play again (y/n)? ");
				char playAgain = (s.nextLine()).charAt(0);
					switch(playAgain){
					case'y'://if the user types in 'y'
					//returns the loop (Replays game)
					exitOption = true;	//Ensure loop that checks y or n exits safely
					break;
					case'n':
						noPlay=true;
						System.out.println("Okay goodbye! ");
						exitOption = true; //changes the exit question to true or yes
						//Exits loop and ends game
						break;
					default:
						System.out.println("Invalid option please type y or n"+ "!");// Prints out error message 
						//repeats the y or n loop
					
				}
			}
			

		
		
		
		}
	} 
	
	
public static int playerTurn(){ //method for the user turn 
		Scanner s = new Scanner(System.in); //sets up a new input
		int resultTurn; 
		resultTurn = 0; 
		//intitalizes the result turn = 0
		int numTurns;
		
		numTurns = 1;
		//initalizes the number of turns taken to 1
		while(numTurns!=3){
			//while the nuber of turns is less than or equal to three
			System.out.print("Your turn total is "+resultTurn+ ", Enter (r)oll or (s)top: ");
			//question to roll or stop is asked
			char question = (s.nextLine()).charAt(0);
			//char variable stores use response
			boolean check = false;
			//boolean used to for the do loop
			
			do{
				boolean exit = false;
				while(exit== false){ 
					//while loop used to repeat the question if the user types in the wrong input
					switch(question){
						case'r': 
							//if the user inputs the string 'r'
							Random r = new Random();
							//generates a random number 0-5
							int roll = r.nextInt(5)+1;
							//adds 1 to random number
							System.out.println("You rolled a "+roll+".");
							
							if (roll==1){
								//if the roll is a 1, the turn is over the resultTurn is set to 0
								System.out.println("Turn over");
								System.out.println(" ");
								resultTurn = 0;
								check=true;
								exit = true;
								return resultTurn;
								
						
							}
							else{
								//the turn continues
								resultTurn += roll;
								check=true;
								numTurns++;
								exit = true;
							}
			
					
		
				
						break;
						case 's':
							//if 's' is inputted, the player turns 'end' and the score up to that point is added to the players total score
							resultTurn += 0; 
							numTurns = 4; //Ensures it exits the loop safely
							return resultTurn;
							
							
						
						
						default:
							//if the user inputs anything else, it is invalid and the question of roll or stop is asked again
							//This does not effect their overal roll count
							System.out.println("You enter an invalid statement please try again!!");
							check=true;
							exit = true;
							
							
						}
					}
				}while(check==false); 
				//condition that checks if the user indicated they did not input anything invalid
				
			
			}
		System.out.println("Player total is "+resultTurn+ ". Player Stops");
		System.out.println("Turn over.");
		System.out.println(" ");
		return resultTurn;	
		//Ends the players turn
	}
public static int computerTurn() throws InterruptedException{   //the InterruptedException is what I used to slow the program down just a bit in order to get simulated feel as if you were playing a real game!
	
	int resultTurn; 
	resultTurn = 0;
	//intializes the computers roll score and sets it to 0
	int numTurns;
	numTurns = 1;
	//number of terms is set to 1
	System.out.println("Computer total is "+resultTurn+" Computer rolls.");
	while(numTurns!=3){
		//loop that checks the number of turns is less than 3 or equal to 
		Random r = new Random();
		int roll = r.nextInt(5)+1;
		System.out.println("Computer rolled a "+roll+ ".");
		
		if (roll==1){
			resultTurn = 0;
			System.out.println("Computer total is "+resultTurn+ ". Computer Stops");
			System.out.println("Turn over.");
			System.out.println(" ");
			return resultTurn;
			
		}
		else{
			resultTurn +=  roll;
			Thread.sleep(900); //buffers the program about 50 seconds to get a simulated feel of the computer rolling dice	
		}
		
		numTurns++;
	
	}
	System.out.println("Computer total is "+resultTurn+ ". Computer Stops");
	System.out.println("Turn over.");
	System.out.println(" ");
	return resultTurn;
	//Ends the computer turn	
		
	
}

	
	

}