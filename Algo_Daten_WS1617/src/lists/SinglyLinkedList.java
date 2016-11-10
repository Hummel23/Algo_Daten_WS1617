package lists;

public class SinglyLinkedList<T> implements Listable<T>{
	private Node head;
	
	private class Node{
		T data;
		Node next;
	}
	
	@Override
	public void add(T data) {
		Node newNode = new Node();
		newNode.data = data;
		newNode.next = null;
		
		if(head == null){
			head = newNode;
		}else{
			Node temp = head;
			while(temp.next != null){
				temp=temp.next;
			}
			temp.next = newNode;
		}
	}

	@Override
	public void remove(int index) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public T get(int index) {
		int count=0;
		Node temp = head;
		while(temp != null){
			if(count == index){
				return temp.data;
			}
			count ++;
			temp = temp.next;
		}
		return null;
	}

	@Override
	public void clear() {
		head=null;		
	}

	@Override
	public boolean isEmpty() {
		return (head==null);
	}

	//Zählervariable in der Klasse, die beim Hinzufügen und Entfernen hoch-/runterzählt ist perfomanter. 
	
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
		Node newNode = new Node();
		newNode.data=data;
		
		while(head!=null){
			
		}
	}

}
