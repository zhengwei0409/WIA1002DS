package S2W9.lab;

public class Q1<T extends Comparable<T>, N extends Comparable<N>> {
    Vertex<T,N> head;
    int size;

    public boolean addEdge(T source, T destination, N w) {
        if(head == null) return false;
        //if(!hasVertex(source) || !hasVertex(destination)) return false;
        Vertex<T,N> sourceVertex = head;
        while (sourceVertex!=null) {
            if(sourceVertex.vertexInfo.compareTo(source) == 0) {
                // Reached source vertex, look for destination now
                Vertex<T,N> destinationVertex = head;
                while (destinationVertex != null) {
                    if(destinationVertex.vertexInfo.compareTo(destination) == 0) {
                        // Reach destination vertex, add edge here
                        Edge<T,N> currentEdge = sourceVertex.firstEdge;
                        Edge<T,N> newEdge = new Edge<>(destinationVertex, w, currentEdge);
                        sourceVertex.firstEdge = newEdge;
                        sourceVertex.outdeg++;
                        destinationVertex.indeg++;
                        return true;
                    }
                    destinationVertex = destinationVertex.nextVertex;
                }
            }
            sourceVertex = sourceVertex.nextVertex; 
        }
        return false;
    }

    // Question2 
    public boolean addUndirectedEdge(T source, T destination, N w) {
        if(addEdge(source, destination, w)) return addEdge(destination, source, w);
        return false;
    } 
}
