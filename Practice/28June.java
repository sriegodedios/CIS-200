import java.util.*;
public class June28 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter name: ");
		System.out.print("Enter first number: ");
		int x = Integer.parseInt(s.nextLine());
		System.out.print("Enter second number: ");
		int y = Integer.parseInt(s.nextLine());
		System.out.print("Enter third number: ");
		int z = Integer.parseInt(s.nextLine());
		
		double result = minimum(minimum(x, y), z); 
		// linear search:
		/*
			take an array and a value in the array and return that value	
				
		*/
		
		
		
		
		
		
		
		/*String name = s.nextLine();
		reformatName(name);
		int[] nums = {2,4,6,8};
		printArray(nums);
		int a = 7; 
		zeroInt(a);
		System.out.println(a);
		zeroArray(nums);*/
		
		
		
		//returnType result = methodCall(..)
		//get the area of 
		double area = areaRect(2.6,7.1);
		
		
	}
	
	public static void reformatName(String s){
		String[] pieces = s.split(" ");
		//print last, first middle initial.
		System.out.println(pieces[2] +", "+pieces[0]+" "+pieces[1].charAt(0)+".");
		
		
		
		
		
		
		
		
	}
	
	public static int indexOf(int[] arr, int value){
		for (int i = 0; i < arr.length; i++){
			if(arr[i]== value){
				return i;
			}
		}
		
		return -1;
	}
	
	public static void zeroInt(int x){
		x = 0;
	}
	
	public static /*type in this case double*/ double areaRect(double length, double width){
		double area = length*width;
		return area ;
		
		
		
	}
	public static /*type in this case double*/ double minimum(double num1, double num2){
		if(num1 < num2)return num1;
		
		return num2;
		
	}
	
	
	
	public static void zeroArray(int[] arr){
		// method can change original array
		for(int i = 0; i < arr.length; i++){
			arr[i] = 0;
			//declaring arrays in method passes a reference to parameters 
		}
		arr = new int[arr.length];
		//creates a new memory address and sets a new array = to 0
		
	}
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
		
		
		
		
	}
	//Stack trace
	//Program stack - record method calls
	//Program Stack prints out as methods get called
	//Program stack also keeps track of methods called as well the other of which the method is called
}
import java.util.*;
public class June28 {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		//System.out.print("Enter name: ");
		System.out.print("Enter first number: ");
		int x = Integer.parseInt(s.nextLine());
		System.out.print("Enter second number: ");
		int y = Integer.parseInt(s.nextLine());
		System.out.print("Enter third number: ");
		int z = Integer.parseInt(s.nextLine());
		
		double result = minimum(minimum(x, y), z); 
		// linear search:
		/*
			take an array and a value in the array and return that value	
				
		*/
		
		
		
		
		
		
		
		/*String name = s.nextLine();
		reformatName(name);
		int[] nums = {2,4,6,8};
		printArray(nums);
		int a = 7; 
		zeroInt(a);
		System.out.println(a);
		zeroArray(nums);*/
		
		
		
		//returnType result = methodCall(..)
		//get the area of 
		double area = areaRect(2.6,7.1);
		
		
	}
	
	public static void reformatName(String s){
		String[] pieces = s.split(" ");
		//print last, first middle initial.
		System.out.println(pieces[2] +", "+pieces[0]+" "+pieces[1].charAt(0)+".");
		
		
		
		
		
		
		
		
	}
	
	public static int indexOf(int[] arr, int value){
		for (int i = 0; i < arr.length; i++){
			if(arr[i]== value){
				return i;
			}
		}
		
		return -1;
	}
	
	public static void zeroInt(int x){
		x = 0;
	}
	
	public static /*type in this case double*/ double areaRect(double length, double width){
		double area = length*width;
		return area ;
		
		
		
	}
	public static /*type in this case double*/ double minimum(double num1, double num2){
		if(num1 < num2)return num1;
		
		return num2;
		
	}
	
	
	
	public static void zeroArray(int[] arr){
		// method can change original array
		for(int i = 0; i < arr.length; i++){
			arr[i] = 0;
			//declaring arrays in method passes a reference to parameters 
		}
		arr = new int[arr.length];
		//creates a new memory address and sets a new array = to 0
		
	}
	public static void printArray(int[] arr){
		for(int i = 0; i < arr.length; i++){
			System.out.print(arr[i]+ " ");
		}
		
		
		
		
		
		
		
		
	}
	//Stack trace
	//Program stack - record method calls
	//Program Stack prints out as methods get called
	//Program stack also keeps track of methods called as well the other of which the method is called
}
