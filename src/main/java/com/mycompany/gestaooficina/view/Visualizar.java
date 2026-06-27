/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestaooficina.view;

import com.mycompany.gestaooficina.control.GerenciamentoClientes;
import com.mycompany.gestaooficina.control.GerenciamentoFuncionarios;
import com.mycompany.gestaooficina.control.GerenciamentoVeiculos;
import com.mycompany.gestaooficina.control.GerenciamentoOrdemServico;
import com.mycompany.gestaooficina.control.GerenciamentoPecas;
import com.mycompany.gestaooficina.control.GerenciamentoServicos;
import javax.swing.JOptionPane;

/**
 *
 * @author silvestre
 */
public class Visualizar extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Visualizar.class.getName());

    /**
     * Creates new form Visualizar
     */
    public Visualizar() {
        initComponents();
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonVerFunc = new javax.swing.JButton();
        jButtonVerClientes = new javax.swing.JButton();
        jButtonVerVeiculo = new javax.swing.JButton();
        jButtonVerPeca = new javax.swing.JButton();
        jButtonVerOS = new javax.swing.JButton();
        jButtonVerServico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));
        jPanel1.setForeground(new java.awt.Color(102, 102, 102));

        jButtonVerFunc.setBackground(new java.awt.Color(0, 0, 153));
        jButtonVerFunc.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVerFunc.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerFunc.setText("Ver Funcionarios");
        jButtonVerFunc.addActionListener(this::jButtonVerFuncActionPerformed);

        jButtonVerClientes.setBackground(new java.awt.Color(0, 0, 153));
        jButtonVerClientes.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVerClientes.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerClientes.setText("Ver Clientes");
        jButtonVerClientes.addActionListener(this::jButtonVerClientesActionPerformed);

        jButtonVerVeiculo.setBackground(new java.awt.Color(0, 0, 153));
        jButtonVerVeiculo.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVerVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerVeiculo.setText("Ver Veiculos");
        jButtonVerVeiculo.addActionListener(this::jButtonVerVeiculoActionPerformed);

        jButtonVerPeca.setBackground(new java.awt.Color(0, 0, 153));
        jButtonVerPeca.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVerPeca.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerPeca.setText("Ver Peça");
        jButtonVerPeca.addActionListener(this::jButtonVerPecaActionPerformed);

        jButtonVerOS.setBackground(new java.awt.Color(0, 0, 153));
        jButtonVerOS.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVerOS.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerOS.setText("Ver Ordem de Serviço");
        jButtonVerOS.addActionListener(this::jButtonVerOSActionPerformed);

        jButtonVerServico.setBackground(new java.awt.Color(0, 0, 153));
        jButtonVerServico.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVerServico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVerServico.setText("Ver Serviço");
        jButtonVerServico.addActionListener(this::jButtonVerServicoActionPerformed);

        jLabel1.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Visualizar");

        jButtonVoltar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonVoltar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVerFunc, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVerClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVerPeca, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVerVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVoltar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 483, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonVerOS, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonVerServico, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(139, 139, 139)))
                .addGap(35, 35, 35))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(212, 212, 212)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar)
                .addGap(29, 29, 29)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVerVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVerPeca))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonVerFunc)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonVerClientes)))
                .addGap(18, 18, 18)
                .addComponent(jButtonVerServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonVerOS)
                .addContainerGap(77, Short.MAX_VALUE))
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

    private void jButtonVerServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerServicoActionPerformed
        GerenciamentoServicos genServico = GerenciamentoServicos.getInstance();
        this.setVisible(false);
        var servicos = genServico.resumirServicos();
        if(servicos == "") servicos = "Nao ha servicos disponiveis";
        JOptionPane.showMessageDialog(null, servicos);
        this.setVisible(true);
    }//GEN-LAST:event_jButtonVerServicoActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonVerClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerClientesActionPerformed
        GerenciamentoClientes genClient = GerenciamentoClientes.getInstance();
        this.setVisible(false);
        var cliente = genClient.resumirClientes();
        if(cliente == "") cliente = "Nao ha clientes disponiveis";
        JOptionPane.showMessageDialog(null, cliente);
        this.setVisible(true);
    }//GEN-LAST:event_jButtonVerClientesActionPerformed

    private void jButtonVerPecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerPecaActionPerformed
        GerenciamentoPecas genPeca = GerenciamentoPecas.getInstance();
        this.setVisible(false);
        var peca = genPeca.resumirPecas();
        if(peca == "") peca = "Nao ha pecas disponiveis";
        JOptionPane.showMessageDialog(null, peca);
        this.setVisible(true);
    }//GEN-LAST:event_jButtonVerPecaActionPerformed

    private void jButtonVerOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerOSActionPerformed
        GerenciamentoOrdemServico genOS = GerenciamentoOrdemServico.getInstance();
        this.setVisible(false);
        var os = genOS.resumirOs();
        if(os == "") os = "Nao ha ordens de servicos disponiveis";
        JOptionPane.showMessageDialog(null, os);
        this.setVisible(true);
    }//GEN-LAST:event_jButtonVerOSActionPerformed

    private void jButtonVerFuncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerFuncActionPerformed
        GerenciamentoFuncionarios genFunc = GerenciamentoFuncionarios.getInstance();
        this.setVisible(false);
        var func = genFunc.resumirFuncionarios();
        if(func == "") func = "Nao ha funcionarios disponiveis";
        JOptionPane.showMessageDialog(null, func);
        this.setVisible(true);
    }//GEN-LAST:event_jButtonVerFuncActionPerformed

    private void jButtonVerVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVerVeiculoActionPerformed
        GerenciamentoVeiculos genVeic = GerenciamentoVeiculos.getInstance();
        this.setVisible(false);
        var veiculos = genVeic.resumirVeiculos();
        if(veiculos == "") veiculos = "Nao ha veiculos disponiveis";
        JOptionPane.showMessageDialog(null, veiculos);
        this.setVisible(true);
    }//GEN-LAST:event_jButtonVerVeiculoActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Visualizar().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonVerClientes;
    private javax.swing.JButton jButtonVerFunc;
    private javax.swing.JButton jButtonVerOS;
    private javax.swing.JButton jButtonVerPeca;
    private javax.swing.JButton jButtonVerServico;
    private javax.swing.JButton jButtonVerVeiculo;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
