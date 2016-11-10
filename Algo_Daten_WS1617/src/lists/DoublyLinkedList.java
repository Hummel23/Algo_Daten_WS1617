package lists;



public class DoublyLinkedList<T> implements Listable<T>{
	
	private Node head;
	private Node tail;
	
	private class Node{
		T data;
		Node next;
		Node prev;
	}

	@Override
	public void add(T data) {
		Node newNode = new Node();
		newNode.data=data;
		if(head == null || tail == null){
			head = newNode;
			tail = newNode;
		}else{
			Node temp = tail;
			temp.next = newNode;
			tail = newNode;
		}
	}

	@Override
	public void remove(int index) {
		if(index < this.getSize()){
			Node temp = head;
			int count = 0;
		}

		
	}

	@Override
	public T get(int index) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean isEmpty() {
		return (head == null || tail==null);
	}

	@Override
	public int getSize() {
		int count = 0;
		Node temp = head;
		while(temp!= null){
			count ++;
			temp = temp.next;
		}
		return count;
	}

	@Override
	public void printAll() {
		System.out.println(this.getClass().getSimpleName());
		Node temp = head;
		while (temp != null){
			System.out.println(temp.data);
			temp = temp.next;
		}
	}

	@Override
	public void insertAt(int index, T data) {
		// TODO Auto-generated method stub
		
	}
	

}
