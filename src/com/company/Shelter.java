package com.company;

import java.util.ArrayList;

public class Shelter {

    private ArrayList<Animal> animalShelter = new ArrayList<>();

    public int getSizeOfShelter(){
        return animalShelter.size();
    }


    public void addAnimalProfile(Animal animal) {

            animalShelter.add(animal);



    }

    public void removeAnimalProfile(int id) {
        for (int i = 0; i < animalShelter.size(); i++) {
            if (id == animalShelter.get(i).getiDNumber()) {
                Animal b = animalShelter.remove(i);
                System.out.println("You have removed " + b.getName() + "\n");

            }
        }


    }

    public void printAllAnimals(){

        System.out.println( "\nThese are the animals:");

        for(Animal animal : animalShelter){

            animal.printAnimalDetails();

        }




    }

    public void  searchById(int id) {


        for (int i = 0; i < animalShelter.size(); i++) {

            if (id == animalShelter.get(i).getiDNumber()) {

                animalShelter.get(i).printAnimalDetails();

            }


        }



    }




}
