package lesson15;

import java.sql.*;

public class JdbcDriverExample {
    public static void main(String[] args) {
        Connection connection = null;
        String connectionUrl = "jdbc:sqlite:test_database.sql";
        try {
            connection = DriverManager.getConnection(connectionUrl);
            System.out.println("Connection to database success");

            PreparedStatement statement = connection.prepareStatement("CREATE TABLE IF NOT EXISTS products (" +
                    "id INTEGER PRIMARY KEY AUTOINCREMENT, " +
                    "name TEXT, " +
                    "price INTEGER);");
            boolean executeResult = statement.execute();
            System.out.println("Create table result: " + executeResult);

            statement = connection.prepareStatement("INSERT INTO products (name, price) VALUES ('Pencil', 10), ('Pen', 15);");
//            statement.execute();

            statement = connection.prepareStatement("SELECT * FROM products;");
            ResultSet tableRows = statement.executeQuery();
            while (tableRows.next()) {
                System.out.println(tableRows.getString("name"));
                System.out.println(tableRows.getInt("price"));
            }
            statement = connection.prepareStatement("SELECT * FROM products WHERE length(name) > ?");
            statement.setInt(1, 3);
            statement.executeQuery();


            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
