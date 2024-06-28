package practice;

public class Trees {

	public static void main(String[] args) {

		TNode a = new TNode('a', null, null);
		TNode b = new TNode('b', null, null);
		TNode f = new TNode('f', null, null);
		TNode g = new TNode('g', null, null);
		TNode c = new TNode('c', a, b);
		TNode e = new TNode('e', f, g);
		TNode d = new TNode('d', c, e);
		TNode t1 = d;

		TNode h = new TNode('h', null, null);
		TNode i = new TNode('i', h, null);
		TNode j = new TNode('j', i, null);
		TNode k = new TNode('k', j, null);
		TNode t2 = k;

		preOrderTraversal(d);
		System.out.println();
		inOrderTraversal(d);
		System.out.println();
		postOrderTraversal(d);
		System.out.println();
		preOrderTraversal(k);
		System.out.println();
		inOrderTraversal(k);
		System.out.println();
		postOrderTraversal(k);
		System.out.println();

		System.out.println("Same Shape t1 t1:" + sameShape(t1, t1));
		System.out.println("Same Shape t1 t2:" + sameShape(t1, t2));
	}

	private static boolean sameShape(TNode t1, TNode t2) {
		if (t1 == null && t2 == null) {
			return true;
		}
		if (t1 != null && t2 == null || t1 == null && t2 != null) {
			return false;
		}
		return sameShape(t1.getLeft(), t2.getLeft()) && sameShape(t1.getRight(), t2.getRight());
	}

	private static void postOrderTraversal(TNode d) {
		if (d == null)
			return;
		postOrderTraversal(d.getLeft());
		postOrderTraversal(d.getRight());
		System.out.print(d.getValue());
		System.out.print('-');
	}

	private static void preOrderTraversal(TNode d) {
		if (d == null)
			return;
		System.out.print(d.getValue());
		System.out.print('-');
		preOrderTraversal(d.getLeft());
		preOrderTraversal(d.getRight());

	}

	private static void inOrderTraversal(TNode d) {
		if (d == null)
			return;
		inOrderTraversal(d.getLeft());
		System.out.print(d.getValue());
		System.out.print('-');
		inOrderTraversal(d.getRight());
	}

}

class TNode {
	char value;
	TNode left, right;

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public TNode getLeft() {
		return left;
	}

	public void setLeft(TNode left) {
		this.left = left;
	}

	public TNode getRight() {
		return right;
	}

	public void setRight(TNode right) {
		this.right = right;
	}

	public TNode(char value, TNode left, TNode right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
}
