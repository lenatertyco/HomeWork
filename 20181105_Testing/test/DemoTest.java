import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DemoTest {


    @Test
    public void testCheckStringForSelf() throws Exception{
        String actual = Demo.checkString("Ivanoff");
        assertEquals("strings", "Ivanoff", actual);


    }

    @Test
    public void testCheckStringLength3()throws Exception{
        String actual = Demo.checkString("Iva");
        assertEquals("strings", "IVA", actual);


    }
    @Test
    public void testCheckStringLength4()throws Exception{
        String actual = Demo.checkString("Ivan");
        assertEquals("strings", "ivan", actual);


    }

    @Test (expected = IncorrectInputDataException.class)
    public void testCheckStringIsNull()throws Exception{
        String actual = Demo.checkString(null);

    }
}


