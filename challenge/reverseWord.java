import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String reverseWord = "";
		
		System.out.print("enter a word: ");
		String word = s.nextLine();
		;
		for(int i = word.length() - 1; i >= 0; i--){
			reverseWord = reverseWord + word.charAt(i);
		}
		
		System.out.println("the reverse word of: "  + word + " is " + reverseWord);
	}
}