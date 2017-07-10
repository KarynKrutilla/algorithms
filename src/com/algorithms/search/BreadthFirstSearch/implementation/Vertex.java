package com.algorithms.search.BreadthFirstSearch.implementation;

import java.util.ArrayList;
import java.util.List;

/**
 * Stores data about an individual vertex
 */
public class Vertex {
    private int id; // The id of this node
    private boolean visited; // If this node has already been visited
    private List<Vertex> neighborList; // This vertex's neighbors

    public Vertex(int id) {
        this.id = id;
        this.neighborList = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isVisited() {
        return visited;
    }

    public void setVisited(boolean visited) {
        this.visited = visited;
    }

    public List<Vertex> getNeighborList() {
        return neighborList;
    }

    public void setNeighborList(List<Vertex> neighborList) {
        this.neighborList = neighborList;
    }

    /**
     * Add another vertex to the neighbor list for this vertex
     * @param vertex the vertex to add
     */
    public void addNeighborVertex(Vertex vertex) {
        this.neighborList.add(vertex);
    }

    @Override
    public String toString() {
        return String.valueOf(this.id);
    }
}
