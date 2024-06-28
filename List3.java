package practice;

public class List3 {
    public static void main(String[] args) {
        LNode a = new LNode('a', null);
        LNode b = new LNode('b', a);
        LNode c = new LNode('c', b);
        LNode d = new LNode('d', c);
        LNode r = d;
        printList(r);
        r = reverse(r);
        printList(r);
    }

    public static LNode reverse(LNode r) {
        if (r == null || r.getNext() == null) return r;
        LNode prev = null;
        LNode current = r;
        while (current != null) {
            LNode next = current.getNext();
            current.setNext(prev);
            prev = current;
            current = next;
        }
        return prev;
    }
    public static void printList(LNode r) {
        if (r == null) {
            System.out.println(" ! ");
            return;
        }
        if (r != null) System.out.print(r.getV() + "  -> ");
        printList(r.getNext());
    }
}
