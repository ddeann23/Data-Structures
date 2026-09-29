import java.io.*;

//To do list: make sure to add insert, delete, etc. also add the menus

public class QueueMain {
	public static void main(String[] args) throws IOException{
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
		boolean running = true;
		QueueDataStructure queue = new QueueDataStructure();
		
		while (running) {
			System.out.println("Queue Menu");
			System.out.println("1. Enqueue");
			System.out.println("2. Dequeue");
			System.out.println("3. Peak");
			System.out.println("4. Display");
			System.out.println("5. Exit Program");
			System.out.print("Enter your option:");
			
			int menu = Integer.parseInt(reader.readLine());
			switch (menu) {
				case 1:
					System.out.print("Enter the data to enqueue:");
					int data = Integer.parseInt(reader.readLine());
					queue.enqueue(data);
					break;
				case 2:
					System.out.println("\nSuccessfully dequeued: " + queue.dequeue() + "\n");
					break;
				case 3:
					System.out.println("\nThe head is: " + queue.peak() + "\n");
					break;
				case 4:
					System.out.println("Displaying the queue: ");
					queue.display();
					break;
				case 5:
					running = false;
					System.out.println("Program Terminated...");
					break;
				default:
					System.out.println("Invalid Option...");
					break;
			}
			
		}
	}
}
