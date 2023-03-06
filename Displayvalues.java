import java.sql.*;
class Displayvalues
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
			//4.Execute queries
			String sql="select * from teja2 where EID=101";
			ResultSet rs=s.executeQuery(sql);
			//for all records use next with in loop
			while(rs.next())
			{
				System.out.println(rs.getInt(1)+" "+rs.getString("ENAME"));
			}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}