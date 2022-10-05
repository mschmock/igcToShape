/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package ch.manuel.igctoraster.gui;

import com.google.common.io.Resources;
import java.io.IOException;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Schmocker
 */
public class InfoForm extends javax.swing.JDialog {

  // files in resources
  private static final String dataHTML = "/data/info.html";

  /**
   * Creates new form InfoForm
   *
   * @param parent
   * @param modal
   */
  public InfoForm(java.awt.Frame parent, boolean modal) {
    super(parent, modal);
    initComponents();

    //add html from ressources
    loadHTML();
  }

  /**
   * This method is called from within the constructor to initialize the form. WARNING: Do NOT
   * modify this code. The content of this method is always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {

    jLabel1 = new javax.swing.JLabel();
    jButton1 = new javax.swing.JButton();

    setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
    setTitle("Information");
    setMaximumSize(new java.awt.Dimension(500, 600));
    setResizable(false);
    setSize(new java.awt.Dimension(0, 0));

    jLabel1.setText("jLabel1");

    jButton1.setText("Close");
    jButton1.addActionListener(new java.awt.event.ActionListener() {
      public void actionPerformed(java.awt.event.ActionEvent evt) {
        jButton1ActionPerformed(evt);
      }
    });

    javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        .addContainerGap())
      .addGroup(layout.createSequentialGroup()
        .addGap(152, 152, 152)
        .addComponent(jButton1)
        .addContainerGap(187, Short.MAX_VALUE))
    );
    layout.setVerticalGroup(
      layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
      .addGroup(layout.createSequentialGroup()
        .addContainerGap()
        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)
        .addGap(18, 18, 18)
        .addComponent(jButton1)
        .addContainerGap())
    );

    pack();
  }// </editor-fold>//GEN-END:initComponents

  private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    // click Close: set visible --> false
    this.setVisible(false);
  }//GEN-LAST:event_jButton1ActionPerformed

  // get data from html
  private void loadHTML() {
    // get File: info.html
    URL url = MainFrame.class.getResource(dataHTML);
    String text = "Error";
    try {
      text = Resources.toString(url, StandardCharsets.UTF_8);
    } catch (IOException ex) {
      Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
    }

    jLabel1.setText(text);
  }


  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JButton jButton1;
  private javax.swing.JLabel jLabel1;
  // End of variables declaration//GEN-END:variables
}
