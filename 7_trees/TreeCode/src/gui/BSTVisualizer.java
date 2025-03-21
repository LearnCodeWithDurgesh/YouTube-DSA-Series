package gui;
import javax.swing.*;
import java.awt.*;

class TreeNode {
    int val;
    TreeNode left, right;

    public TreeNode(int val) {
        this.val = val;
        left = right = null;
    }
}

class BST {
    TreeNode root;

    public void insert(int val) {
        root = insertRec(root, val);
    }

    private TreeNode insertRec(TreeNode root, int val) {
        if (root == null) return new TreeNode(val);
        if (val < root.val) root.left = insertRec(root.left, val);
        else if (val > root.val) root.right = insertRec(root.right, val);
        return root;
    }

    public void delete(int val) {
        root = deleteRec(root, val);
    }

    private TreeNode deleteRec(TreeNode root, int val) {
        if (root == null) return null;

        if (val < root.val) root.left = deleteRec(root.left, val);
        else if (val > root.val) root.right = deleteRec(root.right, val);
        else {
            if (root.left == null) return root.right;
            if (root.right == null) return root.left;
            TreeNode minNode = findMin(root.right);
            root.val = minNode.val;
            root.right = deleteRec(root.right, minNode.val);
        }
        return root;
    }

    private TreeNode findMin(TreeNode root) {
        while (root.left != null) root = root.left;
        return root;
    }
}

class BSTPanel extends JPanel {
    BST tree;

    public BSTPanel(BST tree) {
        this.tree = tree;
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        drawTree(g, tree.root, getWidth() / 2, 50, getWidth() / 4);
    }

    private void drawTree(Graphics g, TreeNode node, int x, int y, int gap) {
        if (node == null) return;
        g.setColor(Color.BLACK);
        g.fillOval(x - 15, y - 15, 30, 30);
        g.setColor(Color.WHITE);
        g.drawString(String.valueOf(node.val), x - 5, y + 5);
        g.setColor(Color.BLACK);

        if (node.left != null) {
            g.drawLine(x, y, x - gap, y + 50);
            drawTree(g, node.left, x - gap, y + 50, gap / 2);
        }
        if (node.right != null) {
            g.drawLine(x, y, x + gap, y + 50);
            drawTree(g, node.right, x + gap, y + 50, gap / 2);
        }
    }
}

public class BSTVisualizer {
    public static void main(String[] args) {
        BST tree = new BST();
        JFrame frame = new JFrame("BST Visualizer");
        BSTPanel panel = new BSTPanel(tree);

        JTextField inputField = new JTextField(5);
        JButton insertButton = new JButton("Insert");
        JButton deleteButton = new JButton("Delete");

        insertButton.addActionListener(e -> {
            int val = Integer.parseInt(inputField.getText());
            tree.insert(val);
            panel.repaint();
        });

        deleteButton.addActionListener(e -> {
            int val = Integer.parseInt(inputField.getText());
            tree.delete(val);
            panel.repaint();
        });

        JPanel controlPanel = new JPanel();
        controlPanel.add(new JLabel("Enter value: "));
        controlPanel.add(inputField);
        controlPanel.add(insertButton);
        controlPanel.add(deleteButton);


        frame.setLayout(new BorderLayout());
        frame.add(panel, BorderLayout.CENTER);
        frame.add(controlPanel, BorderLayout.SOUTH);
        frame.setSize(600, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}