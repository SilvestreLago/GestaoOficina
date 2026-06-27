/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestaooficina.view;

/**
 *
 * @author silvestre
 */
public class Home extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Home.class.getName());

    /**
     * Creates new form Home
     */
    public Home() {
        initComponents();
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonFuncVisu = new javax.swing.JButton();
        jButtonFuncBuscar = new javax.swing.JButton();
        jButtonFuncCad = new javax.swing.JButton();
        jButtonFuncEdit = new javax.swing.JButton();
        jButtonFuncRemove = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(102, 102, 102));

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButtonSair.setBackground(new java.awt.Color(255, 0, 51));
        jButtonSair.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("SAIR");
        jButtonSair.addActionListener(this::jButtonSairActionPerformed);

        jLabel1.setBackground(new java.awt.Color(0, 0, 153));
        jLabel1.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Gerenciar Oficina");

        jButtonFuncVisu.setBackground(new java.awt.Color(0, 51, 153));
        jButtonFuncVisu.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonFuncVisu.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFuncVisu.setText("Visualizar");
        jButtonFuncVisu.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonFuncVisuFocusGained(evt);
            }
        });
        jButtonFuncVisu.addActionListener(this::jButtonFuncVisuActionPerformed);

        jButtonFuncBuscar.setBackground(new java.awt.Color(0, 51, 153));
        jButtonFuncBuscar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonFuncBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFuncBuscar.setText("Buscar");
        jButtonFuncBuscar.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonFuncBuscarFocusGained(evt);
            }
        });
        jButtonFuncBuscar.addActionListener(this::jButtonFuncBuscarActionPerformed);

        jButtonFuncCad.setBackground(new java.awt.Color(0, 51, 153));
        jButtonFuncCad.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonFuncCad.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFuncCad.setText("Cadastrar");
        jButtonFuncCad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonFuncCadFocusGained(evt);
            }
        });
        jButtonFuncCad.addActionListener(this::jButtonFuncCadActionPerformed);

        jButtonFuncEdit.setBackground(new java.awt.Color(0, 51, 153));
        jButtonFuncEdit.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonFuncEdit.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFuncEdit.setText("Editar");
        jButtonFuncEdit.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonFuncEditFocusGained(evt);
            }
        });
        jButtonFuncEdit.addActionListener(this::jButtonFuncEditActionPerformed);

        jButtonFuncRemove.setBackground(new java.awt.Color(0, 51, 153));
        jButtonFuncRemove.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonFuncRemove.setForeground(new java.awt.Color(255, 255, 255));
        jButtonFuncRemove.setText("Remover");
        jButtonFuncRemove.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonFuncRemoveFocusGained(evt);
            }
        });
        jButtonFuncRemove.addActionListener(this::jButtonFuncRemoveActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFuncVisu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFuncBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(47, 47, 47)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonFuncCad, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonFuncEdit, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(76, 76, 76))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonFuncRemove, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(200, 200, 200))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(128, 128, 128))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSair)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFuncCad)
                    .addComponent(jButtonFuncVisu, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonFuncEdit)
                    .addComponent(jButtonFuncBuscar))
                .addGap(18, 18, 18)
                .addComponent(jButtonFuncRemove)
                .addContainerGap(93, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        Login login = new Login();
        this.setVisible(false);
        login.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

    private void jButtonFuncEditFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonFuncEditFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFuncEditFocusGained

    private void jButtonFuncEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncEditActionPerformed
        Editar edit = new Editar();
        edit.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFuncEditActionPerformed

    private void jButtonFuncCadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonFuncCadFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFuncCadFocusGained

    private void jButtonFuncCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncCadActionPerformed
        Cadastrar cad = new Cadastrar();
        cad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFuncCadActionPerformed

    private void jButtonFuncVisuFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonFuncVisuFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFuncVisuFocusGained

    private void jButtonFuncVisuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncVisuActionPerformed
        Visualizar visu = new Visualizar();
        visu.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFuncVisuActionPerformed

    private void jButtonFuncRemoveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonFuncRemoveFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFuncRemoveFocusGained

    private void jButtonFuncRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncRemoveActionPerformed
        Remover remove = new Remover();
        remove.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFuncRemoveActionPerformed

    private void jButtonFuncBuscarFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonFuncBuscarFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonFuncBuscarFocusGained

    private void jButtonFuncBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFuncBuscarActionPerformed
        Buscar busca = new Buscar();
        busca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonFuncBuscarActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Home().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonFuncBuscar;
    private javax.swing.JButton jButtonFuncCad;
    private javax.swing.JButton jButtonFuncEdit;
    private javax.swing.JButton jButtonFuncRemove;
    private javax.swing.JButton jButtonFuncVisu;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
