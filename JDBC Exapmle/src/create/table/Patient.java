package create.table;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.spi.DecimalFormatSymbolsProvider;
import java.util.Scanner;
import java.sql.ResultSetMetaData;

public class Patient {
	static String url = "jdbc:mysql://localhost:3306/hospital";
	static String user = "root";
	static String password = "7025";

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection connection = DriverManager.getConnection(url, user, password);
			showData(connection);

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	private static void createTable(Connection connection) throws SQLException {
		// TODO Auto-generated method stub
		String query = "create table %s(%s)";
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the name of the table");
		String name = scanner.next();
		System.out.println("Enter the no of columns");
		int size = scanner.nextInt();
		String[] columns = new String[size];
		scanner.nextLine();
		for (int i = 0; i < size; i++) {
			System.out.println("Enter the column name and its data type also constraints");
			columns[i] = scanner.nextLine();
		}
		String columnQuery = String.join(",", columns);
		String tableQuery = String.format(query, name, columnQuery);
		PreparedStatement preparedStatement = connection.prepareStatement(tableQuery);
		preparedStatement.execute();
		System.out.println("Table Successfully created");
		preparedStatement.close();
		scanner.close();

	}

	public static void insertData(Connection connection) throws SQLException {
		String query = "insert into %s values(%s)";
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the table name");
		String table = scanner.next();
		scanner.nextLine();

		System.out.println("Enter items to add");
		String str = scanner.nextLine();
		String tableQuery = String.format(query, table, str);
		PreparedStatement preparedStatement = connection.prepareStatement(tableQuery);
		preparedStatement.execute();
		System.out.println("Item added successfully");
		scanner.close();
		preparedStatement.close();
	}
	public static void deleteData(Connection connection) throws SQLException {
		Scanner scanner=new Scanner(System.in);
		String query="delete from %s where %s";
		System.out.println("enter the table name");
		String table=scanner.next();
		scanner.nextLine();
		System.out.println("Please write the condition");
		String condition=scanner.nextLine();
		String deleteQuery=String.format(query,table,condition);
		PreparedStatement preparedStatement=connection.prepareStatement(deleteQuery);
		preparedStatement.execute();
		System.out.println("Item(s) deleted successfully");
	}
	public static void showData(Connection connection) throws SQLException {
		String query="select * from %s";
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the table name");
		String table=scanner.next();
		String showQuery=String.format(query,table);
		Statement statement=connection.createStatement();
		ResultSet resultSet=statement.executeQuery(showQuery);
		ResultSetMetaData metaData=resultSet.getMetaData();
		int columnCount=metaData.getColumnCount();
		for(int i=1;i<=columnCount;i++) {
			System.out.print(metaData.getColumnName(i)+"  ");
		}
		System.out.println();
		while(resultSet.next()) {
			for(int i=1;i<=columnCount;i++) {
				System.out.print(resultSet.getString(i)+"  ");
			}
			System.out.println();
		}
		
	}

}
