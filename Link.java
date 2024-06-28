package practice;

public class Link {

    public static void main(String[] args) {
        LinkNode a = new LinkNode('a', null);
        LinkNode b = new LinkNode('b', a);
        LinkNode c = new LinkNode('c', b);
        LinkNode d = new LinkNode('d', c);
        LinkNode root = d;
        print(root);
        System.out.println();
        root = reverse(root);
        print(root);
        System.out.println();
        root = reverseR(root, null);
        print(root);
        System.out.println();
    }

    private static LinkNode reverseR(LinkNode root, LinkNode prev) {
        if (root == null) return root;
        if (root.getNext() == null) {
            root.setNext(prev);
            return root;
        }
        LinkNode next = root.getNext();
        root.setNext(prev);
        return reverseR(next, root);
    }

    private static LinkNode reverse(LinkNode root) {
        if (root == null || root.getNext() == null) {
            return root;
        }
        LinkNode prev = null;
        LinkNode c = root;
        LinkNode n = null;

        while (c != null) {
            n = c.getNext();
            c.setNext(prev);
            prev = c;
            c = n;
        }
        return prev;
    }

    static void print(LinkNode a) {
        LinkNode t = a;
        while (t != null) {
            System.out.print((char) t.getV());
            t = t.getNext();
            if (t != null) {
                System.out.print("->");
            }
        }
    }
}

class LinkNode {
    char v;
    LinkNode next;

    public LinkNode(char a, LinkNode o) {
        this.v = a;
        next = o;
    }

    public char getV() {
        return v;
    }

    public void setV(char v) {
        this.v = v;
    }

    public LinkNode getNext() {
        return next;
    }

    public void setNext(LinkNode next) {
        this.next = next;
    }
}