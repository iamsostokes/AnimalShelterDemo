package com.company;

public class Animal {

    private int iDNumber;
    private String name;
    private String animalType;
    private String breed;
    private String color;
    private int age;
    private String arrivalDate;
    private String status;

    public Animal(int iDNumber, String name, String animalType, String breed, String color, int age, String arrivalDate,
                  String status) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.animalType = animalType;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.arrivalDate = arrivalDate;
        this.status = status;
    }

    public void printAnimalDetails(){
        System.out.println("The animal id number is " + iDNumber +"\n" +
                "The animal name is " + name + "\n" +
                "The animal type is " + animalType + "\n" +
                "The animal breed is " + breed + "\n" +
                "The animal color is " + color + "\n" +
                "The animal age is " + age + "\n" +
                "The animal arrival date is " + arrivalDate + "\n" +
                "The animal status is " + status);

    }


    public int getiDNumber() {
        return iDNumber;
    }

    public void setiDNumber(int iDNumber) {
        this.iDNumber = iDNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAnimalTyoe() {
        return animalType;
    }

    public void setAnimalTyoe(String animalTyoe) {
        this.animalType = animalTyoe;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(String arrivalDate) {
        this.arrivalDate = arrivalDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
