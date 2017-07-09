package com.algorithms.BreadthFirstSearch.implementation;

/**
 * Run a Breadth First Search
 * Input structure should have vertex1 as root and look like this:
 *
 *              vertex1
 *              /     \
 *        vertex2      vertex4
 *          /            \
 *      vertex3         vertex5
 *
 * Output should look like this:
 * 1
 * 2
 * 4
 * 3
 * 5
 */
public class App {

    public static void main(String[] args) {
        // Init our BreadthFirstSearch object
        BreadthFirstSearch bfs = new BreadthFirstSearch();

        // Create the vertex objects
        Vertex vertex1 = new Vertex(1);
        Vertex vertex2 = new Vertex(2);
        Vertex vertex3 = new Vertex(3);
        Vertex vertex4 = new Vertex(4);
        Vertex vertex5 = new Vertex(5);

        // Link neighbors together
        vertex1.addNeighborVertex(vertex2);
        vertex1.addNeighborVertex(vertex4);
        vertex4.addNeighborVertex(vertex5);
        vertex2.addNeighborVertex(vertex3);

        // Run breadth first search w/ vertex1 as root
        bfs.breadthFirstSearch(vertex1);
    }
}
