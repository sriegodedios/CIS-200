/**
 * This project implements the four-square cipher, allowing for
 * encryption and decryption.
 *
 * @author Shane Riegodedios
 * @version Project 5
 */

public class Proj5 {
	
	public static void main(String[] args) {
		
		//COMPLETE THE MAIN METHOD
		//GET THE KEYS, MESSAGE FROM IO
		//GIVE THEM TO CIPHER TO ENCRYPT/DECRYPT
		//GIVE THEM BACK TO IO TO PRINT
		
		IO input = new IO();
		
		String firstKey = input.firstKey();
		String secondKey = input.secondKey();
		

		char encrypt = input.encryptOrDecrypt();
		//Attempt to catch problems in the code 
		try{
			switch(encrypt){
				case 'e': 
					Cipher encryption = new Cipher(firstKey, secondKey);
					String message =input.message(encrypt);
					String encryptedMessage = encryption.encrypt(message);
			
					input.printMessage(encrypt, encryptedMessage);
					break;
				case'd':
					Cipher decryption = new Cipher(firstKey, secondKey);
					String messageDecr =input.message(encrypt);
					String DecryptedMessage = decryption.decrypt(messageDecr);
			
					input.printMessage(encrypt, DecryptedMessage);
					break;
				}
			}catch(StringIndexOutOfBoundsException e){
				//If the word is an odd length or has q
				String error ="The message you inputted is an odd number, please try a different message.";
				
				input.printError(error);
		
			}catch(NullPointerException e){
				String error ="There appears to be a problem (you could be using a \"q\" in your message which does not exsist), please try again later...";
				input.printError(error);
			}
		
			
		
		
		
		
		
		
		
		
		
	}
}