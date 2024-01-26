import java.sql.*;

public class App10 {
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/students";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public static void main(String[] args) {
        try (Connection connection = DriverManager.getConnection(JDBC_URL, DB_USER, DB_PASSWORD)) {
            Statement statement = connection.createStatement();

            // CREATE operation
            String createQuery = "INSERT INTO students (id, name, age, department) VALUES (1, 'John', 21, 'Computer Science')";
            statement.executeUpdate(createQuery);
            System.out.println("Record created successfully.");

            // READ operation
            String readQuery = "SELECT * FROM students";
            ResultSet resultSet = statement.executeQuery(readQuery);
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                String department = resultSet.getString("department");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age + ", Department: " + department);
            }

            // UPDATE operation
            String updateQuery = "UPDATE students SET age = 22 WHERE name = 'John'";
            statement.executeUpdate(updateQuery);
            System.out.println("Record updated successfully.");

            // DELETE operation
            String deleteQuery = "DELETE FROM students WHERE name = 'John'";
            statement.executeUpdate(deleteQuery);
            System.out.println("Record deleted successfully.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
