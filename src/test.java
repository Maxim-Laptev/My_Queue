
public class test {

	public static void main(String[] args) {
		MyQueue queue=new MyQueue(10);
		System.out.println("___\nTo make it easier to understand how this program works, please read the file ReadThis.md.");
		System.out.println("___\nNow we are adding elements to remove them and check how the addToQueue(), printQueue(), removeFromQueue(), firstElement() methods work.");
		System.out.println("(If the method returns true, then the number was added to the queue successfully).\n"+queue.addToQueue(1)); //true
		System.out.println(queue.addToQueue(2)); //true
		System.out.println(queue.addToQueue(3)); //true
		System.out.println(queue.addToQueue(4)); //true
		System.out.println(queue.addToQueue(5)); //true
		queue.printQueue();
		System.out.println("\nWe are now removing this element: "+queue.removeFromQueue()); //1
		queue.printQueue();
		System.out.println("\nThe first item in the queue is "+queue.firstElement()); //2
		System.out.println("We are now removing this element: "+queue.removeFromQueue()); //2
		System.out.println("We are now removing this element: "+queue.removeFromQueue()); //3
		System.out.println("We are now removing this element: "+queue.removeFromQueue()); //4
		System.out.println("We are now removing this element: "+queue.removeFromQueue()); //5
		System.out.println("___\nNow we have removed all the elements from the queue, so we will check the isEmpty(), isFull() methods.");
		System.out.println(queue.isEmpty()); //true
		queue.addToQueue(0);
		queue.addToQueue(1);
		queue.addToQueue(2);
		queue.addToQueue(3);
		queue.addToQueue(4);
		queue.addToQueue(5);
		queue.addToQueue(6);
		queue.addToQueue(7);
		queue.addToQueue(8);
		queue.addToQueue(9);
		System.out.println(queue.isFull()+"\n___"); //true
	}
}
