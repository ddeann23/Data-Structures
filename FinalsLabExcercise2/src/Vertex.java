
/* Vertex is the node of a graph. it has a data and neighbors. 
 * 
 * 
 * 
 * */
public class Vertex {
	
	//1. Attributes
	public int data;
	private List neighbors;
	
	//2. Constructor
	public Vertex(int data) {
		this.data = data;
		this.neighbors = new List();
	}
	
	//3. Getters Setters
	public int getData() {
		return data;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public List getNeighbors() {
		return neighbors;
	}
	
}
