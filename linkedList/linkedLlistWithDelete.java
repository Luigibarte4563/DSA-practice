import java.util.Scanner;

class Node  {
    String task;
    Node next;

    public Node(String task) {
        this.task = task;
        this.next = null;
    }
}

public class linkedLlistWithDelete {
    Node head;

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

    public void deleteTask(int position) {
        if(head == null) {
            System.out.println("The list is empty, Nothing to delete.");
            return;
        }

        if(position == 1) {
            System.out.println("Deleted task: " + head.task);
            head = head.next;
            return;
        }

        Node current = head;
        Node previous = null;
        int index = 1;

        while(current != null && index < position) {
            previous = current;
            current = current.next;
            index++;
        }

        if(current  == null) {
            System.out.println("Invalid postion. No task to delete");
        } else {
            System.out.println("Deleted task: " + current.task);
            previous.next = current.next;
        }
    }

    public void display() {
        if(head == null) {
            System.out.println("The task is empty");
        }

        Node current = head;
        int index = 1;
        while(current != null) {
            System.out.println(index + ". Task " + current.task );
            current = current.next;
            index++;
        }
    }

    public static void main(String[]main) {
        linkedLlistWithDelete list = new linkedLlistWithDelete();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();
        s.nextLine();

        for(int a = 1; a <= num; a++) {
            System.out.print(a + ". enter a task: ");
            String task = s.nextLine();
            list.addTask(task);
        }

        System.out.println();
        System.out.print("enter a number to delete: ");
        int del = s.nextInt();
        list.deleteTask(del);
        
        System.out.println();
        System.out.println("Tasks");
        list.display();
    }
}
