package main.java.com.example;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserService {

    private String password = "admin123";

    // Check if user exists
    public boolean userExists(String username) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db", "root", password);
             PreparedStatement st = conn.prepareStatement("SELECT 1 FROM users WHERE name = ?")) {
            st.setString(1, username);
            try (ResultSet rs = st.executeQuery()) {
                return rs.next(); // true if user exists
            }
        }
    }

    // Delete user safely
    public boolean deleteUser(String username) throws SQLException {
        try (Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/db", "root", password);
             PreparedStatement st = conn.prepareStatement("DELETE FROM users WHERE name = ?")) {
            st.setString(1, username);
            return st.executeUpdate() > 0; // true if deletion happened
        }
    }

    // Removed unused notUsed() method
}
