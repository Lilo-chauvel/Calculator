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
        assertEquals(1, calculator.addition(-2,3));
    }
    @Test
    public void testAdditionWithZero(){
        assertEquals(2, calculator.addition(0,2));
    }
    @Test
    public void testAdditionTwoZero(){
        assertEquals(0, calculator.addition(0,0));
    }

    //TESTS SUBSTRACT
    @Test
    public void testSubstractionTwoPositif(){
        assertEquals(-1, calculator.substract(2,3));
    }
    @Test
    public void testSubstractionTwoNegatif(){
        assertEquals(1, calculator.substract(-2,-3));
    }
    @Test
    public void testSubstractionPositifAndNegatif(){
        assertEquals(5, calculator.substract(2,-3));
        assertEquals(-5, calculator.substract(-2,3));
    }
    @Test
    public void testSubstractionWithZero(){
        assertEquals(-2, calculator.substract(0,2));
    }
    @Test
    public void testSubstractionTwoZero(){
        assertEquals(0, calculator.substract(0,0));
    }

    //TESTS MULTIPLY
    @Test
    public void testMultiplyTwoPositive(){
        assertEquals(6,calculator.multiply(2,3));
    }
    @Test
    public void testMultiplyTwoNegative(){
        assertEquals(6,calculator.multiply(-2,-3));
    }
    @Test
    public void testMultiplyPositiveAndNegative(){
        assertEquals(-6,calculator.multiply(-2,3));
        assertEquals(-6,calculator.multiply(2,-3));
    }
    @Test
    public void testMultiplyWithZero(){
        assertEquals(0,calculator.multiply(0,2));
    }
    @Test
    public void testMultiplyByOne(){
        assertEquals(6,calculator.multiply(6,1));
    }

    //TESTS DIVIDE
    @Test
    public void testDeviveTwoPositive() throws ExceptionDivideByZero {
        assertEquals(2, calculator.divide(4,2));
    }
    @Test
    public void testDeviveTowNegative() throws ExceptionDivideByZero {
        assertEquals(2,calculator.divide(-4,-2));
    }
    @Test
    public void testDevivePositiveAndNegative() throws ExceptionDivideByZero {
        assertEquals(-2,calculator.divide(4,-2));
        assertEquals(-2,calculator.divide(-4,2));
    }
    @Test
    public void testDeviveWithZero(){
        assertThrows(ExceptionDivideByZero.class, ()->calculator.divide(5,0));
    }
    @Test
    public void testDivideZeroByNumber() throws ExceptionDivideByZero {
        assertEquals(0,calculator.divide(0,10));
    }
    @Test
    public void testDivideByOne() throws ExceptionDivideByZero {
        assertEquals(5, calculator.divide(5,1));
        assertEquals(10, calculator.divide(10,1));
    }
}

