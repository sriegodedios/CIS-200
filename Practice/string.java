import java.util.*;
public class string {
	public static void main(String Args[]){
		Scanner s = new Scanner(System.in);
		System.out.print("Enter your first name: ");
		String FName = s.nextLine();
		
		System.out.print("Enter your middle name: ");
		String MName = s.nextLine();
		
		char initial = MName.charAt(0);
		
		System.out.print("Enter your last name: ");
		String LName =s.nextLine();
		
		
		System.out.print("Hello "+FName+" "+initial+", "+LName);
		
		
		int index = LName.indexOf("e");
		
		System.out.println("The index of "+LName+" of \"e\" is: "+index);
		
		int bigIndex = LName.indexOf("ios");
		
		System.out.println("The big index of "+LName+" is: "+bigIndex);
		
		String sub = LName.substring(0, 5);
		
		System.out.println("Here is the substring of "+LName+": "+sub);
		// string overides 
	}
}