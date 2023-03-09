import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.lang.*;
class Search1 extends Frame implements ActionListener
{
	Label l1;
	TextField t1;
	Button b;
	TextField t2;		
	Search1()
	{
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new Label("Enter roll number");
		t1=new TextField(20);
		t2=new TextField(20);
		b=new Button("Search");
		l1.setBounds(250,40,400,50);
		l1.setForeground(Color.RED);
		add(l1);
		t1.setBounds(250,40,400,50);
		t1.setForeground(Color.BLUE);
		add(t1);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
       			Connection con=DriverManager.getConnection	("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
       			PreparedStatement pst=con.prepareStatement("insert into teja2 values(?,?)");
       			int id=Integer.parseInt(t1.getText());  
       			String name=t2.getText();
       			pst.setInt(1,id);
       			pst.setString(2,name);
       			pst.executeUpdate();
       			System.out.println("Inserted");
		}
		catch(Exception ex)
		{
			System.out.println(ex);
		}
	}
}
class DemoAWTJDBC1
{
	public static void main(String args[])
	{
		Search1 s=new Search1();
	}
}