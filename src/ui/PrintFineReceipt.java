/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;

/**
 *
 * @author usr
 */
public class PrintFineReceipt extends javax.swing.JFrame {

    String printStr;
    /**
     * Creates new form PrintFineReceipt
     */
    public PrintFineReceipt() {
        initComponents();
        this.setLocationRelativeTo(null);
       
    }

    public void setPrintStr(String printStr){
        this.printStr = printStr;
        printText.setText(printStr);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        printText = new javax.swing.JTextArea();
        printReceipt = new javax.swing.JButton();
        cancelPrint = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        printText.setColumns(20);
        printText.setRows(5);
        jScrollPane1.setViewportView(printText);

        printReceipt.setText("Print");
        printReceipt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printReceiptActionPerformed(evt);
            }
        });

        cancelPrint.setText("Cancel");
        cancelPrint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelPrintActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(90, 90, 90)
                .addComponent(printReceipt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cancelPrint)
                .addGap(80, 80, 80))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(printReceipt)
                    .addComponent(cancelPrint))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void printReceiptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printReceiptActionPerformed
        // TODO add your handling code here:
         
        try{
            boolean complete = printText.print();
            if(complete){
                JOptionPane.showMessageDialog(null,"Done printing","Information",JOptionPane.INFORMATION_MESSAGE);
            }else{
                 JOptionPane.showMessageDialog(null,"Printing!","Printer",JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(PrinterException e){
            JOptionPane.showMessageDialog(null,e);
                }     
        
    }//GEN-LAST:event_printReceiptActionPerformed

    private void cancelPrintActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelPrintActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelPrintActionPerformed

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
            java.util.logging.Logger.getLogger(PrintFineReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PrintFineReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PrintFineReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PrintFineReceipt.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PrintFineReceipt().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelPrint;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton printReceipt;
    private javax.swing.JTextArea printText;
    // End of variables declaration//GEN-END:variables

}
