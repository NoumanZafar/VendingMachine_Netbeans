/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vendingMachine;

import javax.swing.JOptionPane;
import static vendingMachine.work.amountPaid;
import static vendingMachine.work.name;
import static vendingMachine.work.price;
import static vendingMachine.work.purchase;
import static vendingMachine.work.quantity;

/**
 *
 * @author muhammadnouman
 */
public class Drinks extends javax.swing.JFrame {

    /**
     * Creates new form Drinks
     */
    public Drinks() {
        initComponents();
        //setting up the size of frame
        setSize(1148, 835);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButtonWater = new javax.swing.JButton();
        jButtonCapriSun = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButtonCoke = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonFanta = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButtonSprite = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        jButtonHoneyPepsi = new javax.swing.JButton();
        jButtonPizzas = new javax.swing.JButton();
        jButtonCustomerFeedBack = new javax.swing.JButton();
        jButtonOtherItems = new javax.swing.JButton();
        jButtonRefund = new javax.swing.JButton();
        jButtonExitOrder = new javax.swing.JButton();
        jTextFieldTotalPurchase = new javax.swing.JTextField();
        jButtonWrapUp = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Drinks Range");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jButtonWater.setBackground(new java.awt.Color(204, 204, 255));
        jButtonWater.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/Water.png"))); // NOI18N
        jButtonWater.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWaterActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonWater);
        jButtonWater.setBounds(385, 578, 105, 112);

        jButtonCapriSun.setBackground(new java.awt.Color(102, 255, 102));
        jButtonCapriSun.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/capri-sun-profile.png"))); // NOI18N
        jButtonCapriSun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCapriSunActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCapriSun);
        jButtonCapriSun.setBounds(673, 578, 105, 112);

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("You Have Selected:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 143, 180, 16);

        jButtonCoke.setBackground(new java.awt.Color(0, 0, 0));
        jButtonCoke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/Cokee.png"))); // NOI18N
        jButtonCoke.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCokeActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCoke);
        jButtonCoke.setBounds(385, 169, 105, 112);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Raanana", 1, 24)); // NOI18N
        jLabel1.setText("Drinks Range");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1140, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1150, 125);

        jButtonFanta.setBackground(new java.awt.Color(0, 153, 0));
        jButtonFanta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/Fanta.png"))); // NOI18N
        jButtonFanta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFantaActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFanta);
        jButtonFanta.setBounds(673, 169, 105, 112);

        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Total Amount:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 753, 90, 16);

        jButtonSprite.setBackground(new java.awt.Color(0, 0, 204));
        jButtonSprite.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/Sprite.png"))); // NOI18N
        jButtonSprite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSpriteActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonSprite);
        jButtonSprite.setBounds(385, 372, 105, 112);

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Items:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(385, 143, 208, 16);

        list1.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(list1);
        list1.setBounds(20, 169, 260, 521);

        jButtonHoneyPepsi.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/Pepsi.png"))); // NOI18N
        jButtonHoneyPepsi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonHoneyPepsiActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonHoneyPepsi);
        jButtonHoneyPepsi.setBounds(673, 372, 105, 112);

        jButtonPizzas.setBackground(new java.awt.Color(255, 102, 255));
        jButtonPizzas.setText("Pizzas");
        jButtonPizzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizzasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPizzas);
        jButtonPizzas.setBounds(911, 346, 194, 98);

        jButtonCustomerFeedBack.setBackground(new java.awt.Color(204, 255, 0));
        jButtonCustomerFeedBack.setText("Customer's Feed Back");
        jButtonCustomerFeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerFeedBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCustomerFeedBack);
        jButtonCustomerFeedBack.setBounds(911, 236, 194, 98);

        jButtonOtherItems.setBackground(new java.awt.Color(255, 204, 204));
        jButtonOtherItems.setText("Other Items");
        jButtonOtherItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtherItemsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOtherItems);
        jButtonOtherItems.setBounds(911, 456, 194, 98);

        jButtonRefund.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRefund.setText("Refund/Cancel");
        jButtonRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefundActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRefund);
        jButtonRefund.setBounds(911, 572, 194, 98);

        jButtonExitOrder.setBackground(new java.awt.Color(255, 51, 51));
        jButtonExitOrder.setText("Exit Order");
        jButtonExitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitOrderActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExitOrder);
        jButtonExitOrder.setBounds(911, 132, 194, 98);

        jTextFieldTotalPurchase.setEditable(false);
        getContentPane().add(jTextFieldTotalPurchase);
        jTextFieldTotalPurchase.setBounds(128, 748, 152, 26);

        jButtonWrapUp.setBackground(new java.awt.Color(0, 0, 255));
        jButtonWrapUp.setText("Wrap Up");
        jButtonWrapUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWrapUpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonWrapUp);
        jButtonWrapUp.setBounds(911, 688, 194, 98);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/drinks.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 120, 1150, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //setting up objects of different frames and assign them as a value to different buttons
    private void jButtonPizzasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPizzasActionPerformed
        PizzaRange pizza = new PizzaRange();
        pizza.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonPizzasActionPerformed

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
    //calling a method money from class work to perform the refund action
    private void jButtonRefundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRefundActionPerformed
        amountPaid = amountPaid + purchase;
        while (amountPaid > 0) {
            vendingMachine.work.money();
        }
        vendingMachine.work.refund();
        Change c = new Change();
        c.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButtonRefundActionPerformed

    private void jButtonExitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitOrderActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonExitOrderActionPerformed

    private void jButtonWrapUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWrapUpActionPerformed
        //if purchase amount is 0 give message otherwise give back change
        if (purchase == 0) {
            JOptionPane.showMessageDialog(null, "To Proceed Purchase amount has to be over €0.0");
        } else {
            while (amountPaid > 0) {
                vendingMachine.work.money();
            }
            Change c = new Change();
            c.setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jButtonWrapUpActionPerformed
    //calling different method from class work and assingn these as a value to different action performed of nutton
    private void jButtonCokeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCokeActionPerformed
        quantity[6][0] = vendingMachine.work.method(list1, jTextFieldTotalPurchase, name[6][0], quantity[6][0], price[6][0], 6, 0);
    }//GEN-LAST:event_jButtonCokeActionPerformed

    private void jButtonFantaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFantaActionPerformed
        quantity[6][1] = vendingMachine.work.method(list1, jTextFieldTotalPurchase, name[6][1], quantity[6][1], price[6][1], 6, 1);
    }//GEN-LAST:event_jButtonFantaActionPerformed

    private void jButtonSpriteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSpriteActionPerformed
        quantity[6][2] = vendingMachine.work.method(list1, jTextFieldTotalPurchase, name[6][2], quantity[6][2], price[6][2], 6, 2);
    }//GEN-LAST:event_jButtonSpriteActionPerformed

    private void jButtonHoneyPepsiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonHoneyPepsiActionPerformed
        quantity[6][3] = vendingMachine.work.method(list1, jTextFieldTotalPurchase, name[6][3], quantity[6][3], price[6][3], 6, 3);
    }//GEN-LAST:event_jButtonHoneyPepsiActionPerformed

    private void jButtonWaterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonWaterActionPerformed
        quantity[6][4] = vendingMachine.work.method(list1, jTextFieldTotalPurchase, name[6][4], quantity[6][4], price[6][4], 6, 4);
    }//GEN-LAST:event_jButtonWaterActionPerformed

    private void jButtonCapriSunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCapriSunActionPerformed
        quantity[6][5] = vendingMachine.work.method(list1, jTextFieldTotalPurchase, name[6][5], quantity[6][5], price[6][5], 6, 5);
    }//GEN-LAST:event_jButtonCapriSunActionPerformed
    //when window gains focus is populate the text fields under the formWindowGainedFocus 
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        jTextFieldTotalPurchase.setText(Double.toString(purchase));
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Drinks.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Drinks().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCapriSun;
    private javax.swing.JButton jButtonCoke;
    private javax.swing.JButton jButtonCustomerFeedBack;
    private javax.swing.JButton jButtonExitOrder;
    private javax.swing.JButton jButtonFanta;
    private javax.swing.JButton jButtonHoneyPepsi;
    private javax.swing.JButton jButtonOtherItems;
    private javax.swing.JButton jButtonPizzas;
    private javax.swing.JButton jButtonRefund;
    private javax.swing.JButton jButtonSprite;
    private javax.swing.JButton jButtonWater;
    private javax.swing.JButton jButtonWrapUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldTotalPurchase;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}