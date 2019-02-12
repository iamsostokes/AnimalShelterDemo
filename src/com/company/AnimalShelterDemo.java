package com.company;

import java.util.Scanner;

public class AnimalShelterDemo {

    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
	// write your code here

        Shelter shelter = new Shelter();
        Bank bankFunds = new Bank();
        bankFunds.setFunds(150000);
        boolean running = true;
        int userOption;
        int idNum = 100;


        Animal animal = new Animal(99, "Fido", "Dog", "Small Dog", "Brown",
                2, "00/00/00", "Adopted");
        shelter.addAnimalProfile(animal);

        Animal animal2 = new Animal(98, "Meow Mix", "Cat", "Siamese", "Tan and Brown",
                3, "00/00/00", "Foster");
        shelter.addAnimalProfile(animal2);

        Animal animal3 = new Animal(97,"Albert", "bird", "African grey",
                "grey",4, "1/22/19", "pending");
        shelter.addAnimalProfile(animal3);
        Animal animal4 = new Animal(96,"Kitty", "cat",
                "fat", "Orange", 6, "11.12.18", "foster" );

       shelter.addAnimalProfile(animal4);
//
//        shelter.printAllAnimals();

        System.out.println("Welcome to the Java Animal Rescue.");

        do{
            System.out.println("What would you like to do?\n[1] Add Animal to the Shelter. \n" +
                    "[2] Remove animal from shelter. \n" +
                    "[3] Search for animal by ID number. \n" +
                    "[4] View and Edit Animal Profiles. \n" +
                    "[5] View Animal by Names, Alphabetically. \n" +
                    "[6] View Animals by Status. \n" +
                    "[7] View Animals Who Have Been in Shelter Longer than 6 Months. \n" +
                    "[8] View Available Funds.\n" +
                    "[9] Exit the Shelter. ");
            System.out.println("Select which option you would like.");
            userOption = scan.nextInt();

            switch(userOption){

                case 1:


                    if((bankFunds.getFunds()/shelter.getSizeOfShelter()) >  5000 && shelter.getSizeOfShelter() <= 75){

                        addingAnimals(shelter, idNum);

                        bankFunds.subtractFundsForNewAnimals();

                        idNum++;

                    } else{

                        System.out.println( "Can not add an animal at this time. Check funds, or shelter size.");

                }
                    break;

                case 2:

                    shelter.printAllAnimals();

                    System.out.println( "What animal would you like to remove?");

                    int id = scan.nextInt();

                    shelter.removeAnimalProfile(id);

                    break;
                case 3:

                    System.out.println( "Enter an ID number: ");

                    int searchId = scan.nextInt();

                    shelter.searchById(searchId);

                    break;

                case 4:

                    shelter.printAllAnimals();

                    System.out.println("Enter animal's id to edit: ");

                    int editIdNumber = scan.nextInt();

                    shelter.editAnimal(editIdNumber);


                    break;
                case 5:

                    shelter.sortAnimalNamesAlphabetically();

                    break;
                case 6:

                    System.out.println("Enter the status you want to view by: [Available, Pending, Foster or Adopted]");

                    scan.nextLine();

                    String statusSearch = scan.nextLine();

                    shelter.viewAnimalByStatus(statusSearch);

                    break;
                case 7:

                    break;
                case 8:

                    System.out.println("The bank's funds are : " + bankFunds.getFunds());

                    break;
                case 9:

                    System.out.println("Exiting the shelter.");

                    running = false;

                    break;

                default:

                    System.out.println("Not a valid option.");

                    break;
            }

        }while(running);


        System.out.println("Have a great day.");



    }

    private static void addingAnimals(Shelter shelter, int idNum) {
        System.out.println("Enter the animal's Name: ");
        scan.nextLine();
        String name = scan.nextLine();
        System.out.println( "Enter the animal's type: [Dog/cat/etc.]");
        String type =scan.nextLine();
        System.out.println( "Enter the animal's breed:");
        String breed =scan.nextLine();
        System.out.println( "Enter the animal's color:");
        String color =scan.nextLine();
        System.out.println( "Enter the animal's arrival date: ");
        String arrivalDate =scan.nextLine();
        System.out.println("Enter the animal's status. [Available, Pending, Foster or Adopted]");
        String status = scan.nextLine();
        System.out.println( "Enter the animal's age: ");
        int age =scan.nextInt();

        Animal b = new Animal (idNum, name, type, breed, color, age, arrivalDate, status);

        b.printAnimalDetails();

        shelter.addAnimalProfile(b);
    }
}
