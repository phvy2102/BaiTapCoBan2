package service;

import dao.ProductDao;
import java.sql.SQLException;
import java.util.List;
import model.Product;

public class ProductService {

        private ProductDao productDao;

        public ProductService() {
                productDao = new ProductDao();
        }

        public List<Product> getAllProducts() throws SQLException {
                return productDao.getAllProducts();
        }

        public void addProduct(Product product) throws SQLException {
                productDao.addProduct(product);
        }

        public void deleteProduct(int id) throws SQLException {
                productDao.deleteProduct(id);
        }

        public Product getProductById(int id) throws SQLException {
                return productDao.getProductById(id);
        }

        public void updateProduct(Product product) throws SQLException {
                productDao.updateProduct(product);
        }
}
