package com.company;

/*
Valmik Revankar
Dice Lab 1 Redo Main.java
Extra: Being able to change the number of sides on the dice
 */

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
