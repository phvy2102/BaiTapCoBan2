package dao;

import connect.JDBCConnection;
import model.User;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

        public List<User> getAllUsers() throws SQLException {
                List<User> users = new ArrayList<User>();

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "SELECT * FROM users";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                        User user = new User();

                        user.setId(rs.getInt("ID"));
                        user.setName(rs.getString("NAME"));
                        user.setPhone(rs.getString("PHONE"));
                        user.setUsername(rs.getString("USERNAME"));
                        user.setPassword(rs.getString("PASSWORD"));
                        user.setAbout(rs.getString("ABOUT"));
                        user.setFavourites(rs.getString("FAVOURITES"));
                        user.setRole(rs.getString("ROLE"));

                        users.add(user);
                }

                return users;
        }

        public User getUserById(int id) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "SELECT * FROM users WHERE ID = ?";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                        User user = new User();

                        user.setId(rs.getInt("ID"));
                        user.setName(rs.getString("NAME"));
                        user.setPhone(rs.getString("PHONE"));
                        user.setUsername(rs.getString("USERNAME"));
                        user.setPassword(rs.getString("PASSWORD"));
                        user.setAbout(rs.getString("ABOUT"));
                        user.setFavourites(rs.getString("FAVOURITES"));
                        user.setRole(rs.getString("ROLE"));

                        return user;
                }

                return null;
        }

        public void addUser(User user) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "INSERT INTO users(NAME, PHONE, USERNAME, PASSWORD, ABOUT, FAVOURITES, ROLE) VALUES(?, ?, ?, ?, ?, ?, ?)";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getPhone());
                preparedStatement.setString(3, user.getUsername());
                preparedStatement.setString(4, user.getPassword());
                preparedStatement.setString(5, user.getAbout());
                preparedStatement.setString(6, user.getFavourites());
                preparedStatement.setString(7, user.getRole());

                int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        }

        public void updateUser(User user) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "UPDATE users SET NAME = ?,PHONE = ?,USERNAME = ?,PASSWORD = ?,ABOUT = ?,FAVOURITES = ?,ROLE = ? WHERE ID = ?";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user.getName());
                preparedStatement.setString(2, user.getPhone());
                preparedStatement.setString(3, user.getUsername());
                preparedStatement.setString(4, user.getPassword());
                preparedStatement.setString(5, user.getAbout());
                preparedStatement.setString(6, user.getFavourites());
                preparedStatement.setString(7, user.getRole());
                preparedStatement.setInt(8, user.getId());

                int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        }

        public void deleteUser(int id) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "DELETE FROM users WHERE ID = ?";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);

                int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        }

        public boolean isLoginUser(User user) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "SELECT * FROM users WHERE Username = ? AND BINARY_CHECKSUM(Password) = BINARY_CHECKSUM(?)";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, user.getUsername());
                preparedStatement.setString(2, user.getPassword());

                ResultSet rs = preparedStatement.executeQuery();
                return rs.next();
        }
        
        public boolean isAdmin(String username) throws SQLException {
                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "SELECT * FROM users WHERE ROLE = 'ROLE_ADMIN' AND USERNAME = ?";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, username);

                ResultSet rs = preparedStatement.executeQuery();
                return rs.next();
        }
}
