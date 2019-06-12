package com.company.Lab3.Calculator;

public class Main {

    public static void main(String[] args) {

        Calculator operations = new Calculator();
        System.out.println("Rezultatul adunarii este: " + operations.sum(3, 4));
        System.out.println("Rezultatul scaderii este: " + operations.substraction(1000, 320));
        System.out.println("Rezultatul inmultirii este: " + operations.multiply(6, 8));
        System.out.println("Rezultatul inmpartirii este: " + operations.division(100, 5));

        LogicalOp comparison = new LogicalOp();
        System.out.println("Numarul mai mare este: " + comparison.checkBiggerNumber(3, 4));
        comparison.checkBiggerNumber(3, 4);

        Print textComparison = new Print();
        textComparison.nameComparison1("fastTrackIt");

        Print textComparison2 = new Print();
        textComparison2.nameComparison2("fastTrackIt", "fastTrackIt");

        Print nameText = new Print();
        nameText.nameAndText("fastTrackIt",3);





    }


}





