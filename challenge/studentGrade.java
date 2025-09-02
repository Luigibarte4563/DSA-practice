import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter a student: ");
		int studentCount = s.nextInt();
		
		int[] numStud = new int[studentCount];
		int highest = numStud[0];
		int lowest = numStud[0];
		int sum = 0;
		
	   for(int a = 0; a < numStud.length; a++){
	   	
	   	System.out.print("Enter grade for student " + (a + 1) + ": ");
	   	numStud[a] = s.nextInt();
	   	
	   	sum += numStud[a];
	   }
	   
	   for(int b = 1; b < numStud.length; b++){
	   	if(numStud[b] > highest){
	   		highest = numStud[b];
	   	}
	   }
	   
	   for(int c = 1; c < numStud.length; c++){
	   	if(numStud[c] < lowest){
	   		lowest = numStud[c];
	   	}
	   }
	   
	   int average = sum/numStud.length;
	   System.out.println("Average : " + average);
	   System.out.println("highest  : " + highest );
	   System.out.println("lowest   : " + lowest);
	}
}