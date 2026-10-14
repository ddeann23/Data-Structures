
/* Vertex is the node of a graph. it has a data and neighbors. 
 * 
 * 
 * 
 * */
public class Vertex {
	
	//1. Attributes
	public int data;
	private List neighbors;
	private boolean searched;
	
	//2. Constructor
	public Vertex(int data) {
		this.data = data;
		this.neighbors = new List();
		this.searched = false;
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
	
	public void setSearched(boolean check) {
		this.searched = check;
	}
	
	public boolean isSearched() {
		return searched;
	}
	
}
