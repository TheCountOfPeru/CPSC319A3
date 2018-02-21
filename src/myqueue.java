/*
 * Adapted from Data Structures and Algorithms 2nd Edition, Drozdek p.153
 */
public class myqueue {
	private mylinkedlist list = new mylinkedlist();
	
	public myqueue() {
		
	}
	public boolean isEmpty() {
		return list.isEmpty();
	}
	public Object dequeue() {
		return list.deleteFromHead();
	}
	public void enqueue(Node el) {
		list.addToTail(el);
	}
}
