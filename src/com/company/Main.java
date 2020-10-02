package com.company;

public class Main {

    public static void main(String[] args) {
	    int result = 0, targetNumber = 7, counter = 0; // setting up
        Dice d = new Dice(6); // initializing the dice
        while (result != targetNumber) {
            result = d.roll(); // roll
            counter++;
        }
        System.out.println("It took " + counter + " try/tries to get a 7");
    }
}
