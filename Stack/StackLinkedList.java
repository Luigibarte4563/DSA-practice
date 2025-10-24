class Node {
    int data;
    Node next;

    Node(int value) {
        data = value;
        next = null;
    }
}

class MyStack {
    private Node top;

    MyStack() {
        top = null;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.next = top;
        top = newNode;
        System.out.println(value + " pushed to stack");
    }

    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        int poppedValue = top.data;
        top = top.next;
        System.out.println(poppedValue + " popped from stack");
        return poppedValue;
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return -1;
        }
        return top.data;
    }

    public boolean isEmpty() {
        return top == null;
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty!");
            return;
        }
        Node current = top;
        System.out.print("Stack elements: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }
}

public class StackLinkedList {
    public static void main(String[] args) {
        MyStack stack = new MyStack();

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();

        System.out.println("Top element: " + stack.peek());
        stack.pop();
        stack.display();

        System.out.println("Is stack empty? " + stack.isEmpty());
    }
}
