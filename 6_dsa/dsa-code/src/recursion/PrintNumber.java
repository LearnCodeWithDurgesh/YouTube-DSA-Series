package recursion;

public class PrintNumber {

    // recursion:
    static void printNumber(int n) {

        //base condition:
        if (n == 1) {
            //True
            System.out.println(n);
        } else {
            System.out.print(n + "\t");
            printNumber(n - 1);
        }

    }


    static void printNumber2(int n) {
        if (n == 1) {
            System.out.print(n+"\t");
        } else {
            printNumber2(n - 1);
            System.out.print(n + "\t");
        }
    }

    public static void main(String[] args) {


        // print 10 to 1

        int n = 10;
        printNumber(n);


        // 1 to 10

        printNumber2(n);


    }
}
