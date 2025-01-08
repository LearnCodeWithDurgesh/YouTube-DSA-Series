package recursion;

public class SumRecursion {

    //n=10
    static int sumNum(int n) {

        //base condition means:
        if (n == 1) {
            return 1;
        } else {
            return n + sumNum(n - 1);
        }

    }

    public static void main(String[] args) {

        int result = sumNum(5);
        System.out.println(result);
    }

}
