package com.company;

public class Bank {

    private int funds;

    public Bank (){

    }

    public int getFunds() {
        return funds;
    }

    public void setFunds(int funds) {
        this.funds = funds;
    }

    public void subtractFundsForNewAnimals(){

        funds -= 5000;

        System.out.println("Your new balance is " + funds );

    }



}
