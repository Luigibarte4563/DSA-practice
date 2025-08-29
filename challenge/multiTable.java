import java.util.Scanner;

public class multiTable {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("enter a range of table: ");
        int range = s.nextInt();

        int[] toMultiply = new int[range];
        int product1;
        int product2;
        
        for(int a = 1; a <= toMultiply.length; a++) {
            for(int b = 1; b <= toMultiply.length; b++) {
                System.out.println(a + " x " + b + " = " + (a * b));
            }
            System.out.println();
         }
    }    
}
