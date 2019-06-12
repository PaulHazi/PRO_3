package com.company.Lab3.Calculator;

public class Print {

    public void printFormat1() {
        System.out.println("    J    a  v     v  a");
        System.out.println("    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  v v  aaaaa");
        System.out.println("  JJ  a     a  v  a     a ");
    }


    public void printFormat2() {
        System.out.println("  +\"\"\"\"\"+");
        System.out.println(" [| O O |]");
        System.out.println("  |  ^  | ");
        System.out.println("  |' _ '| ");
        System.out.println("  +-----+ ");
    }

    public void printMyName() {
        System.out.println("Hello \n Paul");
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

    public String nameAndText(String fastTrackIt, int a) {
        String text = fastTrackIt;
        text = "fastTrackIt";
        if
        (fastTrackIt.equals(text)) {
            System.out.println(text + a);
        } else if (a <= 3) ;

        else if (!fastTrackIt.equals(text)) {
            System.out.println(fastTrackIt + a);
        } else if (a >= 4) ;
        return fastTrackIt;

    }



}














