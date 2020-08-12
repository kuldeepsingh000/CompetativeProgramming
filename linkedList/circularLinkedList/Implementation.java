package linkedList.circularLinkedList;

public class Implementation {
	class Node{
		int data;
		Node next;
		
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
	
	Node head = null;
	void push(int data)
	{
		Node n = new Node(data);
		n.next = head;
		if(head != null)
		{
			Node temp = head;
			while(temp.next != head)
			{
				temp = temp.next;
			}
			
			temp.next = n;
			
		}else {
			n.next = n;
		}
		
		head = n;
	}
	
	void insertAfter(int dataNode, int newData)
	{
		Node n = head;
		while(n.data != dataNode)
		{
			n = n.next;
		}
		
		Node newNode = new Node(newData);
		
		if(n.next == head){
			newNode.next = head;
			n.next = newNode;
		}
		else {
			newNode.next = n.next;
			n.next = newNode;
		}
	}
	
	int length()
	{
		Node n = head;
		int cnt = 0;
		
		if(head != null)
		{
			do {
				cnt++;
				n = n.next;
			}while(n != head);
		}
		else {
			return -1;
		}
		return cnt;
	}
	
	boolean isCircular()
	{
		if(head == null) return true;
		Node n = head;
		
		while(n != null && n != head) {
			n = n.next;
		}
		
		return n == head;
	}
	
	void print()
	{
		Node temp = head; 
	    if (head != null) 
	    { 
	        do {
	        	
	        	System.out.print(temp.data + " ");
	        	temp = temp.next;
	        	
	        }while(temp != head);
	        System.out.println();
	        
	    } 
	    else {
	    	System.out.println("No data found...");
	    }
	    
	}
	
}
