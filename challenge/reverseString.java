package challenge;

import java.util.Scanner;

public class reverseString {
    public static void main(String[]args){

        Scanner s = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String word = s.nextLine();
        String reverse = "";

        for(int a = word.length() - 1; a >= 0; a--) {
            reverse = reverse + word.charAt(a);
        }

        System.out.println("reverse: " + reverse);
    }
}
