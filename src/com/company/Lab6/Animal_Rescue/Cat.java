package com.company.Lab6.Animal_Rescue;

public class Cat extends Animal {

    public void meow(){
        System.out.println("MEOW MEOW");
    }

    @Override
    public void run() {
        System.out.println("Cats run fast");
    }
    public void sleep(){
        System.out.println("ZzZzZzZzZ");
    }

    @Override
    public void smells() {
        System.out.println("Cats doesn't smell like dogs");
    }
}
