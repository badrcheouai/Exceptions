public class ExceptionHandlingExample {

    public static void parseAndDivide(String num1, String num2) {
        try {

            int number1 = Integer.parseInt(num1);
            int number2 = Integer.parseInt(num2);

            try {

                int result = number1 / number2;
                System.out.println("Output: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero.");
            }

        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        }
    }

    public static void main(String[] args) {
        parseAndDivide("10", "2");
        parseAndDivide("ten", "2");
        parseAndDivide("10", "0");
    }
}
