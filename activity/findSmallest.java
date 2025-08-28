import java.util.Scanner;

public class findSmallest {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        int[] num = new int[5];

        for(int a = 0; a < num.length; a++) {
            System.out.print("enter a number: ");
            num[a] = s.nextInt();
        }

        int smallest = num[0];
        
        for(int b = 0; b < num.length; b++) {
            if(smallest >= num[b]) {
                smallest = num[b];
            }
        }

        System.out.println("The smallest number is: " + smallest);
    }    
}
