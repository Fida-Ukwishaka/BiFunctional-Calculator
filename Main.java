public class Main {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;

        
        int sum = FunctionalCalculator.calculate(num1, num2, (a, b) -> a + b);
        int difference = FunctionalCalculator.calculate(num1, num2, (a, b) -> a - b);
        int product = FunctionalCalculator.calculate(num1, num2, (a, b) -> a * b);
        int quotient = FunctionalCalculator.calculate(num1, num2, (a, b) -> a / b);

        System.out.println("Addition: " + num1 + " + " + num2 + " = " + sum);
        System.out.println("Subtraction: " + num1 + " - " + num2 + " = " + difference);
        System.out.println("Multiplication: " + num1 + " * " + num2 + " = " + product);
        System.out.println("Division: " + num1 + " / " + num2 + " = " + quotient);
    }
}
