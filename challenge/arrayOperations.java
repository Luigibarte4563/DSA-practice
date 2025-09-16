import java.util.Scanner;

class arrayOperations {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        int odd = 0;
        int even = 0;

        int sum = 0;
        double ave = 0;
        

        System.out.print("Enter a number of Element: ");
        int size = s.nextInt();

        int[] arr = new int[size];

        for(int a = 0; a < arr.length; a++) {
            System.out.print("Enter a number " + (a + 1) + ": " );
            arr[a] = s.nextInt();
            
            sum += arr[a];

            if(arr[a] % 2 != 0) {
                odd++;
            }else{
                even++;
            }
        }

        System.out.print("Numbers: ");
        for(int b = 0; b < arr.length; b++) {
            System.out.print(arr[b] + " ");
        }

        int largest = arr[0];
        int smallest = arr[0];

        for(int c = 1; c < arr.length; c++) {
            if(largest > arr[c]) {
                largest = arr[c];
            }else if(smallest < arr[c]) {
                smallest = arr[c];
            }
        }

        System.out.println();

        ave = (double) sum/size;

        System.out.println("Largest: " + largest);
        System.out.println("Smallest: " + smallest);
        System.out.println("Average: " + ave);
        System.out.println("Even count: " + even);
        System.out.println("Odd count: " + odd);
        
    }
}