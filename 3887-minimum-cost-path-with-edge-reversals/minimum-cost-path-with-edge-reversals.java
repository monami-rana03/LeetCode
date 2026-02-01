import java.util.*;

class Solution {

    static class Edge {
        int to;
        int w;
        Edge(int t, int w) {
            this.to = t;
            this.w = w;
        }
    }

    static class State {
        int node;
        long dist;
        State(int n, long d) {
            node = n;
            dist = d;
        }
    }

    public int minCost(int n, int[][] edges) {

        List<Edge>[] adj = new ArrayList[n];
        List<Edge>[] incoming = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            adj[i] = new ArrayList<>();
            incoming[i] = new ArrayList<>();
        }

        for (int[] e : edges) {
            adj[e[0]].add(new Edge(e[1], e[2]));
            incoming[e[1]].add(new Edge(e[0], e[2]));
        }

        long INF = Long.MAX_VALUE / 4;
        long[] dist = new long[n];
        Arrays.fill(dist, INF);

        PriorityQueue<State> pq =
            new PriorityQueue<>(Comparator.comparingLong(a -> a.dist));

        dist[0] = 0;
        pq.offer(new State(0, 0));

        while (!pq.isEmpty()) {

            State cur = pq.poll();
            int u = cur.node;

            if (cur.dist != dist[u]) continue;

            // normal edges
            for (Edge e : adj[u]) {
                int v = e.to;
                long nd = cur.dist + e.w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.offer(new State(v, nd));
                }
            }

            // reverse any incoming edge
            for (Edge e : incoming[u]) {
                int v = e.to;
                long nd = cur.dist + 2L * e.w;
                if (nd < dist[v]) {
                    dist[v] = nd;
                    pq.offer(new State(v, nd));
                }
            }
        }

        return dist[n - 1] == INF ? -1 : (int) dist[n - 1];
    }
}
