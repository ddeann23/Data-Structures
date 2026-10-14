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
		
		//Checker if the data is already added
		for (int i = 0; i < vertices.getSize(); i++) {
			if (vertices.getVertex(i).getData() == data) {
				System.out.println("The data is already in the graph.");
				return;
			}
		}
		
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
	/*The most complex thing i've ever did. 
	 * 1. Checks if current vertex is the destination.
	 * 2. If not, Tags the vertex "searched" to prevent infinite loop later.
	 * 3. Runs a recursion on every neighbor of the current vertex until found.
	 * 4. Runs resetter after every neighbor is checked to reset state for future use.
	 * */
	public boolean findPath(int data1, int data2) {
		boolean found = false;
		Vertex v1 = findVertex(data1);
		Vertex v2 = findVertex(data2);
		
		if (v1 != null && v2 != null) {
			found = finder(v1, v2);
		} else {
			System.out.println("One or more vertices are not found.");
		}
		
		resetter();
		
		return found;
	}

	private boolean finder(Vertex current, Vertex destination) {
		
		//Goal to check
		if (current.getData() == destination.getData()) {
			return true;
		}
		
		current.setSearched(true);
		
		List neighbors = current.getNeighbors();

		for (int i = 0; i < neighbors.getSize(); i++) {
			Vertex neighbor = neighbors.getVertex(i);
			
			if (neighbor != null && neighbor.isSearched() == false) {
				if (finder(neighbor, destination)) {
					return true;
				}
			}
		}
		
		return false;
		
	}
	
	private void resetter() {
		for(int i = 0; i < vertices.getSize(); i++) {
			vertices.getVertex(i).setSearched(false);
		}
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
