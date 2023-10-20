package exceptions;

public class Calculator {
    
    public int add(int x, int y){
        return x + y;
    }
    
    public double divide(int x, int y) {
        double ans = 0.0;
        try {
            ans = (double) x/y;
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }

        return ans;
    }
}
