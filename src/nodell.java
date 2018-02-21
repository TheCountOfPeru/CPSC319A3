/*
 * Adapted from CPSC 319 lecture notes
 */
public class nodell {
	private Node BSTnd;
	private nodell next;
	public nodell(Node BSTndA) {
		setBSTnd(BSTndA);
		setNext(null);
	}
	public nodell(Node BSTndA, nodell nextA) {
		setBSTnd(BSTndA);
		setNext(nextA);
	}
	public Node getBSTnd() {
		return BSTnd;
	}
	public void setBSTnd(Node bSTnd) {
		BSTnd = bSTnd;
	}
	public nodell getNext() {
		return next;
	}
	public void setNext(nodell next) {
		this.next = next;
	}
	
}
