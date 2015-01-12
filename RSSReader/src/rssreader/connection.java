package rssreader;

import java.sql.*;
import javax.swing.*;

public class connection {

    static Connection conn = null;
	
        public static Connection getConnection()  {
		
            try{
			
		Connection connect = DriverManager.getConnection("jdbc:mysql://localhost:3306/new_schema","root","");
			
                    return connect ;
				
			}
		
            catch (Exception e){
			
                    return null;
			
		}}}
