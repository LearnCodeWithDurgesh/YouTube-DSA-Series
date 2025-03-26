package bst;

public class Node {
    int data;
    Node left, right;


    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

}
