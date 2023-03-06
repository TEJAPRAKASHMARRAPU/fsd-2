import java.sql.*;
class Insertdemo
{
	public static void main(String args[])
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");						System.out.println("registered succesfully");
			//Establish connection
			Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
			System.out.println("connection established successfully");
			//statment obj
			Statement s=c.createStatement();
			//inserting values
			String sql="insert into teja2 values(103,'kalyan')";
			int no_of_rows_effected=s.executeUpdate(sql);
			System.out.println("N rows effected"+no_of_rows_effected);
			String sql1="insert into teja2 values(104,'anil')";
			no_of_rows_effected=s.executeUpdate(sql1);
			System.out.println("N rows effected"+no_of_rows_effected);
			//update values
			String sql2="update teja2 set eid=110 where ename='sunil'";
			s.executeUpdate(sql2);
			System.out.println("updated succesfully");
			//delete values
			String sql3="delete from teja2 where ename='sunil'";
			s.executeUpdate(sql3);
			System.out.println("del succesful");
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}