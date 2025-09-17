package linkedList;

// Node class for Linked List
class Node {
    int data;      // Value stored in the node
    Node next;     // Reference to the next node

    // Constructor
    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

// Linked List class
class LinkedLists {
    Node head; // Head of the list

    // Insert a new node at the end
    public void insert(int data) {
        Node newNode = new Node(data);

        if (head == null) {  // If list is empty
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    // Delete a node by value
    public void delete(int data) {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        // If head needs to be removed
        if (head.data == data) {
            head = head.next;
            return;
        }

        Node current = head;
        while (current.next != null && current.next.data != data) {
            current = current.next;
        }

        if (current.next == null) {
            System.out.println("Value not found in the list!");
        } else {
            current.next = current.next.next;
        }
    }

    // Display all nodes
    public void display() {
        if (head == null) {
            System.out.println("List is empty!");
            return;
        }

        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("NULL");
    }
}

// Main class
public class LinkedList {
    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();

        // Insert elements
        list.insert(10);
        list.insert(20);
        list.insert(30);
        list.insert(40);

        System.out.println("Linked List:");
        list.display();

        // Delete an element
        list.delete(20);
        System.out.println("\nAfter deleting 20:");
        list.display();

        // Delete head
        list.delete(10);
        System.out.println("\nAfter deleting 10:");
        list.display();

        // Try to delete a non-existent value
        list.delete(100);
    }
}
