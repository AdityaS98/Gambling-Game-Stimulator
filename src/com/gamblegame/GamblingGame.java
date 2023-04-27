package com.gamblegame;

public class GamblingGame {

    public static void main(String args[]) {

        /*
         * Initialized total amount and bet amount
         */
        int totalAmount = 100;
        int totalBet = 1, lowLimitAmount = 10, highLimitAmount = 100, lossAmount = 0, winAmount = 0;

        /*
         * If conditions for checking whether player won the game or lost the game.
         * Also calculating the result using random variable.
         */

        for (int i = 1; i < 21; i++) {


            int resultOfBet = (int) Math.floor(Math.random() * 2);

            if (resultOfBet == 1) {
                totalAmount += totalBet;
                winAmount++;

            } else {
                totalAmount -= totalBet;
                lossAmount++;

            }


        }
        // Display messages
        System.out.println("Amount won by the gambler " + winAmount);
        System.out.println("Amount that is lost by gambler " + lossAmount);
    }

}



