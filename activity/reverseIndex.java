import java.util.Scanner;

public class reverseIndex {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        int[] num = new int[5];

        for(int a = 0; a < num.length; a++) {
            System.out.print("enter a number: ");
            num[a] = s.nextInt();
        }

        System.out.println("the even index: " + num[4] + " " + num[2] + " " + num[0]);
    }    
}
