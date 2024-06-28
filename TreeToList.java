package practice;

public class TreeToList {
    public static void main(String[] args) {
        TreeNode a = new TreeNode('a', null, null);
        TreeNode b = new TreeNode('b', null, null);
        TreeNode c = new TreeNode('c', a, b);
        TreeNode d = new TreeNode('d', c, null);
        LinkNode l = dfs(d, null);
        System.out.println();
        print(l);

    }

    private static void print(LinkNode l) {
        LinkNode n = l;
        while (n != null) {
            System.out.print("->" + n.getV());
            n = n.getNext();
        }
        System.out.println();
    }

    private static LinkNode dfs(TreeNode d, LinkNode l) {
        if (d == null) return l;
        LinkNode n = new LinkNode(d.getValue(), l);
        if (d.getLeft() != null)
            n = dfs(d.getLeft(), n);
        if (d.getRight() != null)
            n = dfs(d.getRight(), n);
        System.out.print("-" + d.getValue());
        return n;
    }
}


