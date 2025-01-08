package stack.practice;

import stack.Stack;

import java.util.Scanner;

public class EvaluteExpression {


    public static int evaluateExpression(String expression) {

        Stack stack = new Stack(expression.length());

//        get characters

        for (int i = 0; i < expression.length(); i++) {

            char ch = expression.charAt(i);

            //if it is digit
            if (Character.isDigit(ch)) {

                //ch=0
                stack.push(ch - '0');

            } else {
                int operand1 = stack.pop();
                int operand2 = stack.pop();

                switch (ch) {

                    case '+':
                        stack.push(operand2 + operand1);
                        break;
                    case '-':
                        stack.push(operand2 - operand1);
                        break;
                    case '*':
                        stack.push(operand2 * operand1);
                        break;
                    case '/':
                        stack.push(operand2 / operand1);
                        break;
                    default:
                        System.out.println("Invalid Operator");

                }


            }


        }

        return stack.pop();


    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter PostFix expression[ab+]: ");
        String ex = scanner.next();
        int result = evaluateExpression(ex);
        System.out.println("output: " + result);

    }

}
