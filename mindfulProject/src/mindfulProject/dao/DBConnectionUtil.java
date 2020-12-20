package mindfulProject.dao;


import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnectionUtil {
	//Create Database connection 
		public static Connection getConnection(){  
		    Connection con=null;  
		    try{  
		        Class.forName("com.mysql.jdbc.Driver");  
		        con=DriverManager.getConnection("jdbc:mysql://localhost:3306/mindful","root","root");  
		    }catch(Exception e){
		    	System.out.println(e);
		    	}  
		    return con;  
	}

}

