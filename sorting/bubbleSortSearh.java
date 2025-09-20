import java.util.Scanner;

class buubbleSort {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number of students: ");
        int size = s.nextInt();

        int[] students = new int[size];

        for(int a = 0; a < students.length; a++) {
            System.out.print("Enter a grade of Student " + (a + 1) + ": ");
            students[a] = s.nextInt();
        }

        System.out.print("Before the sort: ");
        for(int studentC : students) {
            System.out.print(studentC + " ");
        }

        for(int b = 0; b < students.length; b++) {
            for(int c = 0; c < students.length -1; c++) {
                int temp = students[c];
                if(students[c] > students[c + 1]) {
                    students[c] = students[c + 1];
                    students[c + 1] = temp;
                } 
            }
        }

        System.out.println();
        System.out.print("After the sort: ");
        for(int studentB : students) {
            System.out.print(studentB + " ");
        }

        System.out.println();
        System.out.print("Enter a target grade: ");
        int target = s.nextInt();

        int index = -1;
        for(int d = 0; d < students.length; d++) {
            if(students[d] == target){
                index = d;
                break;
            }
        }

        if(index != -1) {
            System.out.print("Number " + target + " found at index " + index);
        }else {
            System.out.print("Number " + target + " not found!");
        }
    }
}