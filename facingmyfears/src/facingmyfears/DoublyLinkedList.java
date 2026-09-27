package facingmyfears;

public class DoublyLinkedList {
	private Node head;
	private int size = 0;
	
	public void append(int data) {
		Node newNode = new Node();
		newNode.setData(data);
		
		if (isEmpty()) {
			head = newNode;
			newNode.setNext(newNode);
			newNode.setPrev(newNode);
			size++;
		} else {
			newNode.setNext(head);
			newNode.setPrev(head.getPrev());
			head.getPrev().setNext(newNode);
			head.setPrev(newNode);
			size++;
		}
	}
	
	public void display() {
		if (head == null) {
			System.out.println("The list is empty!");
			return;
		} else {
			Node current = head;
			do {
				System.out.print(current.getData() + " <-> ");
				current = current.getNext();
			} while (current != head);
			
			System.out.println("Head: (" + head.getData() + ")");
		}
	}
	
	public void delete(int index) {
		if (isEmpty()) {
			System.out.println("The list is empty!"); 
			return;
		}
		
		if (index >= size || index < 0) {
			System.out.println("Invalid index location.");
			return;
		}
		
		if (index == 0){
			if (head.getNext() == head) {
				head = null;
				size = 0;
				System.out.println("The list is deleted");
				return;
			} else {
				head = head.getNext();
				Node tail = head.getPrev().getPrev();
				head.getPrev().getPrev().setNext(head);
				head.getPrev().setNext(null);
				head.getPrev().setPrev(null);
				head.setPrev(tail);
				size--;
				return;
			}
		}
		
		Node current = head;
		for(int i = 0; i < index; i++) {
			current = current.getNext();
		}
			
		current.getPrev().setNext(current.getNext());
		current.getNext().setPrev(current.getPrev());
		size--;
		
	}
	
	public void insert(int index, int data) {	
		if (index >= size || index < 0) {
			System.out.println("Invalid index location.");
			return;
		}
		
		if (index == 0){
			prepend(data);
			return;
		}
		
		Node current = head;
		for(int i = 0; i < index; i++) {
			current = current.getNext();
		}
			
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(current);
		newNode.setPrev(current.getPrev());
		current.getPrev().setNext(newNode);
		current.setPrev(newNode);
		size++;
	}
	
	public void prepend(int data) {
		if (isEmpty()) {
			append(data);
			return;
		}
		
		Node newNode = new Node();
		newNode.setData(data);
		newNode.setNext(head);
		newNode.setPrev(head.getPrev());
		head.getPrev().setNext(newNode);
		head.setPrev(newNode);
		head = newNode;
		size++;
	}
	
	public boolean isEmpty() {
		return head == null;
	}
}
