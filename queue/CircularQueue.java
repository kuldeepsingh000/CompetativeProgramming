package queue;

/*
 * This circular queue is array implementations.
 * This based on fact FIFO, LILO.
 * */

class CQueue {
	private int front, rear, size;
	private int[] arr;

	public CQueue(int s) {
		front = rear = -1;
		size = s;
		arr = new int[s];

	}
	
	void enQueue(int value) {
		if((rear == size-1 && front == 0) || rear == front-1) {
			System.out.println(value + " Can't be inserted " + " Overflow, Queue is full");
			return;
		}
		
		else {
			
			if(front  == -1) {
				front = 0;
				//System.out.println(rear + " " + front + " " + value + " got");
			}
			
			rear = (rear + 1) % size;
			arr[rear] = value;
			//System.out.println(value + " " + front + " " + rear + " inserted");
		}
		
	}
	
	int deQueue() {
		int x;
		if((front == -1 && rear == -1) || (front == rear && front == -1)) {
			System.out.println("Queue is empty");
			return -1;
		}
		else {
			x = arr[front];
			arr[front] = -1;
			if(front == rear) {
				front = -1;
				rear = -1;
			}
			front = (front+1) % size;
			return x;
		}
	}
	
	int rear() {
		if(rear == -1) {
			return Integer.MIN_VALUE;
		}
		return arr[rear];
	}
	
	int front() {
		if(front == -1) {
			return Integer.MIN_VALUE;
		}
		
		return arr[front];
	}
	
	int length()
	{
		return size;
	}
	
	void display()
	{
		if(front == -1) {
			System.out.println("Empty....");
			return;
		}
		
		if(rear >= front)
		{
			for(int i = front; i<=rear; i++)
				System.out.print(arr[i] + " ");
		}else {
			for(int i = front; i<size; i++)
				System.out.print(arr[i] + " ");
			
			for(int i = 0; i<=rear; i++)
				System.out.print(arr[i] + " ");
			
		}
		
		System.out.println();
	}
}

public class CircularQueue {

	public static void main(String[] args) {
		CQueue q = new CQueue(5);
		for(int i = 1; i<=6; i++)
		{
			q.enQueue(i);
		}
		
		System.out.println("Display the queue");
		q.display();
		
		System.out.println("Dequeue");
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		System.out.println(q.deQueue());
		
		System.out.println("After dequeue");
		System.out.println(q.front());
		System.out.println(q.rear());
		System.out.println(q.length());
	}

}
