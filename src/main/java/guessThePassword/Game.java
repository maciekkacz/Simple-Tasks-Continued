package guessThePassword;

import java.util.Scanner;

public class Game {
    private WordList wl = new WordList();
    private Scanner scanner = new Scanner(System.in);

    private static final int NEXT_GAME = 1;
    private static final int END_GAME = 2;

    public void program() {
        int option = NEXT_GAME;
        if (option != END_GAME) {
            play();
            showOption();
            option = scanner.nextInt();
            scanner.nextLine();
        }
        System.out.println("The end");
    }

    private void showOption() {
        System.out.println("NEXT" + NEXT_GAME);
        System.out.println("END" + END_GAME);
    }

    private void play() {
        Starter starter = new Starter(wl.getRandomWord());
        do {
            System.out.println("password to guess");
            String guessWordDisplay = starter.getGuessWordDisplay();
            System.out.println(guessWordDisplay);
            System.out.println("enter the letter");
            String line = scanner.nextLine();
            char userGuess = line.charAt(0);
            starter.checkLetter(userGuess);
        }
        while (!starter.userLost() && !starter.userWon());
        System.out.println();
        if (starter.userLost())
            System.out.println("Lost");
        else if (starter.userWon())
            System.out.println("Win");
        System.out.printf("Password: %s\n\n", starter.getGuessWord());

    }
}
