import java.util.*;

public class June23{
	public static void main(String[] args){
		Scanner s  = new Scanner(System.in);
		/* System.out.print("Enter first number: ");
		int num1 = Integer.parseInt(s.nextLine());
		
		System.out.print("Enter first number: ");
		int num2 = Integer.parseInt(s.nextLine());
		
		System.out.print("Enter first number: ");
		int num3 = Integer.parseInt(s.nextLine());
		
		double avg = (num1+num2+num3)/3.0;
		System.out.println("Average: "+avg); */
		System.out.print("Enter first number: ");
		question = (s.nextLine());
		Random r = new Random();
		int val = r.nextInt(8);
		
		if (val==1){
			System.out.print("Yes ");
		}else if(val==2){
			System.out.print("No");
		}else if(val==3){
			System.out.print("Maybe ");
		}else if(val==4){
			System.out.print("Sure ");
		}else if(val==5){
			System.out.print("Yeah right ");
		}else if(val==6){
			System.out.print("Never ");
		}else if(val==7){
			System.out.print("Ok");
		}else{
			System.out.print("Try again ");
		}
		
		
		
		
		
		
		
		
		
		
		/* System.out.print("Enter second number: ");
		int num2 = Integer.parseInt(s.nextLine());
		
		int small;
		
		if(num1 < num2){
			small = num1;
		}else{
			small = num2;
		} */
		
	/* 	if(avg >=90){
			
			
			
		}else if(avg >= 80){
			
		}else if(avg >= 70){
			System
		}
		 */
		
		System.out.println(small);
		
		/* if((avg >= 0)&&(avg <= 100)){
			if (avg >= 60){
				System.out.print("You passed!");
			}else{
				System.out.print("You failed..");
			}
		}else{
			System.out.print("Invalid score! Please put in a valid score 0-100");
		} */
		/* if(avg % 2 == 0){
			System.out.println("Even");
			
		}else{
			System.out.println("Odd");
		} */
	} 
	
	
}

/* If statement.

if(condition){
	...statements
	
	
} 

How to write a condition.

< = less than
> = greater than
&& = And
|| = Or
! = Not equal to
== = Compares values
! = Not true, (false)

boolean variables: can be either true or false

boolean cond = ((x >= 0)&&(x <= 9)){
	return true;	
	
}



cond  = !cond; (cond is now false)

If they enter something not 0-100 

###Random number generator########

import r = new Random();

int val r.nextInt(5); //val is 0,1,2,3,4


*/