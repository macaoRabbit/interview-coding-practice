package practice;

public class Tree {

	public static void main(String[] args) {
		TreeNode a = new TreeNode('a', null, null);
		TreeNode b = new TreeNode('b', null, null);
		TreeNode f = new TreeNode('f', null, null);
		TreeNode g = new TreeNode('g', null, null);
		TreeNode c = new TreeNode('c', a, b);
		TreeNode e = new TreeNode('e', f, g);
		TreeNode d = new TreeNode('d', c, e);
		preOrderTraversal(d);
		System.out.println();
		inOrderTraversal(d);
		System.out.println();
		postOrderTraversal(d);
		System.out.println();
		System.out.println("Tree Height: " + height(d));
		System.out.println("Tree Height: " + nodeCount(d));
		TreeNode root = null;
		TreeNode t = new TreeNode('t', null, null);
		TreeNode u = new TreeNode('u', null, null);
		TreeNode v = new TreeNode('v', null, null);
		TreeNode x = new TreeNode('x', null, null);
		root = insert(root, root, t);
		root = insert(root, root, u);
		root = insert(root, root, v);
		root = insert(root, root, x);
		inOrderTraversal(root);
		System.out.println();
		root = null;
		TreeNode h = new TreeNode('h', null, null);
		TreeNode i = new TreeNode('i', null, null);
		TreeNode j = new TreeNode('j', null, null);
		TreeNode k = new TreeNode('k', null, null);
		root = insert(root, root, i);
		root = insert(root, root, j);
		root = insert(root, root, h);
		root = insert(root, root, k);
		inOrderTraversal(root);
		System.out.println();
	}

	private static TreeNode insert(TreeNode root, TreeNode current, TreeNode c) {

		if (current == null) {
			return c;
		}
		if (c.getValue() > current.getValue()) {
			if (current.getRight() == null) {
				current.setRight(c);
			} else {
				insert(root, current.getRight(), c);
			}
		} else {
			if (current.getLeft() == null) {
				current.setLeft(c);
			} else {
				insert(root, current.getLeft(), c);
			}
		}
		return root;
	}

	private static TreeNode delete(TreeNode root, TreeNode c) {

		if (root.getValue() == c.getValue() && root.getLeft() == null && root.getRight() == null)
			return null;
		TreeNode thisNode = findNode(root, c);
		if (thisNode != null) {
			TreeNode parent = findParent(root, c);
			if (thisNode.getLeft() == null && thisNode.getRight() == null) {
				if (parent.getLeft() != null && parent.getLeft().getValue() == thisNode.getValue()) {
					parent.setLeft(null);
				} else {
					parent.setRight(null);
				}
			} else {
				if (thisNode.getRight() != null) {
					TreeNode rightMost = findAndKillRightLeast(thisNode);
					thisNode.setValue(rightMost.getValue());
				} else {
					TreeNode leftMost = findAndKillLeftMost(thisNode);
					thisNode.setValue(leftMost.getValue());
				}
			}
		}
		return root;
	}

	private static TreeNode findAndKillLeftMost(TreeNode thisNode) {
		// TODO Auto-generated method stub
		return null;
	}

	private static TreeNode findAndKillRightLeast(TreeNode thisNode) {
		// TODO Auto-generated method stub
		return null;
	}

	private static TreeNode findParent(TreeNode root, TreeNode c) {
		// TODO Auto-generated method stub
		return null;
	}

	private static TreeNode findNode(TreeNode root, TreeNode c) {
		// TODO Auto-generated method stub
		return null;
	}

	private static int nodeCount(TreeNode d) {
		if (d == null)
			return 0;
		int h = nodeCount(d.getLeft()) + nodeCount(d.getRight()) + 1;
		return h;
	}

	private static int height(TreeNode d) {
		if (d == null)
			return 0;
		int h = Math.max(height(d.getLeft()), height(d.getRight())) + 1;
		return h;
	}

	private static void postOrderTraversal(TreeNode d) {
		if (d == null)
			return;
		postOrderTraversal(d.getLeft());
		postOrderTraversal(d.getRight());
		System.out.print(d.getValue());
		System.out.print('-');
	}

	private static void preOrderTraversal(TreeNode d) {
		if (d == null)
			return;
		System.out.print(d.getValue());
		System.out.print('-');
		preOrderTraversal(d.getLeft());
		preOrderTraversal(d.getRight());

	}

	private static void inOrderTraversal(TreeNode d) {
		if (d == null)
			return;
		inOrderTraversal(d.getLeft());
		System.out.print(d.getValue());
		System.out.print('-');
		inOrderTraversal(d.getRight());
	}

}

class TreeNode {
	char value;
	TreeNode left, right;

	public char getValue() {
		return value;
	}

	public void setValue(char value) {
		this.value = value;
	}

	public TreeNode getLeft() {
		return left;
	}

	public void setLeft(TreeNode left) {
		this.left = left;
	}

	public TreeNode getRight() {
		return right;
	}

	public void setRight(TreeNode right) {
		this.right = right;
	}

	public TreeNode(char value, TreeNode left, TreeNode right) {
		super();
		this.value = value;
		this.left = left;
		this.right = right;
	}
}