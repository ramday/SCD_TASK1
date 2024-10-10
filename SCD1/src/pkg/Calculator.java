
package pkg;
public class Calculator {

    // Addition method with input validation
    public int addition(int a, int b) {
        validateInputs(a, b);
        return a + b;
    }

    // Multiplication method with input validation
    public int multiplication(int a, int b) {
        validateInputs(a, b);
        return a * b;
    }

    // Input validation method to ensure non-negative integers
    private void validateInputs(int a, int b) {
        if (a < 0 || b < 0) {
            throw new IllegalArgumentException("Inputs must be non-negative integers.");
        }
    }
}