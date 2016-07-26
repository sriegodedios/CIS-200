/**
 * Square represents one of the squares in the four-square
 * cipher algorithm.
 *
 * @author Shane Riegodedios
 * @version Project 5
 */

public class Square {
	private char[][] matrix;

	/**
	 * Square constructs a matrix with the letters A-Z, skipping Q.
	 */
	public Square() {
		matrix = new char[5][5];
		char alpha = 'A';
		for(int i = 0; i < matrix.length; i++){
			for(int k = 0; k < matrix.length; k++){
			
				if(alpha=='Q'){
					alpha++;
				}
				
				matrix[i][k]=alpha;
				alpha++;
				
			}	
		}

		//COMPLETE THIS CONSTRUCTOR
		//FILL matrix WITH A-Z, SKIPPING Q
	}

	/**
	 * Square first puts the characters from key into
	 * the matrix, and then fills the matrix with the remaining
	 * letters (skipping Q).
	 *
	 * @param key One of the encryption keys
	 */
	public Square(String key) {
		matrix = new char[5][5];
		// makes  a new object and splits up the parameter
		
		String finalString = "";
		String Alpha = key+"ABCDEFGHIJKLMNOPRSTUVWXYZ";
		
		for(int i = 0; i < Alpha.length(); i++){
			boolean copy = false;
			for(int k = 0; k< finalString.length(); k++){
				
				if(Alpha.charAt(i)==finalString.charAt(k)){
					copy = true;
				}
			}
			if(copy ==false){
				finalString += Alpha.charAt(i);
			}
			
		}
		
		
		
		int counter = 0;
		
		for(int i = 0; i < matrix.length; i++){
			for(int k = 0; k < matrix.length; k++){
				matrix[i][k] = finalString.charAt(counter);
				counter++;
				
				
			}
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		//COMPLETE THIS CONSTRUCTOR
		//FILL matrix WITH key, THEN REMAINING A-Z, SKIPPING Q
	}

	/**
	 * getChar returns the character at a given
	 * row and column in the matrix.
	 *
	 * @param row The row to look in
	 * @param col The column to look in
	 *
	 * @return The character at (row, col)
	 */
	public char getChar(int row, int col) {
		//COMPLETE THIS METHOD
		//RETURN THE CHARACTER IN MATRIX AT POSITION row,col

		return matrix[row][col];
	}

	/**
	 * getPos returns the [row,col] position
	 * of the given character.
	 *
	 * @param c The character to look for
	 *
	 * @return A 2-slot array holding the (row,col) of c
	 */
	public int[] getPos(char c) {
		//COPMLETE THIS METHOD
		//RETURN A 2-SLOT INT ARRAY HOLDING THE row,col OF c IN matrix
		int random[] = new int[2];
			for(int i = 0; i < matrix.length; i++){
				for(int k = 0; k < matrix.length; k++){
					if (matrix[i][k] == c){
						random[0] = i;
						random[1] = k;
						return random;
					}
				}
			}
		

		return null;
	}
}