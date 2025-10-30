import java.util.Scanner;

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
        if (top == capacity - 1) {
            System.out.println("The stack is full.");
            return;
        }

        numbers[++top] = number;
        System.out.println("Book added to stack.");
    }

    int pop() {
        if (top == -1) {
            System.out.println("The stack is empty.");
            return -1;
        }
        return numbers[top--];
    }

    int peek() {
        if (top == -1) {
            System.out.println("The stack is empty.");
            return -1;
        }
        return numbers[top];
    }

    String isEmpty() {
        if (top == -1) {
            return "The stack is empty.";
        } else {
            return "The stack is not empty.";
        }
    }

    String isFull() {
        if (top == capacity - 1) {
            return "The stack is full.";
        } else {
            return "The stack is not full.";
        }
    }
}

public class book {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Stack myStack = new Stack(5);

        System.out.println("==== Stack Menu ====");
        System.out.println("1. Push (Add Book)");
        System.out.println("2. Pop (Remove Book)");
        System.out.println("3. Peek (View Top Book)");
        System.out.println("4. Check if Stack is Empty");
        System.out.println("5. Check if Stack is Full");
        System.out.println("6. Exit");

        boolean isLooping = true;

        while (isLooping) {

            System.out.println();
            System.out.print("Enter choice: ");
            int choice = scan.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter book ID to add: ");
                    int bookID = scan.nextInt();
                    myStack.push(bookID);
                    break;

                case 2:
                    System.out.println("Book removed: " + myStack.pop());
                    break;

                case 3:
                    System.out.println("Top book: " + myStack.peek());
                    break;

                case 4:
                    System.out.println(myStack.isEmpty());
                    break;

                case 5:
                    System.out.println(myStack.isFull());
                    break;

                case 6:
                    System.out.println("Exiting program...");
                    isLooping = false;
                    break;

                default:
                    System.out.println("Invalid number.");
            }
        }
    }
}