import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		Graph graph = new Graph();
		boolean running = true;
		int data = 0, data2 = 0;
		
		//Initialize Graph
		graph.addVertex(1);
		graph.addVertex(2);
		graph.addVertex(3);
		graph.addVertex(4);
		graph.addVertex(5);
		
		graph.addDirectedEdge(2, 1);
		graph.addDirectedEdge(3, 1);
		graph.addDirectedEdge(2, 4);
		graph.addUndirectedEdge(3, 5);
		graph.addUndirectedEdge(5, 4);

		while (running) {
			System.out.println("\nGraph Data Structure program");
			System.out.println("1. Add Vertex");
			System.out.println("2. Add Undirected Edge");
			System.out.println("3. Add Directed Edge");
			System.out.println("4. Find Path");
			System.out.println("5. Display Neighbors");
			System.out.println("6. Exit Program");
			
			int menu = inputValidation(reader, "Enter your option: ");
			
			switch (menu) {
				case 1: //Add Vertex
					data = inputValidation(reader, "Enter vertex data: ");
					graph.addVertex(data);
					break;
				case 2: //Add Undirected Edge
					data = inputValidation(reader, "Enter first vertex: ");
					data2 = inputValidation(reader, "Enter second vertex: ");
					graph.addUndirectedEdge(data, data2);
					break;
				case 3: //Add Directed Edge
					data = inputValidation(reader, "Enter first vertex: ");
					data2 = inputValidation(reader, "Enter second vertex: ");
					graph.addDirectedEdge(data, data2);
					break;
				case 4: //Find Path
					data = inputValidation(reader, "Enter first vertex: ");
					data2 = inputValidation(reader, "Enter second vertex: ");
					 
					if (data == data2) {
						System.out.println("Please give a different vertex...");
						break;
					}
					System.out.println("The path between " + data + " and " + data2 + " is: " + (graph.findPath(data, data2) ? "TRUE" : "FALSE"));
					break;
				case 5: //Display Neighbors
					data = inputValidation(reader, "Enter vertex: ");
					graph.displayNeighbors(data);
					break;
				case 6: //Program Terminator
					running = false;
					System.out.println("Program Terminated...");
					break;
				default:
					System.out.println("Please enter a valid option (1-6)...");
					break;
			}
		}
	}
	
	// Satic Input validation method 
	public static int inputValidation(BufferedReader reader, String prompt) throws IOException {
		while (true) {
			System.out.print(prompt);
			try {
				return Integer.parseInt(reader.readLine().trim());
			} catch (NumberFormatException e) {
				System.out.println("Invalid input! Please enter a valid integer.");
			}
		}
	}

}