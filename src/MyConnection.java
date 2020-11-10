
import java.sql.*;
public class MyConnection 
{	static Connection con;
	static
	{	try
		{
			 Class.forName("com.mysql.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/catchdb","root","ammy");
		}catch(Exception ex)
		{
			ex.printStackTrace();
		}	
	}
	
	public static Connection getConnection()
	{
		return con;
	}
	

}

