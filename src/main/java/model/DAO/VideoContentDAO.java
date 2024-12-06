package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class VideoContentDAO {
	private Connection conn;
	private static VideoContentDAO instance;
	public VideoContentDAO() {
		connectDB();
	}
	private void connectDB() {
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			conn =  DriverManager.getConnection("jdbc:mysql://localhost:3306/LTM","root","");
		} 
		catch (Exception e) 
		{
			e.printStackTrace();
		}
	}
	public static VideoContentDAO getInstance() {
        if (instance == null) {
            instance = new VideoContentDAO();
        }
        return instance;
    }
}
