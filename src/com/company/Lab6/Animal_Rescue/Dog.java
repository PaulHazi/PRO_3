package com.company.Lab6.Animal_Rescue;

public class Dog extends Animal {

    public void bark (){
        System.out.println("WooF WooF");
    }

    public void play () {
        System.out.println("Play Fetch");
    }

    public void eat () {
        System.out.println("Eats pedigree");
    }

    @Override
    public void run() {
        System.out.println("Dogs run in zig zag");

    }public void sleep (){
        System.out.println("zzzzzzzzzZZZZZZZzzzzzzzzz");
    }

    @Override
    public void smells() {
        System.out.println("Dogs smell good");
    }
}

