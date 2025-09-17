package linkedList;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void insert(int data) {
        Node newNode = new Node(data);

        if(head == null) {
            head = newNode;
        }else {
            Node current = head;
            
            while(current != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    public void display() {
        Node current = head;

        while(current != null) {
            System.out.print(current.data + " -> ");
            current =  current.next;
        }
        System.out.print("NULL");
    }

    public static void main(String[]args) {
        LinkedList list = new LinkedList();

        list.insert(10);
        list.insert(20);
        list.insert(30);

        list.display();
    }
}
