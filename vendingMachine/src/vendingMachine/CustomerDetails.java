/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingMachine;

/**
 *
 * @author muhammadnouman
 */
public class CustomerDetails extends javax.swing.JFrame {

    /**
     * Creates new form CustomerDetails
     */
    public CustomerDetails() {
        initComponents();
        //setting up frame size
        setSize(1152, 850);
    }

    //feedBack is a public method which requires value of jTextField,jRadioButton and textArea and returns no value. 
    public static void feedBack(javax.swing.JTextField x, javax.swing.JTextField a, javax.swing.JTextField b, javax.swing.JTextField c, javax.swing.JTextField d, javax.swing.JRadioButton y, java.awt.TextArea l) {
        if (y.isSelected()) {
            l.setText("First Name : " + x.getText() + "\n\nLast Name : " + a.getText() + "\n\nHouse #    : " + b.getText() + "\n\nStreet Line : " + c.getText() + "\n\nPhone #    : " + d.getText() + "\n\n\n" + "Satisfied");
        } else if (!y.isSelected()) {
            l.setText("First Name : " + x.getText() + "\n\nLast Name : " + a.getText() + "\n\nHouse #    : " + b.getText() + "\n\nStreet Line : " + c.getText() + "\n\nPhone #    : " + d.getText() + "\n\n\n" + "Not Satisfied");
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jButtonSkip = new javax.swing.JButton();
        jButtonPizzas = new javax.swing.JButton();
        jButtonCustomerFeedBack = new javax.swing.JButton();
        jButtonOtherItems = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextFieldFirstName = new javax.swing.JTextField();
        jTextFieldLastName = new javax.swing.JTextField();
        jTextFieldHouseNo = new javax.swing.JTextField();
        jTextFieldStreet = new javax.swing.JTextField();
        jTextFieldPhoneNumber = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jButtonOk = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jRadioButtonYes = new javax.swing.JRadioButton();
        jRadioButtonNo = new javax.swing.JRadioButton();
        textArea1 = new java.awt.TextArea();
        jButtonAdmin = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Customer's Feed Back");
        getContentPane().setLayout(null);

        jButtonSkip.setBackground(new java.awt.Color(51, 255, 51));
        jButtonSkip.setText("Continue OR Skipp >>");
        jButtonSkip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSkipActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSkip);
        jButtonSkip.setBounds(940, 140, 194, 98);

        jButtonPizzas.setBackground(new java.awt.Color(255, 102, 255));
        jButtonPizzas.setText("Pizzas");
        jButtonPizzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizzasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPizzas);
        jButtonPizzas.setBounds(940, 430, 194, 98);

        jButtonCustomerFeedBack.setBackground(new java.awt.Color(204, 255, 0));
        jButtonCustomerFeedBack.setText("Customer Feed Back");
        jButtonCustomerFeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerFeedBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCustomerFeedBack);
        jButtonCustomerFeedBack.setBounds(940, 290, 194, 98);

        jButtonOtherItems.setBackground(new java.awt.Color(255, 204, 204));
        jButtonOtherItems.setText("Other Items");
        jButtonOtherItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtherItemsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOtherItems);
        jButtonOtherItems.setBounds(940, 570, 194, 98);

        jLabel1.setText("Feed Back:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 540, 110, 27);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));

        jLabel2.setFont(new java.awt.Font("Raanana", 1, 24)); // NOI18N
        jLabel2.setText("Customer's Feed Back");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1150, 126);

        jLabel3.setText("First Name:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(17, 149, 72, 16);

        jLabel4.setText("Last Name:");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(19, 217, 70, 16);

        jLabel5.setText("House #:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(19, 297, 70, 16);

        jLabel6.setText("Street Line:");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(19, 383, 70, 16);

        jLabel7.setText("Phone #:");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(19, 473, 70, 16);

        jTextFieldFirstName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldFirstNameActionPerformed(evt);
            }
        });
        jTextFieldFirstName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextFieldFirstNameKeyTyped(evt);
            }
        });
        getContentPane().add(jTextFieldFirstName);
        jTextFieldFirstName.setBounds(164, 144, 280, 26);
        getContentPane().add(jTextFieldLastName);
        jTextFieldLastName.setBounds(164, 212, 280, 26);
        getContentPane().add(jTextFieldHouseNo);
        jTextFieldHouseNo.setBounds(164, 287, 280, 26);
        getContentPane().add(jTextFieldStreet);
        jTextFieldStreet.setBounds(164, 378, 280, 26);
        getContentPane().add(jTextFieldPhoneNumber);
        jTextFieldPhoneNumber.setBounds(164, 468, 280, 26);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/contact-details-icon-27.jpg"))); // NOI18N
        getContentPane().add(jLabel8);
        jLabel8.setBounds(450, 140, 480, 420);

        jButtonOk.setText("Ok");
        jButtonOk.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOkActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOk);
        jButtonOk.setBounds(160, 670, 130, 100);

        jLabel9.setText("Are You Satisfied?");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(10, 590, 270, 20);

        buttonGroup1.add(jRadioButtonYes);
        jRadioButtonYes.setText("Yes");
        getContentPane().add(jRadioButtonYes);
        jRadioButtonYes.setBounds(160, 570, 54, 23);

        buttonGroup1.add(jRadioButtonNo);
        jRadioButtonNo.setText("No");
        getContentPane().add(jRadioButtonNo);
        jRadioButtonNo.setBounds(160, 620, 50, 23);

        textArea1.setEditable(false);
        getContentPane().add(textArea1);
        textArea1.setBounds(450, 580, 480, 210);

        jButtonAdmin.setBackground(new java.awt.Color(204, 204, 255));
        jButtonAdmin.setText("Admin");
        jButtonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAdminActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonAdmin);
        jButtonAdmin.setBounds(940, 700, 194, 98);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Setting up objects of different frames and assign these objects as value to different buttons
    private void jButtonSkipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSkipActionPerformed
        startPage st = new startPage();
        st.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonSkipActionPerformed

    private void jButtonPizzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizzasActionPerformed
        PizzaRange pizza = new PizzaRange();
        pizza.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonPizzasActionPerformed

    private void jTextFieldFirstNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameActionPerformed

    }//GEN-LAST:event_jTextFieldFirstNameActionPerformed

    private void jButtonOkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOkActionPerformed
        //calling a method feedBack
        feedBack(jTextFieldFirstName, jTextFieldLastName, jTextFieldHouseNo, jTextFieldStreet, jTextFieldPhoneNumber, jRadioButtonYes, textArea1);
        textArea1.requestFocus();
    }//GEN-LAST:event_jButtonOkActionPerformed

    private void jTextFieldFirstNameKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextFieldFirstNameKeyTyped

    }//GEN-LAST:event_jTextFieldFirstNameKeyTyped

    private void jButtonCustomerFeedBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCustomerFeedBackActionPerformed
        CustomerDetails cd = new CustomerDetails();
        cd.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonCustomerFeedBackActionPerformed

    private void jButtonOtherItemsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonOtherItemsActionPerformed
        OtherItems oi = new OtherItems();
        oi.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonOtherItemsActionPerformed

    private void jButtonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAdminActionPerformed
        adminLogIn a = new adminLogIn();
        a.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonAdminActionPerformed

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
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerDetails().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonAdmin;
    private javax.swing.JButton jButtonCustomerFeedBack;
    private javax.swing.JButton jButtonOk;
    private javax.swing.JButton jButtonOtherItems;
    private javax.swing.JButton jButtonPizzas;
    private javax.swing.JButton jButtonSkip;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButtonNo;
    private javax.swing.JRadioButton jRadioButtonYes;
    private javax.swing.JTextField jTextFieldFirstName;
    private javax.swing.JTextField jTextFieldHouseNo;
    private javax.swing.JTextField jTextFieldLastName;
    private javax.swing.JTextField jTextFieldPhoneNumber;
    private javax.swing.JTextField jTextFieldStreet;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
