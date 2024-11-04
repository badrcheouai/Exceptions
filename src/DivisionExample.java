public class DivisionExample {

    public static float divideNumbers(int a, int b) {
        try {
            float div = a / b;
            return div;
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero.");
            return 0;
        }
    }

    public static void main(String[] args) {
        // Test cases
        System.out.println("Output: " + divideNumbers(10, 3));
        System.out.println("Output: " + divideNumbers(10, 0));
    }
}
