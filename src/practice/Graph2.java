package practice;

import java.util.ArrayList;
import java.util.List;

public class Graph2 {

	public static void main(String[] args) {
		GNode z = new GNode('z');
		GNode y = new GNode('y');
		GNode u = new GNode('u');
		GNode x = new GNode('x');
		GNode t = new GNode('t');
		x.getNeighbors().add(u);
		x.getNeighbors().add(y);
		y.getNeighbors().add(z);
		u.getNeighbors().add(t);
		bfs(x);
		System.out.println("-- bfs Done!");
		z.setVisited(false);
		y.setVisited(false);
		u.setVisited(false);
		x.setVisited(false);
		t.setVisited(false);
		dfs(x);
		System.out.println("-- dfs Done!");
		boolean r = isCyclic(x);
		System.out.println(r + "-- isCyclic Done!");
		u.getNeighbors().add(x);
		z.setColor('w');
		y.setColor('w');
		x.setColor('w');
		u.setColor('w');
		t.setColor('w');
		r = isCyclic(x);
		System.out.println(r + "-- isCyclic Done!");
	}

	private static boolean isCyclic(GNode x) {
		if (x.getColor() == 'g') {
			return true;
		}
		if (x.getColor() == 'w') {
			x.setColor('g');
			for (GNode i : x.getNeighbors()) {
				boolean r = isCyclic(i);
				if (r == true)
					return true;
			}
			x.setColor('b');
		}
		return false;
	}

	private static void dfs(GNode y) {
		if (y.isVisited()) {
			return;
		}
		System.out.print(y.getV());
		y.setVisited(true);
		y.getNeighbors().forEach(i -> dfs(i));
	}

	private static void bfs(GNode x) {
		ArrayList<GNode> queue = new ArrayList();
		queue.add(x);
		while (queue.size() > 0) {
			GNode head = queue.get(0);
			queue.remove(0);
			if (!head.isVisited()) {
				System.out.print(head.getV());
				head.setVisited(true);
				head.getNeighbors().forEach(i -> queue.add(i));
			}
		}
	}

}

class GNode {
	char v;
	boolean visited = false;
	char color = 'w';
	List<GNode> neighbors = new ArrayList();

	public char getV() {
		return v;
	}

	public void setV(char v) {
		this.v = v;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public char getColor() {
		return color;
	}

	public void setColor(char color) {
		this.color = color;
	}

	public List<GNode> getNeighbors() {
		return neighbors;
	}

	public void setNeighbors(List<GNode> neighbors) {
		this.neighbors = neighbors;
	}

	public GNode(char v) {
		super();
		this.v = v;
	}
}