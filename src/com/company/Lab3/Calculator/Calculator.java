package com.company.Lab3.Calculator;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public int substraction(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }


    public double remainder(double firstNumber, double secondNumber) {
        double result = (firstNumber % secondNumber);
        return result;

    }
    public int avarageNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int result = (firstNumber + secondNumber + thirdNumber) / 3;
        return result;}

}

