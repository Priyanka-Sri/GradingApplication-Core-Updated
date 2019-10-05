package com.revature.grading.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.revature.grading.exception.DBException;
import com.revature.grading.model.Admindetails;
import com.revature.grading.util.ConnectionUtil;

public class RangeDao {
	public static void Range(int min11,int max11,String grade11,int min22,int max22,String grade22,
			
			
			int min33,int max33,String grade33,int min44,int max44,String grade44)
			
			
			
			
			
			throws SQLException, ClassNotFoundException, DBException {
		
		
		
		
		
		

		Connection con = null;
		PreparedStatement pst3 = null;
		PreparedStatement pst2 = null;

		try {
			con = ConnectionUtil.getConnection();
			String sql1 ="delete from rang";
			String sql = "insert into rang(GRADE,MIN,MAX)VALUES(?,?,?),(?,?,?),(?,?,?),(?,?,?)";
			pst2 = con.prepareStatement(sql1);
			pst3 = con.prepareStatement(sql);
			

			
			pst3.setString(1, grade11);
			pst3.setInt(2, min11);
			pst3.setInt(3, max11);
			
			
			pst3.setString(4, grade22);
			pst3.setInt(5, min22);
			pst3.setInt(6, max22);
			
			
			
			pst3.setString(7, grade33);
			pst3.setInt(8, min33);
			pst3.setInt(9, max33);
			
			
			pst3.setString(10, grade44);
			pst3.setInt(11, min44);
			pst3.setInt(12, max44);
			
			
			 pst2.executeUpdate();
			int rows2 = pst3.executeUpdate();
			
			System.out.println("Number Of Rows Inserted    " + rows2);


		} catch (Exception e) {
			e.printStackTrace();
			throw new DBException("Unable to register");
		}
		// return null;
	}
	

	
	
	
}

	