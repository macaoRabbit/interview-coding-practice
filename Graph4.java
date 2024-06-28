package practice;

public class Graph4 {
    public static void main(String[] args) {
        GNode a = new GNode('a');
        GNode b = new GNode('b');
        GNode c = new GNode('c');
        GNode d = new GNode('d');
        a.getNeighbors().add(b);
        b.getNeighbors().add(c);
        c.getNeighbors().add(d);
        System.out.println("isCylic? " + isCyclic(a));
        a.setColor('w');
        b.setColor('w');
        c.setColor('w');
        d.setColor('w');
        d.getNeighbors().add(a);
        System.out.println("isCylic? " + isCyclic(a));
    }

    public static boolean isCyclic(GNode s) {
        if (s == null) {
            return false;
        }
        if (s.getColor() == 'g') {
            return true;
        }
        if (s.getColor() == 'b') {
            return false;
        }
        s.setColor('g');
        for (GNode n : s.getNeighbors()) {
            boolean r = isCyclic(n);
            if (r) return true;
        }
        s.setColor('b');
        return false;
    }
}
