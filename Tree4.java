package practice;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Tree4 {
    public static void main(String[] args) {
        TreeNode f = new TreeNode('f', null, null);
        TreeNode a = new TreeNode('a', null, null);
        TreeNode e = new TreeNode('e', null, null);
        TreeNode b = new TreeNode('b', a, null);
        TreeNode d = new TreeNode('d', e, null);
        TreeNode c = new TreeNode('c', b, d);
        System.out.println(" Height: " + height4(c));
        dfs4(c);
        System.out.println("  <== dfs Done!");
        Set<Integer> heights = new HashSet<>();
        leftSide(c, 0, heights);
        System.out.println(" -- all leftside node count:" + heights.size());
        leftSideAgain(c);
        System.out.println(" -- again, all leftside node count done");
        TreeNode r = insert4(c, f);
        dfs4(r);
    }

    public static int height4(TreeNode r) {
        if (r == null) return 0;
        return 1 + Math.max(height4(r.getRight()), height4(r.getLeft()));
    }

    public static void dfs4(TreeNode r) {
        if (r == null) return;
        System.out.print(" " + r.getValue());
        dfs4(r.getRight()); dfs4(r.getLeft());
    }

    public static void leftSide(TreeNode r, int level, Set<Integer> heights) {
        if (r == null) return;
        if (!heights.contains(level)) {
            heights.add(level);
            System.out.print(" " + r.getValue());
        }
        leftSide(r.getLeft(), level + 1, heights);
        leftSide(r.getRight(), level + 1, heights);
    }

    public static void leftSideAgain(TreeNode r) {
        java.util.List<TreeNode> queue = new ArrayList<>();
        if (r==null) {
            return;
        }
        TreeNode marker = new TreeNode('-', null, null);
        queue.add(marker);
        queue.add(r);
        int count = 0;
        boolean needsMarker = false;
        while (!queue.isEmpty()) {
            TreeNode t = queue.remove(0);
            if (t.getValue() == '-') {
                count++;
                needsMarker = true;
            } else {
                if (needsMarker) {
                    if (t.getLeft() != null) {
                        queue.add(marker);
                        needsMarker = false;
                        queue.add(t.getLeft());
                    } else if (t.getRight() != null) {
                        queue.add(marker);
                        needsMarker = false;
                        queue.add(t.getRight());
                    }
                }
            }
        }
        System.out.print(" here is the count: " + count);
    }

    public static TreeNode insert4(TreeNode r, TreeNode f) {
        if (r == null) return f;
        if (r.getValue() > f.getValue()) {
            if (r.getLeft() == null) {
                r.setLeft(f);
            } else {
                insert4(r.getLeft(), f);
            }
        } else {
            if (r.getRight() == null) {
                r.setRight(f);
            } else {
                insert4(r.getRight(), f);
            }
        }
        return r;
    }
}
