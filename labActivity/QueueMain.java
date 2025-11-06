import java.util.Scanner;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class Queue {
    Node front, rear;

    Queue() {
        front = rear = null;
    }

    void enqueue(int newData) {
        Node newNode = new Node(newData);

        if (rear == null) {
            front = rear = newNode;
            return;
        }

        rear.next = newNode;
        rear = newNode;
    }

    int dequeue() {
        if (front == null) {
            return -1; 
        }

        int removedData = front.data;
        front = front.next;

        if (front == null) { 
            rear = null;
        }

        return removedData;
    }

    int peek() {
        if (front == null) {
            return -1; 
        }
        return front.data;
    }

    boolean isEmpty() {
        return (front == null);
    }
}

public class QueueMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue queue = new Queue();
        int choice;

        do {
            System.out.println("\n===== QUEUE MENU =====");
            System.out.println("1. Enqueue (Add Customer)");
            System.out.println("2. Dequeue (Remove Customer)");
            System.out.println("3. Peek (View First Customer)");
            System.out.println("4. Check if Queue is Empty");
            System.out.println("5. Exit");
            System.out.print("\nEnter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter customer ID to add: ");
                    int id = sc.nextInt();
                    queue.enqueue(id);
                    System.out.println("Customer " + id + " added to the queue.");
                    break;

                case 2:
                    int removed = queue.dequeue();
                    if (removed == -1)
                        System.out.println("The queue is empty. No customer to remove.");
                    else
                        System.out.println("Customer " + removed + " removed from the queue.");
                    break;

                case 3:
                    int front = queue.peek();
                    if (front == -1)
                        System.out.println("The queue is empty. No customer to view.");
                    else
                        System.out.println("First customer in queue: " + front);
                    break;

                case 4:
                    if (queue.isEmpty())
                        System.out.println("The queue is empty.");
                    else
                        System.out.println("The queue is not empty.");
                    break;

                case 5:
                    System.out.println("Exiting program...");
                    break;

                default:
                    System.out.println("Invalid choice! Please try again.");
            }
        } while (choice != 5);

        sc.close();
    }
}
