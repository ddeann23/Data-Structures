package facingmyfears;

public class Node {
	private int data;
	private Node next;
	private Node prev;
	
	public Node() {
	}

	public Node(int data) {
		this.data = data;
	}
	
	public Node(int data, Node next, Node prev) {
		this.data = data;
		this.next = next;
		this.prev = prev;
	}
	
	public int getData() {
		return this.data;
	}
	
	public Node getNext() {
		return this.next;
	}
	
	public Node getPrev() {
		return this.prev;
	}
	
	public void setData(int data) {
		this.data = data;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}
	
	public void setPrev(Node prev) {
		this.prev = prev;
	}
	
}
