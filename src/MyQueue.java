
public class MyQueue{
	private int first;
	private int last;
	private int size;
	private int[] queue;
	public MyQueue(int size) {
		this.size=size;
		queue=new int[size];
		first=last=-1;
	}
	public boolean isFull() {
		if(last==size-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean isEmpty(){
		if(last==-1) {
			return true;
		}
		else {
			return false;
		}
	}
	public boolean addToQueue(int el) {
		if(isFull()) {
			System.out.println("Queue is full, you can not add element");
			return false;
		}
		else {
			if(first==-1) {
				first++;
			}
			last++;
			queue[last]=el;
			return true;
		}
	}
	public int removeFromQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty, you can not remove element");
			return 0;
		}
		else if(first==last) {
			int temp=queue[first];
			first=last=-1;
			return temp;
		}
		else {
			int temp=queue[first];
			first++;
			return temp;
		}
	}
	public int firstElement() {
		if(isEmpty()) {
			System.out.println("Queue is empty, there is no first element");
			return 0;
		}
		return queue[first];
	}
	public void printQueue() {
		if(isEmpty()) {
			System.out.println("Queue is empty");
		}
		else {
			for(int i=first;i<last;i++) {
				System.out.print(queue[i]+", ");
			}
			System.out.print(queue[last]+". ");
		}
	}
}