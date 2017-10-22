
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 10/16/17.
 */

public class UnitTests {

    @Test
    public void test1LetterWords() {
        boolean expected = true;
        boolean actual = Main.userGuessesHangmanCorrectly("g", "g");
        assertEquals(expected, actual);
    }

    @Test
    public void test2LetterWords() {
        boolean expected = true;
        boolean actual = Main.userGuessesHangmanCorrectly("g", "go");
        assertEquals(expected, actual);
    }

    @Test
    public void addUserGuessesTest1() {
        String expected = "ab";
        String actual = Main.addUserGuesses("a", "b");
        assertEquals(expected, actual);
    }

    @Test
    public void testContainsMethodValidation() {
        boolean expected = true;
        boolean actual = Main.characterIsInHangmanWord("a", "hangman");
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintsOutHangman() {
        boolean expected = false;
        boolean actual = Main.printOutCurrentHangman("a", "ab");
        assertEquals(expected, actual);
    }

    @Test
    public void testPrintsOutInitialLine() {
        int expected = 2;
        int actual = Main.printOutStartingLine( "ab");
        assertEquals(expected, actual);
    }

}
