package linkedList;

import java.util.LinkedList;

public class LinkedListPrac1 {
    public static void main(String[]args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(20);
        list.add(30);

        list.add(1, 15);

        System.out.println("LinkedList " + list);

        System.out.println("First element " + list.getFirst());
        System.out.println("Last element " + list.getLast());

        list.removeFirst();
        list.removeLast();
        list.remove(1);

        System.out.println("After removal list: ");

        System.out.print("Tranversing: ");
        for(int num : list) {
            System.out.print(num + " -> ");
        }
        System.out.println("NULL");
    }    
}
