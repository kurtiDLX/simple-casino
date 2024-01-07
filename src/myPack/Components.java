package myPack;

import java.util.Random;
import java.util.Scanner;

public class Components {
    private int playerAttempts = 3;
    private boolean gameStatus;
    private int randomInit, random;

    public void gameLogic()
    {
        System.out.println("You have: " + getPlayerAttempts() + " attempts"+ "\n    Start game?");
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        if (userInput.equals("y") && getPlayerAttempts() != 0) {
            if (getRandom() < 8) {
                playerAttempts--;
            } else {
                playerAttempts++;
            }
        } else {
            gameStatus = true;
        }

    }

    public boolean getGameStatus(){
        return gameStatus;
    }

    public int getRandom(){
        Random randomInit = new Random();
        random = randomInit.nextInt(10) + 1;
        return random;
    }

    public int getPlayerAttempts(){
        return playerAttempts;
    }

}
