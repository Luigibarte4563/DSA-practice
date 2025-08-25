import java.util.Scanner;
public class oodAndEven {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        int[] num = new int[5];
        int odd = 0;
        int even = 0;
        int sum = 0;
        int average;

        for(int a = 0; a < num.length; a++) {
            System.out.print("enter a number: ");
            num[a] = s.nextInt();

            if(num[a] % 2 != 0) {
                odd++;
            }else{
                even++;
            }
        }

        System.out.println("Even: " + even);
        System.out.println("Odd: " + odd);
    }
}
