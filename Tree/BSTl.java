import java.util.Scanner;

class Node {
    int data;
    Node left, right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

public class BSTl {

    static boolean search(Node root, int data) {
        if (root == null) return false;
        if(root.data == data) return true;
        if (data < root.data) return search(root.left, data);
        return search(root.right, data);
    }

    static Node insert(Node root, int data) {
        if (root == null) return new Node(data);
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
            int number = s.nextInt();

            if(number == 0) {
                isLooping = false;
            } else {
                root = insert(root, number);
            }
        }

        System.out.print("Enter number to search: ");
        int number = s.nextInt();

        if(search(root, number)) {
            System.out.println(number + " is found in BST");
        } else {
            System.out.println(number + " is NOT found in BST");
        }
    }
}
