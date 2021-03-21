package com.code4you.graph;

public class LaunchGraph {

	public static void main(String[] args) {
		Graph graph = new Graph();
		graph.addVertes(0);
		graph.addVertes(1);
		graph.addVertes(2);
		graph.addVertes(3);
		graph.addVertes(4);
		graph.addVertes(5);
		System.out.println(graph.noOfNodes);
		
		graph.edge(0, 1);
		graph.edge(1, 2);
		graph.edge(2, 3);
		graph.edge(3, 4);
		graph.edge(4, 5);
		graph.edge(5, 1);
		
		graph.printGraph();
	}

}
