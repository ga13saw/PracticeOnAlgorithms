package com.code4you.linkedlist;

public class LinkedList {
	 private Node head1;
	Node temp = null, result = null,prev = null;
	public  Node addTwoList(Node head1, Node head2) {
		
		int carry = 0, sum;
		while (head1 != null || head2 != null) {

			sum = carry + (head1 != null ? head1.getData() : 0) + (head2 != null ? head2.getData() : 0);
			carry = sum >= 10 ? 1 : 0;
			sum %= 10;
			temp = new Node(sum);
			if (result == null) {
				result = temp;
			} else {
				prev.setNext(temp) ;
			}
			prev = temp;
			
			if (head1 != null) {
				head1 = head1.getNext();
			}
			if (head2 != null) {
				head2 = head2.getNext();
			}
		
		}
		if (carry > 0) {
			temp.setNext(new Node(carry));
		}

		return result;
	}
	
	public void printList() {
		Node temNode = head1;
		while (temNode != null) {
			System.out.print(temNode.getData()+" ");
			temNode = temNode.getNext();
		}
		
		
	}
	
	
	public void addToList(int data) {
		 
			Node tem_node = new Node(data);
			tem_node.setNext(head1);
			
			head1 = tem_node;
		}
		
	

	public Node getHead() {
		if (head1 != null) {
			return head1;
		}
		return null;
	}

	
	
	
	
	
	
	
	
}
