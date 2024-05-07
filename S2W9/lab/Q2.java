package S2W9.lab;

public class Q2<T extends Comparable<T>, N extends Comparable<N>> {
    Vertex<T,N> head;
    int size;

    public boolean removeEdge(T source, T destination) {
        if(head==null) return false;
        // if (!(hasVertex(source) && hasVertex(destination))) return false;
        Vertex<T,N> sourceVertex = head; 
        while (sourceVertex!=null) {
            // Reached source vertex, look for destination now
            if(sourceVertex.vertexInfo.compareTo(source) == 0) {
                Edge<T,N> currentEdge = sourceVertex.firstEdge;
                // if the first edge is destination
                if(currentEdge.toVertex.vertexInfo.compareTo(destination) == 0) {
                    sourceVertex.firstEdge = null;
                    sourceVertex.outdeg--;
                    currentEdge.toVertex.indeg--;
                    return true;
                }
                while (currentEdge.nextEdge != null) {
                    // destination vertex found
                    if(currentEdge.nextEdge.toVertex.vertexInfo.compareTo(destination) == 0) {
                        if(currentEdge.nextEdge.nextEdge == null) {
                            currentEdge.nextEdge = null;
                        } else {
                            currentEdge.nextEdge = currentEdge.nextEdge.nextEdge;
                        }
                        sourceVertex.outdeg--;
                        currentEdge.nextEdge.toVertex.indeg--;
                        return true;
                    }
                    currentEdge = currentEdge.nextEdge;
                } 
            }
            sourceVertex = sourceVertex.nextVertex;
        }
        return false;
    }
}
