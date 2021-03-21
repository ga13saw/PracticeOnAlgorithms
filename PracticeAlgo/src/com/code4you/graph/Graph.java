package com.code4you.graph;

import java.util.ArrayList;
import java.util.List;

public class Graph {
	
	 int noOfNodes;
	 private List<Node> list;
	
	public Graph() {
		this.noOfNodes = 0;
		this.list = new ArrayList<>();
	}
	
	 
	
	public void addVertes(int node) {
		list.add(new Node(node));
		noOfNodes++;
		
	}
	
	public void edge(int node1, int node2) {
		list.get(node1).values.add(node2);
		list.get(node2).values.add(node1);
	}
	
	public void printGraph() {
		for (Node node : list) {
			System.out.println(node);
		}
	}
	
}
