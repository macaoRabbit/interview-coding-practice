package practice;

public class List2<T> {

	// TODO Auto-generated method stub
	public static void main(String[] args) {
		final LNode a = new LNode('a', null);
		final LNode b = new LNode('b', a);
		final LNode c = new LNode('c', b);
		final LNode d = new LNode('d', c);
		LNode head = d;
		printList(head);
		head = reverse(head);
		printList(head);
	}

	private static LNode reverse(LNode head) {
		if (head == null || head.getNext() == null)
			return head;
		LNode prev, current, next;
		prev = null;
		current = head;
		do {
			next = current.getNext();
			current.setNext(prev);
			prev = current;
			current = next;
		} while (current != null);
		return prev;
	}

	private static void printList(LNode d) {
		LNode e = d;
		while (e != null) {
			System.out.print("-" + (char) e.v);
			e = e.getNext();
		}
		System.out.println();
	}
}

class LNode {
	char v;
	LNode next;

	public LNode(char v, LNode next) {
		super();
		this.v = v;
		this.next = next;
	}

	public char getV() {
		return v;
	}

	public void setV(char v) {
		this.v = v;
	}

	public LNode getNext() {
		return next;
	}

	public void setNext(LNode next) {
		this.next = next;
	}
}