package stack.practice;

import stack.Stack;

public class ReverseString {

    //reverse the string and return it
    public static String reverseString(String str) {

        Stack stack = new Stack(str.length());

        //loop: to fetch characters one by one
        for (int i = 0; i < str.length(); i++)
            //important thing:
            stack.push(str.charAt(i));


        //
        // stack.displayElements();
//        StringBuilder builder = new StringBuilder();
        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            int pop = stack.pop();
            result.append((char) pop);
        }

        //System.out.println(result);


        return result.toString();


    }

    public static void main(String[] args) {

        String rs = reverseString("hello");
        System.out.println(rs);

        System.out.println(reverseString("durgesh"));

    }
}
