import java.sql.*;

class Demo{
	 public static void main(String[] args) {
	        try {
	            // Load the JDBC driver
	            Class.forName("com.mysql.cj.jdbc.Driver");

	            // Establish a connection to the database
	            String url = "jdbc:mysql://localhost:3306/hospital";
	            String user = "root";
	            String password = "7025";
	            Connection connection = DriverManager.getConnection(url, user, password);

	            // Create a SQL statement
	            Statement statement = connection.createStatement();

	            // Execute a SQL query
	            String sqlQuery = "SELECT * FROM hospitaldetails";
	            ResultSet resultSet = statement.executeQuery(sqlQuery);
                 
	            // Process the result set
	            while (resultSet.next()) {
	                int id = resultSet.getInt("hospital_code");
	                String name = resultSet.getString("hospital_name");
	                String location=resultSet.getString("hospital_location");
	                System.out.println("ID: " + id + ", Name: " + name+", Location: "+location);

	            }

	            // Close resources
	            resultSet.close();
	            statement.close();
	            connection.close();

	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	        }
	    }

}