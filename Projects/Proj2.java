import java.util.*;
import java.text.*;

public class Proj2 {
	public static void main(String[] arg){
		Scanner s = new Scanner(System.in);
		int playerScore;
		int computerScore;
		computerScore = playerScore = 0;	
		int turn;
		turn = 1;
		while((playerScore<=20)||(computerScore<=20)){
			System.out.println("Current score: You have"+playerScore+", Computer has"+computerScore+".");
			if(turn % 2 == 0){
				//Computer turn
				
			
			}else{
				//playerturn;
				 playerScore += playerTurn(s);
			}
			turn++;
			
		}
		
		
		
		
		//char system = (s.nextLine()).charAt(0);
		//Switch Statement
		//switch(grade)
		//case:'A';
		//
		
		
		
		
	}
	
public static int playerTurn(Scanner s){
		
		int resultTurn;
		resultTurn = 0;
		
		int numTurns;
		numTurns = 1;
		
		while(numTurns<=3){
			System.out.println("Your turn total is "+resultTurn+ ", Enter (r)oll or (s)top: ");
			char question = s.charAt(0);
			Boolean check=true;
			
			do{
				switch(question){
				case'r':
					if (roll==1){
						resultTurn += 0;
						
						break;
					}
					else{
						resultTurn +=roll;
						check=false;
					}
			
					numTurns++;
		
				}while(check==true)
				break;
				case:''
			
		return resultTurn;	
		
	}
public static int computerTurn(){
	
	int resultTurn;
	resultTurn = 0;
	
	int numTurns;
	numTurns = 1;
	
	while(numTurns<=3){
		System.out.println("Your turn total is "+resultTurn+ ", Enter (r)oll or (s)top: ");
		Random r = new Random();
		int roll = r.nextInt(5)+1;
		
		
		if (roll==1){
			resultTurn += resultTurn + 0;
				
			break;
		}
		else{
			resultTurn += resultTurn + roll;
				
		}
		
		numTurns++;
	
	}
		
	return resultTurn;	
	
}
	
	//public static boolean checkNumber(int roll){
	//	if(roll==1){
	//		return false;
	//	}else{
	//		return true
	//	}
	//}
	
	//return;
	
	

}
