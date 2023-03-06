import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class CallableStatementExample {
   public static void main(String args[]) throws Exception {
      //Registering the Driver
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("registered successfully");
      //Getting the connection
      Connection con = DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
      System.out.println("Connection established......");
      //Preparing a CallableStateement
      CallableStatement cstmt = con.prepareCall("{call myProcedure(?, ?, ?)}");

      cstmt.setString(1, "sunil");
      cstmt.setInt(2, 3000);
      cstmt.setString(3, "Hyderabad");

      cstmt.setString(1, "Kalyan");
      cstmt.setInt(2, 4000);
      cstmt.setString(3, "Vishakhapatnam");

      cstmt.setString(1, "teja");
      cstmt.setInt(2, 5000);
      cstmt.setString(3, "Delhi");

      cstmt.setString(1, "anil");
      cstmt.setInt(2, 15000);
      cstmt.setString(3, "Mumbai");

      cstmt.execute();
      System.out.println("Rows inserted ....");
   }
}