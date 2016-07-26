/**
 * IO handles all input and output for the
 * four-square encryption algorithm
 *
 * @author Shane Riegodedios
 * @version Project 5
 */

import java.util.*;

public class IO {
	private Scanner s;

	/**
	 * IO sets up a new Scanner to System.in
	 */
	public IO() {
		s = new Scanner(System.in);
	}

	/**
	 * firstKey returns the first key from the user
	 *
	 * @return The first key from the user
	 */
	public String firstKey() {
		//COMPLETE THIS TO GET THE FIRST KEY
		System.out.print(" Enter first key: ");
	    String firstKey = s.nextLine().toUpperCase();
	    String[] parts = firstKey.split(" ");
	    String Parse ="";
	    
	    for(int i = 0; i < parts.length; i++ ){
	    	Parse += parts[i];
	    	
	    }
	    
	    
	    
		
		//REMOVE THIS LINE WHEN DONE
		return Parse;
	}

	/**
	 * secondKey returns the second key from the user
	 *
	 * @return The second key from the user
	 */
	public String secondKey() {
		//COMPLETE THIS TO GET THE SECOND KEY
		System.out.print("\n Enter second key: ");
		String secondKey = s.nextLine().toUpperCase();
		//REMOVE THIS LINE WHEN DONE
		return secondKey;
	}

	/**
	 * gets and returns whether the user wants to encrypt or decrypt
	 *
	 *  @return 'e' for encryption, and 'd' for decryption
	 */
	public char encryptOrDecrypt() {
		//COMPLETE THIS TO GET THE ENCRYPT OR DECRYPT OPTION
		char option = 't';
		do{
			System.out.print("\n Enter (e)ncrypt or (d)ecrypt: ");
			option = s.nextLine().charAt(0);
			
			if((option=='e')||(option=='d')){
				//dummy code
				//Do nothing and continue
			}else{
				option ='t';
				System.out.println("\n Invalid option plaese try again.");
			}
			
			
		}while(option == 't');
		
		
		
		
		
			
		//REMOVE THIS LINE WHEN DONE
		return option;
		

	}
	
	
	public String message(char c){
		String type;
		if(c == 'e'){
			type = "encrypt";
		}else{
			type = "decrypt";
		}
		System.out.print("\n Enter the message to "+type+": ");
		String message = s.nextLine();
		
		return message;
	}
	
	public void printMessage(char c, String msg){
		if(c == 'e'){
			System.out.println("\n Encrypted Message: "+msg);
		}else{
			System.out.println("\n Decrypted Message: "+msg);
		}
		
	}
	public void printError(String msg){
		System.out.println("\n An error has occured: "+msg);
	}
	
	
}

	/**
	 * 
	 */
