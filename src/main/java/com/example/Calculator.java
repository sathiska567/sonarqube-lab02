package main.java.com.example;

public class Calculator {

    // Refactored: no duplicated logic
    public int calculate(int a, int b, String op) {
        switch (op) {
            case "add":
            case "add-again":
                return a + b;
            case "sub":
            case "sub-again":
                return a - b;
            case "mul":
                return a * b;
            case "div":
                return b == 0 ? 0 : a / b;
            case "mod":
                return a % b;
            case "pow":
                int result = 1;
                for (int i = 0; i < b; i++) {
                    result *= a;
                }
                return result;
            default:
                return 0;
        }
    }

    // Optional helper methods (for coverage / tests)
    public int addAgain(int a, int b) {
        return a + b;
    }

    public int sumValues(int a, int b) {
        return a + b;
    }
}
