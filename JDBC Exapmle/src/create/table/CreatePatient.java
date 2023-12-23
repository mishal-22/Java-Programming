package create.table;

import java.sql.*;

public class CreatePatient {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospital";
		String user="root";
		String password="7025";
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="create table patient(p_id int primary key,p_name varchar(20) not null,p_location varchar(30) not null)";
		PreparedStatement preparedStatement=connection.prepareStatement(query);
		boolean rowAffected=preparedStatement.execute();
		if(rowAffected) {
			System.out.println("Success");
		}
		else {
			System.out.println("fail");
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
