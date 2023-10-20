package exceptions;

public class ShoppingCart {

    public static void main(String[] args) {
        Calculator calc = new Calculator();
        int addResult = calc.add(69, 420);
        System.out.println("Add Result: " + addResult);

        double divResult = calc.divide(20, 3);
        System.out.println("Division Result: " + divResult);

    }
}