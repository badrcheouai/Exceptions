// Define the custom exception class
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

public class AgeChecker {

    // Method that checks age and throws the custom exception if age is invalid
    public static void checkAge(int age) throws InvalidAgeException {
        if (age < 18) {
            throw new InvalidAgeException("Age must be 18 or older");
        }
    }

    public static void main(String[] args) {
        // Test cases
        try {
            checkAge(20); // Expected: No exception, no output
            System.out.println("Output: Age is valid.");

            checkAge(15); // Expected: Exception, prints "Age must be 18 or older."
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
