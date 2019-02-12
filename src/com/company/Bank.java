package com.company;

public class Bank {

    private double funds;

    public Bank (){

    }

    public double getFunds() {
        return funds;
    }

    public void setFunds(double funds) {
        this.funds = funds;
    }

    public void subtractFundsForNewAnimals(){

        funds -= 5000;

        System.out.println("Your new balance is $" + funds + "\n");

    }



}
