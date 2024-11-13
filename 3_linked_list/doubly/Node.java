package doubly;

public class Node {
    int data;
    Node next;
    Node prev;
    public Node(int data){
        this.data=data;
        this.prev=null;
        this.next=null;
    }
}
