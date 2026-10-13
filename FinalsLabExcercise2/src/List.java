/*More of a dynamic array, this list can be used to store the neighbors of a 
 *vertex to simulate an edge.
 * 
 * 
 * 
 * */

public class List {
	
	//1. Attributes
	private Vertex[] vertices;
	private int size;
	
	//2. Constructors
	public List() {
		vertices = new Vertex[5];
	}
	
	//3. Add vertex method
	//Checks capacity then puts it current size, after the vertex is inserted. size +1
	public void add(Vertex vertex) {
		ensureCapacity();
		vertices[size++] = vertex;
	}
	
	/*4. Dynamic size increaser (Private)
	 * 1. If vertices is full; Create temporary array with twice the size of array.
	 * 2. Transfer the vertices into temp.
	 * 3. make temp the new vertices.
	*/
	private void ensureCapacity() {
		if (size == vertices.length) {
			Vertex[] temp = new Vertex[size * 2];
			for (int i = 0; i < size; i++) {
				temp[i] = vertices[i];
			}
			vertices = temp;
		}
	}
	
	//5. Getters
	// - Returns a vertex in the index i.
	public Vertex getVertex(int i) {
		return vertices[i];
	}
	
	//returns size
	public int getSize() {
		return size;
	}	
}
