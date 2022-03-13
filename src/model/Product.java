package model;

public class Product {

        private int id;
        private String productname;
        private double price;
        private int quantity;
        private int idcategory;

        public int getId() {
                return id;
        }

        public void setId(int id) {
                this.id = id;
        }

        public String getProductname() {
                return productname;
        }

        public void setProductname(String productname) {
                this.productname = productname;
        }

        public double getPrice() {
                return price;
        }

        public void setPrice(double price) {
                this.price = price;
        }

        public int getQuantity() {
                return quantity;
        }

        public void setQuantity(int quantity) {
                this.quantity = quantity;
        }

        public int getIdcategory() {
                return idcategory;
        }

        public void setIdcategory(int idcategory) {
                this.idcategory = idcategory;
        }

}
