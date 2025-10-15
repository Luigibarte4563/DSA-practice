import java.util.Scanner;

class Node {
    String event;
    int date;
    String location;
    Node next;

    public Node(String event, int date, String location) {
        this.event = event;
        this.date = date;
        this.location = location;
        this.next = null;
    }
}

public class LinkedList {
    Node head;

    public void addEvent(String event, int date, String location) {
        Node newNode = new Node(event, date, location);

        if (head == null) {
            head = newNode;
            return;
        }

        Node current = head;

        while (current.next != null) {
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;

    }

    public void displayEvent() {
        if (head == null) {
            System.out.println("Does not have any event here.");
        }

        Node current = head;
        int index = 1;

        System.out.println("EVENTS: ");
        while (current != null) {
            System.out.println(index + ". " + "event  : " + current.event + "\n"
                    + "date    : " + current.date + "\n"
                    + "location: " + current.location);
            current = current.next;
            index++;        
        }
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        LinkedList events = new LinkedList();

        System.out.print("how many event do you like to create? ");
        int size = s.nextInt();
        s.nextLine();

        for (int a = 1; a <= size; a++) {
            System.out.print("Enter event   : ");
            String event = s.nextLine();

            System.out.print("Enter date    : ");
            int date = s.nextInt();
            s.nextLine();

            System.out.print("Enter location: ");
            String location = s.nextLine();
            System.out.println();

            events.addEvent(event, date, location);
        }

        events.displayEvent();
        s.close();
    }
}
