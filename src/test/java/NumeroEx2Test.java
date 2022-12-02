import org.example.NumeroEx2;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


import static org.junit.jupiter.api.Assertions.*;

public class NumeroEx2Test {
    NumeroEx2 num;
    @BeforeEach
    public void setUp(){
        num = new NumeroEx2();
    }
    @ParameterizedTest
    @DisplayName("PRIMO")
    @ValueSource(ints = {3,23,311,487,653,947})
    public void testIsPrime(int number){
        assertTrue(num.isPrime(number));
    }

    @ParameterizedTest
    @DisplayName("PAR")
    @ValueSource(ints = {32,64,2,20,30,26})
    public void testIsEven(int number){
        assertTrue(num.isEven(number));
    }

    @ParameterizedTest
    @DisplayName("MULTIPLO")
    @ValueSource(ints = {23,46,115,184,207,230})
    public void testIsMultiple(int number){
        int divisor = 23;
        assertTrue(num.isMultiple(number,divisor));
    }
}
