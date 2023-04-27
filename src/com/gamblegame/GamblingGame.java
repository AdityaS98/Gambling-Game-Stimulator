package com.gamblegame;

public class GamblingGame {

    public static void main(String args[]) {

        /*
         * Initialized total amount and bet amount
         */
        int totalAmount = 100;
        int totalBet = 1, lossAmountBet = 0, winAmountBet = 0;
        int winningday = 0, lossday = 0;

        /*
         * If conditions for checking whether player won the game or lost the game.
         * Also calculating the result using random variable.
         */

        for (int i = 1; i < 21; i++) {


            int resultOfBet = (int) Math.floor(Math.random() * 2);

            if (resultOfBet == 1) {
                totalAmount += totalBet;
                System.out.println("Gambler won the game");
            } else {
                totalAmount -= totalBet;
                System.out.println("Gambler lost the game");
            }

        }
        if (winAmountBet > lossAmountBet) {
            winningday++;
        } else {
            lossday++;
        }
        System.out.println("Winning days in the month are " + winningday);
        System.out.println("Losing days in the month are " + lossday);

    }

}




