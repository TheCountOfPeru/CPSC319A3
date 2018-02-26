
public class mylinkedliststrings {
	private nodestrings head;
	private nodestrings tail;
	public mylinkedliststrings() {
		setHead(tail = null);
	}
	public nodestrings getHead() {
		return head;
	}
	public void setHead(nodestrings head) {
		this.head = head;
	}
	public nodestrings getTail() {
		return tail;
	}
	public void setTail(nodestrings tail) {
		this.tail = tail;
	}
	public boolean isEmpty() {
		return getHead() == null;
	}
	public void addToTail(String el) {
		if (!isEmpty()) {
			tail.setNext(new nodestrings(el));
			tail = tail.getNext();
		}
		else 
			setHead(tail = new nodestrings(el));
	}
}
