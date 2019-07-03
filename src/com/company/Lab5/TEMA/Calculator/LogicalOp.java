package com.company.Lab5.TEMA.Calculator;

public class LogicalOp {
    public int checkBiggerNumber(int a, int b) {
        if (a > b) {
            return a;
        } else {
            return b;
        }
    }

    public String nameComparison1(String fastTrackIt) {

        String text = fastTrackIt;
        text = "fastTrackIt";

        if (fastTrackIt.equals(text)) {
            System.out.println("Learning text comparison");
        } else if (!fastTrackIt.equals(text)) {
            System.out.println("Got to try some more");
        }
        return fastTrackIt;

    }

    public String nameComparison2(String fastTrackIt1, String fastTrackIt2) {

        String first = fastTrackIt1;
        String second = fastTrackIt2;


        if (first.equals(second)) {
            System.out.println("Learning text comparison");
            return fastTrackIt1;
        } else if (!first.equals(second)) {
            System.out.println("Got to try some more");
        }
        return fastTrackIt2;
    }


    public void printSumAndAvarage() {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
        }
        System.out.println(sum);
        System.out.println("Avarage is :" + (sum / 100f));
    }

    public void printToHundredWhile(int number) {
        while (number <= 100) {
            System.out.println(number);
            number++;
        }

    }

    public void printToHundredDoWhile(int number) {
        do {
            System.out.println(number);
            number++;

        } while (number <= 100);
    }

    public void printToHundred(int number) {
        for (int i = number; i <= 100; i++)
            System.out.println(i);
    }


    public void printNegativeToHundred(int number) {
        for (int i = number; i >= -100; i--)
            System.out.println(i);
    }

    //ex 2
    public int[] getArrayToHundred() {
        int myArray[] = new int[100];
        for (int i = 1; i <= 100; i++) {
            myArray[i - 1] = i;
        }
        return myArray;
    }

    // ex 4
    public float getAvarageArray(int[] myArray) {

        float sum = 0;
        for (int i = 0; i < myArray.length; i = i++)
            sum += myArray[i];


        return (sum / myArray.length);
    }

    // ex 3
    public int[] getEvenArray() {
        int count = 0;
        int[] myArray = new int[51];
        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {

                myArray[count] = i;
                count++;
            }
        }
        return myArray;


    }
}





