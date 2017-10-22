import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        char [] hangmanWordsArray = getHangmanWord();
        String hangmansWord = hangmanWordsArray.toString();

        printOutStartingLine(hangmansWord);

        System.out.println("Guess a letter. Any letter.");
        String nextCharacterGuess = scan.nextLine();
        System.out.println("You guessed " + nextCharacterGuess);

        boolean userGuessedAllCorrectLetters = false;
        int guesses = 0;

        while(userGuessedAllCorrectLetters == false && guesses <= 10){

            if (characterIsInHangmanWord(nextCharacterGuess, hangmansWord) == false) {
                guesses = guesses + 1;
                System.out.println("Nope, that's not in the word. That was Guess # " + guesses + ". Guess again.");
                nextCharacterGuess = scan.nextLine();
            }

            printOutCurrentHangman(nextCharacterGuess, hangmansWord);

            userGuessedAllCorrectLetters = true;
            System.out.println("Congrats, you did it!");
        }



    }

    static boolean printOutCurrentHangman(String nextCharacterGuess, String hangmansWord) {
        int lengthOfHangmanWord = hangmansWord.length();
        System.out.println(lengthOfHangmanWord);

        return false;
    }

    static int printOutStartingLine(String hangmansWord) {
        int lengthOfHangmansWord = hangmansWord.length();
        for (int i = 0; i < hangmansWord.length() ; i++) {
            System.out.print("_");
        }
        return lengthOfHangmansWord;
    }

    static boolean characterIsInHangmanWord(String nextCharacterGuess, String hangmansWord) {
            if(hangmansWord.contains(nextCharacterGuess)) {
                return true;
            }
        else return false;
    }

    private static char[] getHangmanWord() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the word you'd like the person to guess");
        String hangmanWord = scan.nextLine();

        char[] temporaryHangmanWordsArray = hangmanWord.toCharArray();
        System.out.println(temporaryHangmanWordsArray);
        return temporaryHangmanWordsArray;
    }

    //TODO add a validation method to make sure whatever the user is putting in is only 1 letter long and not a longer string. Also make sure it's a letter in the alphabet.

    static String addUserGuesses(String userGuesses, String newUserGuessLetter) {
        if(!userGuesses.contains(newUserGuessLetter)) {
            userGuesses = userGuesses + newUserGuessLetter;
        }

        return userGuesses;
    }

    static boolean userGuessesHangmanCorrectly(String userGuesses, String actualWord) {
        if (userGuesses.equalsIgnoreCase(actualWord)) {
            return true;
        } else return false;

    }
}
