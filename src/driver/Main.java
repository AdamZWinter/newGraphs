package driver;

import graphs.DirectedGraphAL;
import graphs.Edge;

import java.util.List;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        DirectedGraphAL<Integer> graph = new DirectedGraphAL<>();

        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);

        graph.addEdge(1, 2);
        graph.addEdge(2, 4);
        graph.addEdge(1, 3);
        graph.addEdge(3, 4);
        graph.addEdge(4, 1);

        graph.printGraph();

        System.out.println();
        System.out.println("|V| = " + graph.vertexSize());
        System.out.println("|E| = " + graph.edgeSize());

        Set<Integer> verts = graph.getVertices();
        for(int vert : verts){
            System.out.println("Vertex - " + vert);
        }

        System.out.println();
        for (Edge<Integer> edge : graph.getEdges()) {
            System.out.println(edge);
        }

        List<Integer> dfs = graph.dfs(4);
        System.out.println(dfs);
    }
}