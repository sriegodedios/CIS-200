import java.util.*;
import java.text.*;
public class Proj1 {	
		
			
		public static void main(String[] args){
			DecimalFormat df = new DecimalFormat("#0.00");
			Scanner s = new Scanner(System.in);

				double projectWeight = opProjectsWeight();
				double labWeight = opLabsWeight();	
				
				double testWeight = opTestsWeight();
				double projectAvg = opProjectsGrade();
				double labAvg = opLabsGrade();
				double numTest = opNumTest();
				double lastTest = numTest-1;
				double testAvg = opTestsGrade();
				System.out.println("lab total is "+labWeight*labAvg);
				System.out.println("project total is "+projectWeight*projectAvg);
				System.out.println("Test total is "+(testWeight*testAvg)*(lastTest/numTest));
				double desiredGrade = opDesiredGrade();
				
				
				
				//double finalGrade = ((projectWeight*projectAvg)+(labWeight*labAvg)+((testWeight*testAvg)*(lastTest/numTest))+(testWeight*projectAvg)*100);
				double finalNeededGrade = (desiredGrade-((projectWeight*projectAvg)+(labWeight*labAvg)+((testWeight*testAvg)*(lastTest/numTest))+(testWeight*projectAvg))/(testWeight*(1/numTest)));
				System.out.println(df.format(finalNeededGrade));
				gradeCheck(desiredGrade, finalNeededGrade);
				
				
				
				
		}
		
				

		
		public static double opLabsWeight() {
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the weight for Labs (as a percentage):");
			String str1= s.nextLine();
			double labsWeight = (Double.parseDouble(str1)/100);
			return labsWeight;
		}
		
		public static double opTestsWeight(){
			Scanner a = new Scanner(System.in);
			System.out.print("Enter the weight for Tests (as a percentage):");
			String str1= a.nextLine();
			double testWeight = (Double.parseDouble(str1)/100);
			return testWeight;
		}
		
		public static double opProjectsWeight(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the weight for Projects (as a percentage):");
			String str1= s.nextLine();
			double projectWeight = (Double.parseDouble(str1)/100);
			return projectWeight;
		}
		
		public static double opProjectsGrade(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the average score earned on Projects:");
			String str1= s.nextLine();
			double projectGrade = (Double.parseDouble(str1)/100);
			return projectGrade;
		}
		
		public static double opTestsGrade(){
			
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the average score earned on Tests:");
			String str1= s.nextLine();
			double testGrade = (Double.parseDouble(str1)/100);
			return testGrade;
		}
		
		public static double opLabsGrade(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the average score earned on Labs:");
			String str1= s.nextLine();
			double labGrade = (Double.parseDouble(str1)/100);
			return labGrade;
		}
		
		public static double opNumTest(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the total number of exams in the course:");
			String str1= s.nextLine();
			double numTest = Double.parseDouble(str1);
			return numTest;
		}
		public static double opDesiredGrade(){
			Scanner s = new Scanner(System.in);
			System.out.print("Enter the desired grade in the course(As a percentage):");
			String str1= s.nextLine();
			double gradeDesired = Double.parseDouble(str1);
			return gradeDesired;
			
		}
		public static boolean gradeCheck(double desiredGrade, double finalNeededGrade){
			boolean ok = true;
			double doubleValue = desiredGrade;
			double A = 0.90;
			double B = 0.80;
			double C = 0.70;
			if (doubleValue >= A){
				System.out.println("In order to get an A(90%) you need to get a "+finalNeededGrade+"%");
				
			}
			
			if((doubleValue >=B)&&(doubleValue < B)){
				System.out.println("In order to get an B(*80%) you need to get a "+finalNeededGrade+"%");
			}
			
			if ((doubleValue >=B)&&(doubleValue < B)){
				System.out.println("In order to get an C(70%) you need to get a "+finalNeededGrade+"%");
			}
			
			return true;
			
			
		}
		
}	
	
	
	
	
	
	

