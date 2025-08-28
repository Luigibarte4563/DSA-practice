import java.util.Scanner;

public class setARangeArr {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        int rangeArr = 0;

        System.out.print("enter a range of a array: ");
        rangeArr = s.nextInt();

        int[] nums = new int[rangeArr];

        for(int a = 0; a < nums.length; a++) {
            System.out.print("enter a number: ");
            nums[a] = s.nextInt();
        }

        for(int b =  nums.length - 1; b >= 0; b--) {
            if(nums[b] % 2 == 0) {
                System.out.println("this is even number: " + nums[b]);
            }
        }
    }    
}
