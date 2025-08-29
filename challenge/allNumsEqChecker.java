import java.util.Scanner;

public class allNumsEqChecker {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Input first number: ");
        int num1 = s.nextInt();

        System.out.print("Input second number: ");
        int num2 = s.nextInt();

        System.out.print("Input third number: ");
        int num3 = s.nextInt();

        System.out.print("Input fourth number: ");
        int num4 = s.nextInt();

        if (num1 == num2) {
            if (num2 == num3) {
                if (num3 == num4) {
                    System.out.println("Numbers are equal");
                }
            }
        } else {
            System.out.println("Numbers are not equal");
        }
    }
}
