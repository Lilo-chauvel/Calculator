import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;


public class CalculatorTest {
    Calculator calculator = new Calculator();

    // TESTS ADDITION
    @Test
    public void testAdditionTwoPositif(){
        assertEquals(5, calculator.addition(2,3));
    }
    @Test
    public void testAdditionTwoNegatif(){
        assertEquals(-5, calculator.addition(-2,-3));
    }
    @Test
    public void testAdditionPositifAndNegatif(){
        assertEquals(-1, calculator.addition(2,-3));
    }
    @Test
    public void testAdditionWithZero(){
        assertEquals(2, calculator.addition(0,2));
    }
    @Test
    public void testAdditionTwoZero(){
        assertEquals(0, calculator.addition(0,0));
    }

}
