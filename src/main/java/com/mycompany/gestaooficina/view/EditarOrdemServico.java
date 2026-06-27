/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.gestaooficina.view;

import com.mycompany.gestaooficina.control.GerenciamentoOrdemServico;
import com.mycompany.gestaooficina.model.OrdemServico;
import com.mycompany.gestaooficina.model.StatusOrdemServico;
import javax.swing.JOptionPane;

/**
 *
 * @author silvestre
 */
public class EditarOrdemServico extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = java.util.logging.Logger.getLogger(EditarOrdemServico.class.getName());

    /**
     * Creates new form EditarOrdemServico
     */
    private int codigo;
    
    public EditarOrdemServico(OrdemServico os) {
        initComponents();
        this.setSize(600, 350);
        this.setLocationRelativeTo(null);
        this.codigo = os.getCodigo();
        this.jTextField1.setText("" + os.getCodigoVeiculo());
        this.jTextField2.setText("" + os.getCodigoCliente());
        this.jTextField3.setText("" + os.getCodigoMecanico());
        this.jTextField4.setText("" + os.getCodigoPeca());
        this.jTextField5.setText("" + os.getCodigoServico());
        if(os.getStatus() == StatusOrdemServico.ABERTA){
            this.jRadioButton1.setSelected(true);
        }else if(os.getStatus() == StatusOrdemServico.EM_ANDAMENTO){
            this.jRadioButton2.setSelected(true);
        }else if(os.getStatus() == StatusOrdemServico.CONCLUIDA){
            this.jRadioButton3.setSelected(true);
        }else{
            this.jRadioButton4.setSelected(true);
        }
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jButtonEditOs = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jButtonVoltar = new javax.swing.JButton();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jLabel1.setFont(new java.awt.Font("Inter", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Editar Ordem de Serviço");

        jLabel6.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Cod Peça:");

        jButtonEditOs.setBackground(new java.awt.Color(0, 51, 255));
        jButtonEditOs.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonEditOs.setForeground(new java.awt.Color(255, 255, 255));
        jButtonEditOs.setText("Editar");
        jButtonEditOs.addActionListener(this::jButtonEditOsActionPerformed);

        jTextField4.setForeground(new java.awt.Color(0, 0, 0));
        jTextField4.addActionListener(this::jTextField4ActionPerformed);

        jLabel2.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Cod Veiculo:");

        jLabel7.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Cod Servico:");

        jTextField5.setForeground(new java.awt.Color(0, 0, 0));
        jTextField5.addActionListener(this::jTextField5ActionPerformed);

        jButtonVoltar.setBackground(new java.awt.Color(255, 0, 0));
        jButtonVoltar.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jButtonVoltar.setForeground(new java.awt.Color(255, 255, 255));
        jButtonVoltar.setText("Voltar");
        jButtonVoltar.addActionListener(this::jButtonVoltarActionPerformed);

        jTextField1.setForeground(new java.awt.Color(0, 0, 0));
        jTextField1.addActionListener(this::jTextField1ActionPerformed);

        jTextField2.setForeground(new java.awt.Color(0, 0, 0));
        jTextField2.addActionListener(this::jTextField2ActionPerformed);

        jLabel4.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Cod Cliente:");

        jLabel5.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Cod Mecanico:");

        jTextField3.setForeground(new java.awt.Color(0, 0, 0));
        jTextField3.addActionListener(this::jTextField3ActionPerformed);

        jRadioButton1.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setText("Aberta");

        jRadioButton2.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setText("Em andamento");

        jRadioButton3.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setText("Concluida");

        jRadioButton4.setBackground(new java.awt.Color(102, 102, 102));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setForeground(new java.awt.Color(255, 255, 255));
        jRadioButton4.setText("Cancelada");

        jLabel3.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Status:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButtonEditOs)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jTextField2)
                                        .addComponent(jTextField1)
                                        .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jRadioButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton4))
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jButtonVoltar)))
                .addContainerGap(41, Short.MAX_VALUE))
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
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(jButtonEditOs)
                .addGap(32, 32, 32))
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
        // TODO add your handling code here:
        Editar edit = new Editar();
        edit.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButtonVoltarActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jButtonEditOsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEditOsActionPerformed
        String codVeicStr = jTextField1.getText();
        String codClienteStr = jTextField2.getText();
        String codMecStr = jTextField3.getText();
        String codPecaStr = jTextField4.getText();
        String codServicoStr = jTextField5.getText();
        
        if (codVeicStr.isEmpty() || codClienteStr.isEmpty() || codMecStr.isEmpty() || codPecaStr.isEmpty() || codServicoStr.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Preencha todos os campos!");
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
        
        com.mycompany.gestaooficina.control.GerenciamentoClientes genCliente = com.mycompany.gestaooficina.control.GerenciamentoClientes.getInstance();
        if (genCliente.buscarCliente(codCliente) == null) {
            JOptionPane.showMessageDialog(null, "Cliente (" + codCliente + ") nao encontrado!");
            return;
        }
        
        com.mycompany.gestaooficina.control.GerenciamentoVeiculos genVeiculo = com.mycompany.gestaooficina.control.GerenciamentoVeiculos.getInstance();
        com.mycompany.gestaooficina.model.Veiculo veiculo = genVeiculo.buscarVeiculo(codVeiculo);
        if (veiculo == null) {
            JOptionPane.showMessageDialog(null, "Veiculo (" + codVeiculo + ") nao encontrado!");
            return;
        }
        if (veiculo.getCodigoCliente() != codCliente) {
            JOptionPane.showMessageDialog(null, "O veiculo informado nao pertence ao cliente informado!");
            return;
        }
        
        com.mycompany.gestaooficina.control.GerenciamentoFuncionarios genFuncionario = com.mycompany.gestaooficina.control.GerenciamentoFuncionarios.getInstance();
        if (genFuncionario.buscarFuncionario(codMecanico) == null) {
            JOptionPane.showMessageDialog(null, "Mecanico (" + codMecanico + ") nao encontrado!");
            return;
        }
        
        com.mycompany.gestaooficina.control.GerenciamentoPecas genPeca = com.mycompany.gestaooficina.control.GerenciamentoPecas.getInstance();
        if (genPeca.buscarPeca(codPeca) == null) {
            JOptionPane.showMessageDialog(null, "Peca (" + codPeca + ") nao encontrada!");
            return;
        }
        
        com.mycompany.gestaooficina.control.GerenciamentoServicos genServico = com.mycompany.gestaooficina.control.GerenciamentoServicos.getInstance();
        if (genServico.buscarServico(codServico) == null) {
            JOptionPane.showMessageDialog(null, "Servico (" + codServico + ") nao encontrado!");
            return;
        }
        
        StatusOrdemServico status = null;
        if (jRadioButton1.isSelected()) status=StatusOrdemServico.ABERTA;
        else if (jRadioButton2.isSelected()) status=StatusOrdemServico.EM_ANDAMENTO;
        else if (jRadioButton3.isSelected()) status=StatusOrdemServico.CONCLUIDA;
        else if (jRadioButton4.isSelected())status=StatusOrdemServico.CANCELADA;
        
        if(status == null) JOptionPane.showMessageDialog(null, "Selecione o status da OS");
        
        GerenciamentoOrdemServico genOS = GerenciamentoOrdemServico.getInstance();
        genOS.editarOrdemServico(codigo, codVeiculo, codCliente, codMecanico, codPeca, codServico, status);
        
        this.setVisible(false);
        JOptionPane.showMessageDialog(null, "Ordem de Servico (" + codigo + ") editada com sucesso!");
        Editar edit = new Editar();
        edit.setVisible(true);
    }//GEN-LAST:event_jButtonEditOsActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new EditarOrdemServico(new com.mycompany.gestaooficina.model.OrdemServico(0,0,0,0,0)).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButtonEditOs;
    private javax.swing.JButton jButtonVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
