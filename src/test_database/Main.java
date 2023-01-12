package test_database;

import java.sql.*;

public class Main {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Adrian\\DataBaseJava\\testjava.db");
            Statement statement = conn.createStatement();
            statement.execute("CREATE TABLE IF NOT EXISTS " +
                    "contacts (id INTEGER PRIMARY KEY, name TEXT, phone INTEGER, email TEXT)");
            statement.execute("INSERT INTO contacts (name, phone, email) VALUES " +
                    "('Adrian', 35434543, 'adrian@gmail.com')");
//            statement.execute("ALTER TABLE contacts ADD id INTEGER PRIMARY KEY");
            statement.close();
            conn.close();
        } catch (SQLException e) {
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
