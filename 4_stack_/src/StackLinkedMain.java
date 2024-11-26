public class StackLinkedMain {
    public static void main(String[] args) {

        StackLinkedList stackLinkedList = new StackLinkedList();
        stackLinkedList.display();
        stackLinkedList.push(20);
        stackLinkedList.push(10);
        stackLinkedList.push(30);
        stackLinkedList.display();
        System.out.println(stackLinkedList.pop());
        stackLinkedList.display();
        System.out.println(stackLinkedList.peek());
        stackLinkedList.display();

    }
}
