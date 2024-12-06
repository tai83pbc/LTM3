package model.DAO;

import java.sql.Connection;
import java.sql.DriverManager;

public class VideoDAO {
	private Connection conn;
	private static VideoDAO instance;
	public VideoDAO() {
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
	public static VideoDAO getInstance() {
        if (instance == null) {
            instance = new VideoDAO();
        }
        return instance;
    }
}
