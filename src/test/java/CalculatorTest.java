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
    public void testAdditionTwoNegative(){
        assertEquals(-5, calculator.addition(-2,-3));
    }
    @Test
    public void testAdditionPositifAndNegative(){
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

    //TESTS SUBSTRACTION
    @Test
    public void testSubstractionTwoPositif(){
        assertEquals(-1, calculator.subtraction(2,3));
    }
    @Test
    public void testSubstractionTwoNegative(){
        assertEquals(1, calculator.subtraction(-2,-3));
    }
    @Test
    public void testSubstractionPositifAndNegative(){
        assertEquals(5, calculator.subtraction(2,-3));
        assertEquals(-5, calculator.subtraction(-2,3));
    }
    @Test
    public void testSubstractionWithZero(){
        assertEquals(-2, calculator.subtraction(0,2));
    }
    @Test
    public void testSubstractionTwoZero(){
        assertEquals(0, calculator.subtraction(0,0));
    }

    //TESTS MULTIPLICATION
    @Test
    public void testMultiplicationTwoPositive(){
        assertEquals(6,calculator.multiplication(2,3));
    }
    @Test
    public void testMultiplicationTwoNegative(){
        assertEquals(6,calculator.multiplication(-2,-3));
    }
    @Test
    public void testMultiplicationPositiveAndNegative(){
        assertEquals(-6,calculator.multiplication(-2,3));
        assertEquals(-6,calculator.multiplication(2,-3));
    }
    @Test
    public void testMultiplicationWithZero(){
        assertEquals(0,calculator.multiplication(0,2));
    }
    @Test
    public void testMultiplicationByOne(){
        assertEquals(6,calculator.multiplication(6,1));
    }

    //TESTS DIVISION
    @Test
    public void testDivisionTwoPositive() throws ExceptionDivideByZero {
        assertEquals(2, calculator.division(4,2));
    }
    @Test
    public void testDivisionTowNegative() throws ExceptionDivideByZero {
        assertEquals(2,calculator.division(-4,-2));
    }
    @Test
    public void testDivisionPositiveAndNegative() throws ExceptionDivideByZero {
        assertEquals(-2,calculator.division(4,-2));
        assertEquals(-2,calculator.division(-4,2));
    }
    @Test
    public void testDivisionWithZero(){
        assertThrows(ExceptionDivideByZero.class, ()->calculator.division(5,0));
    }
    @Test
    public void testDivisionZeroByNumber() throws ExceptionDivideByZero {
        assertEquals(0,calculator.division(0,10));
    }
    @Test
    public void testDivisionByOne() throws ExceptionDivideByZero {
        assertEquals(5, calculator.division(5,1));
        assertEquals(10, calculator.division(10,1));
    }
}

