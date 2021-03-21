package com.code4you.graph;

import java.util.ArrayList;

public class Node {
	 int index;
	public ArrayList<Integer> values;

	public Node(int data) {
		this.index = data;
		this.values = new ArrayList<>();
	}

	@Override
	public String toString() {
		return "index=" + index + ", values=" + values ;
	}
	
	
}
