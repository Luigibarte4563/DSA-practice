import java.util.Scanner;
import java.util.Arrays;

class gradeAnalyzer {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        int[] scores = new int[5];

        for (int i = 0; i < scores.length; i++) {
            System.out.print("Enter score #" + (i + 1) + ": ");
            scores[i] = s.nextInt();
        }

        int highest = scores[0];
        int lowest = scores[0];
        int sum = 0;

        for (int score : scores) {
            if (score > highest) {
                highest = score;
            } else {
                lowest = score;
            }

            sum += score;
        }

        double average = (double) sum / scores.length;

        Arrays.sort(scores);

        System.out.println("\n===== Results =====");
        System.out.println("Highest Score: " + highest);
        System.out.println("Lowest Score: " + lowest);
        System.out.println("Average Score: " + average);
        System.out.println("Scores in ascending order: " + Arrays.toString(scores));
    }
}