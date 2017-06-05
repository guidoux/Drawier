package drawier;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class DrawierTest {
    Drawier drawier;

    @Before
    public void setUp() throws Exception {
        drawier = new Drawier();
    }

    @Test
    public void printAsterisk() {
        assertEquals('*', drawier.asterisk());
    }

    @Test
    public void drawLineReturnsAstringWithCorrectSize() {
        assertEquals( 3, drawier.drawLine(3).length());
    }

    @Test
    public void drawLineCorrectly() {
        assertEquals("***", drawier.drawLine(3));
    }

}