
public class BinarySearchTree {
	//Step 1: Instance Variable
	private Node root;
	
	//Step 2: Class Constructor
	public BinarySearchTree() {
		this.root = null;
	}
	
	//Step 3: Getters and Setters for root
	public Node getRoot() {
		return root;
	}
	
	public void setRoot(Node root) {
		this.root = root;
	}
	
	//Step 4: Create a method to call insertNode() to keep the current root
	public void insert(int key) {
		this.root = insertNode(this.root, key);
	}
	
	//Step 5: Create the insertNode() Method
	public Node insertNode(Node root, int key) {
		
		//Checks if the tree is empty, return a new node
		if (root == null) {
			root = new Node(key);
			return root;
		}
		
		//Otherwise, recur down the tree
		if (key < root.getKey()) {
			//insert a node at root's left.
			root.setLeft(insertNode(root.getLeft(), key));
		} else if (key > root.getKey()) {
			//insert a node at root's right
			root.setRight(insertNode(root.getRight(), key));
		}
		
		return root;
	}
	
	//Calls the searchNode() recursively and prints the result
	public void search(int key) {
		Node temp = searchNode(this.root, key);
		if(temp != null) {
			System.out.print("\n" + key + " was found in the tree");
		} else {
			System.out.print("\n" + key + " does not exist in the tree");
		}
	}
	
	//Recursive search 
	public Node searchNode(Node root, int key) {
		//Checks if the key is found in the BST
		if (root == null || root.getKey()==key) {
			return root;
		}
		
		//if current root's key is greater than key, go left
		if (root.getKey() > key) {
			return searchNode(root.getLeft(), key);
		}
		
		// else go right
		return searchNode(root.getRight(), key);		
	}
	
	/* In order Traversal: Left - Root - Right */
	public void printInorder(Node node) {
		
		// Check if it's a node
		if (node == null) {
			return;
		}
		
		// Recur on left
		printInorder(node.getLeft());
		
		System.out.print(node.getKey() + " ");
		
		// Recur on right
		printInorder(node.getRight());
	}
	
	/* Recurs for each node check if they are a leaf (+1) or not (+0)*/
	public int countLeaf(Node node) {
		
		// Check if it's a node
		if (node == null) {
			return 0;
		}
		
		//Checks if the node is a leaf, then counts it.
		if (node.getRight() == null && node.getLeft() == null) {
			return 1;
		}
		
		//RECURS on left and right. check if it's children is a leaf. else recur again.
		return (countLeaf(node.getLeft()) + countLeaf(node.getRight()));
	
	}
	
	/* Recurs to the left most node 
	 * (which is always the smallest in a binary search tree) 
	 */
	public Integer minimum(Node node) {
		// Check if it's a node/the top node
		if (node.getLeft() == null) {
			return node.getKey();
		}
		
		//Recurs to the left most node 
		return minimum(node.getLeft());
	}
	
	
	
}
