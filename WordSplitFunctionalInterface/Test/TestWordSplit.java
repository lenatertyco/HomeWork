import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import java.util.function.Function;
import java.util.function.Predicate;

import static org.junit.Assert.assertEquals;

public class TestWordSplit {



    String sentence;

    Function<String, String> toUpperCase = s -> s.toUpperCase();

    Predicate<String> isThree = t -> t.length() == 3;



    Function<String, String> toLowerCase = s -> s.toLowerCase();

    Predicate<String> isFour = t -> t.length() == 4;



    @Before

    public void before() {

        sentence = "sss DDDD NNN aBc";

    }



    @Test

    public void testOneWordSentenceToUpper() {

        String input = "aAb";

        String expected = "AAB";

        String actual = TransformerMain.transform(input, isThree, toUpperCase);



        assertEquals(expected, actual);

    }



    @Test

    public void testOneWordSentenceToLower() {



        String input = "AbCd";



        String expected = "abcd";



        String actual = TransformerMain.transform(input, isFour, toLowerCase);



        assertEquals(expected, actual);

    }



    @Test

    public void testMultipleWordsToUpper() {

        String expected = "SSS DDDD NNN ABC";



        String actual = TransformerMain.transform(sentence, isThree, toUpperCase);



        assertEquals(expected, actual);

    }



    @Test

    public void testMultipleWordsToLower() {

        String expected = "sss dddd NNN aBc";



        String actual = TransformerMain.transform(sentence, isFour, toLowerCase);



        assertEquals(expected, actual);

    }



    @Test

    @Ignore("Lets assume we do not know yet how to handle null inputs")

    public void testIfNullInput () {

        TransformerMain.transform(null, isFour, toLowerCase);

    }

}

