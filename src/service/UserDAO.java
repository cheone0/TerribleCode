package service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;






public class UserDAO {
	
	private DataSource dataFactory;
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	
	
	public UserDAO() {
	       try {
	    	Context ctx = new InitialContext();
	       dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/trb");
			conn = dataFactory.getConnection();
		} catch (Exception e) {
			
			e.printStackTrace();
		}	     
}
	
	public void dbClose() {
	      if(rs != null) {
	         try {
	            rs.close();
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	      
	      if(pstmt != null) {
	         try {
	            pstmt.close();
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	      
	      if(conn != null) {
	         try {
	            conn.close();
	         } catch (SQLException e) {
	            e.printStackTrace();
	         }
	      }
	   }
	
	public String userInsert(String user_id, String user_pw) {
		
		String sql = "INSERT INTO userTBL (userID, userPW) VALUES(?, ?) ";
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, user_id);
			pstmt.setString(2, user_pw);
			pstmt.executeUpdate();
					
		} catch (SQLException e) {
			e.printStackTrace();
		}finally{
	  		dbClose();
	    }		
		return null;
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}

