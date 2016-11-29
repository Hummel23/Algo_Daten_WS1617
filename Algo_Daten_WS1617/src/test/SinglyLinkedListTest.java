package test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import data.Student;
import lists.SinglyLinkedList;

public class SinglyLinkedListTest {
	SinglyLinkedList<Student> list = new SinglyLinkedList<>();
	SinglyLinkedList<Student> listSizeOne = new SinglyLinkedList<>();
	SinglyLinkedList<Student> listSizeTwo = new SinglyLinkedList<>();
	SinglyLinkedList<Student> listSizeThree = new SinglyLinkedList<>();

	@Before
	public void setUp(){
		for (int i = 0; i < 5; i++) {
			list.add(new Student("firstname " + i, "lastname " + i, 0, 1, 2));
		}
		for (int i = 0; i < 3; i++) {
			listSizeThree.add(new Student("firstname " + i, "lastname " + i, 0, 0, 0));
		}
		for (int i = 0; i < 2; i++) {
			listSizeTwo.add(new Student("firstname " + i, "lastname " + i, 0, 1, 2));
		}
		listSizeOne.add(new Student("Micky", "Mouse", 3, 3, 3));

	}
	@Test
	public void testAddingGettingAndSize() {

		int size = list.getSize();
		assert(size == 5);
		assert(list.get(0).getPrename().equals("firstname 0"));
		assert(list.get(3).getGender() == 1);
		assert(list.get(size-1).getSurname().equals("lastname 4"));	
		
		assert (listSizeOne.getSize()==1);
		assert (listSizeTwo.getSize()==2);
		assert (listSizeThree.getSize()== 3);
		
		assertNull (listSizeOne.get(3));
		assert (listSizeTwo.get(0).getPrename().equals("firstname 0"));
		assert (listSizeThree.get(2).getMn() == 0);
		
		
	}
	
	@Test
	public void testRemoval(){
		list.remove(0);
		assert (list.getSize() == 4);
		assert (list.get(0).getPrename().equals("firstname 1"));
		
		list.remove(list.getSize()-1);
		assert (list.getSize() == 3);
		assert (list.get(4) == null);
		
		list.remove(1);
		assert (list.getSize() == 2);
		//sudents 1 and 3 left over
		assert (list.get(1).getSurname().equals("lastname 3"));
		
		list.remove(7);
		assert(list.getSize()==2);
		
		listSizeOne.remove(0);
		assertTrue(listSizeOne.isEmpty());
		assertTrue(listSizeOne.getSize()==0);
		assert(listSizeOne.get(0)==null);
		
		listSizeTwo.remove(1);
		assertTrue(listSizeTwo.getSize()==1);
		assertTrue(listSizeTwo.get(1)==null);
		
		
	}
	
	@Test
	public void testInsertAt(){
		Student student1 = new Student("Peter", "Pan", 0, 0, 7);
		Student student2 = new Student("Harry", "Potter", 1, 1, 1);
		Student student3 = new Student("Lara", "Croft", 2, 3, 2);
		assert (list.getSize()==5);
		
		list.insertAt(0, student1);
		assert (list.get(0).getSurname().equals("Pan"));
		assert(list.get(0).getGender()==0);
		assert(list.getSize()==6);
		
		list.insertAt(6, student2);
		assert (list.get(6).getPrename().equals("Harry"));
		assert(list.get(6).getGender()== 1);
		assert(list.getSize()==7);
		assert(list.get(7)==null);
		
		list.insertAt(3, student3);
		assert (list.get(3).getCourse()==2);
		assert (list.getSize()==8);
		assert(list.get(8)==null);	
		
		listSizeOne.insertAt(5, student3);
		assertTrue(listSizeOne.getSize()==1);
		listSizeOne.insertAt(0, student1);
		assertTrue(listSizeOne.get(0).getPrename().equals("Peter"));
	}
	
	@Test
	public void testClearAndIsEmpty(){
		
		list.clear();
		assert(list.getSize()==0);		
		assert(list.isEmpty()==true);
	}

}
