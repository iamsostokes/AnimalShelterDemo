package com.company;

public class AnimalShelterDemo {

    public static void main(String[] args) {
	// write your code here

        Shelter shelter = new Shelter();
        Animal animal = new Animal(100, "Fido", "Dog", "Small Dog", "Brown",
                2, "00/00/00", "Adopted");
        shelter.addAnimalProfile(animal, animal.getStatus());

        Animal animal2 = new Animal(101, "Fido", "Cat", "Siamese", "Tan and Brown",
                3, "00/00/00", "Foster");

        shelter.addAnimalProfile(animal2, animal2.getStatus());


        shelter.printAllAnimals();

    }
}
