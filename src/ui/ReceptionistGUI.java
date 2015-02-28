/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.Toolkit;
import java.awt.event.WindowEvent;

/**
 *
 * @author leiz03
 */
public class ReceptionistGUI extends javax.swing.JFrame {

    /**
     * Creates new form AdiminGUI
     */
    public ReceptionistGUI() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

	public void close() {

		WindowEvent winClosingEvent = new WindowEvent(this,
				WindowEvent.WINDOW_CLOSING);
		Toolkit.getDefaultToolkit().getSystemEventQueue()
				.postEvent(winClosingEvent);

	}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        addCustomerButton = new javax.swing.JButton();
        manageCustomerButton = new javax.swing.JButton();
        viewBorrowButton = new javax.swing.JButton();
        updateBookStatusButton = new javax.swing.JButton();
        logoffButton = new javax.swing.JButton();
        btnBookLendingReport = new javax.swing.JButton();
        btnFineReport = new javax.swing.JButton();
        btnBookPurchasedReport = new javax.swing.JButton();
        btnPopBooksReport = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Receptionist Main Menu");

        addCustomerButton.setText("Add Customer");
        addCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addCustomerButtonActionPerformed(evt);
            }
        });

        manageCustomerButton.setText("Manage Customer Info");
        manageCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageCustomerButtonActionPerformed(evt);
            }
        });

        viewBorrowButton.setText("View Customer Borrow");
        viewBorrowButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBorrowButtonActionPerformed(evt);
            }
        });

        updateBookStatusButton.setText("Manage Books");
        updateBookStatusButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateBookStatusButtonActionPerformed(evt);
            }
        });

        logoffButton.setText("Logoff");
        logoffButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoffButtonActionPerformed(evt);
            }
        });

        btnBookLendingReport.setText("Book Lending Report");
        btnBookLendingReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookLendingReportActionPerformed(evt);
            }
        });

        btnFineReport.setText("Fine Report");
        btnFineReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFineReportActionPerformed(evt);
            }
        });

        btnBookPurchasedReport.setText("Book Purchased Report");
        btnBookPurchasedReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBookPurchasedReportActionPerformed(evt);
            }
        });

        btnPopBooksReport.setText("Popular Books Report");
        btnPopBooksReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPopBooksReportActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoffButton, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(73, 73, 73)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnBookLendingReport, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnBookPurchasedReport, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(viewBorrowButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addCustomerButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnFineReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPopBooksReport, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(updateBookStatusButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(manageCustomerButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(114, 114, 114))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addCustomerButton, btnBookLendingReport, btnBookPurchasedReport, btnFineReport, btnPopBooksReport, manageCustomerButton, updateBookStatusButton, viewBorrowButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addCustomerButton)
                    .addComponent(manageCustomerButton))
                .addGap(62, 62, 62)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(viewBorrowButton)
                    .addComponent(updateBookStatusButton))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookLendingReport)
                    .addComponent(btnFineReport))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBookPurchasedReport)
                    .addComponent(btnPopBooksReport))
                .addGap(32, 32, 32)
                .addComponent(logoffButton)
                .addGap(19, 19, 19))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addCustomerButton, btnBookLendingReport, btnBookPurchasedReport, btnFineReport, btnPopBooksReport, manageCustomerButton, updateBookStatusButton, viewBorrowButton});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoffButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoffButtonActionPerformed
        // TODO add your handling code here:
    	this.dispose();
    	LoginGUI gui = new LoginGUI();
    	gui.setVisible(true);
    }//GEN-LAST:event_logoffButtonActionPerformed

    private void updateBookStatusButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateBookStatusButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
    	BookGUI_ForReceptionist gui = new BookGUI_ForReceptionist();
    	gui.setVisible(true);
    	
    }//GEN-LAST:event_updateBookStatusButtonActionPerformed

    private void addCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addCustomerButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Receptionist_addCustomer gui = new Receptionist_addCustomer();
        gui.frmAddACustomer.setVisible(true);
    }//GEN-LAST:event_addCustomerButtonActionPerformed

    private void manageCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageCustomerButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ManageCustomer_ForReceptionist gui = new ManageCustomer_ForReceptionist();
        gui.setVisible(true);
    }//GEN-LAST:event_manageCustomerButtonActionPerformed

    private void viewBorrowButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBorrowButtonActionPerformed
        // TODO add your handling code here:
        this.dispose();
        ViewCustomerBorrow_ForReceptionist gui = new ViewCustomerBorrow_ForReceptionist();
        gui.setVisible(true);
    }//GEN-LAST:event_viewBorrowButtonActionPerformed

    private void btnBookLendingReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookLendingReportActionPerformed
        // TODO add your handling code here:
        
        BookLendingReport gui = new BookLendingReport();
    	gui.setVisible(true);
    }//GEN-LAST:event_btnBookLendingReportActionPerformed

    private void btnFineReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFineReportActionPerformed
        // TODO add your handling code here:
        
        FineReport fineReport = new FineReport();
        fineReport.setVisible(true);
    }//GEN-LAST:event_btnFineReportActionPerformed

    private void btnBookPurchasedReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBookPurchasedReportActionPerformed
        // TODO add your handling code here:
        
        Admin_purchaseReport gui = new Admin_purchaseReport();
        gui.frmPurchasedBooksReport.setVisible(true);
    }//GEN-LAST:event_btnBookPurchasedReportActionPerformed

    private void btnPopBooksReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPopBooksReportActionPerformed
        // TODO add your handling code here:
        
        PopularBooksReport gui = new PopularBooksReport();
        gui.setVisible(true);
    }//GEN-LAST:event_btnPopBooksReportActionPerformed

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
            java.util.logging.Logger.getLogger(ReceptionistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ReceptionistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ReceptionistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ReceptionistGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ReceptionistGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addCustomerButton;
    private javax.swing.JButton btnBookLendingReport;
    private javax.swing.JButton btnBookPurchasedReport;
    private javax.swing.JButton btnFineReport;
    private javax.swing.JButton btnPopBooksReport;
    private javax.swing.JButton logoffButton;
    private javax.swing.JButton manageCustomerButton;
    private javax.swing.JButton updateBookStatusButton;
    private javax.swing.JButton viewBorrowButton;
    // End of variables declaration//GEN-END:variables

}
