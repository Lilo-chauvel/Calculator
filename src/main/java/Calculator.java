public class Calculator {

    public int addition (int a, int b){
        return a + b;
    }

    public int subtraction(int a, int b){
        return a - b;
    }

    public int multiplication(int a, int b){
        return a * b;
    }

    public int division(int a, int b) throws ExceptionDivideByZero {
        if(b==0){
            throw new ExceptionDivideByZero();
        }
        return a / b;
    }
}
