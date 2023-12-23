import java.sql.*;
public class UpdateEmployee {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
	Class.forName("com.mysql.cj.jdbc.Driver");
	String urlString="jdbc:mysql://localhost:3306/hospital";
	String user="root";
	String password="7025";
	Connection connection=DriverManager.getConnection(urlString,user,password);
	String query="update employee set emp_name='Sumesh',emp_email='sumesh@gmail.com' where emp_id=7";
	PreparedStatement preparedStatement=connection.prepareStatement(query);
	 int affected= preparedStatement.executeUpdate();
	 if(affected>0) {
		 System.out.println("Success");
	 }
	 else {
System.out.println("fail");
	}
}
}
