package com.company;

public class Animal {

    private int iDNumber;
    private String name;
    private String animalTyoe;
    private String breed;
    private String color;
    private int age;
    private String arrivalDate;
    private String status;

    public Animal(int iDNumber, String name, String animalType, String breed, String color, int age, String arrivalDate,
                  String status) {
        this.iDNumber = iDNumber;
        this.name = name;
        this.animalTyoe = animalType;
        this.breed = breed;
        this.color = color;
        this.age = age;
        this.arrivalDate = arrivalDate;
        this.status = status;
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
        return animalTyoe;
    }

    public void setAnimalTyoe(String animalTyoe) {
        this.animalTyoe = animalTyoe;
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
