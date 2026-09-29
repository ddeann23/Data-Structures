
public class QueueDataStructure {
	//Attributes
	private Node head;
	private Node tail;
	
	
	//enqueue (Simple linked list insertions)
	public void enqueue(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			head = tail = newNode;
		} else {
			tail.setNext(newNode);
			tail = newNode;
		}
		
		System.out.println("\nSuccessfully enqueued: " + data + "\n");
	}
	
	//dequeue
	public Integer dequeue() {
		
		
		if (isEmpty()) {
			System.out.println("\nThere is nothing in queue.");
			return null;
		}
		
		//Sets the first out value (head)
		Integer value = head.getData();
		
		//Saves new head 
		Node newHead = head.getNext();
		
		//Removes the head (first in, first out)
		head.setNext(null);
		
		//Sets new head;
		head = newHead;
				
		//Returns the value
		return value;
	}
	
	public void display() {
		
		if (isEmpty()) {
			System.out.println("\nThe queue is Empty.\n");
			return;
		}
		
		Node current = head;
		while (current != null) {
			System.out.print(current.getData() + " <- ");
			current = current.getNext();
		}
		
		System.out.println("Null\n");
	}
	//isEmpty
	public boolean isEmpty() {
		return head == null;
	}
	
	//peak
	public Integer peak() {
		
		if (isEmpty()) {
			System.out.println("\nThere is nothing in queue\n");
			return null;
		}
		
		return head.getData();
	}
}
