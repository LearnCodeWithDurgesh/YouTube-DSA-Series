package singly;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void printMenu() {
        System.out.println("************MENU********");
        System.out.println("ENTER 1 TO INSERT");
        System.out.println("ENTER 2 TO DELETE");
        System.out.println("ENTER 3 TO SEARCH");
        System.out.println("ENTER 4 TO DISPLAY");
        System.out.println("ENTER 5 TO EXIT");

        System.out.println("Enter your choice??");
        System.out.println("**************************");
    }

    public static void printInsertMenu() {
        System.out.println("Press 1 to insert from HEAD");
        System.out.println("Press 2 to insert from TAIL");
        System.out.println("Press 3 to insert at specific Position");
    }

    public static void printDeleteMenu() {
        System.out.println("Press 1 to delete from HEAD");
        System.out.println("Press 2 to delete from TAIL");
        System.out.println("Press 3 to delete from specific Position");
    }

    public static void main(String[] args) {

//        LinkedList linkedList = new LinkedList();
//        linkedList.insertAtBeginning(12);
////        linkedList.insertAtBeginning(11);
//        linkedList.insertAtEnd(13);
//        linkedList.insertAtEnd(908);
//        linkedList.insertAtEnd(1232);
//        linkedList.insertAtPosition(10,2);
//        linkedList.insertAtBeginning(111);
//        linkedList.insertAtBeginning(23);
//        linkedList.insertAtBeginning(45);
//        linkedList.insertAtEnd(33);
//        linkedList.insertAtEnd(45);
//        linkedList.printData();
        System.out.println("******Welcome to LinkedList App*****");
        ///data structure implement
        LinkedList linkedList = new LinkedList();
        Scanner scanner = new Scanner(System.in);
        while (true) {

            try {


                printMenu();
                //read the choice
                int choice = scanner.nextInt();
                if (choice == 1) {
                    //insert op
                    insertLinkedList(linkedList);

                } else if (choice == 2) {
                    //delete op
                    deleteFromLinkedList(linkedList);
                } else if (choice == 3) {
                    //search op

                    System.out.println("Enter the data you want to search ??");
                    int data = scanner.nextInt();
                    boolean result = linkedList.searchData(data);
                    if (result) {
                        System.out.println("Yes, data is present in list");
                    } else {
                        System.out.println("Data is not present in list");
                    }

                } else if (choice == 4) {
                    linkedList.printData();
                } else if (choice == 5) {
//                  exit
                    System.out.println("Thank you for using App");
                    break;
                } else {
                    System.out.println("Invalid Choice !!");
                }


            } catch (Exception ex) {
                System.out.println(ex.getMessage());
            }


        }


    }

    private static void insertLinkedList(LinkedList linkedList) {
        printInsertMenu();

        System.out.println("Enter choice ??");
        Scanner scanner = new Scanner(System.in);
        int insertChoice = scanner.nextInt();
        if (insertChoice == 1) {
            System.out.println("Enter your data : ");
            int data = scanner.nextInt();
            linkedList.insertAtBeginning(data);
            System.out.println("Success !!");
        } else if (insertChoice == 2) {
            System.out.println("Enter your data : ");
            int data = scanner.nextInt();
            linkedList.insertAtEnd(data);
            System.out.println("Success!!");
        } else if (insertChoice == 3) {
            System.out.println("Enter position :");
            int position = scanner.nextInt();
            System.out.println("Enter Data :");
            int data = scanner.nextInt();
            linkedList.insertAtPosition(data, position);
            System.out.println("Success !!");
        } else {
            System.out.println("Invalid Choice !!");
        }

    }

    private static void deleteFromLinkedList(LinkedList linkedList) {

        printDeleteMenu();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter delete Choice ??");
        int deleteChoice = scanner.nextInt();
        if (deleteChoice == 1) {
            linkedList.deleteFirst();
            System.out.println("Deleted !!");
        } else if (deleteChoice == 2) {
            linkedList.deleteLast();
            System.out.println("Deleted !!");
        } else if (deleteChoice == 3) {
            System.out.println("Enter the position :");
            int position = scanner.nextInt();
            linkedList.deleteFromPosition(position);
            System.out.println("Deleted !!");
        } else {
            System.out.println("Invalid Delete Choice !");
        }


    }
}
