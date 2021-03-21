package com.code4you.launch;

import com.code4you.linkedlist.LinkedList;
import com.code4you.linkedlist.Node;

public class Launch {

	public static void main(String[] args) {
		LinkedList ll = new LinkedList(); 
		LinkedList ll2 = new LinkedList();
        // creating first list 
		ll.addToList(7);
		ll.addToList(5);
		ll.addToList(9);
		ll.addToList(4);
		ll.addToList(6);
       
		 // creating seconnd list 
		ll2.addToList(8);
		ll2.addToList(4);
		
		
		
        System.out.print("First List is "); 
        ll.printList(); 
  
      
        System.out.print("Second List is "); 
        ll2.printList(); 
  
        // add the two lists and see the result 
        Node rs = ll.addTwoList(ll.getHead(),ll2.getHead() ); 
        System.out.print("Resultant List is "); 
       while(rs!= null){
    	   System.out.print(rs.getData()+" ");
    	   rs = rs.getNext();
       }
       
    	   
	}

}
