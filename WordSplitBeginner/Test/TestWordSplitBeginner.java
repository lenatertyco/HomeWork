
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestWordSplitBeginner {


@Test
        public void testWordsTransformer () {

        String input = "ss kkk aa";
        String expected = "SS kkk AA";
        String actual = Main.WordsTransformer.transform(input);
        assertEquals(actual, expected);
        }

}


