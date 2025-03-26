package bst.gui;

import bst.BST;
import bst.Node;

import javax.swing.*;
import java.awt.*;

public class CustomPanel extends JPanel {
    private BST tree;

    public CustomPanel(BST tree) {
        this.tree = tree;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        //draw custom components:
        drawTree(g, tree.getRoot(), getWidth() / 2, 50, getWidth() / 4);

    }

    //draw ka actual logic yaha pe hoga
    private void drawTree(Graphics g, Node node, int x, int y, int gap) {

        // logic to draw the tree
        if (node == null) {
            return;
        }

        g.setColor(Color.BLACK);
        g.fillOval(x - 15, y-15, 30, 30);
        g.setColor(Color.WHITE);
        g.drawString(String.valueOf(node.getData()), x - 5, y + 5);
        g.setColor(Color.BLACK);

        if (node.getLeft() != null) {
            g.drawLine(x, y, x - gap, y + 50);
            drawTree(g, node.getLeft(), x - gap, y + 50, gap / 2);
        }


        if (node.getRight() != null) {
            g.drawLine(x, y, x + gap, y + 50);
            drawTree(g, node.getRight(), x + gap, y + 50, gap / 2);
        }

    }

}
