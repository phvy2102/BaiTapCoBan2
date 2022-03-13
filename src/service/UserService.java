package service;

import dao.UserDao;
import java.sql.SQLException;
import java.util.List;
import model.User;

public class UserService {

        private UserDao userDao;

        public UserService() {
                userDao = new UserDao();
        }

        public List<User> getAllUsers() throws SQLException {
                return userDao.getAllUsers();
        }

        public void addUser(User user) throws SQLException {
                userDao.addUser(user);
        }

        public void deleteUser(int id) throws SQLException {
                userDao.deleteUser(id);
        }

        public User getUserById(int id) throws SQLException {
                return userDao.getUserById(id);
        }

        public void updateUser(User user) throws SQLException {
                userDao.updateUser(user);
        }

        public boolean isLoginUser(User user) throws SQLException {
                return userDao.isLoginUser(user);
        }
        
        public boolean isAdmin(String username) throws SQLException {
                return userDao.isAdmin(username);
        }
}
