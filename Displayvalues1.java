import java.sql.*;
import java.util.*;
class Displayvalues1
{
	public static void main(String args[])
	{
		try{
	int id;
	String name;
	Scanner s=new Scanner(System.in);
	//read id and name from user
	System.out.println("enter id");
	id=s.nextInt();
	System.out.println("enter name");
	name=s.next();
	Class.forName("oracle.jdbc.driver.OracleDriver");								System.out.println("registered succesfully");
			//Establish connection
			Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
	String sql="insert into teja2 values(?,?)";
	PreparedStatement stmt=con.prepareStatement(sql);
	stmt.setInt(1,id);
	stmt.setString(2,name);
	int i=stmt.executeUpdate();
	System.out.println(i+"records inserted");
}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}