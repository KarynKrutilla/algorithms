package com.algorithms.BreadthFirstSearch.implementation;

import java.util.LinkedList;
import java.util.Queue;

/**
 * The Breadth First Search algorithm
 */
public class BreadthFirstSearch {

    public void breadthFirstSearch(Vertex root) {
        Queue<Vertex> queue = new LinkedList<>(); // Using queue to allow FIFO

        // Visit root node and add to queue
        root.setVisited(true);
        queue.add(root);

        // Now traverse until we complete the queue:
        while(!queue.isEmpty()) {
            // Take first value off the queue and print it
            Vertex actualVertex = queue.remove();
            System.out.println(actualVertex + " ");
            // Check each of the vertex's neighbors
            for(Vertex v : actualVertex.getNeighborList()) {
                // If we haven't visited the neighbor, visit it and add to queue
                if(!v.isVisited()) {
                    v.setVisited(true);
                    queue.add(v);
                }
            }
        }
    }
}
