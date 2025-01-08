package recursion;

public class MainRecursion {

//    5 4 3 2 1

    static void printNum(int n) {

        //base condition:[important point]
        if (n == 1) {
            System.out.println(1);
        } else {
            System.out.println(n);
            printNum(n - 1);
        }
    }


    public static void main(String[] args) {
        System.out.println("program started: ");
        printNum(5);
    }

}
