package com.company.Lab2.Calculator;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        printMyName();
        System.out.println("rezultatul este:" + sum(8, 5));
        System.out.println("rezultatul este:" + substraction(4, 3));
        System.out.println("rezultatul este:" + division(4, 2));
        System.out.println("rezultatul este:" + multiply(4, 5));

        int mult2 = multiply(8, 6);
        int result = sum(-5, mult2);
        System.out.println(result);
        System.out.println(8 * 6 + -5);
        printFormat1();

        System.out.println("media numerelor este:" + avarageNumber(3, 4, 5));
        printFormat2();

        System.out.println(remainder(10, 3));

        System.out.println(fahrenheitToCelsius(125));
        System.out.println(inchToMeters(10.3));

        double[] speed = multipleReturns(1,2,3,4);
        System.out.println("meterSecond  "   + speed[0]);
        System.out.println("kmHour  "   + speed[1]);
        System.out.println("mileHour  "  + speed[2]);


    }

    public static int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public static int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public static int substraction(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public static int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public static void printMyName() {
        System.out.println("Hello \n Paul");
    }

    public static void printFormat1() {
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  v v  aaaaa");
        System.out.println("  JJ  a     a  v  a     a ");
    }

    public static int avarageNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int result = (firstNumber + secondNumber + thirdNumber) / 3;
        return result;
    }

    public static void printFormat2() {
        System.out.println("  +\"\"\"\"\"+");
        System.out.println(" [| O O |]");
        System.out.println("  |  ^  | ");
        System.out.println("  |' _ '| ");
        System.out.println("  +-----+ ");
    }

    public static double remainder(double firstNumber, double secondNumber) {
        double result = (firstNumber % secondNumber);
        return result;
    }

    public static int fahrenheitToCelsius(int fahrenheit) {
        int celsius = ((fahrenheit - 32) * 5 / 9);
        return celsius;
    }

    public static double inchToMeters(double inch) {
        double meters = (inch * 0.0254);
        return meters;
    }

    public static double[] multipleReturns(double meters, double hours, double minuites, double seconds) {
       double[] speed = new double[3];
       speed[0]=(meters/seconds);
       speed[1]=((speed[0])*3.6);
       speed[2]=((speed[0])*2.236936292054);
       return speed;

    }


}





