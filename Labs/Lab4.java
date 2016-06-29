import java.io.*;
import java.util.*;

public class Lab4 {
	public static String getInitial(String fullName) {
		//WRITE THIS METHOD FIRST

		//fullName is a string with a person's first, middle, and last
		//names separated by spaces (like "Thomas Alva Edison").  You
		//should return the string with the first, middle, and last
		//initials of the person' with this fullName.  For example,
		//if fullName was "Thomas Alva Edison", you should return
		//the string "T.A.E."

		//use a StringTokenizer (or split) to break up the name into
		//pieces)
	}

	public static void printInitials(String[] allNames) {
		//WRITE THIS METHOD SECOND

		//allNames is an array of strings, where each element is
		//someone's full name (first, middle, last separated by spaces).

		//Loop through allNames, and for each element, print the
		//initials corresponding to that name.  You should call
		//getInitial on each full name to get the initials.  Then,
		//print the return value you get back from printInitials.
	}

	public static String[] getNames(String filename) throws IOException {
		//THIS METHOD IS FINISHED

		Scanner inFile = new Scanner(new File(filename));
		int size = Integer.parseInt(inFile.nextLine());
		String[] arr = new String[size];

		for (int i = 0; i < size; i++) {
			arr[i] = inFile.nextLine();
		}

		inFile.close();

		return arr;
	}

	public static void main(String[] args) throws IOException {
		//WRITE THIS METHOD LAST

		Scanner s = new Scanner(System.in);
		System.out.print("Enter the name of the input file: ");
		String fname = s.nextLine();

		//This calls the getNames method to get back an array of
		//names from the file
		String[] names = getNames(fname);

		//YOU DO THIS: call printInitials (passing the names
		//array) to print the initials for each name.  You should
		//have just ONE line of code to call that method
	}
}