import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean running = true;
		int data = 0;
		BinarySearchTree tree = new BinarySearchTree();
		
//		// Initiating the tree
//		tree.insert(50);
//		tree.insert(30);
//		tree.insert(20);
//		tree.insert(40);
//		tree.insert(70);
//		tree.insert(60);
//		tree.insert(80);

		while (running) {
			System.out.println("\nBinary Search Tree (BST) program");
			System.out.println("1. Insert");
			System.out.println("2. Display");
			System.out.println("3. Search");
			System.out.println("4. Count");
			System.out.println("5. Minimum");
			System.out.println("6. Exit Program");
			
			int menu = inputValidation(reader, "Enter your option: ");
			
			switch (menu) {
				case 1: //Insert Data
					data = inputValidation(reader, "Enter the data to insert: ");
					tree.insert(data);
					break;
				case 2: //Display Inorder
					if (tree.getRoot() == null) {
						System.out.println("The Tree is Empty.");
					} else {
						System.out.print("Printing in Inorder: ");
						tree.printInorder(tree.getRoot());
						System.out.println();
					}
					break;
				case 3: //Search Data
					if (tree.getRoot() == null) {
						System.out.println("The Tree is Empty.");
					} else {
						data = inputValidation(reader, "Enter the data to search: ");
						tree.search(data);
						System.out.println();
					}
					break;
				case 4: //Leaf Counter
					if (tree.getRoot() == null) {
						System.out.println("The Tree is Empty.");
					} else {
						System.out.println("Total number of leaf nodes: " + tree.countLeaf(tree.getRoot()));
						break;
					}
				case 5: //Minimum Finder
					if (tree.getRoot() == null) {
						System.out.println("The Tree is Empty.");
					} else {
						Integer min = tree.minimum(tree.getRoot());
						if (min != null) {
							System.out.println("The smallest key is: " + min);
						}
					}
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