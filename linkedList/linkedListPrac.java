package linkedList;

import java.util.LinkedList;

public class linkedListPrac {
    public static void main(String[]args) {
        LinkedList<String> fruits = new LinkedList<>();

        fruits.add("banana");
        fruits.add("hotdog");
        fruits.add("champorado");

        System.out.println(fruits);

        System.out.println("First " + fruits.getFirst());
        System.out.println("Last " + fruits.getLast());


        fruits.remove("banana");
        System.out.println("After removal: " + fruits);

        for(String fruit : fruits) {
            System.out.println(fruit);
        }
    }    
}
