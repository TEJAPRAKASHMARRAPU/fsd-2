import java.sql.*;
class Insertdemo1
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");								System.out.println("registered succesfully");
			//Establish connection
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
			System.out.println("connection established successfully");
			//statment obj
			Statement s=c.createStatement();
			//inserting values
			String sql="insert into teja2 values(105,'heamanth')";
			int no_of_rows_effected=s.executeUpdate(sql);
			System.out.println("N rows effected"+no_of_rows_effected);
			String sql1="insert into teja2 values(106,'siddu')";
			no_of_rows_effected=s.executeUpdate(sql1);
			System.out.println("N rows effected"+no_of_rows_effected);
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}