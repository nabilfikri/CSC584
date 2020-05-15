import java.sql.*;

public class SimpleJDBC {
	public static void main(String[] args) throws SQLException, ClassNotFoundException {
		// Load the JDBC driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver loaded");

		// Connect to a database
		Connection connection = DriverManager.getConnection
				("jdbc:mysql://localhost/sampledb" , "root", "");
		System.out.println("Database connected");

		// Create a statement
		Statement statement = connection.createStatement();

		// Execute a statement
		ResultSet resultSet = statement.executeQuery("SELECT * FROM student");

		// Iterate through the result and print the student names
		while (resultSet.next()){
			System.out.print(resultSet.getString(2));
			System.out.print(" " + resultSet.getString(3));
			System.out.println(" " + resultSet.getString(4));
		}

		// Close the connection
		connection.close();
	}
}
