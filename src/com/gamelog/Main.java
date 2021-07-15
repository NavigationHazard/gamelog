package com.gamelog;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        GameLogic gameLog = new GameLogic();
        gameLog.codePrep();
        gameLog.generateTurn(2);

    }
}

class GameLogic {

    private int digitOne;
    private int digitTwo;
    private int digitThree;
    private int digitFour;
    private boolean allCow;
    private int i = 1;
    public void codePrep() {
        allCow = false;
        digitOne = 1;
        digitTwo = 2;
        digitThree = 3;
        digitFour = 4;
        System.out.println("The secret code i prepared: ****.");
        System.out.println();
    }

    public void generateTurn(int amountOfTurns) {

        while (i <= amountOfTurns+1 || !allCow) {
            System.out.println("Turn "+ i + ". Answer:");
            generateBreaker();
            codeGrading();
            i++;
            if (i == amountOfTurns+1) {
                System.out.println("Congrats! The secret code is 9305.");
                break;
            }else {System.out.println();}

        }
    }

    public void codeGrading() {
        System.out.println("Grade: 1 cow.");
    }

    public void generateBreaker() {
        Random ran = new Random();
        int breakOne = ran.nextInt(9);
        int breakTwo = ran.nextInt(9);
        int breakThree = ran.nextInt(9);
        int breakFour = ran.nextInt(9);

        System.out.println(breakOne + "" + breakTwo + "" + breakThree + "" + breakFour);
    }

}
