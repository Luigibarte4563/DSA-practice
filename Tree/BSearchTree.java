import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class BSearchTree {
    
    static boolean search(Node root, int data) {
        if(root == null) return false;
        if(root.data == data) return true;
        if(data < root.data) return search(root.left, data);
        return search(root.right, data);
    }

    static Node insert(Node root, int data) {
        if(root == null) return new Node(data);
        if(data < root.data) root.left = insert(root.left, data);
        else root.right = insert(root.right, data);
        return root;
    }

    public static void main(String[]args) {
        Scanner s = new Scanner(System.in);

        Node root = null;

        boolean isLooping = true;

        while(isLooping) {

            System.out.print("Enter a number to insert(0 to stop): ");
            int ID = s.nextInt();

            if(ID == 0) {
                isLooping = false;
            } else {
                
                
                if(search(root, ID)) {
                    System.out.println("ID " + ID + " Already exist in NODE");
                } else {
                    System.out.println("ID " + ID + " Successfull Registed.");
                }

                root = insert(root, ID);
            }
        }
    }
}
