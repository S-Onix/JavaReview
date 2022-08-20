package datastructure;

public class LinkedListImpl<T> {
	private Node<T> head;
	int count;

	public Node<T> addElement(T data) {

		Node<T> newNode = new Node<T>(data);

		if (head == null) {
			head = newNode;
		} else {
			Node<T> curNode = head;
			while (curNode.next != null) {
				curNode = curNode.next;
			}
			curNode.next = newNode;
		}

		count++;
		return newNode;
	}
	
	public Node<T> insertElement(int position, T data) {
		int tempCnt = 0;
		Node<T> curNode = head;
		
		while(tempCnt != position) {
			curNode = curNode.next;
			tempCnt++;
		}
		
		Node<T> insertNode = new Node<T>(data);
		Node<T> tempNode = curNode.next;
		
		insertNode.next = tempNode;
		curNode.next = insertNode;
		
		return insertNode;
	}

}

class Node<T> {
	private T data;
	public Node<T> next;

	public Node() {
		this.data = null;
		this.next = null;
	}

	public Node(T value) {
		this.data = value;
		this.next = null;
	}

	public Node(T value, Node<T> link) {
		this.data = value;
		this.next = link;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNext() {
		return next;
	}

	public void setNext(Node<T> next) {
		this.next = next;
	}
}
