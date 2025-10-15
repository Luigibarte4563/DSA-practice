import java.util.Scanner;

class Node {
    String task;
    Node next;

    public Node(String task) {
        this.task = task;
        this.next = null;
    }
}
public class linkedlistprac2 {
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

    public void display() {
        if(head == null) {
            System.out.println("The head is empty");
            return;
        }

        Node current = head;
        int index = 1;
        while(current != null) {
            System.out.println(index + ". Task: " + current.task);
            current = current.next;
            index++;
        }
    }

    public static void main(String[]args) {
        linkedlistprac2 list = new linkedlistprac2();
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();
        s.nextLine();

        for(int a = 1; a <= num; a++) {
            System.out.print("Enter a task: ");
            String task = s.nextLine();
            list.addTask(task);
        }

        System.out.println();
        System.out.println("Tasks");
        list.display();
    }
}
