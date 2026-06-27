/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestaooficina.view;

import com.mycompany.gestaooficina.control.GerenciamentoClientes;
import com.mycompany.gestaooficina.control.GerenciamentoFuncionarios;
import com.mycompany.gestaooficina.control.GerenciamentoVeiculos;
import com.mycompany.gestaooficina.control.GerenciamentoPecas;
import com.mycompany.gestaooficina.control.GerenciamentoServicos;
import com.mycompany.gestaooficina.control.GerenciamentoOrdemServico;
import javax.swing.JOptionPane;

/**
 *
 * @author silvestre
 */
public class Remover extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(Remover.class.getName());

    /**
     * Creates new form Remover
     */
    public Remover() {
        initComponents();
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButtonRemoveFuncionario = new javax.swing.JButton();
        jButtonRemoveCliente = new javax.swing.JButton();
        jButtonRemoveVeiculo = new javax.swing.JButton();
        jButtonRemovePeca = new javax.swing.JButton();
        jButtonRemoveOS = new javax.swing.JButton();
        jButtonRemoveServico = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jButtonVoltar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jButtonRemoveFuncionario.setBackground(new java.awt.Color(0, 51, 153));
        jButtonRemoveFuncionario.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonRemoveFuncionario.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveFuncionario.setText("Remover Funcionario");
        jButtonRemoveFuncionario.addActionListener(this::jButtonRemoveFuncionarioActionPerformed);

        jButtonRemoveCliente.setBackground(new java.awt.Color(0, 51, 153));
        jButtonRemoveCliente.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonRemoveCliente.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveCliente.setText("Remover Cliente");
        jButtonRemoveCliente.addActionListener(this::jButtonRemoveClienteActionPerformed);

        jButtonRemoveVeiculo.setBackground(new java.awt.Color(0, 51, 153));
        jButtonRemoveVeiculo.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonRemoveVeiculo.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveVeiculo.setText("Remover Veiculo");
        jButtonRemoveVeiculo.addActionListener(this::jButtonRemoveVeiculoActionPerformed);

        jButtonRemovePeca.setBackground(new java.awt.Color(0, 51, 153));
        jButtonRemovePeca.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonRemovePeca.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemovePeca.setText("Remover Peça");
        jButtonRemovePeca.addActionListener(this::jButtonRemovePecaActionPerformed);

        jButtonRemoveOS.setBackground(new java.awt.Color(0, 51, 153));
        jButtonRemoveOS.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonRemoveOS.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveOS.setText("Remover Ordem de Serviço");
        jButtonRemoveOS.addActionListener(this::jButtonRemoveOSActionPerformed);

        jButtonRemoveServico.setBackground(new java.awt.Color(0, 51, 153));
        jButtonRemoveServico.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonRemoveServico.setForeground(new java.awt.Color(255, 255, 255));
        jButtonRemoveServico.setText("Remover Serviço");
        jButtonRemoveServico.addActionListener(this::jButtonRemoveServicoActionPerformed);

        jLabel1.setFont(new java.awt.Font("Inter", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Remover");

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
                .addComponent(jButtonVoltar)
                .addContainerGap(518, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(211, 211, 211))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButtonRemoveServico, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButtonRemoveOS, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(149, 149, 149))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRemoveCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemoveFuncionario, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(65, 65, 65)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonRemovePeca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonRemoveVeiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(36, 36, 36))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar)
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRemoveFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemoveCliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jButtonRemoveVeiculo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonRemovePeca)))
                .addGap(33, 33, 33)
                .addComponent(jButtonRemoveServico)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonRemoveOS)
                .addContainerGap(65, Short.MAX_VALUE))
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

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        Home home = new Home();
        this.setVisible(false);
        home.setVisible(true);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jButtonRemoveClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveClienteActionPerformed
        var textoCodigo = JOptionPane.showInputDialog("Digite o codigo do cliente a remover: ");
        
        if (textoCodigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "O codigo deve ser informado");
            return;
        }
        
        int codigo = 0;
        try {
            codigo = Integer.parseInt(textoCodigo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Codigo invalido!");
            return;
        }
        
        GerenciamentoClientes genClient = GerenciamentoClientes.getInstance();
        if (genClient.buscarCliente(codigo) == null) {
            JOptionPane.showMessageDialog(null, "Cliente nao encontrado!");
        } else {
            genClient.removerCliente(codigo);
            JOptionPane.showMessageDialog(null, "Cliente (" + codigo + ") removido com sucesso!");
        }
    }//GEN-LAST:event_jButtonRemoveClienteActionPerformed

    private void jButtonRemovePecaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemovePecaActionPerformed
        var textoCodigo = JOptionPane.showInputDialog("Digite o codigo da peca a remover: ");
        
        if (textoCodigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "O codigo deve ser informado");
            return;
        }
        
        int codigo = 0;
        try {
            codigo = Integer.parseInt(textoCodigo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Codigo invalido!");
            return;
        }
        
        GerenciamentoPecas genPeca = GerenciamentoPecas.getInstance();
        if (genPeca.buscarPeca(codigo) == null) {
            JOptionPane.showMessageDialog(null, "Peca nao encontrada!");
        } else {
            genPeca.removerPeca(codigo);
            JOptionPane.showMessageDialog(null, "Peca (" + codigo + ") removida com sucesso!");
        }
    }//GEN-LAST:event_jButtonRemovePecaActionPerformed

    private void jButtonRemoveOSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveOSActionPerformed
        var textoCodigo = JOptionPane.showInputDialog("Digite o codigo da ordem de servico a remover: ");
        
        if (textoCodigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "O codigo deve ser informado");
            return;
        }
        
        int codigo = 0;
        try {
            codigo = Integer.parseInt(textoCodigo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Codigo invalido!");
            return;
        }
        
        GerenciamentoOrdemServico genOS = GerenciamentoOrdemServico.getInstance();
        if (genOS.buscarOrdemServico(codigo) == null) {
            JOptionPane.showMessageDialog(null, "Ordem de Servico nao encontrada!");
        } else {
            genOS.removerOrdemServico(codigo);
            JOptionPane.showMessageDialog(null, "Ordem de Servico (" + codigo + ") removida com sucesso!");
        }
    }//GEN-LAST:event_jButtonRemoveOSActionPerformed

    private void jButtonRemoveServicoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveServicoActionPerformed
        var textoCodigo = JOptionPane.showInputDialog("Digite o codigo do servico a remover: ");
        
        if (textoCodigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "O codigo deve ser informado");
            return;
        }
        
        int codigo = 0;
        try {
            codigo = Integer.parseInt(textoCodigo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Codigo invalido!");
            return;
        }        
        
        GerenciamentoServicos genServico = GerenciamentoServicos.getInstance();
        if (genServico.buscarServico(codigo) == null) {
            JOptionPane.showMessageDialog(null, "Servico nao encontrado!");
        } else {
            genServico.removerServico(codigo);
            JOptionPane.showMessageDialog(null, "Servico (" + codigo + ") removido com sucesso!");
        }
    }//GEN-LAST:event_jButtonRemoveServicoActionPerformed

    private void jButtonRemoveVeiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveVeiculoActionPerformed
        var textoCodigo = JOptionPane.showInputDialog("Digite o codigo do veiculo a remover: ");
        
        if (textoCodigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "O codigo deve ser informado");
            return;
        }
        
        int codigo = 0;
        try {
            codigo = Integer.parseInt(textoCodigo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Codigo invalido!");
            return;
        }
        
        
        GerenciamentoVeiculos genVeic = GerenciamentoVeiculos.getInstance();
        if (genVeic.buscarVeiculo(codigo) == null) {
            JOptionPane.showMessageDialog(null, "Veiculo nao encontrado!");
        } else {
            genVeic.removerVeiculo(codigo);
            JOptionPane.showMessageDialog(null, "Veiculo (" + codigo + ") removido com sucesso!");
        }
    }//GEN-LAST:event_jButtonRemoveVeiculoActionPerformed

    private void jButtonRemoveFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveFuncionarioActionPerformed
        var textoCodigo = JOptionPane.showInputDialog("Digite o codigo do funcionario a remover: ");
        
        if (textoCodigo.isEmpty()){
            JOptionPane.showMessageDialog(null, "O codigo deve ser informado");
            return;
        }
        
        int codigo = 0;
        try {
            codigo = Integer.parseInt(textoCodigo);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Codigo invalido!");
            return;
        }
        
        
        GerenciamentoFuncionarios genFunc = GerenciamentoFuncionarios.getInstance();
        if (genFunc.buscarFuncionario(codigo) == null) {
            JOptionPane.showMessageDialog(null, "Funcionario nao encontrado!");
        } else {
            genFunc.removerFuncionario(codigo);
            JOptionPane.showMessageDialog(null, "Funcionario (" + codigo + ") removido com sucesso!");
        }
    }//GEN-LAST:event_jButtonRemoveFuncionarioActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new Remover().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonRemoveCliente;
    private javax.swing.JButton jButtonRemoveFuncionario;
    private javax.swing.JButton jButtonRemoveOS;
    private javax.swing.JButton jButtonRemovePeca;
    private javax.swing.JButton jButtonRemoveServico;
    private javax.swing.JButton jButtonRemoveVeiculo;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
