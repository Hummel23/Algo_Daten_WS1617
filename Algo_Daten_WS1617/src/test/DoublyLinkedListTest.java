package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import data.Student;
import lists.DoublyLinkedList;

public class DoublyLinkedListTest {

	DoublyLinkedList<Student> list = new DoublyLinkedList<>();

	@Before
	public void setUp(){
		for (int i = 0; i < 5; i++) {
			list.add(new Student("firstname " + i, "lastname " + i, i, i, i));
		}
	}
	@Test
	public void testAddGetSize() {
		assert(list.get(0).getPrename().equals("firstname 0"));
		assert(list.get(5)==null);
		assert(list.get(3).getPrename().equals("firstname 3"));
		assert(list.get(2).getGender()==2);
		assert(list.getSize()==5);
		assert(list.get(-2)==null);
		
	}
	
	@Test
	public void testRemove(){
		list.remove(0);
		assert(list.get(0).getSurname().equals("lastname 1"));
		assert(list.getSize()==4);
		assert(list.get(4)==null);
		assert(list.get(3).getMn()==4);
		
		list.remove(3);
		assert(list.getSize()==3);
		assert(list.get(3)==null);
		assert(list.get(2).getCourse()==3);
		assert(list.get(0).getGender()==1);
		
		list.remove(1);
		assert(list.getSize()==2);
		assert(list.get(0).getCourse()==1);
		assert(list.get(1).getGender()==3);
		assert(list.get(2)==null);

		
	}
	
	@Test
	public void testClearEmptySize(){
		assert(list.getSize()==5);
		list.clear();
		assert(list.getHead()==null);
		assert(list.getTail()== null);
		assert(list.getSize()==0);
		assert(list.isEmpty());		
	}

}
