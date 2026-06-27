/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestaooficina.view;

/**
 *
 * @author silvestre
 */
public class Cadastrar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Cadastrar.class.getName());

    /**
     * Creates new form Cadastrar
     */
    public Cadastrar() {
        initComponents();
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButtonSair = new javax.swing.JButton();
        jButtonCadVeic = new javax.swing.JButton();
        jButtonCadPeca = new javax.swing.JButton();
        jButtonCadServ = new javax.swing.JButton();
        jButtonCadOS = new javax.swing.JButton();
        jButtonCadCliente = new javax.swing.JButton();
        jButtonCadFunc = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar");

        jButtonSair.setBackground(new java.awt.Color(255, 0, 0));
        jButtonSair.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonSair.setForeground(new java.awt.Color(255, 255, 255));
        jButtonSair.setText("Voltar");
        jButtonSair.addActionListener(this::jButtonSairActionPerformed);

        jButtonCadVeic.setBackground(new java.awt.Color(0, 51, 153));
        jButtonCadVeic.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonCadVeic.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadVeic.setText("Cadastrar Veiculo");
        jButtonCadVeic.addActionListener(this::jButtonCadVeicActionPerformed);

        jButtonCadPeca.setBackground(new java.awt.Color(0, 51, 153));
        jButtonCadPeca.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonCadPeca.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadPeca.setText("Cadastrar Peça");
        jButtonCadPeca.addActionListener(this::jButtonCadPecaActionPerformed);

        jButtonCadServ.setBackground(new java.awt.Color(0, 51, 153));
        jButtonCadServ.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonCadServ.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadServ.setText("Cadastrar Serviço");
        jButtonCadServ.addActionListener(this::jButtonCadServActionPerformed);

        jButtonCadOS.setBackground(new java.awt.Color(0, 51, 153));
        jButtonCadOS.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonCadOS.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadOS.setText("Cadastrar Ordem de Serviço");
        jButtonCadOS.addActionListener(this::jButtonCadOSActionPerformed);

        jButtonCadCliente.setBackground(new java.awt.Color(0, 51, 153));
        jButtonCadCliente.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonCadCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadCliente.setText("Cadastrar Cliente");
        jButtonCadCliente.addActionListener(this::jButtonCadClienteActionPerformed);

        jButtonCadFunc.setBackground(new java.awt.Color(0, 51, 153));
        jButtonCadFunc.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonCadFunc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadFunc.setText("Cadastrar Funcionario");
        jButtonCadFunc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jButtonCadFuncFocusGained(evt);
            }
        });
        jButtonCadFunc.addActionListener(this::jButtonCadFuncActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(6, 6, 6)
                .addComponent(jButtonSair)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCadServ, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadOS))
                        .addGap(149, 149, 149))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCadCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonCadVeic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonCadPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(204, 204, 204))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonSair)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCadVeic)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCadPeca))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonCadFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonCadCliente)))
                .addGap(18, 18, 18)
                .addComponent(jButtonCadServ)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonCadOS)
                .addGap(82, 82, 82))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonCadVeicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadVeicActionPerformed
        // TODO add your handling code here:
        CadastrarVeiculo cadVei = new CadastrarVeiculo();
        cadVei.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadVeicActionPerformed

    private void jButtonCadPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadPecaActionPerformed
        // TODO add your handling code here:
        CadastrarPeca cadPeca = new CadastrarPeca();
        cadPeca.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadPecaActionPerformed

    private void jButtonCadServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadServActionPerformed
        // TODO add your handling code here:
        CadastrarServico cadServ = new CadastrarServico();
        cadServ.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadServActionPerformed

    private void jButtonCadOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadOSActionPerformed
        // TODO add your handling code here:
        CadastrarOrdemServico cadOS = new CadastrarOrdemServico();
        cadOS.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadOSActionPerformed

    private void jButtonCadClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadClienteActionPerformed
        // TODO add your handling code here:
        CadastrarCliente cadCli = new CadastrarCliente();
        cadCli.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadClienteActionPerformed

    private void jButtonCadFuncFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jButtonCadFuncFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonCadFuncFocusGained

    private void jButtonCadFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadFuncActionPerformed
        // TODO add your handling code here:
        CadastrarFucionario cadFunc = new CadastrarFucionario();
        cadFunc.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonCadFuncActionPerformed

    private void jButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSairActionPerformed
        // TODO add your handling code here:
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jButtonSairActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Cadastrar().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadCliente;
    private javax.swing.JButton jButtonCadFunc;
    private javax.swing.JButton jButtonCadOS;
    private javax.swing.JButton jButtonCadPeca;
    private javax.swing.JButton jButtonCadServ;
    private javax.swing.JButton jButtonCadVeic;
    private javax.swing.JButton jButtonSair;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
