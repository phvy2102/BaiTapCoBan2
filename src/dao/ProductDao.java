package dao;

import connect.JDBCConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import model.Product;

public class ProductDao {

        public List<Product> getAllProducts() throws SQLException {
                List<Product> products = new ArrayList<Product>();

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "SELECT * FROM products";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                        Product product = new Product();

                        product.setId(rs.getInt("ID"));
                        product.setProductname(rs.getString("PRODUCTNAME"));
                        product.setPrice(rs.getDouble("PRICE"));
                        product.setQuantity(rs.getInt("QUANTITY"));
                        product.setIdcategory(rs.getInt("IDCATEGORY"));

                        products.add(product);
                }

                return products;
        }

        public Product getProductById(int id) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "SELECT * FROM products WHERE ID = ?";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                        Product product = new Product();

                        product.setId(rs.getInt("ID"));
                        product.setProductname(rs.getString("PRODUCTNAME"));

                        return product;
                }

                return null;
        }

        public void addProduct(Product product) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "INSERT INTO products(PRODUCTNAME, PRICE, QUANTITY, IDCATEGORY) VALUES(?, ?, ?, ?)";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, product.getProductname());
                preparedStatement.setDouble(2, product.getPrice());
                preparedStatement.setInt(3, product.getQuantity());
                preparedStatement.setInt(4, product.getIdcategory());

                int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        }

        public void updateProduct(Product product) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "UPDATE products SET PRODUCTNAME = ?, PRICE = ?, QUANTITY = ?, IDCATEGORY = ? WHERE ID = ?";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1, product.getProductname());
                preparedStatement.setDouble(2, product.getPrice());
                preparedStatement.setInt(3, product.getQuantity());
                preparedStatement.setInt(4, product.getIdcategory());
                preparedStatement.setInt(5, product.getId());

                int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        }

        public void deleteProduct(int id) throws SQLException {

                Connection connection = JDBCConnection.getJDBCConnection();

                String sql = "DELETE FROM products WHERE ID = ?";

                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setInt(1, id);

                int rs = preparedStatement.executeUpdate();
                System.out.println(rs);
        }
}
