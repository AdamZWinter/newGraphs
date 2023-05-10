package graphs;

public class Edge<V> {

    private V source;
    private V destination;

    public Edge(V source, V destination) {
        this.source = source;
        this.destination = destination;
    }

    public V getSource() {
        return source;
    }

    public void setSource(V source) {
        this.source = source;
    }

    public V getDestination() {
        return destination;
    }

    public void setDestination(V destination) {
        this.destination = destination;
    }

    @Override
    public String toString() {
        return "Edge{" +
                "source=" + source +
                ", destination=" + destination +
                '}';
    }
}
