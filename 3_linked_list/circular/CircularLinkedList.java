package circular;

public class CircularLinkedList {

    private Node head;
    private Node tail;

    public CircularLinkedList() {
        this.head = null;
        this.tail = null;
    }

    //add front
    //add data item to front (head)
    public void addFront(int data) {
        //create new node
        Node newNode = new Node(data);

        if (head == null) {
            this.head = newNode;
            this.tail = newNode;

            head.next = head;
            head.prev = head;

        } else {
            newNode.next = head;
            newNode.prev = tail;
            head.prev = newNode;
            tail.next = newNode;
            head = newNode;
        }


    }

    //add the data item to end
    public void addEnd(int data) {
        Node newNode = new Node(data);
        if (tail == null) {
            this.head = newNode;
            this.tail = newNode;
            head.next = head;
            head.prev = head;
        } else {
            newNode.prev = tail;
            newNode.next = head;
            tail.next = newNode;
            head.prev = newNode;
            tail = newNode;
        }

    }

    //delete from front:

    public void deleteFront() {
        if (head == null) {
            System.out.println("Empty List !!");
            return;
        }

        if (head == tail) {
            head = null;
            tail = null;
        } else {
            head = head.next;
            head.prev = tail;
            tail.next = head;
        }
    }

    // delete front end
    public void deleteEnd() {
        if (tail == null) {
            System.out.println("Empty List !!");
            return;
        }

        if (head == tail) {
            this.tail = null;
            this.head = null;
        } else {
            tail = tail.prev;
            tail.next = head;
            head.prev = tail;
        }

    }

    // display forward
    public void displayForward() {

        if (head == null) {
            System.out.println("List is empty !!");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + "\t");
            temp = temp.next;
        } while (temp != head);
        System.out.println();

    }

    // display backward
    public void displayBackward() {
        if (tail == null) {
            System.out.println("List is empty !!");
            return;
        }
        Node temp = tail;
        do {

            System.out.print(temp.data + "\t");
            temp = temp.prev;

        } while (temp != tail);
        System.out.println();
    }

}
