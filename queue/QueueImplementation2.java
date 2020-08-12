package queue;

/*Using linked list implementation*/

class QueueDemo{
	
	class Node{
		int data;
		Node next;
		public Node(int key)
		{
			this.data = key;
			this.next = null;
		}
	}
	
	Node front, rear;
	public QueueDemo()
	{
		this.front = this.rear = null;
	}
	
	void enqueue(int data)
	{
		Node n = new Node(data);
		if(this.rear == null)
		{
			this.front = this.rear = n;
			return;
		}else {
			this.rear.next = n;
			this.rear = n;
		}
		
	}
	
	void dequeue()
	{
		if(this.front == null) {
			System.out.println("Underflow");
			return;
		}
		Node temp = this.front;
		System.out.println(front.data);
		this.front = this.front.next;
		if(this.front == null) {
			this.rear = null;
		}
	}
}

public class QueueImplementation2 {

	public static void main(String[] args) {
		QueueDemo q = new QueueDemo();
		q.enqueue(12);
		System.out.println("front : " + q.front.data);
		q.enqueue(14);
		q.enqueue(13);
		System.out.println("rear : " + q.rear.data);
		q.dequeue();
		q.dequeue();
		q.dequeue();
		q.dequeue();
	}

}
