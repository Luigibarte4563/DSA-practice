import java.util.Scanner;

public class searching {
    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);


        System.out.print("Enter a number of names: ");
        int size = s.nextInt();
        s.nextLine();

        String[] names = new String[size];

        for(int b = 0; b < names.length; b++) {
            System.out.print("Enter name: ");
            names[b] = s.nextLine();
        }

        System.out.print("Enter a name to search: ");
        String target = s.nextLine();

        int linearIndex = -1;
        for(int a = 0; a < names.length; a++) {
            if(names[a].equalsIgnoreCase(target)) {
                linearIndex = a;
                break;
            }
        }

        if(linearIndex != -1) {
            System.out.println("Value " + target + " found at index " + linearIndex);
        }else {
            System.out.println("value " + linearIndex + " not found!");
        }
    }    
}
