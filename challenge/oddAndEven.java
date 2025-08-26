package challenge;

import java.util.Scanner;

public class oddAndEven {

    public static int num = 0;

    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter a number: ");
        num = s.nextInt();

        oddAndEvenChecker(num);
    }

    public static void oddAndEvenChecker(int num) {
       if(num % 2 != 0) {
            System.out.println("Odd");
        }else {
            System.out.println("even");
        }
    }
}