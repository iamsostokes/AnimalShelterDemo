package com.company;

import java.util.ArrayList;

public class Shelter {

    private ArrayList<Animal> available = new ArrayList<>();
    private ArrayList<Animal> pending = new ArrayList<>();
    private ArrayList<Animal> foster = new ArrayList<>();
    private ArrayList<Animal> adopted = new ArrayList<>();

    public void addAnimalProfile(Animal animal, String statusName) {
        if (statusName.equalsIgnoreCase("available")) {
            available.add(animal);
            System.out.println("Animal Added to available status!");
        } else if (statusName.equalsIgnoreCase("pending")) {
            pending.add(animal);
            System.out.println("Animal is pending.");
        } else if (statusName.equalsIgnoreCase("foster")) {
            foster.add(animal);
            System.out.println("Animal is now in foster care.");
        } else if (statusName.equalsIgnoreCase("adopted")) {
            adopted.add(animal);
            System.out.println("The animal is now adopted.");
        } else {
            System.out.println("not a valid status.");
        }

    }

}
