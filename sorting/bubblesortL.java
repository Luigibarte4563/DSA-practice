import java.util.Scanner;

public class bubblesortL {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number of students: ");
        int students = s.nextInt();

        int[] grade = new int[students];

        for(int a = 0; a < grade.length; a++) {
            System.out.print("Enter a grade of student: ");
            grade[a] = s.nextInt();
        }

        System.out.print("Before the sorting: ");
        for(int before : grade){
            System.out.print(before + " ");
        }

        for(int b = 0; b < grade.length; b++) {
            for(int c = 0; c < grade.length - 1; c++) {
                int temp = grade[c];
                if(grade[c] > grade[c + 1]){
                    grade[c] = grade[c + 1];
                    grade[c + 1] = temp; 
                }
            }
        }

        System.out.println();
        System.out.print("After the sort: ");
        for(int after : grade) {
            System.out.print(after + " ");
        }
    }    
}
