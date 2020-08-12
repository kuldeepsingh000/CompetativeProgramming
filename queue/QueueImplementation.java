package queue;

/* Array implementation */

class Queue{
	private int front, rear, size;
	private int capacity;
	private int array[];
	
	public Queue(int capacity)
	{
		this.capacity = capacity;
		front = this.size = 0;
		rear = capacity-1;
		array = new int[this.capacity];
	}
	
	boolean isFull(Queue q)
	{
		return q.size == q.capacity; 
	}
	
	
	/* Queue is empty if it's size is empty which means 0 */	
	boolean isEmpty(Queue q)
	{
		return q.size == 0;
	}
	
	void enqueue(int data)
	{
		if(isFull(this)) {
			return ;
		}
		
		this.rear = (this.rear+1) % this.capacity;
		//System.out.println(this.rear);
		this.array[this.rear] = data;
		this.size++;
		System.out.println(data + " : is inserted");
	}
	
	int dequeue()
	{
		if(isEmpty(this)) {
			return Integer.MIN_VALUE;
		}
		else {
			int item = array[this.front];
			this.front = (this.front+1) % this.capacity;
			this.size = this.size - 1;
			return item;
		}
	}
	
	int front()
	{
		if(isEmpty(this))
		{
			return Integer.MIN_VALUE; // for default value, that your queue contain garbage values
		}
		
		return this.array[this.front];
	}
	
	int rear()
	{
		if(isEmpty(this))
		{
			return Integer.MIN_VALUE;
		}
		
		return this.array[this.rear];
	}
	
	int size()
	{
		return this.size;
	}
}

public class QueueImplementation {

	public static void main(String[] args) {
		
		Queue q = new Queue(500);
		for(int i = 1; i<=10; i++)
		{
			q.enqueue(i);
		}
		
		System.out.println(q.size());
		System.out.println(q.front());
		System.out.println(q.rear());
		System.out.println(q.isFull(q));
		System.out.println(q.isEmpty(q));
	}

}
