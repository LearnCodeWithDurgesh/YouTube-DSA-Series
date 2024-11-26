public class SimpleQueue {

    //array to store data
    private int[] queue;
    private int front;
    private int rear;
    private int capacity;

    public SimpleQueue(int capacity) {
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.front = 0;
        this.rear = -1;


    }

    //insert data at rear:Enqueue
    public void enqueue(int data) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full!!");
            return;
        }
        rear++;
        queue[rear] = data;
        System.out.println(data + "is inserted into queue");

    }

    //Dequeue: remove the element
    public int dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty !!");
            return -1;
        }
        int data = queue[front];
        front++;
        return data;

    }

    //Peek:
    public int peek() {
        if (front > rear) {
            System.out.println("Queue is empty !!");
            return -1;
        }
        return queue[front];
    }

    //display:
    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty!!");
            return;
        }

        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + "\t");
        }
        System.out.println();
    }

}
