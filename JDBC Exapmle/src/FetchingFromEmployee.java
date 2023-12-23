import java.sql.*;
public class FetchingFromEmployee {
public static void main(String[] args) throws ClassNotFoundException, SQLException {
      Class.forName("com.mysql.cj.jdbc.Driver");
      String url="jdbc:mysql://localhost:3306/hospital";
      String userName="root";
      String password="7025";
      Connection connection=null;
      Statement statement=null;
      ResultSet resultSet=null;
      String sqlQuery="select * from employee";
      connection=DriverManager.getConnection(url,userName,password);
      statement=connection.createStatement();
      resultSet=statement.executeQuery(sqlQuery);
      while(resultSet.next()) {
    	  int id=resultSet.getInt("emp_id");
    	  String name=resultSet.getString("emp_name");
    	  String email=resultSet.getString("emp_email");
    	  System.out.println("Id: "+id+" Name: "+name+" Email: "+email);
    	 
    	
    
    	  
    	  
      }
      connection.close();
      resultSet.close();
      statement.close();
      
}
}
