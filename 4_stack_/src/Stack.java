import java.security.Principal;

public class Stack {

    private int[] array;
    private int maxSize;
    private int top = 0;

    public Stack(int size) {

        this.maxSize = size;
        array = new int[maxSize];
        top = -1;

    }

    //push operations
    public void push(int data) {
        if (top == maxSize - 1) {
            System.out.println("Stack is full !!");
            return;
        } else {
            top++;
            array[top] = data;
        }
    }

    //check empty
    public boolean isEmpty() {
        return top == -1;
    }

    //pop operations
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty !!");
            return -1;
        } else {
            int popElement = array[top];
            top--;
            return popElement;
        }
    }

    //peek operations
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty !!");
            return -1;
        } else {
            return array[top];
        }
    }

    //display:
    public void displayElements() {
        if (isEmpty()) {
            System.out.println("Stack is empty !!");
            return;
        }

        for (int i = 0; i <= top; i++) {
            System.out.print(array[i] + "\t");
        }
        System.out.println();

    }

}
