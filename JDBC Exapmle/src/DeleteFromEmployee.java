import java.sql.*;
public class DeleteFromEmployee {
public static void main(String[] args) throws SQLException {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	String url="jdbc:mysql://localhost:3306/hospital";
	String userName="root";
	String password="7025";
	
		Connection connection=DriverManager.getConnection(url,userName,password);
	
	String query="delete from employee where emp_name='Rahul'";
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	
	int rowAffected=preparedStatement.executeUpdate();
}
}
