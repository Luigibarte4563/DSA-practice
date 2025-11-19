import java.util.Scanner;

public class Queue1 {
    private int[] numbers;
    private int front;
    private int rear;
    private int capacity;
    private int size;

    Queue1(int capacity) {
        this.capacity = capacity;
        numbers = new int[capacity];
        front = 0;   
        rear = -1;   
        size = 0;
    }

    void enqueue(int item) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }

        rear = (rear + 1) % capacity;
        numbers[rear] = item;
        size++;
    }

    int dequeue() {
        if (isEmpty()) {
            throw new IllegalStateException("Queue is empty");
        }

        int removeItem = numbers[front];
        front = (front + 1) % capacity;
        size--;
        return removeItem;
    }

    int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        return numbers[front];
    }

    boolean isEmpty() {
        return size == 0;
    }

    boolean isFull() {
        return size == capacity;
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Queue1 q = new Queue1(5);

        boolean isLooping = true;

        while (isLooping) {
            System.out.println("Select an Action");
            System.out.println("1. Enqueue");
            System.out.println("2. Dequeue");
            System.out.println("3. Peek");
            System.out.println("4. isEmpty");
            System.out.println("5. isFull");
            System.out.println("6. Exit");

            System.out.print("Enter an action to take: ");
            int select = s.nextInt();

            switch (select) {
                case 1:
                    System.out.print("Enter an item: ");
                    int item = s.nextInt();
                    q.enqueue(item);
                    System.out.println();
                    break;

                case 2:
                    try {
                        System.out.println("Removed: " + q.dequeue());
                    } catch (IllegalStateException e) {
                        System.out.println(e.getMessage());
                    }
                    System.out.println();
                    break;

                case 3:
                    System.out.println("Front: " + q.peek());
                    System.out.println();
                    break;

                case 4:
                    System.out.println(q.isEmpty());
                    System.out.println();
                    break;

                case 5:
                    System.out.println(q.isFull());
                    System.out.println();
                    break;

                case 6:
                    System.out.println("Exiting....");
                    isLooping = false;
                    break;

                default:
                    System.out.println("Invalid input");
                    break;
            }
        }

        s.close();
    }
}
