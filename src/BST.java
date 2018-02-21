/*
 * Adapted from CPSC 319 lecture notes
 * Recursively visiting all nodes: Depth-first.
 */
public class BST {
	private Node root;
	
	public BST() {
		root = null;
	}
	public void insert(char opcd, int snum, String lnam, String dep, String prog, int yr) {
		Node current = root, parent = null;
		while(current != null) {
			parent = current;
			if(lnam.compareTo(current.getLastname()) > 0)
				current = current.getRight();
			else
				current = current.getLeft();
		}
		if(root == null)
			root = new Node(opcd, snum, lnam, dep, prog, yr, null, null, parent);
		else if(lnam.compareTo(parent.getLastname())>0)
			parent.setRight(new Node(opcd, snum, lnam, dep, prog, yr, null, null, parent));
		else
			parent.setLeft(new Node(opcd, snum, lnam, dep, prog, yr, null, null, parent));
	}
	
	public void depthfirst(Node current) {
		if(current != null) {
			depthfirst(current.getLeft());
			current.visit();
			depthfirst(current.getRight());
		}
	}
	
	public void breadthfirst() {
		Node p = root;
		myqueue queue = new myqueue();
		if (p != null) {
			queue.enqueue(p);
			while (!queue.isEmpty()) {
			p =  (Node) queue.dequeue();
			p.visit();
			if (p.getLeft() != null)
			queue.enqueue(p.getLeft());
			if (p.getRight() != null)
			queue.enqueue(p.getRight());
			}
		}
	}
}
