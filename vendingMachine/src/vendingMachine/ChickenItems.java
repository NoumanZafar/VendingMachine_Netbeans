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
public class ChickenItems extends javax.swing.JFrame {

    /**
     * Creates new form ChickenItems
     */
    public ChickenItems() {
        initComponents();
        //setting up the size of frame
        setSize(1148, 835);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        list1 = new java.awt.List();
        jButtonChickenWings = new javax.swing.JButton();
        jButtonBbqWings = new javax.swing.JButton();
        jButtonFrankHotWings = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButtonChickenStripper = new javax.swing.JButton();
        jButtonStripperCombo = new javax.swing.JButton();
        jButtonChickenKickers = new javax.swing.JButton();
        jTextFieldtotalPurchase = new javax.swing.JTextField();
        jButtonWrapUp = new javax.swing.JButton();
        jButtonExitOrder = new javax.swing.JButton();
        jButtonPizzas = new javax.swing.JButton();
        jButtonCustomerFeedBack = new javax.swing.JButton();
        jButtonOtherItems = new javax.swing.JButton();
        jButtonRefund = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Chicken Items Range");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(102, 255, 204));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Raanana", 1, 24)); // NOI18N
        jLabel1.setText("Chicken Items Range");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 1120, 120);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 1143, 125);

        jLabel2.setForeground(new java.awt.Color(0, 0, 204));
        jLabel2.setText("You Have Selected:");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(20, 156, 180, 16);

        jLabel5.setForeground(new java.awt.Color(0, 0, 204));
        jLabel5.setText("Total Amount:");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, 690, 90, 16);

        list1.setBackground(new java.awt.Color(204, 255, 204));
        getContentPane().add(list1);
        list1.setBounds(20, 182, 260, 464);

        jButtonChickenWings.setBackground(new java.awt.Color(51, 204, 255));
        jButtonChickenWings.setText("Chicken Wings");
        jButtonChickenWings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChickenWingsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonChickenWings);
        jButtonChickenWings.setBounds(351, 182, 216, 69);

        jButtonBbqWings.setBackground(new java.awt.Color(51, 204, 255));
        jButtonBbqWings.setText("BBQ Wings");
        jButtonBbqWings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBbqWingsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonBbqWings);
        jButtonBbqWings.setBounds(619, 426, 215, 69);

        jButtonFrankHotWings.setBackground(new java.awt.Color(204, 153, 0));
        jButtonFrankHotWings.setText("Frank's Hot Wings");
        jButtonFrankHotWings.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFrankHotWingsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonFrankHotWings);
        jButtonFrankHotWings.setBounds(351, 426, 216, 69);

        jLabel3.setForeground(new java.awt.Color(0, 0, 204));
        jLabel3.setText("Items:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(360, 156, 235, 16);

        jButtonChickenStripper.setBackground(new java.awt.Color(204, 153, 0));
        jButtonChickenStripper.setText("Chicken Strippers");
        jButtonChickenStripper.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChickenStripperActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonChickenStripper);
        jButtonChickenStripper.setBounds(619, 182, 215, 69);

        jButtonStripperCombo.setBackground(new java.awt.Color(204, 153, 0));
        jButtonStripperCombo.setText("Stripper Combo");
        jButtonStripperCombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonStripperComboActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonStripperCombo);
        jButtonStripperCombo.setBounds(619, 665, 215, 69);

        jButtonChickenKickers.setBackground(new java.awt.Color(51, 204, 255));
        jButtonChickenKickers.setText("Chicken Kickers");
        jButtonChickenKickers.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChickenKickersActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonChickenKickers);
        jButtonChickenKickers.setBounds(351, 665, 216, 69);

        jTextFieldtotalPurchase.setEditable(false);
        getContentPane().add(jTextFieldtotalPurchase);
        jTextFieldtotalPurchase.setBounds(122, 685, 158, 26);

        jButtonWrapUp.setBackground(new java.awt.Color(0, 0, 255));
        jButtonWrapUp.setText("Wrap Up");
        jButtonWrapUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonWrapUpActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonWrapUp);
        jButtonWrapUp.setBounds(913, 692, 194, 98);

        jButtonExitOrder.setBackground(new java.awt.Color(255, 51, 51));
        jButtonExitOrder.setText("Exit Order");
        jButtonExitOrder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitOrderActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonExitOrder);
        jButtonExitOrder.setBounds(913, 143, 194, 98);

        jButtonPizzas.setBackground(new java.awt.Color(255, 102, 255));
        jButtonPizzas.setText("Pizzas");
        jButtonPizzas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPizzasActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonPizzas);
        jButtonPizzas.setBounds(913, 357, 194, 98);

        jButtonCustomerFeedBack.setBackground(new java.awt.Color(204, 255, 0));
        jButtonCustomerFeedBack.setText("Customer's Feed Back");
        jButtonCustomerFeedBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonCustomerFeedBackActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonCustomerFeedBack);
        jButtonCustomerFeedBack.setBounds(913, 247, 194, 98);

        jButtonOtherItems.setBackground(new java.awt.Color(255, 204, 204));
        jButtonOtherItems.setText("Other Items");
        jButtonOtherItems.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonOtherItemsActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonOtherItems);
        jButtonOtherItems.setBounds(913, 466, 194, 98);

        jButtonRefund.setBackground(new java.awt.Color(255, 51, 51));
        jButtonRefund.setText("Refund/Cancel");
        jButtonRefund.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRefundActionPerformed(evt);
            }
        });
        getContentPane().add(jButtonRefund);
        jButtonRefund.setBounds(913, 576, 194, 98);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/vendingMachine/images/ChickenItems.jpg"))); // NOI18N
        getContentPane().add(jLabel4);
        jLabel4.setBounds(0, 120, 1150, 690);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    //calling different methods from class work under the action perform of different button
    private void jButtonBbqWingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBbqWingsActionPerformed
        quantity[3][3] = vendingMachine.work.method(list1, jTextFieldtotalPurchase, name[3][3], quantity[3][3], price[3][3], 3, 3);
    }//GEN-LAST:event_jButtonBbqWingsActionPerformed

    private void jButtonChickenWingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChickenWingsActionPerformed
        quantity[3][0] = vendingMachine.work.method(list1, jTextFieldtotalPurchase, name[3][0], quantity[3][0], price[3][0], 3, 0);
    }//GEN-LAST:event_jButtonChickenWingsActionPerformed

    private void jButtonChickenStripperActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChickenStripperActionPerformed
        quantity[3][1] = vendingMachine.work.method(list1, jTextFieldtotalPurchase, name[3][1], quantity[3][1], price[3][1], 3, 1);
    }//GEN-LAST:event_jButtonChickenStripperActionPerformed

    private void jButtonFrankHotWingsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFrankHotWingsActionPerformed
        quantity[3][2] = vendingMachine.work.method(list1, jTextFieldtotalPurchase, name[3][2], quantity[3][2], price[3][2], 3, 2);
    }//GEN-LAST:event_jButtonFrankHotWingsActionPerformed

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

    private void jButtonExitOrderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitOrderActionPerformed
        dispose();
    }//GEN-LAST:event_jButtonExitOrderActionPerformed

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
    //calling a method money() from class work to perform the refund action
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

    private void jButtonChickenKickersActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChickenKickersActionPerformed
        quantity[3][4] = vendingMachine.work.method(list1, jTextFieldtotalPurchase, name[3][4], quantity[3][4], price[3][4], 3, 4);
    }//GEN-LAST:event_jButtonChickenKickersActionPerformed

    private void jButtonStripperComboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonStripperComboActionPerformed
        quantity[3][5] = vendingMachine.work.method(list1, jTextFieldtotalPurchase, name[3][5], quantity[3][5], price[3][5], 3, 5);
    }//GEN-LAST:event_jButtonStripperComboActionPerformed
    //whenever window gains focus populate the jTextField with total amount of purchase
    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        jTextFieldtotalPurchase.setText(Double.toString(purchase));
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
            java.util.logging.Logger.getLogger(ChickenItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ChickenItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ChickenItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ChickenItems.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ChickenItems().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBbqWings;
    private javax.swing.JButton jButtonChickenKickers;
    private javax.swing.JButton jButtonChickenStripper;
    private javax.swing.JButton jButtonChickenWings;
    private javax.swing.JButton jButtonCustomerFeedBack;
    private javax.swing.JButton jButtonExitOrder;
    private javax.swing.JButton jButtonFrankHotWings;
    private javax.swing.JButton jButtonOtherItems;
    private javax.swing.JButton jButtonPizzas;
    private javax.swing.JButton jButtonRefund;
    private javax.swing.JButton jButtonStripperCombo;
    private javax.swing.JButton jButtonWrapUp;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextFieldtotalPurchase;
    private java.awt.List list1;
    // End of variables declaration//GEN-END:variables
}
