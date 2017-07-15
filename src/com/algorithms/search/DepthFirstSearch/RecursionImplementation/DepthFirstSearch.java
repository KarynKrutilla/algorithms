package com.algorithms.search.DepthFirstSearch.RecursionImplementation;

/**
 * The Depth First Search algorithm, using recursion
 */
public class DepthFirstSearch {

    public void depthFirstSearch(Vertex vertex) {
        System.out.println(vertex);
        for(Vertex v : vertex.getNeighbors()) {
            if (!v.isVisited()) {
                v.setVisited(true);
                depthFirstSearch(v);
            }
        }
    }
}
