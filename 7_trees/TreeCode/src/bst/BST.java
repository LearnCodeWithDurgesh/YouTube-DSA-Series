package bst;

public class BST {
    private Node root;


    public Node getRoot() {
        return root;
    }

    public void setRoot(Node root) {
        this.root = root;
    }

    public BST() {
        this.root = null;
    }

    //    insert method
    private Node insert(Node root, int data) {
        //if root is null
        if (root == null) {
            Node node = new Node(data);
            return node;
        }

        if (data < root.data) {
            //left ki taraf approach karna hai.
            root.left = insert(root.left, data);
        } else if (data > root.data) {
            //right ki taraf approach karenge
            root.right = insert(root.right, data);
        }
        return root;

    }

    public void insert(int data) {
        root = this.insert(root, data);
    }

    // delete:
    private Node delete(Node root, int data) {

        if (root == null) {
            return null;
        }

        if (data < root.data) {
            root.left = delete(root.left, data);
        } else if (data > root.data) {
            root.right = delete(root.right, data);
        } else {

            //value mil gayi hai aur hame delete karna :
            //Case1: Node with no child (Leaf node)
            if (root.left == null && root.right == null) {
                return null;
            }
            // Case2: Node with one child
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Case3: node with two children
            else {
                Node successor = findMin(root.right);
                root.data = successor.data;
                root.right = delete(root.right, successor.data);

            }


        }

        return root;


    }


    public Node findMin(Node root) {
        while (root.left != null) {
            root = root.left;
        }
        return root;
    }


    public void delete(int data) {
        root = this.delete(root, data);
    }

    private boolean search(Node root, int data) {

        if (root == null) {
            return false;
        }
        if (root.data == data) {
            return true;
        }

//        if (data < root.data) {
//            return search(root.left, data);
//        } else {
//            return search(root.right, data);
//        }

        return data < root.data ? search(root.left, data) : search(root.right, data);


    }

    //    searching
    public boolean search(int data) {

        return search(root, data);
    }

    public void preOrder(Node node) {
        if (node == null) {
            return;
        }
        System.out.print(node.data + "\t");
        preOrder(node.left);
        preOrder(node.right);


    }
    //Inorder--> Left-->Root-->Right

    public void inOrder(Node node) {
        if (node == null) {
            return;
        }
        inOrder(node.left);
        System.out.print(node.data + "\t");
        inOrder(node.right);


    }

    //Post Order: Left-->Right-->Root
    public void postOrder(Node node) {
        if (node == null) {
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.data + "\t");
    }


}
