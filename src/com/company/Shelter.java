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

    public void removeAnimalProfile( String idNumber) {
        for (int i = 0; i < available.size(); i++) {
            if (idNumber.equals(available.get(i).getiDNumber())) {
                available.remove(i);
            }
        }

        for (int i = 0; i < pending.size(); i++) {
            if (idNumber.equals(pending.get(i).getiDNumber())) {
                pending.remove(i);
            }
        }

        for (int i = 0; i < foster.size(); i++) {
            if (idNumber.equals(foster.get(i).getiDNumber())) {
                foster.remove(i);
            }
        }

        for (int i = 0; i < adopted.size(); i++) {
            if (idNumber.equals(adopted.get(i).getiDNumber())) {
                adopted.remove(i);
            }
        }

    }

    public void printAllAnimals(){

        System.out.println( "\nThese are the available animals:");
        for(Animal animal : available){

            animal.printAnimalDetails();
        }

        System.out.println( "\nThese are pending animals: ");
        for(Animal animal : pending){

            animal.printAnimalDetails();

        }

        System.out.println( "\nThese are the foster animals:");
        for(Animal animal : foster){

            animal.printAnimalDetails();

        }

        System.out.println( "\nThese are the adopted animals:");
        for(Animal animal : adopted){

            animal.printAnimalDetails();

        }

    }


}
