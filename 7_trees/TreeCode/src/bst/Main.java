package bst;

public class Main {
    public static void main(String[] args) {


        // Insert : Adding
        // Deletion:
        // Search
        // Traversal


        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(80);

        System.out.println("Inorder Traversal");

        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("Preorder Traversal");
        tree.preOrder(tree.root);
        System.out.println();
        System.out.println("Postorder Traversal");
        tree.postOrder(tree.root);

        System.out.println();
        System.out.println("deleting 80");

        tree.delete(80);
        tree.inOrder(tree.root);
        System.out.println();
        System.out.println("Found: 40 : " + tree.search(40));
        System.out.println();
        System.out.println("Found: 32 : " + tree.search(32));


    }
}
