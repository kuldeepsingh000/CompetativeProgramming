package linkedList.circularLinkedList;

public class Main {

	public static void main(String[] args) {
		Implementation ll = new Implementation();
		
		System.out.println(ll.length());
		
		ll.push(12);
		ll.push(24);
		ll.push(36);
		ll.push(48);
		ll.print();
		
		
		ll.insertAfter(12, 98);
		ll.print();
		
		ll.insertAfter(48, 100);
		ll.print();
		
		System.out.println(ll.length());
		
		System.out.println(ll.isCircular());
	}

}
