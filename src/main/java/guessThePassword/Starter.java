package guessThePassword;

public class Starter {
    private static final int MAX_MISTAKES = 10;
    private String guessWord;
    private String guessWordDisplay;
    private char[] userGuesses;
    private int guesses;
    private int mistakes;

    public Starter(String guessWord) {
        this.guessWord = guessWord;
        userGuesses = new char[32];
        generateDisplay();
    }

    private void generateDisplay() {
        String display = " ";
        for (int i = 0; i < guessWord.length(); i++) {
            char nextChar = guessWord.charAt(i);
            if (arrayContains(userGuesses, nextChar))
                display += nextChar;
            else if (nextChar == ' ')
                display += ' ';
            else display += "*"; //change " " on "*"
        }
        this.guessWordDisplay = display;
    }

    private boolean arrayContains(char[] userGuesses, char nextChar) {
        for (char elements : userGuesses) {
            if (elements == nextChar)
                return true;
        }
        return false;
    }

    public String getGuessWord() {
        return guessWord;
    }

    public String getGuessWordDisplay() {
        return guessWordDisplay;
    }

    public boolean userLost() {
        return mistakes >= MAX_MISTAKES;
    }

    public boolean userWon() {
        return !guessWordDisplay.contains("*");
    }

    public void checkLetter(char letter) {
        if(!arrayContains(userGuesses, letter)) {
            checkMistake(letter);
            rememberGuess(letter);
            generateDisplay();
        }
    }

    private void checkMistake(char letter) {
        if(guessWord.indexOf(letter) == -1) {
            mistakes++;
        }
    }

    private void rememberGuess(char letter) {
        userGuesses[guesses] = letter;
        guesses++;
    }
}
