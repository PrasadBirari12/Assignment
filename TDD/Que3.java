package TDD_Assingment;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Scanner;


public class Que3 {
	
	public static boolean chekPassAndEmail(){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter your Email");
		String email=sc.next();
		System.out.println("Enter your password");
		String password= sc.next();
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			System.out.println("loding...");
			Connection cone=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/tdd","root","1234"); 
						
			Statement stmt=cone.createStatement();
			ResultSet rs=stmt.executeQuery("select * from employee where email= '"+email+"' && password='"+password+"'");  
			
			if(rs.next()==true) 
			{
				return true;
//				System.out.println("done");
			}
			  
			cone.close();  
			}catch(Exception e){ System.out.println(e);
			
			}
		return false;  

    }
}
