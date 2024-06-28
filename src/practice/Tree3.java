package practice;

import java.util.ArrayList;

public class Tree3 {
    public static void main(String[] args) {
        TrNode a = new TrNode('a', null, null);
        TrNode b = new TrNode('b', null, null);
        TrNode c = new TrNode('c', b, a);
        TrNode e = new TrNode('e', null, null);
        TrNode d = new TrNode('d', c, e);
        TrNode root = d;
        System.out.print("dfs --");
        dfs(root);
        System.out.println();
        System.out.print("bfs --");
        bfs(root);
        System.out.println();
        System.out.println(" node count: " + nodeCount(root));
        System.out.println(" height : " + height(root));
    }

    private static int height(TrNode r) {
        if (r==null) return 0;
        return 1 + Math.max(height(r.getLeft()), height(r.getRight()));
    }

    private static int nodeCount(TrNode root) {
        if (root == null) return 0;
        return 1 + nodeCount(root.getRight()) + nodeCount(root.getLeft());
    }

    private static void bfs(TrNode root) {
        ArrayList<TrNode> queue = new ArrayList<>();
        if (root != null) {
            queue.add(root);
        }
        while (!queue.isEmpty()) {
            TrNode top = queue.get(0); queue.remove(0);
            System.out.print((char) top.getV()); System.out.print(" ");
            if (top.getLeft() != null) {
                queue.add(top.getLeft());
            }
            if (top.getRight() != null) {
                queue.add(top.getRight());
            }
        }
    }

    private static void dfs(TrNode root) {
        if (root == null) return;
        System.out.print((char) root.getV()); System.out.print(" ");
        dfs(root.getLeft());
        dfs(root.getRight());
    }
}

class TrNode {
    char v;
    TrNode left, right;

    public TrNode(char v, TrNode left, TrNode right) {
        this.v = v;
        this.left = left;
        this.right = right;
    }

    public char getV() {
        return v;
    }

    public void setV(char v) {
        this.v = v;
    }

    public TrNode getLeft() {
        return left;
    }

    public void setLeft(TrNode left) {
        this.left = left;
    }

    public TrNode getRight() {
        return right;
    }

    public void setRight(TrNode right) {
        this.right = right;
    }


}