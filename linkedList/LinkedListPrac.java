
import java.util.Scanner;

class Node {
   String task;
   Node next;
   
   public Node(String task) {
      this.task = task;
      this.next = null;
   }
}

class LinkedList {
   Node head;
   
   public void addTask(String task) {
      Node newNode = new Node(task);
      
      if(head == null) {
         head = newNode;
      } else {
         Node current = head;
         
         while(current.next != null) {
            current = current.next;
         }
         current.next = newNode;
      }
   }
   
   public void display() {
      if(head == null) {
         System.out.println();
         System.out.println("your task is empty");
      } else {
         Node current = head;
         int index = 1;
         
         System.out.println();
         System.out.println("your tasks");
         while(current != null) {
            System.out.println(index + ". " + current.task);
            current = current.next;
            index++;
         }
      }
   }
   
   public static void main(String[]args) {
      Scanner s = new Scanner(System.in);
      LinkedList list = new LinkedList();
      
      boolean isLooping = true;
      
      while(isLooping) {
      
         System.out.println("this is the choices:");
         System.out.println("1. add task");
         System.out.println("2. display");
         System.out.println();
         System.out.print("Enter your choice: ");
         int choice = s.nextInt();
         s.nextLine();
         
         switch(choice) {
            case 1:
               System.out.print("Enter a number: ");
               int n = s.nextInt();
               s.nextLine();
               
               for(int a = 1; a <= n; a++) {
                  System.out.print(a + ". Enter your task: ");
                  String task = s.nextLine();
                  list.addTask(task);
               }
           break;
           case 2:
               list.display();
           break;
           default:
               System.out.println("You enter a invalid choice");
           break;
         }
         
         System.out.println();
         System.out.print("You want to continue? y/n: ");
         String con = s.nextLine();
         
         if(con.equalsIgnoreCase("y")) {
            isLooping = true;
         } else {
            isLooping = false;
         }
      }
   }
}