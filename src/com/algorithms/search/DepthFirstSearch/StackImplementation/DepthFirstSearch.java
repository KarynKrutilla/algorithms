package com.algorithms.search.DepthFirstSearch.StackImplementation;

import java.util.Stack;

/**
 * The Depth First Search algorithm, using a stack
 */
public class DepthFirstSearch {

    public void depthFirstSearch(Vertex root) {
        Stack<Vertex> stack = new Stack<>(); // Use Stack to ensure LIFO

        // Visit root node and add to stack
        root.setVisited(true);
        stack.add(root);

        // Now traverse until we complete the stack
        while(!stack.isEmpty()) {
            // Take first value off the stack and print it
            Vertex actualVertex = stack.pop();
            System.out.println(actualVertex);
            // Check each of the vertex's neighbors
            for(Vertex vertex : actualVertex.getNeighbors()) {
                // If we haven't visited the neighbor, visit it and add to the stack
                if (!vertex.isVisited()) {
                    vertex.setVisited(true);
                    stack.push(vertex);
                }
            }
        }
    }

}
