package doubly;

import java.util.Scanner;

public class DoublyLinkedListMenu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DoublyLinkedLIst list = new DoublyLinkedLIst();
        int choice, data;

        do {
            System.out.println("\nDoubly Linked List Operations:");
            System.out.println("1. Add at Front");
            System.out.println("2. Add at End");
            System.out.println("3. Delete from Front");
            System.out.println("4. Delete from End");
            System.out.println("5. Display Forward");
            System.out.println("6. Display Backward");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter data to add at front: ");
                    data = scanner.nextInt();
                    list.addFront(data);
                    System.out.println(data + " added to the front.");
                    break;

                case 2:
                    System.out.print("Enter data to add at end: ");
                    data = scanner.nextInt();
                    list.addEnd(data);
                    System.out.println(data + " added to the end.");
                    break;

                case 3:
                    System.out.println("Deleting from front...");
                    list.deleteFront();
                    break;

                case 4:
                    System.out.println("Deleting from end...");
                    list.deleteEnd();
                    break;

                case 5:
                    System.out.println("Displaying list forward:");
                    list.displayForward();
                    break;

                case 6:
                    System.out.println("Displaying list backward:");
                    list.displayBackward();
                    break;

                case 7:
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 7);

        scanner.close();
    }
}
