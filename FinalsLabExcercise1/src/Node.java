
public class Node {
	// Step 1: Attributes
	private int key;
	private Node left;
	private Node right;
	
	// Step 2: Constructors 
	public Node(int key) {
		this.key = key;
		left = null;
		right = null;
	}
	
	// Step 3: Getters Setters
	public int getKey() {
		return key;
	}
	
	public void setKey(int key) {
		this.key = key;
	}
	
	public Node getLeft() {
		return left;
	}
	
	public void setLeft(Node left) {
		this.left = left;
	}
	
	public Node getRight() {
		return right;
	}
	
	public void setRight(Node right) {
		this.right = right;
	}
}
