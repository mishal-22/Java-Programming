package create.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectItems {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost:3306/hospital";
		String user="root";
		String password="7025";
		Connection connection=DriverManager.getConnection(url,user,password);
		String query="select * from patient";
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(query);
		System.out.println("Patient details");
		System.out.println("--------------------------");
		while(resultSet.next()) {
			int id=resultSet.getInt("p_id");
			String name=resultSet.getString("p_name");
			String location=resultSet.getString("p_location");
			System.out.println("Patient Id: "+id+" Patient Name: "+name+" Patient Location: "+location);
		}
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
