package com.company;

/*
Valmik Revankar
Dice Lab 1 Redo Dice.java
Extra: Being able to change the number of sides on the dice
 */

public class Dice {
    int sides; // init vars

    public Dice(int sidesIn){
        sides = sidesIn; // transfer the variable to a local one
    }
    public int roll() {
        int die1 = (int) Math.floor(Math.random()*sides); // rolling the dice
        int die2 = (int) Math.floor(Math.random()*sides);
        System.out.println("The dice came up " + die1 + " and " + die2 + " for a total of " + (die1+die2)); // outputting the sum
        return die1+die2;
    }
}
