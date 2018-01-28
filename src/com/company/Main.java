package com.company;
// Create a program that demonstrates the use of the different operators. Use at least 5 different operators.
// Use a System.out.println statement to display both the equation to be evaluated
// and if the equation evaluates to true or false.

public class Main {


    public static void main(String[] args) {

        // initialize variables
        int intOne = 87;
        int intTwo = 24;
        int result1 = intOne + intTwo;
        int result2 = intOne - intTwo;
        int result3 = intOne * intTwo;
        double result4 = (double) intOne / intTwo;
        double result5 = (double) intOne % intTwo;

        // and if the equation evaluates to true or false.
        boolean b1 = result1 == intOne + intTwo;
        boolean b2 = result2 == intOne - intTwo;
        boolean b3 = result3 == intOne * intTwo;
        boolean b4 = result4 == (double) intOne / intTwo;
        boolean b5 = result5 == (double) intOne % intTwo;

        // display addition
        System.out.println(intOne + " + " + intTwo + " = " + result1 + " : " + b1);
        // display subtraction
        System.out.println(intOne + " - " + intTwo + " = " + result2 + " : " + b2);
        // display multiplication
        System.out.println(intOne + " * " + intTwo + " = " + result3 + " : " + b3);
        // display division
        System.out.println(intOne + " / " + intTwo + " = " + result4 + " : " + b4);
        // display modulus (remainder)
        System.out.println(intOne + " % " + intTwo + " = " + result5 + " : " + b5);

    }
}
