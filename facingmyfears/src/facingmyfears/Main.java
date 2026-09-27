package facingmyfears;

import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		DoublyLinkedList doubly = new DoublyLinkedList();
		int menu = 0;
		
		do {
			System.out.println("Redemption ahh program real");
			System.out.println("1. Append");
			System.out.println("2. Display");
			System.out.println("3. Delete");
			System.out.println("4. Insert");
			System.out.println("5. Prepend");
			
			menu = Integer.parseInt(reader.readLine());
			
			if (menu == 1) {
				System.out.print("Which data to append: ");
				int data = Integer.parseInt(reader.readLine());
				doubly.append(data);
			} else if (menu == 2) {
				System.out.println("Displaying the Node: ");
				doubly.display();;
			} else if (menu == 3) {
				System.out.print("Which index to delete: ");
				int index = Integer.parseInt(reader.readLine());
				doubly.delete(index);
			} else if (menu == 4) {
				System.out.print("Which index to insert: ");
				int index = Integer.parseInt(reader.readLine());
				System.out.print("Which data to insert: ");
				int data = Integer.parseInt(reader.readLine());
				doubly.insert(index, data);
			} else if (menu == 5) {
				System.out.print("Which data to prepend: ");
				int data = Integer.parseInt(reader.readLine());
				doubly.prepend(data);
			}
			
		} while (menu != 0);

	}

}
