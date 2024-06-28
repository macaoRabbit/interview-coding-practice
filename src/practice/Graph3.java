package practice;

import java.util.ArrayList;

public class Graph3 {
    public static void main(String[] args) {
        GNode a = new GNode('a');
        GNode b = new GNode('b');
        GNode c = new GNode('c');
        a.getNeighbors().add(b);
        b.getNeighbors().add(c);
        System.out.println(isCyclic(a));
        c.getNeighbors().add(a);
        a.setColor('w');
        b.setColor('w');
        c.setColor('w');
        System.out.println(isCyclic(a));
    }

    public static boolean isCyclic(GNode r) {
        if (r == null) return false;
        if (r.getColor() == 'g') return true;
        if (r.getColor() == 'b') return false;
        r.setColor('g');
        for (GNode a : r.getNeighbors()) {
            boolean result = isCyclic(a);
            if (result) return true;
        }
        r.setColor('b');
        return false;
    }
}
