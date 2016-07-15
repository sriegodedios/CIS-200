import java.util.*;
import java.io.*;
	
public class Proj4 {
	public static Scanner s = new Scanner(System.in);
	public static Scanner inputFile;
	public static String[] cities; 
	public static int[][] mileage;
	public static boolean[] visited; 
	public static int[] prev; 
	public static int[] dist;
	public static int size;
	public static void main(String[] args) throws IOException { 
		char answer = 'N';
		do{
			System.out.println("\n File hard coded in ");
			System.out.println();	
			inputFile = new Scanner(new File("cities.txt"));
			size = Integer.parseInt(inputFile.nextLine());
		
			//Sets up each array
		
		
			cities = new String[size];
			mileage = new int[size][size];
			visited = new boolean[size];
			prev = new int[size];
			dist = new int[size];
		
			//loops to add each city
			inputFile.nextLine();
			for(int i = 0; i < cities.length; i++){
				cities[i] = inputFile.nextLine();
		
			
			
			
			
			
			}

			
		
			inputFile.nextLine();
			for(int i = 0; i < size; i++){
				for(int k = 0; k < size; k++){
					mileage[i][k]= Integer.MAX_VALUE;
				
				
				
				}
			}
		
		
			while(inputFile.hasNextLine()){
				String line = inputFile.nextLine();
		
				if(line.isEmpty()){
					continue;
				}else{
				
					String[] data = line.split("(,)|(:)");
				
					int firstCity = Arrays.asList(cities).indexOf(data[0]);
					int lastCity = Arrays.asList(cities).indexOf(data[1]);
					int miles = Integer.parseInt(data[2]);
				
					mileage[firstCity][lastCity]= miles;
				}
			}
			inputFile.close();
		
	//should read the input file, create the arrays, //get pairs of cities from the user, and call
	//appropriate methods to get the value of the shortest path
			String Fname = "O";
			String Lname = "O"; 
			boolean noGo = false;
			do{
				System.out.print(" Enter the first city: ");
				Fname = s.nextLine();
				int startIndex = index(Fname);
				System.out.print(" Enter the last city: ");
				Lname = s.nextLine();
				if(checkValidCity(Fname)==true&&checkValidCity(Lname)==true){
					noGo = true;
					continue;
				}else{
					System.out.println();
					System.out.println(" Invalid city name(s)");
					System.out.println();
					continue;
				}
				
				
				
				
			}while(noGo!=true);
				System.out.println();	
				
				
				
				
				inti(Fname);
		
				dijkstra(Fname);
				print(Fname, Lname);
				
		 
				System.out.print("\n Another Pair? (Y/N): ");
				answer = s.nextLine().charAt(0);
		 	
		 	
		}while(answer == 'Y');
	
	
	
	} 
	
	
	
	
	
	public static int index(String name) {
		int index = 0;
		for(int i = 0; i < size; i++){
			if(cities[i].equals(name)){
				index = i;
				
			
			}
			
			
			
			
		}
		
		
		
		
	//should return the index of name in the cities array
		return index;
	}
	public static void inti(String start) {
		
		//initlize visit to false
		for(int i = 0; i < cities.length; i++){
			prev[i]= -1;
			
					
			
			
		}

		for(int i = 0; i < cities.length; i++){
			dist[i] = Integer.MAX_VALUE;
		}
		dist[index(start)]=0;
	//should initialize the values in the dist and prev arrays 
	//start is the name of the starting city
		
		
	} 
	public static int minIndex() {
	//should return the index of the unvisited city //with minimum dist
	//REMOVE WHEN COMPLETE
		int min = Integer.MAX_VALUE;
		int index = 0;
		for(int i = 0; i < size; i++){
			if(visited[i] == false){
				if(dist[i]< min){
					min = dist[i];
					index = i;
				}
			}
		}
		return index;
	} 
	
	public static boolean done() {
		boolean go = true;
		for(int i = 0; i < size; i++){
			if(visited[i]==false){
				return false;
			}
			
	//returns whether all cities have been visited
	//REMOVE WHEN COMPLETE return false;
		
	}
		return true;
}
	public static void print(String start, String stop) { 
		//prints the shortest path from start city //to stop city, plus the total distance
		StringBuilder build = new StringBuilder(stop);
		int cur = index(stop);
		
		while (cur != index(start)) {
			cur = prev[cur];
			build.insert(0, cities[cur]+"->");
			
		}
		/*System.out.print(start +"->");
		for(int i = 0; i< visited.length; i++){
			if(prev[i] > i){
				System.out.print(cities[i] +"->");
			}
			
		}*/
		//print the stringnuilder
		System.out.print(" "+build+", distance "+dist[index(stop)]+" miles");
		System.out.println();	
		//vxvxv
	}
	
	public static boolean checkValidCity(String city){
		for(int i = 0; i < cities.length; i++){
			if(cities[i].equals(city)){
				return true;
			}
			
			
		}
		
		
		return false;
	}
	
	
	
	
	public static void dijkstra(String start) {
	//implements dijkstra's algorithm starting at start city 
		//call the init, minIndex, and done methods to help you
		inti(start);
		while(!done()){
				int x = minIndex();
				visited[x]=true;
				
				for(int j = 0; j < cities.length; j++){
					if(visited[j] == false){
						if(mileage[x][j] != Integer.MAX_VALUE){
							int dy = dist[x] + mileage[x][j];
							if(dy < dist[j]){
								dist[j] = dy;
								prev[j] = x;
							}
						}
					}
				}
				
			}
	}

}

