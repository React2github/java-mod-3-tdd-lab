import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.lang.reflect.Array;

class MainTest {

    @Test
    void main() {
    }

    @Test 
    void fizzBuzzTestForNull() {
        String response = Main.fizzBuzzString("");
        assertEquals(null, response);
    }

    @Test 
    void fizzBuzzTestForF() {
        String response = Main.fizzBuzzString("f");
        assertEquals("Fizz", response);
    }

    @Test 
    void fizzBuzzTestForB() {
        String response = Main.fizzBuzzString("b");
        assertEquals("Buzz", response);
    }

    @Test 
    void fizzBuzzTestForFAndB() {
        String response = Main.fizzBuzzString("fb");
        assertEquals("FizzBuzz", response);
    }

    // @Test
    // void fizzBuzzArray() {
    // Array resultsArr = 
    // assertArrayEquals(expectedArr.toArray(), resultsArr.toArray());
    // }
}