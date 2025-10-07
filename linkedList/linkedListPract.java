package LinkedList;

public class linkedListPrac {

    static class Node {
        int data;
        Node next;

        Node(int data, Node next) {
            this.data = data;
            this.next = null;
        }
    }

    Node head;

    public void add(int data) {
        Node newNode = new Node(data);

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

    public void display() {
        Node current = head;

        if (current == null) {
            System.out.println("List is empty");
            return;
        }

        System.out.print("Linked List: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        linkedListPrac list = new linkedListPrac();

        list.add(10);
        list.add(20);
        list.add(30);
        list.display();
    }
}
