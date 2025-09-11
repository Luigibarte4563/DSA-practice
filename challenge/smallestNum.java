package challenge;

import java.util.Scanner;

public class smallestNum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter a size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for (int i = 0; i < arr.length; i++) {
            System.out.print("enter a number: " + (i + 1) + ". ");
            arr[i] = s.nextInt();
        }

        int smallest = arr[0];

        for (int a = 1; a < arr.length; a++) {
            if (arr[a] < smallest) {
                smallest = arr[a];
            }
        }

        System.out.println("the snallest: " + smallest);
    }
}
