package com.gamblegame;

public class GamblingGame {

    public static void main(String args[]) {

        /*
         * Initialized total amount and bet amount
         */

        int totalAmount = 100;
        int totalBet = 1;
        /*
         * If conditions for checking whether player won the game or lost the game.
         * Also calculating the result using random variable.
         */

        int resultOfBet = (int) Math.floor(Math.random() * 2);

        if (resultOfBet == 1) {
            totalAmount += totalBet;
            System.out.println("Gamble won the game");
        } else {
            totalAmount -= totalBet;
            System.out.println("Gambler lost the game");
        }

    }


}
