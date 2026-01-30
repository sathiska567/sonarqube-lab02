package main.java.com.example;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {

    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) throws Exception {
        // Calculator usage
        Calculator calc = new Calculator();
        int result = calc.calculate(10, 5, "add-again");
        logger.info("Calculation result: {}", result);

        // User service
        UserService service = new UserService();

        // Invoke deleteUser only conditionally
            service.deleteUser("admin"); // safe execution
            logger.info("User 'admin' deleted successfully.");
    }
}
