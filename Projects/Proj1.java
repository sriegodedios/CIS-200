import java.util.*;
import java.text.*;
/**
 *CIS 200 Project 1 Final Score Calculator
 *
 *		Note: I have a moderate Java programming background and I decided to use methodes even though we havent learned them yet, 
 *			  for me its mucu easier to keep track of where everything is.
 *
 *@author Shane Riegodedios
 *@Version 1.0
 */
public class Proj1 {	
		
			
		public static void main(String[] args){
				DecimalFormat df = new DecimalFormat("#0.00");
				Scanner s = new Scanner(System.in);
				System.out.println("######################################################");
				System.out.println(" ");
				System.out.println("This is a calculator that is designed to help you calculate what you need on");
				System.out.println("the final to get the your desired grade.");
				System.out.println(" ");
				System.out.println("DISCLAIMER: This will not always be accurate as calculation of grade are based");
				System.out.println("            by instructor. This is only a tool  to help you make an educated");
				System.out.println("            guess on your final grades.");
				System.out.println(" ");
				System.out.println("            We are not responsible if your grades go down...");
				System.out.println(" ");
				System.out.println("######################################################");
				double projectWeight = opProjectsWeight(); //Weight of Projects
				double labWeight = opLabsWeight();	 //Weight of Labs
				double testWeight = opTestsWeight(); //Weight of Tests
				double projectAvg = opProjectsGrade(); //Average grade of Projects
				double labAvg = opLabsGrade(); //Average grade of Projects
				double numTest = opNumTest(); //Number of Test in the class
				double lastTest = numTest-1; //Number of Test-1 to make a fraction 
				double testAvg = opTestsGrade(); //Average grade of Projects
				//Call each method and assigns each return to a variable with through user input
				double A = 90;
				double B = 80;
				double C = 70;
				//This is configures the grades note that each variable is the actual grade letter itself with the assigned number

				double finalNeededGradeA = (A-((projectWeight*projectAvg)+(labWeight*labAvg)+((testWeight*testAvg)*(lastTest/numTest))+(testWeight*projectAvg))/(testWeight*(1/numTest))); //Calculation for "A"
				double finalNeededGradeB = (B-((projectWeight*projectAvg)+(labWeight*labAvg)+((testWeight*testAvg)*(lastTest/numTest))+(testWeight*projectAvg))/(testWeight*(1/numTest))); //Calculation for "B"
				double finalNeededGradeC = (C-((projectWeight*projectAvg)+(labWeight*labAvg)+((testWeight*testAvg)*(lastTest/numTest))+(testWeight*projectAvg))/(testWeight*(1/numTest))); //Calculation for "C"
				//Calculates Each of the Grades
				
				System.out.println("In order to get an A(90%) you need to get a "+df.format(finalNeededGradeA)+"%"); //Prints the Percentage needed on final to get an "A" in the class
				System.out.println("In order to get an B(80%) you need to get a "+df.format(finalNeededGradeB)+"%"); //Prints the Percentage needed on final to get an "B" in the class
				System.out.println("In order to get an C(70%) you need to get a "+df.format(finalNeededGradeC)+"%"); //Prints the Percentage needed on final to get an "C" in the class
				
				// End of fuction of program
		}
		
				

		
		public static double opLabsWeight() {
			System.out.println(" ");
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the weight for Labs (as a percentage): ");
			String str1= s.nextLine();
			double labsWeight = (Double.parseDouble(str1)/100);
			return labsWeight;
		}
		
		public static double opTestsWeight(){
			System.out.println(" ");
			Scanner a = new Scanner(System.in);
			System.out.print("Enter the weight for Tests (as a percentage): ");
			String str1= a.nextLine();
			double testWeight = (Double.parseDouble(str1)/100);
			return testWeight;
		}
		
		public static double opProjectsWeight(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the weight for Projects (as a percentage): ");
			String str2= s.nextLine();
			double projectWeight = (Double.parseDouble(str2)/100);
			return projectWeight;
		}
		
		public static double opProjectsGrade(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the average score earned on Projects: ");
			String str1= s.nextLine();
			double projectGrade = (Double.parseDouble(str1)/100);
			return projectGrade;
		}
		
		public static double opTestsGrade(){
			
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the average score earned on Tests: ");
			String str1= s.nextLine();
			double testGrade = (Double.parseDouble(str1)/100);
			return testGrade;
		}
		
		public static double opLabsGrade(){
			Scanner s = new Scanner(System.in);
			System.out.println(" ");
			System.out.print("Enter the average score earned on Labs: ");
			String str1= s.nextLine();
			double labGrade = (Double.parseDouble(str1)/100);
			return labGrade;
		}
		
		public static double opNumTest(){
			Scanner s = new Scanner(System.in);
			System.out.println(" ");
			System.out.print("Enter the total number of exams in the course: ");
			String str1= s.nextLine();
			double numTest = Double.parseDouble(str1);
			return numTest;
		}
		public static double opDesiredGrade(){
			Scanner s = new Scanner(System.in);
			System.out.println(" ");
			System.out.print("Enter the desired grade in the course(As a percentage):");
			String str1= s.nextLine();
			double gradeDesired = Double.parseDouble(str1);
			return gradeDesired;
			
		}
		/* public static boolean gradeCheck(double desiredGrade, double finalNeededGrade){
			boolean ok = true;
			DecimalFormat df = new DecimalFormat("#0.00");
			double doubleValue = desiredGrade;
			double A = 0.90;
			double B = 0.80;
			double C = 0.70;
			if (doubleValue >= A){
				System.out.println("In order to get an A(90%) you need to get a "+df.format(finalNeededGrade)+"%");
				
			}
			
			if((doubleValue >=B)&&(doubleValue < A)){
				System.out.println("In order to get an B(*80%) you need to get a "+df.format(finalNeededGrade)+"%");
			}
			
			if ((doubleValue >=C)&&(doubleValue < B)){
				System.out.println("In order to get an C(70%) you need to get a "+df.format(finalNeededGrade)+"%");
			} */
			//This unused
			

			
			
		//}
		
		
		
}	