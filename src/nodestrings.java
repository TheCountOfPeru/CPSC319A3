
public class nodestrings {
	private String name;
	private nodestrings next;
	public nodestrings(String namea) {
		setName(namea);
		setNext(null);
	}
	public nodestrings(String namea, nodestrings nexta) {
		setName(namea);
		setNext(nexta);
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public nodestrings getNext() {
		return next;
	}
	public void setNext(nodestrings next) {
		this.next = next;
	}
	
	
}
