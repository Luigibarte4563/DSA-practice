import java.util.Scanner;

public class MissingNumberFinder {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a size of array: ");
        int n = s.nextInt();

        int[] arr = new int[n];
        int sum = 0;

        System.out.println("Enter a elements: ");
        for(int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
            sum += arr[i];
        }

        int expedtedSum = (n + 1) * (n + 2) / 2;
        int missingNumber = expedtedSum - sum;

        System.out.println("The missing number is " + missingNumber);

    }    
}
