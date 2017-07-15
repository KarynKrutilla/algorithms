package com.algorithms.search.DepthFirstSearch.StackImplementation;

/**
 * Run a Depth First Search
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
 * 3
 * 4
 * 5
 */
public class App {

    public static void main(String[] args) {
        // Init our DepthFirstSearch object
        DepthFirstSearch dfs = new DepthFirstSearch();

        // Create the vertex objects
        Vertex vertex1 = new Vertex("1");
        Vertex vertex2 = new Vertex("2");
        Vertex vertex3 = new Vertex("3");
        Vertex vertex4 = new Vertex("4");
        Vertex vertex5 = new Vertex("5");

        // Link neighbors together
        vertex1.addNeighbor(vertex4);
        vertex1.addNeighbor(vertex2);
        vertex4.addNeighbor(vertex5);
        vertex2.addNeighbor(vertex3);

        // Run depth first search w/ vertex1 as root
        dfs.depthFirstSearch(vertex1);
    }
}
