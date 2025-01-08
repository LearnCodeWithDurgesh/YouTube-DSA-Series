package stack.practice;

import stack.Stack;

public class QueueUsingStack {

    //stack1 for enqueue
    // stack2 for dequeue

    private Stack stack1;
    private Stack stack2;
    private int size;

    public QueueUsingStack(int size) {
        this.size = size;
        stack1 = new Stack(this.size);
        stack2 = new Stack(this.size);
    }

    public void enqueue(int data) {
        this.stack1.push(data);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty !!");
            return -1;
        } else {

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }

            return stack2.pop();
        }
    }

    public int peek() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty !!");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();

    }

    public boolean isEmpty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }

    public static void main(String[] args) {


        System.out.println("creating queue");

        QueueUsingStack queueUsingStack = new QueueUsingStack(3);

        queueUsingStack.enqueue(20);
        queueUsingStack.enqueue(10);
        System.out.println(queueUsingStack.dequeue());
        System.out.println(queueUsingStack.dequeue());
    }

}
