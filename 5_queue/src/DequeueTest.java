public class DequeueTest {
    public static void main(String[] args) {



        DeQueue deQueue = new DeQueue(5);

        deQueue.insertRear(10);
        deQueue.insertRear(40);
        deQueue.insertFront(500);
        deQueue.insertFront(300);
        deQueue.insertRear(700);
        deQueue.display();

        System.out.println("size : "+deQueue.size());
        System.out.println("rear data: "+deQueue.getRear());
        System.out.println("front data: "+deQueue.getFront());

        deQueue.deleteFront();
        deQueue.deleteRear();

        deQueue.display();

    }
}
