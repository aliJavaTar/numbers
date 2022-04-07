import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {
    private Numbers numbers;

    @BeforeEach
    public void createObject() {
        numbers = new Numbers();
    }

    @Test
    public void empty() {
        char douDigit = numbers.isDouDigit("");
        assertEquals('n', douDigit);
    }

    @Test
    public void singleDigit() {
        char douDigit = numbers.isDouDigit("1");
        assertEquals('n', douDigit);

        char douDigit1 = numbers.isDouDigit("3");
        assertEquals('n', douDigit1);

        char douDigit2 = numbers.isDouDigit("7");
        assertEquals('n', douDigit2);

    }

    @Test
    public void twoDigitNotEqual() {
        char douDigit = numbers.isDouDigit("13");
        assertEquals('n', douDigit);
    }

    @Test
    public void twoDigitNotEqual1() {
        char douDigit = numbers.isDouDigit("12345678");
        assertEquals('n', douDigit);
    }

    @Test
    public void twoDigitNotEqual2() {
        char douDigit = numbers.isDouDigit("31");
        assertEquals('n', douDigit);
    }


    @Test
    public void DigitNotEqual() {
        char douDigit = numbers.isDouDigit("1397453");
        assertEquals('y', douDigit);

//        char douDigit1 = numbers.isDouDigit("31");
//        assertEquals('n', douDigit1);

//        char douDigit2 = numbers.isDouDigit("74");
//        assertEquals('n', douDigit2);

    }

    @Test
    public void twoDigitEqual() {
        char douDigit = numbers.isDouDigit("11");
        assertEquals('y', douDigit);

        char douDigit1 = numbers.isDouDigit("22");
        assertEquals('y', douDigit1);

        char douDigit2 = numbers.isDouDigit("1397453");
        assertEquals('y', douDigit2);

    }

    @Test
    public void DigitEqual() {
        char douDigit = numbers.isDouDigit("1111");
        assertEquals('y', douDigit);

        char douDigit1 = numbers.isDouDigit("2222");
        assertEquals('y', douDigit1);

        char douDigit2 = numbers.isDouDigit("7777");
        assertEquals('y', douDigit2);

    }


    @Test
    public void isValidNumberTest() {
        String number = "12";
        boolean validNumber = numbers.isValidNumber(number);
        assertTrue(validNumber);
        String number1 = "12a";
        boolean validNumber1 = numbers.isValidNumber(number1);
        assertFalse(validNumber1);
        String number2 = "1a2";
        boolean validNumber2 = numbers.isValidNumber(number2);
        assertFalse(validNumber2);
        String number3 = "1a2";
        boolean validNumber3 = numbers.isValidNumber(number3);
        assertFalse(validNumber3);
    }

    @Test
    void plusNumberOfHome() {
        numbers.plusNumberOfHome('1');
        numbers.plusNumberOfHome('1');
        numbers.plusNumberOfHome('1');
        Integer actual = numbers.arrayNumber[1];
        assertEquals(3, actual);

        numbers.plusNumberOfHome('2');
        Integer actual1 = numbers.arrayNumber[2];
        assertEquals(1, actual1);

        numbers.plusNumberOfHome('0');
        numbers.plusNumberOfHome('0');
        Integer actual2 = numbers.arrayNumber[0];
        assertEquals(2, actual2);
    }

}