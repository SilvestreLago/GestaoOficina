/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestaooficina.view;

import com.mycompany.gestaooficina.control.GerenciamentoClientes;
import com.mycompany.gestaooficina.control.GerenciamentoFuncionarios;
import com.mycompany.gestaooficina.control.GerenciamentoOrdemServico;
import com.mycompany.gestaooficina.control.GerenciamentoPecas;
import com.mycompany.gestaooficina.control.GerenciamentoServicos;
import com.mycompany.gestaooficina.control.GerenciamentoVeiculos;
import com.mycompany.gestaooficina.model.OrdemServico;
import com.mycompany.gestaooficina.model.Veiculo;
import javax.swing.JOptionPane;

/**
 *
 * @author silvestre
 */
public class CadastrarOrdemServico extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(CadastrarOrdemServico.class.getName());

    /**
     * Creates new form CadastrarOrdemServico
     */
    public CadastrarOrdemServico() {
        initComponents();
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField4 = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButtonCadOs = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.addActionListener(this::jTextField4ActionPerformed);

        jLabel7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cod Servico:");

        jLabel4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cod Cliente:");

        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.addActionListener(this::jTextField5ActionPerformed);

        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jButtonVoltar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonVoltar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cod Mecanico:");

        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Cadastrar Ordem de Serviço");

        jButtonCadOs.setBackground(new java.awt.Color(0, 51, 255));
        jButtonCadOs.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonCadOs.setForeground(new java.awt.Color(255, 255, 255));
        jButtonCadOs.setText("Cadastrar");
        jButtonCadOs.addActionListener(this::jButtonCadOsActionPerformed);

        jLabel2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cod Veiculo:");

        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jLabel6.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cod Peça:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jButtonCadOs)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addComponent(jTextField2)
                                            .addComponent(jTextField1)
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 1, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jButtonVoltar))
                .addContainerGap(118, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonVoltar)
                .addGap(13, 13, 13)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonCadOs)
                .addContainerGap(62, Short.MAX_VALUE))
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

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jButtonCadOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonCadOsActionPerformed
        String codVeicStr = jTextField1.getText();
        String codClienteStr = jTextField2.getText();
        String codMecStr = jTextField3.getText();
        String codPecaStr = jTextField4.getText();
        String codServicoStr = jTextField5.getText();
        
        if (codVeicStr.isEmpty() || codClienteStr.isEmpty() || codMecStr.isEmpty() || codPecaStr.isEmpty() || codServicoStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Todos os campos devem ser preenchidos");
            return;
        }
        
        int codVeiculo, codCliente, codMecanico, codPeca, codServico;
        try {
            codVeiculo = Integer.parseInt(codVeicStr);
            codCliente = Integer.parseInt(codClienteStr);
            codMecanico = Integer.parseInt(codMecStr);
            codPeca = Integer.parseInt(codPecaStr);
            codServico = Integer.parseInt(codServicoStr);
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null, "Todos os codigos devem ser numericos!");
            return;
        }
        
        GerenciamentoClientes genCliente = GerenciamentoClientes.getInstance();
        if (genCliente.buscarCliente(codCliente) == null) {
            JOptionPane.showMessageDialog(null, "Cliente (" + codCliente + ") nao encontrado!");
            return;
        }
        
        GerenciamentoVeiculos genVeiculo = GerenciamentoVeiculos.getInstance();
        Veiculo veiculo = genVeiculo.buscarVeiculo(codVeiculo);
        if (veiculo == null) {
            JOptionPane.showMessageDialog(null, "Veiculo (" + codVeiculo + ") nao encontrado!");
            return;
        }
        if (veiculo.getCodigoCliente() != codCliente) {
            JOptionPane.showMessageDialog(null, "O veiculo informado nao pertence ao cliente informado!");
            return;
        }
        
        GerenciamentoFuncionarios genFuncionario = GerenciamentoFuncionarios.getInstance();
        if (genFuncionario.buscarFuncionario(codMecanico) == null) {
            JOptionPane.showMessageDialog(null, "Mecanico (" + codMecanico + ") nao encontrado!");
            return;
        }
        
        GerenciamentoPecas genPeca = GerenciamentoPecas.getInstance();
        if (genPeca.buscarPeca(codPeca) == null) {
            JOptionPane.showMessageDialog(null, "Peca (" + codPeca + ") nao encontrada!");
            return;
        }
        
        GerenciamentoServicos genServico = GerenciamentoServicos.getInstance();
        if (genServico.buscarServico(codServico) == null) {
            JOptionPane.showMessageDialog(null, "Servico (" + codServico + ") nao encontrado!");
            return;
        }
        
        GerenciamentoOrdemServico genOS = GerenciamentoOrdemServico.getInstance();
        OrdemServico os = new OrdemServico(codVeiculo, codCliente, codMecanico, codPeca, codServico);
        try {
            genOS.cadastrarOrdemServico(os);
        } catch (com.mycompany.gestaooficina.exception.PecaSemEstoqueException ex) {
            JOptionPane.showMessageDialog(null,
                    "Não foi possível abrir a OS: " + ex.getMessage(),
                    "Estoque insuficiente", JOptionPane.WARNING_MESSAGE);
            return;
        }
        
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Ordem de Servico (" + os.getCodigo() + ") adicionada com sucesso!");
        
        CadastrarOrdemServico cadOS = new CadastrarOrdemServico();
        cadOS.setVisible(true);
    }//GEN-LAST:event_jButtonCadOsActionPerformed

    private void jButtonVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonVoltarActionPerformed
        // TODO add your handling code here:
        Cadastrar cad = new Cadastrar();
        cad.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new CadastrarOrdemServico().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonCadOs;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
