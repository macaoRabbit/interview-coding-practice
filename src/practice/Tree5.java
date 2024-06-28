package practice;

import java.util.ArrayList;
import java.util.List;

public class Tree5 {
    public static void main(String[] args) {
        TreeNode e = new TreeNode('e', null, null);
        TreeNode d = new TreeNode('d', null, null);
        TreeNode c = new TreeNode('c', e, null);
        TreeNode b = new TreeNode('b', d, null);
        TreeNode a = new TreeNode('a', b, c);
        TreeNode root = a;
        dfs(root); System.out.println(" <==");
        bfs(root); System.out.println(" <==");
        System.out.println("count: " + count(root));
        System.out.println("height: " + height(root));
        TreeNode x = new TreeNode('x', null, null);
        insert(root, x);
        dfs(root); System.out.println(" <==");
        bfs(root); System.out.println(" <==");
        TreeNode zero = new TreeNode('0', null, null);
        insert(root, zero);
        dfs(root); System.out.println(" <==");
        bfs(root); System.out.println(" <==");
    }
    public static void dfs(TreeNode r) {
        if (r == null) return;
        dfs(r.getLeft());
        System.out.print(r.getValue());
        System.out.print('-');
        dfs(r.getRight());
    }
    public static void bfs(TreeNode r) {
        if (r == null) return;
        List<TreeNode> queue = new ArrayList<>();
        queue.add(r);
        while (!queue.isEmpty()) {
            TreeNode t = queue.remove(0);
            System.out.print(t.getValue());
            System.out.print("-");
            if (t.getLeft() != null) queue.add(t.getLeft());
            if (t.getRight() != null) queue.add(t.getRight());
        }
    }
    public static int count(TreeNode r) {
        if (r == null) {
            return 0;
        }
        return 1 + count(r.getLeft()) + count(r.getRight());
    }

    public static int height(TreeNode r) {
        if (r == null) return 0;
        return 1 + Math.max(height(r.getLeft()), height(r.getRight()));
    }
    public static TreeNode insert(TreeNode root, TreeNode n) {
       if (root == null)  return n;
       doInsert(root, n);
       return root;
    }
    public static void doInsert(TreeNode parent, TreeNode n) {
        if (parent.getValue() > n.getValue()) {
            if (parent.getLeft() == null) {
                parent.setLeft(n);
                return;
            } else {
                doInsert(parent.getLeft(), n);
            }
        } else {
            if (parent.getRight() == null) {
                parent.setRight(n);
                return;
            } else {
                doInsert(parent.getRight(), n);
            }
        }
    }
}
