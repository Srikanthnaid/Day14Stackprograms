
public class Stack<T> {
	// Created a object of LinkedList class.
	LinkedList<T> listObj = new LinkedList<T>();

	// Method for inserting (push) data into the stack.
	public void push(T value) {
		listObj.addAtStart(value);
	}

	// Method for printing the stack data.
	public void show() {
		listObj.show();
	}

	// retrieve or fetch the first element of the Stack and The element retrieved
	// does not get deleted or removed from the Stack.
	public T peek() {
		return listObj.peek();
	}

	// pop or fatch an element from the top of stack.
	public Node<T> pop() {
		return listObj.pop();

	}

	public static void main(String args[]) {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(70);
		stack.push(30);
		stack.push(56);
		stack.show();
		System.out.println();
		while (stack.peek() != null) {
			System.out.println("First element of the stack is " + stack.peek());
			stack.pop();
			stack.show();
		}
	}
}
