package java_inventory_application;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;
import javax.swing.JOptionPane;


public class Add_Product_Form extends javax.swing.JFrame {

    /**
     * Creates new form Add_Product_Form
     */
    
    // get the image path
    String imagePth = null;
    public Add_Product_Form() {
        initComponents();
        
        // populate the combobox with key and value
        BindCombo();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField_Price = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Quantity = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField_Name = new javax.swing.JTextField();
        jLabel_Picture = new javax.swing.JLabel();
        jButton_BROWSE_PIC = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton_ADD_PRODUCT = new javax.swing.JButton();
        jButton_CANCEL = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(27, 68, 99));

        jLabel5.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Product Type:");

        jLabel6.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Price per Unit:");

        jTextField_Price.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Quantity of Product:");

        jTextField_Quantity.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTextField_Quantity.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_QuantityKeyTyped(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Product Name:");

        jTextField_Name.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_Picture.setBackground(new java.awt.Color(255, 255, 204));
        jLabel_Picture.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel_Picture.setForeground(new java.awt.Color(255, 255, 255));
        jLabel_Picture.setOpaque(true);

        jButton_BROWSE_PIC.setText("Select a Picture");
        jButton_BROWSE_PIC.setToolTipText("");
        jButton_BROWSE_PIC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BROWSE_PICActionPerformed(evt);
            }
        });

        jButton_ADD_PRODUCT.setBackground(new java.awt.Color(128, 128, 128));
        jButton_ADD_PRODUCT.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_ADD_PRODUCT.setForeground(new java.awt.Color(255, 255, 255));
        jButton_ADD_PRODUCT.setText("Add");
        jButton_ADD_PRODUCT.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ADD_PRODUCTActionPerformed(evt);
            }
        });

        jButton_CANCEL.setBackground(new java.awt.Color(128, 128, 128));
        jButton_CANCEL.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jButton_CANCEL.setForeground(new java.awt.Color(255, 255, 255));
        jButton_CANCEL.setText("Cancel");
        jButton_CANCEL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_CANCELActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Product Picture:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jButton_CANCEL, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField_Quantity)
                                            .addComponent(jTextField_Price)
                                            .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jComboBox1, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(jLabel_Picture, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(41, 41, 41)
                                        .addComponent(jButton_ADD_PRODUCT, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jButton_BROWSE_PIC, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jLabel5)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField_Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField_Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel_Picture, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton_BROWSE_PIC)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_CANCEL, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton_ADD_PRODUCT, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(126, 126, 126))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // close the button
    private void jButton_CANCELActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_CANCELActionPerformed

        System.exit(0);

    }//GEN-LAST:event_jButton_CANCELActionPerformed

    // button insert
    private void jButton_ADD_PRODUCTActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ADD_PRODUCTActionPerformed

        CLASS.Product product;
        CLASS.Category category = new CLASS.Category();

        HashMap<String, Integer> map = category.populateCombo();

        String name = jTextField_Name.getText();
        String price;

        Integer quantity;
        Integer catId;

        byte[] img;
        if(imagePth != null){
            try {
                if(verifFields())
                {
                    quantity = Integer.valueOf(jTextField_Quantity.getText());

                    // get the category id
                    catId = map.get(jComboBox1.getSelectedItem().toString());
                    price = jTextField_Price.getText();

                    Path path = Paths.get(imagePth);
                    img = Files.readAllBytes(path);

                    product = new CLASS.Product(null,name,catId,price,img,quantity,null);

                    CLASS.Product.insertProduct(product);
                }
            }
            catch (IOException ex) {
                JOptionPane.showMessageDialog(null,ex.getMessage());
            }
        }else{
            JOptionPane.showMessageDialog(null, "You Must Select A Profile Picture");
        }
    }//GEN-LAST:event_jButton_ADD_PRODUCTActionPerformed

    // browse image button
    private void jButton_BROWSE_PICActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BROWSE_PICActionPerformed

        CLASS.Myfunc mf = new CLASS.Myfunc();
        imagePth = mf.browseImage(jLabel_Picture);
        System.out.println(imagePth);

    }//GEN-LAST:event_jButton_BROWSE_PICActionPerformed

    // Allow OnLy Numbers on key typed
    private void jTextField_QuantityKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_QuantityKeyTyped

        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_jTextField_QuantityKeyTyped

    
    
    // create a methode to fill combobox with keys and values
    public void BindCombo(){

        CLASS.Category category = new CLASS.Category();

        HashMap<String, Integer> map = category.populateCombo();

        for(String s : map.keySet()){

            jComboBox1.addItem(s);

        }

    }

    // verify the empty fields
    public boolean verifFields()
    {
     
        if(jTextField_Quantity.getText().equals("") || jTextField_Price.getText().equals("") || jTextField_Name.getText().equals(""))
        {
            JOptionPane.showMessageDialog(null, "One Or More Fields Are Empty", "Empty Fields", 0);
            return false;
        }
        else{
            try{
                Integer.valueOf(jTextField_Quantity.getText());
                Double.valueOf(jTextField_Price.getText());
                return true;
            }catch(NumberFormatException ex){
                JOptionPane.showMessageDialog(null, ex.getMessage(), "Invalid Values", 0);
                return false;
            }
        }
    }
    
    

   
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Add_Product_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add_Product_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add_Product_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add_Product_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Add_Product_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_ADD_PRODUCT;
    private javax.swing.JButton jButton_BROWSE_PIC;
    private javax.swing.JButton jButton_CANCEL;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel_Picture;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField_Name;
    private javax.swing.JTextField jTextField_Price;
    private javax.swing.JTextField jTextField_Quantity;
    // End of variables declaration//GEN-END:variables
}
