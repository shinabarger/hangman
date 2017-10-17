public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

    }

    static String addUserGuesses(String userGuesses, String newUserGuess) {
        if(!userGuesses.contains(newUserGuess)) {
            userGuesses = userGuesses + newUserGuess;
        }

        return userGuesses;
    }

    static boolean userGuessesHangmanCorrectly(String userGuesses, String actualWord) {
        if (userGuesses.equalsIgnoreCase(actualWord)) {
            return true;
        } else return false;

    }
}
