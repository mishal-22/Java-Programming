import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class Bank {
		

		public static void main(String[] args) {
			 String url = "jdbc:mysql://localhost:3306/hospital";
			 String user = "root";
			 String password = "7025";
			Connection connection=null;
			try {
				
			     Scanner scanner=new Scanner(System.in);
				Class.forName("com.mysql.cj.jdbc.Driver");
				 connection = DriverManager.getConnection(url, user, password);
				// 1. by setting auto commit status false
				connection.setAutoCommit(false);
				String qurey1="update bank set amount=amount-? where id=111";
				String qurey2="update bank12 set amount=amount+? where id=333";
				System.out.println("Enter the amount want to send");
				int amount=scanner.nextInt();
				
				PreparedStatement preparedStatement1=connection.prepareStatement(qurey1);
				PreparedStatement preparedStatement2=connection.prepareStatement(qurey2);
				preparedStatement1.setInt(1,amount);
				preparedStatement1.execute();
				preparedStatement2.setInt(1,amount);
				preparedStatement2.execute();
				// 2.commiting the changes
				connection.commit();

			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				try {
					// 3.if any problem happens,rollback the changes
					connection.rollback();
					System.out.println("changes are roll back");
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}

	

}
}
