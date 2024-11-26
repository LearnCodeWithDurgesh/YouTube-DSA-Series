//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SimpleQueue simpleQueue = new SimpleQueue(5);
        simpleQueue.enqueue(200);
        simpleQueue.enqueue(300);
        simpleQueue.display();
        simpleQueue.enqueue(50);
        simpleQueue.display();
        System.out.println("Deleted : " + simpleQueue.dequeue());
        simpleQueue.display();
        simpleQueue.enqueue(10);
        simpleQueue.enqueue(15);

        simpleQueue.display();
        simpleQueue.enqueue(1000);
    }
}