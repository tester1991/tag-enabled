package validator;

import org.junit.*;

import static junit.framework.Assert.assertEquals;

public class Assignment1Part1Test {
    private ISBNValidate isbn;

    @Before
    public void setUp() throws Exception {
        isbn = new ISBNValidate();
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void testAppendCheckDigitPass(){
        assertEquals("1234567890128", isbn.appendCheckDigitToISBN12("123456789012"));
    };

    @Test(expected = IllegalArgumentException.class)
    public void testAppendCheckDigitFail(){
        isbn.appendCheckDigitToISBN12("12345678901");
    };

}