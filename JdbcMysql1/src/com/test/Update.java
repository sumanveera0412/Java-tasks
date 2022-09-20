package com.test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Update {
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
			
			String query = "UPDATE EMP SET ENAME='suman' WHERE EID=10";
					//"UPDATE EMP SET EID=10 WHERE ENAME ='SAM'";
			
			int count = st.executeUpdate(query);
			if(count==0) {
				System.out.println("record not updateed");
			}else {
				System.out.println("record updated");
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
