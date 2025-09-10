package challenge;

import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        //sum and ave
        int sum = 0;
        double ave = 0;

        // odd or even
        int odd = 0;
        int even = 0;

        // size of array to input
        int size = 0;

        System.out.print("enter a size of input: ");
        size = s.nextInt();

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");

        int[] numbers = new int[size];
        
        for(int a = 0; a < numbers.length; a++) {
            System.out.print("enter a number: ");
            numbers[a] = s.nextInt();
        }

        System.out.println("");

        for(int b = numbers.length - 1; b >= 0; b--) {
            System.out.println(numbers[b] + " ");
        }

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");

        for(int c = 0; c < numbers.length; c++) {
            sum += numbers[c];
        }

        ave = sum/5;

        System.out.println("Sum: " + sum);
        System.out.println("Ave: " + ave);

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");

        // largest smallest 
        int largest = numbers[0];
        int smallest = numbers[0];

        for(int number : numbers) {
            if(largest < number){
                largest = number;
            }else if(smallest > number){
                smallest = number;
            }
        }

        System.out.println("Largest number is : " + largest);
        System.out.println("smallest number is : " + smallest);

        System.out.println("");
        System.out.println("------------------------");
        System.out.println("");

        for(int d = 0; d < numbers.length; d++) {
            if(numbers[d] % 2 != 0) {
                odd++;
            }else{
                even++;
            }
        }

        System.out.println("odd : " + odd);
        System.out.println("even : " + even);

    }    
}
