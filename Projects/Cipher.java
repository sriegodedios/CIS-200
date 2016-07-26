/**
 * Cipher handles the encryption and decryption of
 * messages according to the four-square cipher algorithm.
 *
 * @author Julie Thornton
 * @version Project 5
 */

public class Cipher {
	private Square plain1;
	private Square plain2;
	private Square cipher1;
	private Square cipher2;

	/**
	 * Cipher creates the four squares based on
	 * two keys for the four-square cipher algorithm.
	 *
	 * @param key1 The first key (no Q's)
	 * @param key2 The second key (no Q's)
	 */
	public Cipher(String key1, String key2) {
		//COMPLETE THIS CONSTRUCTOR
		//CREATE plain1, plain2, cipher1, and cipher2
		plain1 = new Square();
		plain2 = new Square();
		cipher1 = new Square(key1);
		cipher2 = new Square(key2);	
	}

	/**
	 * encrypt returns the encrypted message using the
	 * four-square cipher algorithm
	 *
	 * @param message The message to encrypt
	 *
	 * @return The encrypted message
	 */
	public String encrypt(String message) {
		//COMPLETE THIS METHOD
		
		
		
		
		String auditMess = message.toUpperCase();
		
		String[] split = auditMess.split(" ");
		
		String netMessage = "";
		for(int i = 0; i < split.length; i++){
			netMessage += split[i];
		}
		// Converts string and breaks up it by spaces
		
		
		String encryptedMessage = "";
		for(int i = 0; i < netMessage.length(); i +=2){
			
			char firstLetter = netMessage.charAt(i);
			char secondLetter = netMessage.charAt(i+1);
			
			int[] position1 = plain1.getPos(firstLetter);
			int[] position2 = plain2.getPos(secondLetter);
			
			
			char newChar1 = cipher1.getChar(position1[0], position2[1]);
			char newChar2 = cipher2.getChar(position2[0], position1[1]);
			
			encryptedMessage += newChar1;
			encryptedMessage += newChar2;
			
			
		}
		
		
		
		
		
		//RETURN THE ENCRYPTED message USING THE FOUR SQUARES
		
		
		
		

		//REMOVE THIS LINE WHEN DONE
		return encryptedMessage;
	}

	/**
	 * decrypt returns the decrypted message using the
	 * four-square cipher algorithm
 	 *
	 * @param message The message to decrypt
	 *
	 * @return The decrypted message
	 */
	public String decrypt(String message) {
		//COMPLETE THIS METHOD

		//RETURN THE DECRYPTED message USING THE FOUR SQUARES
		String decodedMessage = "";
		for(int i = 0; i < message.length(); i +=2){
			
			char firstLetter = message.charAt(i);
			char secondLetter = message.charAt(i+1);
			
			int[] position1 = cipher1.getPos(firstLetter);
			int[] position2 = cipher2.getPos(secondLetter);
			
			
			char newChar1 = plain1.getChar(position1[0], position2[1]);
			char newChar2 = plain2.getChar(position2[0], position1[1]);
			
			decodedMessage += newChar1;
			decodedMessage += newChar2;
			
			
		}
		//REMOVE THIS LINE WHEN DONE
		return decodedMessage;
	}
}