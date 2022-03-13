package view.product;

import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Product;
import service.ProductService;

public class AddProductFrame extends javax.swing.JFrame {

        ProductService productService;
        Product product;

        public AddProductFrame() {
                initComponents();
                productService = new ProductService();
                product = new Product();
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                buttonGroup1 = new javax.swing.ButtonGroup();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                productnameTextField = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                priceTextField = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                quantityTextField = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                backButton = new javax.swing.JButton();
                confirmButton = new javax.swing.JButton();
                idcategoryTextField = new javax.swing.JTextField();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                jLabel1.setText("Them Moi Product");

                jLabel2.setText("Product Name");

                productnameTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                productnameTextFieldActionPerformed(evt);
                        }
                });

                jLabel3.setText("Price");

                priceTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                priceTextFieldActionPerformed(evt);
                        }
                });

                jLabel4.setText("Quantity");

                quantityTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                quantityTextFieldActionPerformed(evt);
                        }
                });

                jLabel5.setText("Id Category");

                backButton.setText("Back");
                backButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                backButtonActionPerformed(evt);
                        }
                });

                confirmButton.setText("Confirm");
                confirmButton.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                confirmButtonActionPerformed(evt);
                        }
                });

                idcategoryTextField.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                idcategoryTextFieldActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel1)
                                                .addGap(111, 111, 111)
                                                .addComponent(backButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGap(22, 22, 22)
                                                                .addComponent(jLabel2))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addContainerGap()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                                                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))))
                                                .addGap(33, 33, 33)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(quantityTextField)
                                                        .addComponent(priceTextField)
                                                        .addComponent(productnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(idcategoryTextField))
                                                .addGap(0, 66, Short.MAX_VALUE)))
                                .addContainerGap())
                        .addGroup(layout.createSequentialGroup()
                                .addGap(176, 176, 176)
                                .addComponent(confirmButton)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel1)
                                        .addComponent(backButton))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(productnameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel5)
                                        .addComponent(idcategoryTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(confirmButton)
                                .addContainerGap(32, Short.MAX_VALUE))
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

    private void productnameTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_productnameTextFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_productnameTextFieldActionPerformed

    private void priceTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_priceTextFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_priceTextFieldActionPerformed

    private void quantityTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityTextFieldActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
            try {
                    // TODO add your handling code here:
                    new ListProductFrame().setVisible(true);
            } catch (SQLException ex) {
                    Logger.getLogger(AddProductFrame.class.getName()).log(Level.SEVERE, null, ex);
            }
            this.dispose();
    }//GEN-LAST:event_backButtonActionPerformed

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
            product.setProductname(productnameTextField.getText());
            product.setPrice(Double.valueOf(priceTextField.getText()));
            product.setQuantity(Integer.valueOf(quantityTextField.getText()));
            product.setIdcategory(Integer.valueOf(idcategoryTextField.getText()));

            try {
                    productService.addProduct(product);
                    new ListProductFrame().setVisible(true);
            } catch (SQLException ex) {
                    Logger.getLogger(AddProductFrame.class.getName()).log(Level.SEVERE, null, ex);
            }

            this.dispose();
    }//GEN-LAST:event_confirmButtonActionPerformed

        private void idcategoryTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_idcategoryTextFieldActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_idcategoryTextFieldActionPerformed

        /**
         * @param args the command line arguments
         */

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton backButton;
        private javax.swing.ButtonGroup buttonGroup1;
        private javax.swing.JButton confirmButton;
        private javax.swing.JTextField idcategoryTextField;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JTextField priceTextField;
        private javax.swing.JTextField productnameTextField;
        private javax.swing.JTextField quantityTextField;
        // End of variables declaration//GEN-END:variables
}
