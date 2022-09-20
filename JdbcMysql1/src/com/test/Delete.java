package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		//load the driver from mysql
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		try(Connection con = DriverManager.getConnection("jdbc:mysql://@localhost:3306/new_schema_db","root", "1234@Sql");
				Statement st = con.createStatement();){
			
			String query = "DELETE FROM EMP WHERE EID=1";
			
			int count = st.executeUpdate(query);
			if(count==0) {
				System.out.println("record is not deleted");
			}else {
				System.out.println("record deleted");
			}
			
		}
		catch ( SQLException se) {
			// TODO: handle exception
			System.out.println(se.getMessage());
			se.printStackTrace();
		}catch(Exception e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}
}
