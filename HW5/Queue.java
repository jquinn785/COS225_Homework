
public interface Queue<T> {
	
	public void enqueue(T item);
	
	public T dequeue();
	
	// public T peek(); Commented this out because it wasn't used and was casuing an error with the linkedQueue class
	
	public boolean isEmpty();
	
	public int size();
}
