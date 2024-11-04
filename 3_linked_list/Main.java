
class Main {
    public static void main(String[] args) {
        // String str = new String();
        // System.out.println(str.isBlank());

        // Node node1 = new Node(34);
        // System.out.println(node1.data);
        // System.out.println(node1.next);

        // Node node2 = new Node(667);

        // node1.next = node2;

        // System.out.println(node1.next.data);
        // int x = 45;
        // // value copy
        // int y = x;
        // System.out.println(x);
        // System.out.println(y);
        // y = 90;
        // System.out.println(x);
        // System.out.println(y);
        Node node1 = new Node(12);
        Node node2 = node1;

        System.out.println(node1.data);
        System.out.println(node2.data);

        node2.data = 55;
        System.out.println(node1.data);
        System.out.println(node2.data);

    }
}