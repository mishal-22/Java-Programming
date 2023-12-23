import java.sql.*;
public class InsertIntoEmployee {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
    Class.forName("com.mysql.cj.jdbc.Driver");
    String urtString="jdbc:mysql://localhost:3306/hospital";
    String userNameString="root";
    String password="7025";
    Connection connection=DriverManager.getConnection(urtString,userNameString,password);
    String query="insert into employee values(?,?,?)";
    PreparedStatement preparedStatement=connection.prepareStatement(query);
    preparedStatement.setInt(1, 8);
    preparedStatement.setString(2, "Rahul");
    preparedStatement.setString(3, "rahul@gmail.com");
    int rowAffected=preparedStatement.executeUpdate();
    if(rowAffected>0) {
    	System.out.println("Successfully updated");
    	
    }
    else {
		System.out.println("Failed to insert data");
	}
    connection.close();
    preparedStatement.close();
    
}
}
