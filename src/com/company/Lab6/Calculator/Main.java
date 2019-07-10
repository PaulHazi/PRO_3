package com.company.Lab6.Calculator;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//
//          Calculator calc = new Calculator();
//         System.out.println(calc.sum(1, 3, 4));
//         System.out.println(calc.multiply(4.5f, 3.5f));
//         System.out.println(calc.substraction(4, 3, 2, 1));
//           System.out.println(calc.division(4.3, 2.2));
//         System.out.println(calc.remainder(12f, 3.3f));
//         System.out.println(calc.avarageNumber(5, 7, 8, 33));

        LogicalOp op = new LogicalOp();
        // int[] myArray = op.getArrayToHundred();

        //  for (int i = 0; i < myArray.length; i++)
        //    System.out.println(myArray[i]);

        // int[] myArray1 = op.getEvenArray();
        // for (int i = 0; i < myArray1.length; i++)
        // System.out.println(myArray1[i]);

        int[] myArray2 = {1, 5, 6, 7, 8, 9, 10};
        float x = op.getAvarageArray(myArray2);
        System.out.println(x);
        List<Integer> y =op.getListHundred();
        op.PrintList(y);

        List<Integer> myScondList = new ArrayList<>();
        myScondList.add(3);
        myScondList.add(5);
        op.AddNumber(myScondList,44);
        System.out.println(myScondList);


    }


}





