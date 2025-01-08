package recursion;

public class Types {
    public static int factorial(int n, int result) {
        if (n == 0) { // Base case
            return result;
        }

        return factorial(n - 1, result * n); // Recursive call is the last operation
    }

    public static void printNumbers(int n) {
        if (n == 0) { // Base case
            return;
        }
        printNumbers(n - 1); // Recursive call first
        System.out.println(n); // Process after returning
    }

    public static int sum(int n) {
        if (n == 0) { // Base case
            return 0;
        }
        return n + sum(n - 1); // One recursive call per step
    }

    public static int fibonacci(int n) {
        if (n == 0) return 0; // Base case
        if (n == 1) return 1; // Base case
        return fibonacci(n - 1) + fibonacci(n - 2); // Two recursive calls
    }

}
