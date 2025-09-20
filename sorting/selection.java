public class insertion {
    public static void main(String[]args) {

        int[] num = {64, 25, 12, 22, 11};

        for(int a = 0; a < num.length; a++) {
            int min_index = a;
            for(int b = a + 1; b < num.length; b++) {
                if(num[b] < num[min_index]) {
                    min_index = b;
                    System.out.print("if ");
                    System.out.print(min_index);
                }
                System.out.print("for");
                System.out.print(num[b]);
            }
            int temp = num[a];
            num[a] = num[min_index];
            num[min_index] = temp;
        }

        System.out.println(); 
        System.out.println("After sorting ");
        for(int value : num) {
            System.out.print(value + " ");
        }
    }
}
