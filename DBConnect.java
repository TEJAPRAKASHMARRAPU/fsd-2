import java.sql.*;
class DBConnect
{
	public static void main(String args[])
	{
		try
		{
			//register with driver step1
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("registered succesfully");
			//Establish connection
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
			System.out.println("connection established succesfully");
			//3 statement Object
			Statement stmt=c.createStatement();
			//4 Execute
			String sql="create table teja2(eid integer,ename varchar2(40))";
			stmt.execute(sql);
			System.out.println("table created");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}