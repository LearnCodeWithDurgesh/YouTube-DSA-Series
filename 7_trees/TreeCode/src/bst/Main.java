package bst;

import bst.gui.CustomPanel;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {


        // Insert : Adding
        // Deletion:
        // Search
        // Traversal


        BST tree = new BST();

        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(80);


        //////////////////

        JFrame frame = new JFrame("BST Visualizer");

        JPanel mainPanel = new CustomPanel(tree);


        //input box
        JTextField inputField = new JTextField(5);

        //input button
        JButton insertButton = new JButton("Insert");

        //delete button
        JButton deleteButton = new JButton("Delete");

        JPanel bottomPanel = new JPanel();

        bottomPanel.add(new JLabel(("Enter Number :")));
        bottomPanel.add(inputField);
        bottomPanel.add(insertButton);
        bottomPanel.add(deleteButton);


        insertButton.addActionListener(e -> {
            int value = Integer.parseInt(inputField.getText());
            tree.insert(value);
            mainPanel.repaint();
        });

        deleteButton.addActionListener(e -> {
            int value = Integer.parseInt(inputField.getText());
            tree.delete(value);
            mainPanel.repaint();
        });


        //main frame:

        frame.setLayout(new BorderLayout());
        frame.add(mainPanel, BorderLayout.CENTER);

        frame.add(bottomPanel, BorderLayout.SOUTH);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible((true));

//        System.out.println("Inorder Traversal");
//
//        tree.inOrder(tree.root);
//        System.out.println();
//        System.out.println("Preorder Traversal");
//        tree.preOrder(tree.root);
//        System.out.println();
//        System.out.println("Postorder Traversal");
//        tree.postOrder(tree.root);
//
//        System.out.println();
//        System.out.println("deleting 80");
//
//        tree.delete(80);
//        tree.inOrder(tree.root);
//        System.out.println();
//        System.out.println("Found: 40 : " + tree.search(40));
//        System.out.println();
//        System.out.println("Found: 32 : " + tree.search(32));

//

    }
}
