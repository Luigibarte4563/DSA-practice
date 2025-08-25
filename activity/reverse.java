import java.util.Scanner;

class reverse {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        int[] num = new int[5];

        for(int a = 0; a < num.length; a++) {
            System.out.print("Enter a number: ");
            num[a] = s.nextInt();
        }

        for(int b = 4; b >= 0; b--) {
            System.out.println(num[b]);
        }
    }
}