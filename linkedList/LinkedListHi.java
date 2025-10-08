package LinkedList;

import java.util.Scanner;

class Node {
    String task;
    Node next;

    public Node(String task) {
        this.task = task;
        this.next = null;
    }
}

class LinkedListHi {

    private Node head;

    public void addTask(String task) {
        Node newNode = new Node(task);

        if(head == null) {
            head = newNode;
        } else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayTask() {
        if(head == null) {
            System.out.println("Your To-Do List is empty");
        }
        Node current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". " + current.task);
            current = current.next;
            index++;
        }
    }

    public static void main(String[]args) {
        LinkedListHi list = new LinkedListHi();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of tasks: ");
        int size = s.nextInt();
        s.nextLine();

        for(int a = 1; a <= size; a++) {
            System.out.print("Enter a task " + a + ": ");
            String task = s.nextLine();
            list.addTask(task);
        }

        System.out.println();
        System.out.println("Your To-Do List");
        list.displayTask();
    }
}
