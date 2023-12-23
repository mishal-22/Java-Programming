package ticket.booking;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class SeatBooking {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the seat id");
		int seatId=scanner.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			String url="jdbc:mysql://localhost:3306/booking";
			String userName="root";
			String password="7025";
			
		  Connection connection=DriverManager.getConnection(url, userName, password);
		  String query="SELECT is_available, version FROM Seats WHERE id = ?";
		  PreparedStatement preparedStatement=connection.prepareStatement(query);
		  preparedStatement.setInt(1, seatId);
		  ResultSet resultSet=preparedStatement.executeQuery();
		  if(resultSet.next()) {
			  boolean isAvailable=resultSet.getBoolean("is_available");
			  int currentVersion=resultSet.getInt("version");
			  if(!isAvailable) {
				  System.out.println("seat is not available");
				  return;
			  }
			  boolean bookingSuccessful=bookSeat(connection,seatId,currentVersion);
			  if(bookingSuccessful) {
				  System.out.println("Booking successful");
			  }
			  else {
				System.out.println("Booking is not successful");
			}
		  }
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static boolean bookSeat(Connection connection, int seatId, int currentVersion) {
		
		try {
			String updateQuery="UPDATE Seats SET is_available = ?, version = ? WHERE id = ? AND version = ?";
			PreparedStatement preparedStatement=connection.prepareStatement(updateQuery);
			preparedStatement.setBoolean(1, false);
			preparedStatement.setInt(2, currentVersion+1);
			preparedStatement.setInt(3, seatId);
			preparedStatement.setInt(4, currentVersion);
			int rowUpdated=preparedStatement.executeUpdate();
			return rowUpdated>0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return true;
		
	}

}
