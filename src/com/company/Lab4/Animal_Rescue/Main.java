package com.company.Lab4.Animal_Rescue;

public class Main {
    public static void main(String[] args) {

        Dog dorel = new Dog();
        dorel.setBreed("Maidanez");
        System.out.println("Rasa: " + dorel.getBreed());
        dorel.setHightM(0.4f);
        System.out.println("Inaltime metrii: " + dorel.getHightM());
        dorel.bark();

        Adopter bob = new Adopter();
        bob.setName("Numele Adoptatorului este Bob");
        System.out.println(bob.getName());
        bob.setDollarsAvailable(3333);
        System.out.println("Dollari in buzunar:" + bob.getDollarsAvailable());

        AnimalFood whiskas = new AnimalFood();
        whiskas.setName("whiskas");
        System.out.println("Mancare: " + whiskas.getName());
        whiskas.setPriceDollar(21);
        System.out.println("Pret in dolari:" + whiskas.getPriceDollar());
        whiskas.setQuantityKg(22);
        System.out.println("Cantitate :" + whiskas.getQuantityKg());
        whiskas.setStock("In stock");
        System.out.println("Stock:" + whiskas.getStock());

        VeterinaryDoctor doctorPhill = new VeterinaryDoctor();
        doctorPhill.setName("DoctorPhill");
        System.out.println("Numele veterinarului este: " + doctorPhill.getName());
        doctorPhill.setSpecialization("Caini si pisici");
        System.out.println("Specializare: " + doctorPhill.getSpecialization());

        Cat marioara = new Cat();
        marioara.setFavoriteFood("whiskas");
        System.out.println("Mancarea favorita este: " + marioara.getFavoriteFood());
        marioara.meow();
        marioara.setWeight(12.3f);
        System.out.println(marioara.getWeight());


    }


}
