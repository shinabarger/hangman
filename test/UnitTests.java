
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by davidshinabarger on 10/16/17.
 */

public class UnitTests {

    @Test
    public void firstTest() {
        boolean expected = true;
        boolean actual = Main.userGuessesHangmanCorrectly("g", "g");
        assertEquals(expected, actual);
    }

}
