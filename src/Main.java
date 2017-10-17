public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

    }


    static boolean userGuessesHangmanCorrectly(String userGuess, String actualWord) {
        if (userGuess.equalsIgnoreCase(actualWord)) {
            return true;
        } else return false;

    }
}
