package lists;

public class DoublyLinkedList<T> implements Listable<T>{

	private Node head;
	private Node tail;
	private int counter = 0;

	private class Node{
		T data;
		Node next;
		Node prev;
	}

	@Override
	public void add(T data) {
		Node newNode = new Node();
		newNode.data=data;
		if(getHead() == null || getTail() == null){
			setHead(newNode);
			setTail(newNode);
		}else{
			Node temp = getTail();
			temp.next = newNode;
			newNode.prev=temp;
			newNode.next = null;
			setTail(newNode);
		}
		counter ++;
	}

	@Override
	public void remove(int index) {	
		if(index >=counter || index < 0){
			return;
		}
		// deletes head
		if(index == 0){
			setHead(getHead().next);
			getHead().prev = null;
			counter --;
			return;
		}
		// deletes tail
		if(index == (counter-1)){
			setTail(getTail().prev);
			getTail().next = null;
			counter --;
			return;
		}else{
			int count = 0 ;
			Node toBeDeleted = getHead();
			while(count < index){
				toBeDeleted = toBeDeleted.next;
				count ++;
			}
			Node previous = toBeDeleted.prev;
			Node next = toBeDeleted.next;
			previous.next = next;
			next.prev= previous;
			toBeDeleted.prev = previous;
			toBeDeleted.next = next;
			counter --;
		}
	}

	@Override
	public T get(int index) {
		if(index >=counter || index < 0){
			return null;
		}
		if(index == 0){
			return getHead().data;
		}
		if (index == (counter-1)){
			return getTail().data;
		}else{
			int count = 0;
			Node temp = getHead();
			while(count < index){
				temp = temp.next;
				count ++ ;
			}
			return temp.data;
		}
	}

	@Override
	public void clear() {
		setHead(null);
		setTail(null);
		counter = 0;
	}

	@Override
	public boolean isEmpty() {
		return counter == 0;
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
		if(index < 0  || index >= counter){
			return;
		}
		Node newNode = new Node();
		newNode.data = data;
		counter++;
		if(index == 0){
			newNode.next = getHead();
			getHead().prev = newNode;
			setHead(newNode);
			return;
		}
		if(index == (counter-1)){
			newNode.prev = getTail();
			getTail().next = newNode;
			setTail(newNode);
			return;
		}else{
			int count = 0;
			Node temp = getHead();
			while(count < index){
				temp = temp.next;
				count ++ ;
			}
			Node previous = temp.prev;
			previous.next = newNode;
			newNode.prev = previous;
			temp.prev = newNode;
			newNode.next = temp;
		}
	}
	
	public Node getHead() {
		return this.head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getCounter() {
		return counter;
	}

	public void setCounter(int counter) {
		this.counter = counter;
	}





}
