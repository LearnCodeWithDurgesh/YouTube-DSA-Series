package recursion;

public class Main {


    static void printData1(int n) {
        System.out.println(n);
    }

    static void printData(int n) {
        System.out.println(n);
        printData1(n-1);
    }


    public static void main(String[] args) {

        System.out.println("program started");
        printData(5);
        System.out.println("program ends");
    }

}
