import java.util.Scanner;

public class twoDarrayWithInput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a size of row: ");
        int sizeRow = s.nextInt();

        System.out.print("Enter a size of col: ");
        int sizeCol = s.nextInt();

        int[][] numbers = new int[sizeRow][sizeCol];

        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print("Enter a number: ");
                numbers[row][col] = s.nextInt();
            }
        }

        System.out.println();
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
    }
}
