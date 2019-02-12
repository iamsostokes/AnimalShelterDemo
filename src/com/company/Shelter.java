package com.company;

import java.util.ArrayList;

public class Shelter {

    private ArrayList<Animal> animalShelter = new ArrayList<>();


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

//        System.out.println( "\nThese are pending animals: ");
//        for(Animal animal : pending){
//
//            animal.printAnimalDetails();
//
//        }
//
//        System.out.println( "\nThese are the foster animals:");
//        for(Animal animal : foster){
//
//            animal.printAnimalDetails();
//
//        }
//
//        System.out.println( "\nThese are the adopted animals:");
//        for(Animal animal : adopted){
//
//            animal.printAnimalDetails();
//


    }

    public void  searchById(int id) {


        for (int i = 0; i < animalShelter.size(); i++) {

            if (id == animalShelter.get(i).getiDNumber()) {

                animalShelter.get(i).printAnimalDetails();

            }



        }

//            for (int i = 0; i < pending.size(); i++) {
//
//                if (id == pending.get(i).getiDNumber()) {
//
//                    pending.get(i).printAnimalDetails();
//
//                    return pending.get(i);
//                }
//            }
//
//            for (int i = 0; i < foster.size(); i++) {
//                if (id == foster.get(i).getiDNumber()) {
//                    foster.get(i).printAnimalDetails();
//                    return foster.get(i);
//                }
//            }
//
//            for (int i = 0; i < adopted.size(); i++) {
//                if (id == adopted.get(i).getiDNumber()) {
//                    adopted.get(i).printAnimalDetails();
//                    return adopted.get(i);
//                }
//



    }




}
