package service;

import dao.CategoryDao;
import java.sql.SQLException;
import java.util.List;
import model.Category;

public class CategoryService {

        private CategoryDao categoryDao;

        public CategoryService() {
                categoryDao = new CategoryDao();
        }

        public List<Category> getAllCategories() throws SQLException {
                return categoryDao.getAllCategories();
        }

        public void addCategory(Category category) throws SQLException {
                categoryDao.addCategory(category);
        }

        public void deleteCategory(int id) throws SQLException {
                categoryDao.deleteCategory(id);
        }

        public Category getCategoryById(int id) throws SQLException {
                return categoryDao.getCategoryById(id);
        }

        public void updateCategory(Category category) throws SQLException {
                categoryDao.updateCategory(category);
        }
}
