
public class Queue<T> {
	LinkedList<T> listObj = new LinkedList<T>();

	// Method for Adding elements to the queue.
	public void enqueue(T value) {
		listObj.add(value);
	}

	// Method for printing the data of queue till the last node's next element is
	// null.
	public void show() {
		listObj.show();
	}

	// Method for dequeue or remove the element at the front of the queue.
	public Node<T> dequeue() {
		return listObj.pop();

	}

	public static void main(String[] args) {
		Queue<Integer> queue = new Queue<Integer>();
		queue.enqueue(56);
		queue.enqueue(30);
		queue.enqueue(70);
		System.out.println("Before Dequeue: ");
		queue.show();
		System.out.println("After Dequeue: ");
		queue.dequeue();
		queue.show();
	}
}
