package lists;

public class SinglyLinkedList<T> implements Listable<T>{
	private Node head;
	private int counter = 0;

	private class Node{
		T data;
		Node next;
	}

	@Override
	public void add(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;

		if(getHead() == null){
			setHead(newNode);
		}else{
			Node temp = getHead();
			while(temp.next != null){
				temp=temp.next;
			}
			temp.next = newNode;
		}
		counter ++;
	}

	@Override
	public void remove(int index) {
		if(index >= counter || index <0){
			return;
		}
		if(index == 0){
			setHead(getHead().next);
			counter --;
		}else{
			int count = 1;
			Node temp=getHead();
			while(count < index){
				temp = temp.next;
				count ++;
			}
			Node toBeDeleted= temp.next;
			temp.next = toBeDeleted.next;
			counter --;			
		}
	}

	@Override
	public T get(int index) {
		if(index >= counter || index <0){
			return null;
		}
		if(index == 0){
			return getHead().data;
		}else{
			int count=0;
			Node temp = getHead();
			while(count < index){
				temp = temp.next;
				count ++;
			}
			return temp.data;
		}
	}

	@Override
	public void clear() {
		setHead(null);
		counter = 0;
	}

	@Override
	public boolean isEmpty() {
		return (counter == 0);
	}

	@Override
	public int getSize() {
		return counter;
	}

	@Override
	public void printAll() {
		System.out.println(this.getClass().getSimpleName());
		Node temp = getHead();
		while (temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	
	@Override
	public void printOne(T data) {
		System.out.println(this.getClass().getSimpleName());
		System.out.println(data.toString());
		
	}

	@Override
	public void insertAt(int index, T data) {
		if(index > counter || index <0){
			return;
		}
		Node newNode = new Node();
		newNode.data = data;
		if(index == 0){
			newNode.next = getHead();
			setHead(newNode);
			counter ++;
		}else{
			int count = 1;
			Node temp = getHead();
			while(count < index){
				temp = temp.next;
				count ++;
			}
			
			newNode.next = temp.next;
			temp.next = newNode;
			counter ++;
		}
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

}
