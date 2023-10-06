package Graph;

import java.util.*;

public class Graph {
    HashMap<Integer, HashMap<Integer, Integer>> map;

    public Graph(int v) {
        map = new HashMap<>();
        for (int i = 1; i <= v; i++) { // Change the loop condition from i < v to i <= v to include vertex v
            map.put(i, new HashMap<>());
        }
    }

    public void addEdge(int v1, int v2, int cost) {
        if (!map.containsKey(v1) || !map.containsKey(v2)) {
            throw new IllegalArgumentException("Vertex not found in the graph.");
        }
        map.get(v1).put(v2, cost);
        map.get(v2).put(v1, cost);
    }

    public boolean containsEdge(int v1, int v2) {
        if (!map.containsKey(v1) || !map.containsKey(v2)) {
            return false; // Return false if either vertex is not found in the graph
        }
        return map.get(v1).containsKey(v2) && map.get(v2).containsKey(v1);
    }

    public boolean containVertex(int v1) {
        return map.containsKey(v1);
    }

    public int noOfEdge() {
        int sum = 0;
        for (int key : map.keySet()) {
            sum += map.get(key).size();
        }
        return sum / 2;
    }

    public void removeEdge(int v1, int v2) {
        if (containsEdge(v1, v2)) {
            map.get(v1).remove(v2);
            map.get(v2).remove(v1);
        }
    }

    public void removeVertex(int v) { // Correct the method signature to remove a single vertex
        if (!map.containsKey(v)) {
            throw new IllegalArgumentException("Vertex not found in the graph.");
        }
        for (int key : map.get(v).keySet()) {
            removeEdge(key, v);
        }
        map.remove(v);
    }

    public void display() {
        for (int key : map.keySet()) {
            System.out.println(key + "--->" + map.get(key));
        }
    }

    public static void main(String[] args) {
        Graph g = new Graph(7);
        g.addEdge(1, 4, 6);
        g.addEdge(1, 2, 10);
        g.addEdge(2, 3, 7);
        g.addEdge(3, 4, 5);
        g.addEdge(4, 5, 1);
        g.addEdge(5, 6, 4);
        g.addEdge(7, 5, 2);
        g.addEdge(6, 7, 3);
        g.display();
        System.out.println(g.hasPath(1, 6, new HashSet<>()));

    }

    public boolean hasPath(int src, int des, HashSet<Integer> visited) {
        if (src == des) {
            return true;
        }
        visited.add(src);
        for (int nbrs : map.get(src).keySet()) {
            if (!visited.contains(nbrs)) {
                boolean ans = hasPath(nbrs, des, visited);
                if (ans) {
                    return ans;
                }
            }
        }
        visited.remove(src);
        return false;
    }
}
