package recursion.ncr;


public class NCRITR {

//    function to find factorial:

    static int fact(int n) {
        if (n == 1 || n == 0) {
            return 1;
        }
        return n * fact(n - 1);
    }

    //this is recursive function to calculate combination
    static long nCrRecursive(int n, int r) {
        if (r == 0 || r == n)
            return 1;
        if (r > n)
            return 0;//
        return nCrRecursive(n - 1, r - 1) + nCrRecursive(n - 1, r);

    }


    //combination:
    //nCr

    static int nCr(int n, int r) {

        if (r > n) return 0;
        int factN = fact(n);
        int factR = fact(r);
        int factNR = fact(n - r);
        return factN / (factR * (factNR));


    }

    public static void main(String[] args) {

        int n = 4;
        int r = 3;
        System.out.println("result: " + (nCrRecursive(n, r)));


    }

}
