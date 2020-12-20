package mindfulProject.dao;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.servlet.ServletOutputStream;

import java.sql.PreparedStatement;
import java.sql.ResultSet;

import mindfulProject.model.Events;

public class EventDao {
	 public static final ArrayList<Events> getEvents() throws SQLException, IOException, ClassNotFoundException {
	        ArrayList<Events> ev = new ArrayList<>();
	        byte[] img = null;
	        Blob blob = null;
	        Events event = new Events();
	        ServletOutputStream sos = null;
	        
	        String sql = "SELECT * FROM Events";
	         
	        try{
	        	Class.forName("com.mysql.jdbc.Driver");
				Connection con =  DBConnectionUtil.getConnection();
	            PreparedStatement statement = con.prepareStatement(sql);
	            //statement.setInt(1, id);
	            ResultSet result = statement.executeQuery();
	            //System.out.println("hiiii");
	             
	            if (result.next()) {
	            	
	            	
	            	
	            	event.setName(result.getString(2));
	            	event.setDate(result.getString(3));
	            	event.setTime(result.getString(4));
	            	event.setCrowd(result.getString(5));
	            	img = result.getBytes(6);
	            	//event.setTime(result.getString(3));
	            	//event.setImage(result.getString(5));
	            	// blob = result.getBlob(6);
	            	//byte[] b=blob.getBytes(6,(int)blob.length());
	                //fos.write(b);
	               
	               String name = result.getString("name");
	                String date = result.getString("date");
	                String time = result.getString("time");
	                String crowd = result.getString("crowd");
	                blob = result.getBlob("image");
	                                
	                }
	            
                InputStream inputStream = blob.getBinaryStream();
                ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
                byte[] buffer = new byte[4096];
                int bytesRead = -1;
                 
                while ((bytesRead = inputStream.read(buffer)) != -1) {
                    outputStream.write(buffer, 0, bytesRead); 
	               
	                 
	                byte[] imageBytes = outputStream.toByteArray();
	                String base64Image = Base64.getEncoder().encodeToString(imageBytes);
	                 
	                 
	                inputStream.close();
	                outputStream.close();
	                
	                
	                /*Events event = new Events(name,date,time,crowd,base64Image);
	              
	               event.setName(name);
	               event.setDate(date);
	               event.setTime(time);
	               event.setCrowd(crowd);*/
	               event.setImage(base64Image);
	               ev.add(event);
	            }          
	             
	        } catch (SQLException ex) {
	            ex.printStackTrace();
	            throw ex;
	        }      
	         
	        return ev;
	    }
	
	
}
