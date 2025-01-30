package binary;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        // tree banna start karte.


        //creating root node
        Node root = new Node(1);
        //left child of root
        Node left = new Node(2);
        //right child of root
        Node right = new Node(3);

        //setting root of the binary tree
//        binaryTree.root=root;
        BinaryTree binaryTree = new BinaryTree(root);
        binaryTree.root.left = left;
        binaryTree.root.right = right;

        //node 4 and 5
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        binaryTree.root.left.left = node4;
        binaryTree.root.left.right = node5;

        //node 6
        Node node6 = new Node(6);
        binaryTree.root.right.right = node6;

        // traversal

        System.out.println("Preorder:");
        binaryTree.preOrder(binaryTree.root);
        System.out.println();

        System.out.println("In order");

        binaryTree.inOrder(binaryTree.root);
        System.out.println();
        System.out.println("Postorder");
        binaryTree.postOrder(binaryTree.root);



    }
}