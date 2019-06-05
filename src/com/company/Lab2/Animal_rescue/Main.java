package com.company.Lab2.Animal_rescue;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Dog dorel = new Dog();
        System.out.println(dorel.weight);
        dorel.eat();
        dorel.drink();
        System.out.println(dorel.hightM);

        Cat marioara = new Cat();
        System.out.println(marioara.favoriteActivity);

        Adopter bob = new Adopter();
        System.out.println(bob.dollarsAvailable);
        System.out.println(bob.name);

        animalFood whiskas= new animalFood();
        System.out.println(whiskas.name);

        Veterinary_doctor DoctorPhill = new Veterinary_doctor();
        DoctorPhill.reputation();




    }


}
