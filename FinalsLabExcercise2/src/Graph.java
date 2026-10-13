//A Graph object with a list of vertices.

public class Graph {
	//1. Attributes
	private List vertices;
	
	//2. Constructors
	public Graph() {
		this.vertices = new List();
	}
	
	//3. Add Vertex
	public void addVertex(int data) {
		Vertex vertex = new Vertex(data);
		vertices.add(vertex);
	}
	
	//4. Find Vertex
	public Vertex findVertex(int data) {
		for (int i = 0; i < vertices.getSize(); i++) {
			if (vertices.getVertex(i).getData() == data) {
				return vertices.getVertex(i);
			}
		}
		
		return null;
	}
	
	//5. Adds Edge when data 1 and data 2 is found in any vertex.
	public void addUndirectedEdge(int data1, int data2) {
		Vertex v1 = findVertex(data1);
		Vertex v2 = findVertex(data2);
		
		if (v1 != null && v2 != null) {
			v1.getNeighbors().add(v2);
			v2.getNeighbors().add(v1);
		} else {
			System.out.println("One or more vertices are not found.");
		}
	}
	
	// Copy pasted Unidirected Edge but remove backwards
	public void addDirectedEdge(int data1, int data2) {
		Vertex v1 = findVertex(data1);
		Vertex v2 = findVertex(data2);
		
		if (v1 != null && v2 != null) {
			v1.getNeighbors().add(v2);
		} else {
			System.out.println("One or more vertices are not found.");
		}
	}
	
	//6. Display vertices and its neighbors
	public void displayGraph() {
		for(int i = 0; i < vertices.getSize(); i++) {
			System.out.print("\nVertex: " + vertices.getVertex(i).getData());
			System.out.print("\nNeighbors: ");
			for (int j = 0; j < vertices.getVertex(i).getNeighbors().getSize(); j++) {
				System.out.print(vertices.getVertex(i).getNeighbors().getVertex(j).getData() + " ");
			}
			System.out.println();
		}
	}
	
	//7. Find Path
	public boolean findPath(int data1, int data2) {
		Vertex v1 = findVertex(data1);
		Vertex v2 = findVertex(data2);
		
		if (v1 != null && v2 != null) {
			
		} else {
			System.out.println("One or more vertices are not found.");
		}
		
		return false;
	}
	
	
	//. Display Neighbors
	public void displayNeighbors(int data) {
		Vertex v = findVertex(data);
		
		if (v != null) {
			boolean hasNeighbors = false;
			System.out.print("Neighbors: ");
			for (int i = 0; i < v.getNeighbors().getSize(); i++) {
				System.out.print(v.getNeighbors().getVertex(i).getData() + " ");
				hasNeighbors = true;
			}
			
			if (hasNeighbors == false) {
				System.out.print("Null");
			}
			
			System.out.println();
		} else {
			System.out.println("Vertex not found.");
		}
	}
}
