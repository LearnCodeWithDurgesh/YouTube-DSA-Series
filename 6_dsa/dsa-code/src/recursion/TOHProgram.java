package recursion;

public class TOHProgram {
    static void TOH(int n, char source, char helper, char destination) {


        //base condition:
        if (n == 1) {
            //base
            System.out.println("MOVE disk 1 from " + source + " to " + destination);
            return;
        }
        //
        TOH(n - 1, source, destination, helper);
        System.out.println("MOVE Disk " + n + " from " + source + " to " + destination);
        TOH(n - 1, helper, source, destination);


    }

    public static void main(String[] args) {

        int n = 4;
        TOH(n, 'A', 'B', 'C');
    }
}
