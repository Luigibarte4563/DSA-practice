class Stack { 
    private int numbers[];
    private int capacity;
    private int top;

    Stack(int cap) {
        capacity = cap;
        numbers = new int[capacity];
        top = -1;
    }

    void push(int number) {
        if(top == capacity - 1) {
            System.out.println("Stack is full");
            return;
        }
        numbers[++top] = number;
    }

    int peek() {
        if(top == -1) {
            System.out.println("The stack is empty");
            return -1;
        }
        return numbers[top];
    }

    int pop() {
        return numbers[top--];
    }

    boolean isEmpty() {
        if(top == -1) {
            return true;
        }
        return false;
    }

    boolean isFull() {
        return top == capacity -1;
    }
}

public class ArrayStack {
    public static void main(String[]args) {
        Stack myStack = new Stack(2);

        myStack.push(100);
        myStack.push(200);
        myStack.push(300);
        
        System.out.println(myStack.peek());

        System.out.println(myStack.pop());

        System.out.println(myStack.isEmpty());

        System.out.println(myStack.isFull());
    }
}