package com.company.Lab5.TEMA.Calculator;

public class Calculator {

    public int sum(int firstNumber, int secondNumber) {
        int result = firstNumber + secondNumber;
        return result;
    }

    public int sum(int firstNumber, int secondNumber, int thirdNumber) {
        int result = firstNumber + secondNumber + thirdNumber;
        return result;
    }

    public int multiply(int firstNumber, int secondNumber) {
        int result = firstNumber * secondNumber;
        return result;
    }

    public float multiply(float firstNumber, float secondNumber) {
        float result = firstNumber * secondNumber;
        return result;
    }

    public int substraction(int firstNumber, int secondNumber) {
        int result = firstNumber - secondNumber;
        return result;
    }

    public int substraction(int firstNumber, int secondNumber, int thirdNumber, int forthNumber) {
        int result = firstNumber - secondNumber - thirdNumber - forthNumber;
        return result;
    }

    public int division(int firstNumber, int secondNumber) {
        int result = firstNumber / secondNumber;
        return result;
    }

    public double division(double firstNumber, double secondNumber) {
        double result = firstNumber / secondNumber;
        return result;
    }


    public double remainder(double firstNumber, double secondNumber) {
        double result = (firstNumber % secondNumber);
        return result;

    }

    public float remainder(float firstNumber, float secondNumber) {
        float result = firstNumber % secondNumber;
        return result;
    }

    public int avarageNumber(int firstNumber, int secondNumber, int thirdNumber) {
        int result = (firstNumber + secondNumber + thirdNumber) / 3;
        return result;
    }

    public int avarageNumber(int firstNumber, int secondNumber, int thirdNumber, int forthNumber) {
        int result = (firstNumber + secondNumber + thirdNumber + forthNumber) / 4;
        return result;
    }
}

