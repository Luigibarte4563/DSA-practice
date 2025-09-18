import java.util.Scanner;

public class bubblesort {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter a size of number: ");
        int size = s.nextInt();

        int[] num = new int[size];

        for(int i = 0; i < num.length; i++) {
            System.out.print("Enter a number " + (i + 1) + ": ");
            num[i] = s.nextInt();
        }

        System.out.print("Before sort: ");
        for(int value : num) {
            System.out.print(value + " ");
        }

        System.out.println();

        int n = num.length;
        boolean swapped;
        for(int i = 0; i < n - 1; i++) {
            swapped = false;
            for(int j = 0; j < n - 1 - i; j++) {
                if(num[j] > num[j + 1]){
                    int temp = num[j];
                    num[j]  = num[j + 1];
                    num[j + 1] = temp;
                    swapped = true;
                }
            }

            if(!swapped) break;
        }


        System.out.print("After sorting: ");
        for(int value : num) {
            System.out.print(value + " ");
        }
    }
}