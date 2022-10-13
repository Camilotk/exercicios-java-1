/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.utfpr.veiculos.interfaces;

import javax.swing.JOptionPane;

/**
 *
 * @author cazevedo
 */
public class MenuPasseio extends javax.swing.JFrame {
    private static MenuPasseio menuPasseio;

    /**
     * Creates new form MenuPasseio
     */
    private MenuPasseio() {
        initComponents();
    }
    
    public static MenuPasseio criaMenuPasseio() {
        if (menuPasseio == null) menuPasseio =  new MenuPasseio();
        
        return menuPasseio;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCadastrarPasseio = new javax.swing.JButton();
        btnConsultarPasseio = new javax.swing.JButton();
        btnImprimirPasseio = new javax.swing.JButton();
        btnSairPasseio = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Veículos de Passeio");

        btnCadastrarPasseio.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        btnCadastrarPasseio.setText("Cadastrar");
        btnCadastrarPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarPasseioActionPerformed(evt);
            }
        });

        btnConsultarPasseio.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        btnConsultarPasseio.setText("Consultar / Excluir pela placa");
        btnConsultarPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPasseioActionPerformed(evt);
            }
        });

        btnImprimirPasseio.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        btnImprimirPasseio.setText("Imprimir / Excluir todos");
        btnImprimirPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnImprimirPasseioActionPerformed(evt);
            }
        });

        btnSairPasseio.setFont(new java.awt.Font("Fira Sans", 1, 18)); // NOI18N
        btnSairPasseio.setText("Sair");
        btnSairPasseio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSairPasseioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(77, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(btnCadastrarPasseio)
                    .addComponent(btnConsultarPasseio)
                    .addComponent(btnImprimirPasseio)
                    .addComponent(btnSairPasseio))
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(btnCadastrarPasseio)
                .addGap(18, 18, 18)
                .addComponent(btnConsultarPasseio)
                .addGap(18, 18, 18)
                .addComponent(btnImprimirPasseio)
                .addGap(18, 18, 18)
                .addComponent(btnSairPasseio)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadastrarPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarPasseioActionPerformed
        CadastroPasseio.criaCadastroPasseio().setVisible(true);
    }//GEN-LAST:event_btnCadastrarPasseioActionPerformed

    private void btnConsultarPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPasseioActionPerformed
        ConsultaPasseio.criaConsultaPasseio().setVisible(true);
    }//GEN-LAST:event_btnConsultarPasseioActionPerformed

    private void btnImprimirPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnImprimirPasseioActionPerformed
        ListaPasseio.criaListaPasseio().setVisible(true);
    }//GEN-LAST:event_btnImprimirPasseioActionPerformed

    private void btnSairPasseioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSairPasseioActionPerformed
        sair();
    }//GEN-LAST:event_btnSairPasseioActionPerformed

    private void sair() {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja realmente sair?", "saida", JOptionPane.YES_NO_CANCEL_OPTION);

        if (resposta == 0) {
            dispose();
        }
    }
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
            java.util.logging.Logger.getLogger(MenuPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPasseio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPasseio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrarPasseio;
    private javax.swing.JButton btnConsultarPasseio;
    private javax.swing.JButton btnImprimirPasseio;
    private javax.swing.JButton btnSairPasseio;
    // End of variables declaration//GEN-END:variables
}