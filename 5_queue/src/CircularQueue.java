public class CircularQueue {

    private int[] queue;
    private int front;
    private int rear;
    private int size;
    private int capacity;

    public CircularQueue(int capacity) {

        queue = new int[capacity];
        front = 0;
        rear = -1;
        size = 0;
        this.capacity = capacity;

    }

    //insert an element :[R]
    public void enqueue(int data) {

        if (size == capacity) {
            System.out.println("Queue is full ");
            return;
        }
        //capacity=10
        //rear (9+1)%10===>0
        rear = (rear + 1) % capacity;
        queue[rear] = data;
        size++;

    }

    //delete from front:
    public int dequeue() {
        if (size == 0) {
            System.out.println("Queue is empty!!");
            return -1;
        }
        //actual delete
        int data = queue[front];
        front = (front + 1) % capacity;
        size--;
        return data;
    }

    //return no of elements
    public int size() {
        return this.size;
    }

    public void display() {
        if (this.size == 0) {
            System.out.println("Queue is empty");
            return;
        }


        for (int i = 0; i < size; i++) {
            int data = queue[(front + i) % capacity];
            System.out.print(data + "\t");
        }
        System.out.println();
    }


}
