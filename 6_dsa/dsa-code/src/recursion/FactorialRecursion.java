package recursion;

public class FactorialRecursion {

    static int factorial(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }

    public static void main(String[] args) {

        int factorial = factorial(6);
        System.out.println("factorial " + factorial);
    }
}
