package lists;

public interface Listable <T> {

	public void add(T data);
	
	public void remove(int index);
	
	public T get(int index);
	
	public void clear();
	
	public boolean isEmpty();
	
	public int getSize();
	
	public void printAll();
	
	public void insertAt(int index, T data);
	
	public void printOne(T data);

}
