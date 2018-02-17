/*
 * Node class for a binary search tree
 */
public class Node {
	private char opcode;
	private int studentnum;
	private String lastname;
	private String department;
	private String program;
	private int year;
	private Node left, right;
	
	public Node() {
		left = right = null;
	}
	public Node(char opcd, int snum, String lnam, String dep, String prog, int yr) {
		this(opcd, snum, lnam, dep, prog, yr, null, null);
	}
	public Node(char opcd, int snum, String lnam, String dep, String prog, int yr, Node lt, Node rt) {
		opcode = opcd;
		studentnum = snum;
		lastname= lnam;
		department = dep;
		program = prog;
		left = lt;
		right = rt;
	}
}
