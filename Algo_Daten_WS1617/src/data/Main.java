package data;

import lists.DoublyLinkedList;
import lists.Listable;
import lists.SinglyLinkedList;

public class Main {

	public static void main(String[] args) {
		
		
		Student s1 = new Student("hans", "peter", 3, 1, 4);
		Student s2 = new Student("micky", "mouse", 1, 1, 0);
		Student s3 = new Student("Peter", "Pan", 3,0, 0);
		
		Listable <Student> list = new SinglyLinkedList<>();
//		Listable <Student> list = new DoublyLinkedList<>();
		
		list.add(s1);
		list.add(s2);
		list.add(s3);
		
		list.printAll();
		System.out.println("Size: " + list.getSize());
		
	}

}
