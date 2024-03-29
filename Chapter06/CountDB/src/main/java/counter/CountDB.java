package counter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class CountDB {
	private int count = 0;
	private Statement statement = null;

	public CountDB() {
		initializeJdbc();
	}

	/** Return count property */
	public int getCount() {
		try {
			ResultSet rset = statement.executeQuery("select countValue from Count");
			rset.next();
			count = rset.getInt(1);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}

		return count;
	}

	/** Increase count */
	public void increaseCount() {
		count++;
		try {
			statement.executeUpdate("update Count set countValue = " + count);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	/** Initialize database connection */
	public void initializeJdbc() {
		try {
			Class.forName("com.mysql.jdbc.Driver");

			// Connect to the sample database
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost/sampledb" , "root", "");

			statement = connection.createStatement();
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
	}

}

