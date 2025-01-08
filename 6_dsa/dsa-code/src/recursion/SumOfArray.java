package recursion;

public class SumOfArray {

    static int sumArray(int[] arr, int n) {
        if (n <= 0) {
            return 0;
        }

        return arr[n - 1] + sumArray(arr, n - 1);
    }

    public static void main(String[] args) {

        int arr[] = {
                2, 4, 5,4
        };

        System.out.println(sumArray(arr, arr.length));

    }
}
