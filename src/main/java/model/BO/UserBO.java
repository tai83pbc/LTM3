package model.BO;

import model.DAO.UserDAO;
import model.bean.User;

public class UserBO {
    private UserDAO userDAO;

    public UserBO() {
        userDAO = UserDAO.getInstance();
    }

    // Thêm người dùng
    public void addUser(User user) throws Exception {
        userDAO.addUser(user);
    }

    // Lấy thông tin người dùng
    public User getUser(int userId) throws Exception {
        return userDAO.getUser(userId);
    }

    // Cập nhật người dùng
    public void updateUser(User user) throws Exception {
        userDAO.updateUser(user);
    }

    // Xóa người dùng
    public void deleteUser(int userId) throws Exception {
        userDAO.deleteUser(userId);
    }

	public boolean checkUser(String username, String password) throws Exception {
		// TODO Auto-generated method stub
		return (userDAO.getUserByNameAndPassword(username,password)!=null);
	}
}
