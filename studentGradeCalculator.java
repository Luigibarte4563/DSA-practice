import java.util.Scanner;

class studentGradeCalculator {
    public static void main(String[]args) {

        Scanner s = new Scanner(System.in);

        System.out.print("Enter number of students: ");
        int num = s.nextInt();
        s.nextLine();

        String[] names = new String[num];
        double[] average = new double[num]; 

        for(int a = 0; a < names.length; a++) {
            System.out.print("\nEnter name of student " + (a + 1) + ": ");
            names[a] = s.nextLine();

            double total = 0;
            for(int b = 0; b < 3; b++) {
                System.out.print("Enter grade " + (b + 1) + ": ");
                total += s.nextDouble();
            }
            s.nextLine();

            average[a] = total / 3;
        }

        System.out.println();
        for(int c = 0; c < average.length; c++) {
            if(average[c] >= 75) {
                System.out.println("Name: " + names[c] + " | " + "Avarage: " + average[c] + " | " + "Status: " + "PASSED");
            } else {
                System.out.println("Name: " + names[c] + " | " + "Avarage: " + average[c] + " | " + "Status: " + "FAILED");
            }
        }
    }
}