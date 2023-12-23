package create.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertValues {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospital";
		String user="root";
		String password="7025";
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="insert into patient values(2,'Ram','Malappuram')";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		preparedStatement.execute();
		System.out.println("Successful");
	
	} catch (ClassNotFoundException |SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
