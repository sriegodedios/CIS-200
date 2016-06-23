import java.util.*;
public class Lab3 {
	private static void s(){
		Scanner s = new Scanner(System.in); 
	}
	public static void main(String Args[]){
		
		double[] userInput = new double[10];
		for(int i=0; i < 10; i++){
			userInput[i] = askUser();
		}
		double sumOfInputs = 0;
		double sumOfValues = 0;
		for(int j = 0; j < userInput.length; j++){
			sumOfInputs += userInput[j];
			sumOfValues++;
		}
		System.out.println("Added up is: "+sumOfInputs);
		
		double avgOfInputs = (sumOfInputs/sumOfValues);
		System.out.println("Average is: "+avgOfInputs);
		double newTotal = 0;
		for(int k = 0; k < userInput.length; k++){
			newTotal += (userInput[k]-avgOfInputs)*(userInput[k]-avgOfInputs);
			
			
		}
		
		double subTotal = 0;
		subTotal = (newTotal/10);
		
		double result =  Math.sqrt(subTotal);
		System.out.println("Square root is: "+result);
	}
	public static double askUser(){
		Scanner s = new Scanner(System.in); 
		System.out.print("Enter the number: ");
		double ask = Double.parseDouble(s.nextLine()); 
		return ask;
	}
}
