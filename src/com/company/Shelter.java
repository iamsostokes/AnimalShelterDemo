package com.company;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

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

    public void searchById(int id) {


        for (int i = 0; i < animalShelter.size(); i++) {

            if (id == animalShelter.get(i).getiDNumber()) {

                animalShelter.get(i).printAnimalDetails();

            }


        }



    }


    public void editAnimal(int id){

        Scanner scan = new Scanner(System.in);

        System.out.println( "Are you changing the animal's status or the animal's age? ");
        String userChoice = scan.nextLine();

        if(userChoice.equalsIgnoreCase("status")){
        System.out.println("Enter the animal's new status. [Available, Pending, Foster or Adopted]");

        String newStatus = scan.nextLine();


        for (int i = 0; i < animalShelter.size(); i++) {

            if (id == animalShelter.get(i).getiDNumber()) {

                animalShelter.get(i).setStatus(newStatus);

                System.out.println("Animal's status successfully update!\n");

                animalShelter.get(i).printAnimalDetails();

            }
        }


        } else {
            System.out.println("Enter the animal's new age: ");

            int newAge = scan.nextInt();


            for (int i = 0; i < animalShelter.size(); i++) {

                if (id == animalShelter.get(i).getiDNumber()) {

                    animalShelter.get(i).setAge(newAge);

                    System.out.println( "Animal's age successfully updated! \n");

                    animalShelter.get(i).printAnimalDetails();


                }


            }
        }

    }

    public void sortAnimalNamesAlphabetically(){

        ArrayList<String> tempNameArray = new ArrayList<>();

        for (Animal a : animalShelter){

            tempNameArray.add(a.getName());
        }

       Collections.sort(tempNameArray);

        System.out.println("Animals by name, A-Z.");
        for(String name : tempNameArray){
            System.out.println(name);
        }
    }












}
