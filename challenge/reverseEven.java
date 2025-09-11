package challenge;

import java.util.Scanner;

public class reverseEven {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter a size of array: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for(int i = 0; i < arr.length; i++) {
            System.out.print("enter a number: ");
            arr[i] = s.nextInt();
        }

        System.out.print("even index : ");
        for(int b = arr.length - 2; b > 0; b--) {
            if(arr[b] % 2 == 0) {
                System.out.print(arr[b] + " ");
            }
        }
    }    
}
