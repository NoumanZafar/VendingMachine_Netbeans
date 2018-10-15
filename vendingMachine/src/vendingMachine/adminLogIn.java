/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingMachine;

import javax.swing.JOptionPane;

/**
 *
 * @author muhammadnouman
 */
public class adminLogIn extends javax.swing.JFrame {

    /**
     * Creates new form adminLogIn
     */
    //setting up arrays of type integer and string
    String usernames[] = {"nouman", "admin"};
    int password[] = {3255, 3256};

    public adminLogIn() {
        initComponents();
        //setting up frame size
        setSize(728, 500);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextFieldusername = new javax.swing.JTextField();
        jPasswordFieldpassword = new javax.swing.JPasswordField();
        jButtonlogin = new javax.swing.JButton();
        Cancel = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Login");
        getContentPane().setLayout(null);

        jLabel1.setText("Username:");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(366, 122, 66, 24);

        jLabel2.setText("Password:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(366, 211, 66, 16);
        getContentPane().add(jTextFieldusername);
        jTextFieldusername.setBounds(450, 121, 170, 26);
        getContentPane().add(jPasswordFieldpassword);
        jPasswordFieldpassword.setBounds(450, 206, 170, 26);

        jButtonlogin.setText("Log In");
        jButtonlogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonloginActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonlogin);
        jButtonlogin.setBounds(366, 320, 92, 41);

        Cancel.setText("Cancel");
        Cancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelActionPerformed(evt);
            }
        });
        getContentPane().add(Cancel);
        Cancel.setBounds(581, 393, 95, 49);

        jPanel1.setBackground(new java.awt.Color(51, 255, 204));

        jLabel3.setFont(new java.awt.Font("Lucida Sans", 1, 18)); // NOI18N
        jLabel3.setText("Admin Login");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 718, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 718, 100);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/login.png"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(35, 126, 271, 235);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/admin.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 100, 720, 370);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //if username and password is right then open admin page otherwise give error message
    private void jButtonloginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonloginActionPerformed
        boolean found = false;
        int i = 0;
        while (i < usernames.length && !found) {
            if (usernames[i] != null) {
                if (usernames[i].equalsIgnoreCase(jTextFieldusername.getText()) && password[i] == Integer.parseInt(jPasswordFieldpassword.getText())) {
                    found = true;
                } else {
                    i++;
                }
            } else {
                return;
            }
        }
        if (found == true) {
            admin a = new admin();
            a.setVisible(true);
            dispose();
            //if username or password is wrong    
        } else {
            JOptionPane.showMessageDialog(null, "Wrong UserName or Password");
            jTextFieldusername.setText("");
            jPasswordFieldpassword.setText("");
            jTextFieldusername.requestFocus();
        }


    }//GEN-LAST:event_jButtonloginActionPerformed
    //under the CancelActionPerformed button close the current frame and opens startPage
    private void CancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelActionPerformed
        startPage s = new startPage();
        s.setVisible(true);
        dispose();
    }//GEN-LAST:event_CancelActionPerformed

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
            java.util.logging.Logger.getLogger(adminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(adminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(adminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(adminLogIn.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new adminLogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Cancel;
    private javax.swing.JButton jButtonlogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPasswordField jPasswordFieldpassword;
    private javax.swing.JTextField jTextFieldusername;
    // End of variables declaration//GEN-END:variables
}
