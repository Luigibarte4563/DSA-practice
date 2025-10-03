package labActivity;

import java.util.Scanner;

class Node {
    String task;
    Node next;

    public Node(String task) {
        this.task = task;
        this.next = null;
    }
}


class ToDoList {
    private Node head;

    public void addTask(String task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void displayTasks() {
        if (head == null) {
            System.out.println("Your To-Do List is empty.");
            return;
        }
        Node current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". " + current.task);
            current = current.next;
            index++;
        }
    }

    public void deleteTask(String task) {
        if (head == null) {
            System.out.println("Your To-Do List is empty. Nothing to delete.");
            return;
        }

        if (head.task.equals(task)) {
            head = head.next;
            System.out.println("Task \"" + task + "\" deleted successfully.");
            return;
        }

        Node current = head;
        Node prev = null;

        while (current != null && !current.task.equals(task)) {
            prev = current;
            current = current.next;
        }

        if (current == null) {
            System.out.println("Task not found.");
        } else {
            prev.next = current.next;
            System.out.println("Task \"" + task + "\" deleted successfully.");
        }
    }
}

public class toDoListApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ToDoList list = new ToDoList();

        System.out.print("Enter number of tasks: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 1; i <= n; i++) {
            System.out.print("Enter task " + i + ": ");
            String task = sc.nextLine();
            list.addTask(task);
        }

        System.out.println("\nYour To-Do List:");
        list.displayTasks();

        System.out.print("\nEnter a task to delete: ");
        String deleteTask = sc.nextLine();
        list.deleteTask(deleteTask);

        System.out.println("\nUpdated To-Do List:");
        list.displayTasks();

        sc.close();
    }
}
