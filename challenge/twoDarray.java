class twoDarray {
    public static void main(String[]args) {

        int[][] numbers = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        for(int row = 0; row < numbers.length; row++) {
            for(int col = 0; col < numbers.length; col++) {
                System.out.print(numbers[row][col] + " ");
            }
            System.out.println();
        }
    }
}