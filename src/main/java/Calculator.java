public class Calculator {

    public int addition (int a, int b){
        return a + b;
    }

    public int substract (int a, int b){
        return a - b;
    }

    public int multiply (int a, int b){
        return a * b;
    }

    public int divide(int a, int b) throws ExceptionDivideByZero {
        if(b==0){
            throw new ExceptionDivideByZero();
        }
        return a / b;
    }
}
