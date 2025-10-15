import java.util.Scanner;

class Nodee {
    String item;
    String discription;
    Nodee next;

    public Nodee(String item, String discription) {
        this.item = item;
        this.discription = discription;
        this.next = null;
    }
}

public class ManagementSystem {
    Nodee head;

    public void addItem(String item, String discription) {
        Nodee newNode = new Nodee(item, discription);

        if(head == null) {
            head = newNode;
            return;
        }

        Nodee current = head;
        while(current.next != null) {
            current = current.next;
        }

        current.next = newNode;
    }

    public void displayItems() {
        if(head == null) {
            System.out.println("Empty item");
            return;
        }

        System.out.println();
        System.out.println("INVENTORY:");

        Nodee current = head;
        int index = 1;
        while(current != null) {
            System.out.println("item " + index + " " + current.item);
            System.out.println("Discription " + current.discription);
            current = current.next;
            index++;
        }
    }


    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);
        ManagementSystem items = new ManagementSystem();

        System.out.print("how many item to add? ");
        int many = s.nextInt();
        s.nextLine();

        for(int a = 1; a <= many; a++) {
            System.out.print(a + ". Enter a item to add: ");
            String item = s.nextLine();

            System.out.print("Enter discription: ");
            String discript = s.nextLine();

            items.addItem(item, discript);
        }

        items.displayItems();
        s.close();
    }
}
