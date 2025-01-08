package recursion;

public class FibonacciRecursion {

    static int fabnocci(int n) {

        if (n == 0)
            return 0;

        if (n == 1)
            return 1;

        return fabnocci(n - 1) + fabnocci(n - 2);


    }

    static void printFabnocci(int item) {

        if (item == 0) {
            System.out.print(fabnocci(0) + "\t");
        } else {
            printFabnocci(item-1);
            int fabnocciAtIndex = fabnocci(item);
            System.out.print(fabnocciAtIndex + "\t");

        }
    }

    public static void main(String[] args) {

//        for (int i = 0; i <= 9; i++) {
//            System.out.print(fabnocci(i) + "\t");
//        }
//        System.out.println();

        printFabnocci(10);

    }


}
