import java.util.Scanner;
public class sumAve {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        int[] num = new int[5];
        int sum = 0;
        int average;

        for(int a = 0; a < num.length; a++) {
            System.out.print("enter a number: ");
            num[a] = s.nextInt();

            sum += num[a];
        }

        average = sum/5;

        System.out.println("sum      : " + sum);
        System.out.println("average: " + average);
    }
}
