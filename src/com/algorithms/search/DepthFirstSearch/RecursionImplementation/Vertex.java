package com.algorithms.search.DepthFirstSearch.RecursionImplementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores data about an individual vertex
 */
public class Vertex {

    private String name; // Name of this node
    private boolean visited; // If this node has already been visited
    private List<Vertex> neighbors; // This vertex's neighbors

    public Vertex(String name) {
        this.name = name;
        this.neighbors = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighbors() {
        return neighbors;
    }

    public void setNeighbors(List<Vertex> neighbors) {
        this.neighbors = neighbors;
    }

    public void addNeighbor(Vertex vertex) {
        this.neighbors.add(vertex);
    }

    @Override
    public String toString() {
        return this.name;
    }
}
