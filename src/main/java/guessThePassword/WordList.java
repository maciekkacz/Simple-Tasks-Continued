package guessThePassword;

import java.util.Random;

public class WordList {
    private Random random = new Random();

    private final String[] wordList = {"bath", "shower", "toilet", "bathroom cabinet", "shelf", "towel",
    "washing machine", "basin", "shower curtain", "tap", "toilet paper holder"};


    public String getRandomWord(){
        int randomIndex = random.nextInt(wordList.length);
        return wordList[randomIndex];
    }
}
