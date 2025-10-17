import java.util.Scanner;

class factorial {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = s.nextInt();

        int factorial = 1;

        for(int a = 1; a <= num; a++) {
            factorial = factorial * a;
        }

        System.out.println("The factorial of " + num + " is " + factorial);
    }
}